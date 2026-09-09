# 电子游戏

Articles about video games. The first of them is a guide to Counter-Strike's
`Italy` map, in `src/main/resources/kranji/articles/youxi/yi-da-li.ktxt`.

## What happened to the `.kmd` file

This module used to hold one `.kmd` source and no articles — a Markdown subset
with headings, sections and `‹…›` around every non-Chinese word, waiting for a
build step that would turn it into one JSON resource per section.

That step is not being built. The format merged back into the one the other
groups use: an article is lines of Chinese, a blank line ends a block, and
nothing else is markup. The `.kmd` document is in the history at `86cee31` if
its detail is ever wanted; what is here now is the same guide with the
essential half kept and the rest cut.

The cut was the point. The `.kmd` version ran to eight sections and about
2,500 characters — a reference document. This one is 444, which is what a child
reads in a sitting.

## The extension

`.ktxt` — the same format, under the name the merged one is taking. Nothing in
the reading path gates on the extension, so this can be first without the older
groups having to be renamed.

## Writing more

One shelf per game, and articles in the order they were written; see
`YouXiCollections`. Two things to know before adding one:

- **Every character must be in the corpus.** The parser drops one it cannot
  read and the article then fails to serve. `ArticlesTest` catches it in this
  module, in the second this module takes.
- **Non-Chinese runs are ordinary text** — `CS2` needs no wrapping. Each run
  becomes one square, so keep them short: a five-letter word in a square is
  legible, a sentence of them is not.

## The name

电子游戏 means video games. It is not the 语言游戏 shelf in
`kranji-library-all`, which is 笑话 and 口语 — things played with language
rather than things played.
