package kranji.library.workbench;

import kranji.library.all.KranjiLibrary;
import kranji.reading.library.ArticleLibrary;
import kranji.reading.library.Libraries;
import kranji.simple.gloss.ZiCollections;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * This module's one job, checked: the bench started from here sees this
 * library and the reader's meanings.
 *
 * <p>Both arrive by discovery, so both can be lost by a dependency edit that
 * builds cleanly. The demo set is on this classpath too, by way of the bench's
 * dependency on the reader, which is what makes the precedence rule worth
 * asserting here rather than assuming.</p>
 */
class LibraryOnTheBenchTest {

    @Test
    void thisLibraryIsWhatTheBenchMounts() {
        List<String> found = Libraries.discovered().stream().map(ArticleLibrary::name).toList();
        assertTrue(found.contains("kranji"), "this library is not on the bench's classpath: " + found);
        assertSame(KranjiLibrary.INSTANCE.tree(), Libraries.mounted().tree(),
                "the bench must mount this library, not the demo set that rides in with the reader");
    }

    @Test
    void theMeaningsAreOnTheBenchToo() {
        assertFalse(ZiCollections.discovered().isEmpty(),
                "no gloss collection on the bench's classpath - the Character pane would say "
              + "'no meanings library in this build' for every square");
    }
}
