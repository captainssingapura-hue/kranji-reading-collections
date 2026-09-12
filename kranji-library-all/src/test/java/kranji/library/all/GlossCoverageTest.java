package kranji.library.all;

import kranji.reading.library.LibraryTree;
import kranji.reading.testkit.GlossCoverageTestBase;

import java.util.List;

/**
 * How much of this library the shipped meanings explain.
 *
 * <h2>Why here and not in each group</h2>
 *
 * <p>The article check runs per group because a broken article is a group's
 * fault and the group is where it gets fixed. Coverage is not anybody's fault
 * in that way — it is a property of the pair, this library against those
 * meanings — and the number that matters is the one for the whole root,
 * because that is the library a reader is handed. So it is measured once,
 * here, where the root is assembled, and the report breaks it down by shelf
 * and by article for whoever wants to know where the gaps are.</p>
 *
 * <h2>The floor</h2>
 *
 * <p>Held on reads, not on pairs or characters: what a child meets is squares,
 * and a character read forty times that has no meaning is forty taps that
 * answer nothing. It sits just under what the first measurement found, so
 * that adding an article full of unglossed characters, or losing a gloss jar
 * from the classpath, fails the build rather than a child. Raise it as the
 * meanings catch up; lower it in a diff, with a reason.</p>
 *
 * <p>The report is left at {@code target/gloss-coverage.txt}. Its last
 * section is the worklist: the missing pairs, most-read first, each saying
 * whether the character is absent from the library altogether or present
 * under a different reading.</p>
 */
class GlossCoverageTest extends GlossCoverageTestBase {

    @Override
    protected List<LibraryTree> trees() { return List.of(KranjiLibrary.INSTANCE.tree()); }

    @Override
    protected String library() { return KranjiLibrary.INSTANCE.name(); }

    @Override
    protected double floor() { return 0.94; }
}
