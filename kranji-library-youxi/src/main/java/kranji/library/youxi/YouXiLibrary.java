package kranji.library.youxi;

import kranji.reading.library.LibraryTree;

/**
 * 电子游戏 — a branch, because the shelves under it are games.
 *
 * <p>使用指南 is grafted as a shelf and says why: a heading above one shelf is
 * a level to click through for no reason. This one is a branch on the same
 * reasoning read the other way. The level here is not a classification anybody
 * invented — it is the game — and a second game is a second shelf beside this
 * one rather than a rearrangement. 反恐精英2 arriving alone does not make the
 * heading empty; it makes it the first of several.</p>
 *
 * <p>It is 电子游戏 and not 游戏 to keep it clear of 语言游戏 in the root,
 * which is 笑话 and 口语 — things played with language rather than things
 * played.</p>
 */
public final class YouXiLibrary {

    /** This group, arranged, for a root to graft. See {@link kranji.reading.library.ArticleLibrary}. */
    public static final LibraryTree TREE =
            LibraryTree.branch("电子游戏", YouXiCollections.CS2);

    private YouXiLibrary() {}
}
