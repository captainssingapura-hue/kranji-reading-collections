# 电子游戏

Five map guides for Counter-Strike 2, in
`src/main/resources/kranji/articles/youxi/`: 意大利, 炙热沙城, 荒漠迷城,
炼狱小镇 and 核子危机 — the hostage map the group started with, and the four
bomb-defusal maps a player meets first.

## One map, one idea

Each is 300–450 characters and says one thing the map is about, because five
guides that all list rooms would be one guide printed five times. Italy is
about the walk back; 炙热沙城 about the middle; 荒漠迷城 about smoke; 炼狱小镇
about how little space there is; 核子危机 about the two floors. The rooms are
there to make the idea land, not the other way round.

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
2,500 characters — a reference document. 意大利 is 444, which is what a child
reads in a sitting.

## The extension

`.ktxt` — the same format, under the name the merged one is taking. Nothing in
the reading path gates on the extension, so these can be first without the
older groups having to be renamed.

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
