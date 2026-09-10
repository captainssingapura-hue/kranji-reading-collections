# 电子游戏

Counter-Strike 2, in two shelves:

```
电子游戏 / 反恐精英2 / 地图        five map guides
                    / 武器与装备   nine entries on what you carry
```

`src/main/resources/kranji/articles/youxi/`.

## Why two shelves and not one list

Because they are read differently. 地图 is worked through — one map at a time,
in order, 300 to 450 characters each. 武器与装备 is dipped into: 170 to 230
characters, one thing per entry, looked up rather than read. Mixed into one
shelf, a note about a grenade would sit in the middle of a run of map guides
and make both harder to find.

## One thing, one idea

Each article says ONE thing, because fourteen articles that all list facts
would be one article printed fourteen times.

意大利 is about the walk back; 炙热沙城 about the middle; 荒漠迷城 about smoke;
炼狱小镇 about how little space there is; 核子危机 about the two floors.

步枪 is about the spray pattern being fixed, so it can be learned; 狙击枪 about
buying an angle rather than a kill; 手枪 about the round that sets the next
four; 烟雾弹 about deleting a sightline; 闪光弹 about it blinding your own team
too; 燃烧弹 about buying time; 手雷 about wounding rather than killing; 护甲和
拆弹器 about the two purchases nobody remembers making; 买枪 about the round you
win by buying nothing.

## What happened to the `.kmd` file

This module used to hold one `.kmd` source and no articles — a Markdown subset
with headings, sections and `‹…›` around every non-Chinese word, waiting for a
build step that would turn it into one JSON resource per section.

That step is not being built. The format merged back into the one the other
groups use: an article is lines of Chinese, a blank line ends a block, and
nothing else is markup. The `.kmd` document is in the history at `86cee31` if
its detail is ever wanted.

## The extension

`.ktxt` — the same format, under the name the merged one is taking. Nothing in
the reading path gates on the extension, so these can be first without the
older groups having to be renamed.

## Writing more

One branch per game, and shelves under it by how the reading is done; see
`YouXiCollections`. Three things to know before adding one:

- **Every character must be in the corpus.** The parser drops one it cannot
  read and the article then fails to serve. `ArticlesTest` catches it in this
  module, in the second this module takes.
- **Read `target/article-warnings.txt` after building.** It lists every reading
  the parser guessed. Most are right; the ones that are not are always the same
  families — 地 is `de` by principal and `dì` in 地图/地道/地面/地方, 得 needs
  choosing between `dé`/`děi`/`de`, and 打中 is `zhòng`.
- **A title can carry an override too**, in the same syntax: the shelf is
  declared `地{dì}图`. Without it the tree annotates it `de tú`.
- **Non-Chinese runs are ordinary text** — `AK`, `CS2` need no wrapping. Each
  run becomes one square, so keep them short: `A` and `B` fill a square the way
  a character does, `CS2` does not.

## The name

电子游戏 means video games. It is not the 语言游戏 shelf in
`kranji-library-all`, which is 笑话 and 口语 — things played with language
rather than things played.
