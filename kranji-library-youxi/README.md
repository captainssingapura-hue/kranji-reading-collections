# 游戏

Articles about games. The first of them is a map guide for Counter-Strike's
`Italy` — the document the whole `.kmd` design was written against, now written
*in* it.

## Why this module looks unfinished

Because it is, and deliberately so. Every other module here ships `.txt`
articles beside a hand-written catalogue of `ArticleRef`s. This one ships
nothing yet.

The reason is that a `.kmd` document is a **source**, not an article. A build
step reads it and emits one JSON resource per section beside a generated
catalogue — which is what keeps the rule the library depends on:

> Metadata is Java; the body is a resource. Listing therefore never parses.

Two things have to happen before that step can run here:

1. **The generator lives in `kranji-studio`**, in the reader's repository, not
   in this one. Nothing in this build can invoke it today.
2. **The reader cannot serve a generated section.** `ArticleRef.resource` would
   name a `.json`, and the reading path still expects the `.txt` lines it scans
   in the browser.

So this module holds the source and stops there. A catalogue committed now
would name articles nothing can open, and a half-built library is worse than no
library — the half that built looks finished.

## What is here

```
src/main/kmd/kranji/articles/youxi/*.kmd
```

`src/main/kmd` rather than `src/main/resources` on purpose: these files are not
the artifact. Putting them under `resources` would ship them in the jar, where
nothing would ever read them.

## Working on them

Point the studio's article workspace at this repository — add it as a root in
the **Roots** pane — and the **Navigator** will find every `.kmd` under it. The
**Drafts** pane shows what the subset makes of one, and every finding it has.

The format is specified in *The Markdown Kranji Reads*, in `kranji-studio`.
Two things about it are worth knowing before editing these files:

- **Anything not Chinese and not a punctuation mark must be wrapped** in
  `‹…›` — `‹Italy›`, `‹CS2›`, `‹1999›`. This is an error, not a warning: a
  square holds one character, and only the author can say that eight letters
  are one word.
- **Emphasis cannot span a run.** `**匪徒方（‹T›）负责看守人质**` leaves an
  unpaired `*` on each side of the run and is warned about; write
  `**匪徒方**（‹T›）**负责看守人质**` instead.

## The name

游戏 here means video games. It is not the 语言游戏 shelf in
`kranji-library-all`, which is 笑话 and 口语 — things played with language
rather than things played.
