# Prototyping Constraints & Trade-offs

## Rendering splits
- Full page: `/tasks` returns layout + list + pager.
- Fragment: `/tasks/fragment` returns list + pager + OOB status.

## URL & History
- `hx-push-url="true"` on filter and pager links keeps Back/Forward meaningful.

## Accessibility hooks
- Live region `#status` announces changes.
- Result count associated with list via `aria-describedby`.
- Result count is visually hidden because users who don't rely on assistive tech like screen readers or users who are not visually impaired can see how many results are returned. I don't fully agree with this due to debugging issues but I assume this is why

## State management
- 'q' and 'page' are updated when pagination is called using GET /tasks and is maintained using renderTemplate
- I think because pagination is used in displaying all the tasks and when a filter is applied, so pagination needs to be included in filter query

## Performance notes
- Page size: 10 items; consider server time vs client cost.
- Fragments avoid re-sending the full layout.

## Future risks
- Template duplication between full page and fragments.
- Focus management after deletes (ensure next focusable target).

## Accessibility verification

### Keyboard testing
- Tab navigation was a success, no issues with order or anything!

### Screen reader testing
- Not completed yet (NVDA is buggy at the moment)

### No-JS parity
- Most features work without Javascript, see backlog (most issues on No JS also don't work with HTML)