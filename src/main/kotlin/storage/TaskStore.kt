package storage

import model.Task
import java.io.File
import data.Page

class TaskStore (private val csvFile: File = File("data/tasks.csv")) {
    private val tasks = mutableListOf<Task>()

    init {
        if (csvFile.exists()) {
            // Load tasks from CSV (implement if needed)
        }
    }

    fun getAll(): List<Task> = tasks.toList()

    fun getById(id: String): Task? = tasks.find { it.id == id }

    fun add(task: Task) { tasks.add(task) }

    fun update(task: Task): Boolean {
        val index = tasks.indexOfFirst { it.id == task.id }
        return if (index != -1) { tasks[index] = task; true } else false
    }

    /**
     * Search tasks by title and return paginated results.
     */
    fun search(query: String, page: Int, pageSize: Int = 10): Page<Task> {
        val filtered = if (query.isBlank()) {
            getAll()
        } else {
            getAll().filter { task ->
                task.title.contains(query, ignoreCase = true)
            }
        }

        val totalItems = filtered.size
        val totalPages = if (totalItems == 0) 1 else (totalItems + pageSize - 1) / pageSize
        val validPage = page.coerceIn(1, totalPages)
        val startIndex = (validPage - 1) * pageSize
        val pageItems = filtered.drop(startIndex).take(pageSize)

        return Page(
            items = pageItems,
            page = validPage,
            pages = totalPages,
            total = totalItems
        )
    }


    fun delete(id: String): Boolean = tasks.removeIf { it.id == id }
}
