package kranji.library.youxi;

import kranji.reading.testkit.LibraryArticlesTestBase;
import kranji.reading.library.LibraryTree;

import java.util.List;

/**
 * Every 电子游戏 article reads, one case each.
 *
 * <p>The check lives in {@link LibraryArticlesTestBase}; this names the tree
 * it should be run over. It matters more here than in the older groups: a
 * fable uses the characters a fable has always used, while a map guide reaches
 * for 匪徒、埋伏、掩体 and for whatever the next article's game happens to
 * call things. This is what says the corpus can read them.</p>
 */
class ArticlesTest extends LibraryArticlesTestBase {

    @Override
    protected List<LibraryTree> trees() { return List.of(YouXiLibrary.TREE); }

    /**
     * Five map guides. The floor is what stops a broken classpath reading as
     * success — the base class insists only on more than nothing, and more
     * than nothing is what an empty jar looks like.
     */
    @Override
    protected int fewestArticlesExpected() { return 5; }
}
