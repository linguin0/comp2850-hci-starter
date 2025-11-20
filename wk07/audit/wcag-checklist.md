# WCAG 2.2 AA Checklist — Week 7

**Date**: 2025-11-20
**Scope**: Task manager (add, edit, delete flows)
**Tester**: Emma Harris

---

## Perceivable (Principle 1)

### 1.1 Text Alternatives
| Criterion | Level | Status | Evidence | Notes |
|-----------|-------|--------|----------|-------|
| 1.1.1 Non-text Content | A | N/A | No images yet | Will add in Week 8 |

### 1.3 Adaptable
| Criterion | Level | Status | Evidence | Notes |
|-----------|-------|--------|----------|-------|
| 1.3.1 Info and Relationships | A | ✅ Pass | `<label for="title">` links to input | Semantic HTML (`<main>`, `<section>`, `<ul>`) |
| 1.3.2 Meaningful Sequence | A | ✅ Pass | Tab order: skip link → add form → task list | Logical reading order |

### 1.4 Distinguishable
| Criterion | Level | Status | Evidence                        | Notes |
|-----------|-------|--------|---------------------------------|-------|
| 1.4.3 Contrast (Minimum) | AA | ❌ Fail | All buttons #6c757d = 1.11:1    | Needs 4.5:1 (AA) |

---

## Operable (Principle 2)

### 2.1 Keyboard Accessible
| Criterion | Level | Status | Evidence | Notes |
|-----------|-------|--------|----------|-------|
| 2.1.1 Keyboard | A | ✅ Pass | All features accessible via Tab/Enter/Space | Tested: add, edit, delete, cancel |
| 2.1.2 No Keyboard Trap | A | ✅ Pass | No traps detected | Can Tab out of all forms |

### 2.4 Navigable
| Criterion | Level | Status | Evidence                                                             | Notes |
|-----------|-------|--------|----------------------------------------------------------------------|-------|
| 2.4.3 Focus Order | A | ✅ Pass | Tab order: Edit → Title → Save → Cancel                              | Logical sequence |
| 2.4.4 Link Purpose | A | ⚠️ Partial | 'about' link in footer had no text attribute | Add text to that link |
| 2.4.7 Focus Visible | AA | ⚠️ Partial | Pico.css default outline visible on input boxes but faint on buttons | Consider custom outline (3px solid) |

---

## Robust (Principle 4)

### 4.1 Compatible
| Criterion | Level | Status | Evidence                                                                                      | Notes |
|-----------|-------|--------|-----------------------------------------------------------------------------------------------|-------|
| 4.1.2 Name, Role, Value | A | ⚠️ Partial | All buttons have accessible names but no discernible text connecte to "/about" link in footer | `<a href="/about"></a>` |
| 4.1.3 Status Messages | AA | ✅ Pass | `<div role="status" aria-live="polite">`                                                      | Tested with NVDA |

---

## Summary
- **Total criteria evaluated**: 10
- **Pass**: 8
- **Fail**: 1 (1.4.3 Contrast)
- **Partial**: 1 (2.4.7 Focus Visible)
- **N/A**: 0

---

## High-Priority Failures
1. **1.4.3 Contrast (Minimum, AA)**: All button texts fails 4.5:1 ratio
    - **Action**: Change button text color or add custom CSS

2. **2.4.7 Focus Visible (AA, Partial)**: Default outline is too similar to button colour/is faint
    - **Action**: Add custom `:focus` styles (3px solid #1976d2)

---

**Next**: Add these findings to backlog with severity scores.
