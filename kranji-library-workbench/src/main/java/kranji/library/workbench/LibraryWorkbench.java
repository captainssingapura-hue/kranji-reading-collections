package kranji.library.workbench;

import kranji.reading.workbench.LibraryWorkbenchServer;

/**
 * Starts the bench with this library on the classpath.
 *
 * <p>Nothing but a name to point {@code exec:java} at. The bench announces the
 * libraries it found and which one it mounted before it listens, so the first
 * line of output says whether this module did its one job.</p>
 */
public final class LibraryWorkbench {

    private LibraryWorkbench() {}

    public static void main(String[] args) {
        LibraryWorkbenchServer.main(args);
    }
}
