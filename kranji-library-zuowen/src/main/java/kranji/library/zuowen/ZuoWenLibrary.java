package kranji.library.zuowen;

import kranji.reading.library.LibraryTree;

/**
 * 作文 — a shelf for now, a branch when a second series arrives.
 *
 * <p>One series is one shelf, and a 作文 heading above one shelf would be a
 * level to click through for no reason — the same call 使用指南 makes. Unlike
 * 使用指南 this one is expected to outgrow that: a second examination's series
 * is a second shelf, and the day it lands this becomes
 * {@code LibraryTree.of("作文", …)} with the two beneath it. The shelf's id
 * does not move when that happens, so nothing a reader bookmarked does.</p>
 */
public final class ZuoWenLibrary {

    /** This group, arranged, for a root to graft. See {@link kranji.reading.library.ArticleLibrary}. */
    public static final LibraryTree TREE = LibraryTree.shelf(ZuoWenCollections.PSLE);

    private ZuoWenLibrary() {}
}
