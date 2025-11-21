# axe DevTools Audit Report — Week 7

**Date**: [2025-11-20]
**URL**: http://localhost:8080/tasks
**Tool**: axe DevTools 4.x
**Scope**: Full page scan (add form + task list)

---

## Summary
- **Critical**: 0
- **Serious**: 2
- **Moderate**: 0
- **Minor**: 0
- **Total**: 2 issues

---

## Critical Issues
None detected.

---

## Serious Issues

### Issue 1: Insufficient color contrast (Serious)
**Element**: `<button type="submit">Add Task</button>`
**Rule**: `color-contrast` (WCAG 1.4.3, WCAG 2aa)
**Description**: Foreground colour #6c757d and background colour #0172ad has insufficient colour contrast, it is expected to be 4.5:1 but instead is 1.11:1
**Impact**: People with low vision struggle to read button text on top of background colour
**Fix**: Change button color to #ffffff (darker gray, 7:1 contrast).
**Status**: ✅ **CONFIRMED** — Add to backlog as High severity.

### Issue 2: Links must have discernible text (Serious)
**Element**: `<a href="/about"></a>`
**Rule**: `link-text` (WCAG 2.4.4, WCAG 4.1.2, WCAG 2a)
**Description**: The link /about has no text attribute
**Impact**: Everyone, there is no clear text highlighted as a link so no one would know there is a link to click on!
**Fix**: Add title attribute to the about link
**Status**: ✅ **CONFIRMED** — Add to backlog as High severity.

---

## Moderate Issues
None detected.

---

## Mild Issues
None detected.

---

## Actions
1. **High priority (Issue 1)**: Fix contrast ratio → Add to backlog
2. **High priority (Issue 2)**: Fix ARIA code for footer → Add to backlog
---

**Next step**: Manual testing to catch issues axe misses (focus order, SR announcements, keyboard traps).
