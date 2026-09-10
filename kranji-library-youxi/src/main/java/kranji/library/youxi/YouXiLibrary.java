package kranji.library.youxi;

import kranji.reading.library.LibraryTree;

/**
 * 电子游戏 — a branch of games, and each game a branch of subjects.
 *
 * <p>使用指南 is grafted as a shelf and says why: a heading above one shelf is
 * a level to click through for no reason. Both levels here earn their place.
 * 电子游戏 is the game — a second game is a second branch beside 反恐精英2
 * rather than a rearrangement — and under it 地图 and 武器与装备 are two
 * different kinds of reading: one is worked through, the other is looked
 * things up in.</p>
 *
 * <p>反恐精英2 arriving alone did not make the outer heading empty, and 地图
 * arriving alone did not make the inner one empty either; each was the first
 * of several, which is the case the rule about pointless levels does not
 * cover.</p>
 *
 * <p>It is 电子游戏 and not 游戏 to keep it clear of 语言游戏 in the root,
 * which is 笑话 and 口语 — things played with language rather than things
 * played.</p>
 */
public final class YouXiLibrary {

    /** This group, arranged, for a root to graft. See {@link kranji.reading.library.ArticleLibrary}. */
    public static final LibraryTree TREE =
            LibraryTree.of("电子游戏",
                    LibraryTree.branch("反恐精英2",
                            YouXiCollections.CS2_DITU,
                            YouXiCollections.CS2_WUQI));

    private YouXiLibrary() {}
}
