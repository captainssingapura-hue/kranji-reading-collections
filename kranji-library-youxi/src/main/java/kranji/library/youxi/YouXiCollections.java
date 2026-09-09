package kranji.library.youxi;

import kranji.reading.library.ArticleCollection;
import kranji.reading.library.ArticleRef;
import kranji.reading.library.CollectionId;

import java.util.List;

/**
 * 电子游戏 — one shelf per game, articles in the order they were written.
 *
 * <h2>Why a game gets a shelf of its own</h2>
 *
 * <p>Because a reader who comes here comes for a game, not for the category.
 * A single 电子游戏 shelf holding a map guide, a patch note and a piece about
 * a different game entirely would be a list nobody scans; 反恐精英2 is a name
 * a reader recognises and can decide about in one glance. The group divides by
 * the thing the reader already has an opinion about.</p>
 *
 * <h2>Why the vocabulary is not simplified</h2>
 *
 * <p>人质、匪徒、埋伏、掩体 are not beginner words, and they are not softened
 * here. A child reading about a map they played last night already holds the
 * concepts — what they are missing is the characters, which is exactly the gap
 * this reader closes. Writing 坏人 for 匪徒 would remove the only thing worth
 * learning from the sentence.</p>
 *
 * <p>Every character is in the corpus, so the parser can read every one of
 * them; that is checked in {@code ArticlesTest} rather than assumed.</p>
 */
public final class YouXiCollections {

    private YouXiCollections() {}

    private record Bundle(CollectionId id, String title, String summary,
                          List<ArticleRef> articles) implements ArticleCollection {}

    private static ArticleCollection bundle(String id, String title, String summary,
                                            ArticleRef... articles) {
        return new Bundle(CollectionId.named("kranji.library.youxi." + id),
                title, summary, List.of(articles));
    }

    /**
     * The article's text.
     *
     * <p>{@code .ktxt} rather than {@code .txt} — the same format, under the
     * extension the merged one is taking. Nothing in the reading path gates on
     * the extension: an {@link ArticleRef} names a resource and the parser
     * reads what it finds, so the two can sit side by side while the older
     * groups keep the older name.</p>
     */
    private static ArticleRef a(String slug, String title) {
        return ArticleRef.of(slug, title, "/kranji/articles/youxi/" + slug + ".ktxt");
    }

    public static final ArticleCollection CS2 = bundle("cs2",
            "反恐精英2", "地图、模式和打法，一次讲一张图。",
            a("yi-da-li", "意大利"));

    public static List<ArticleCollection> all() {
        return List.of(CS2);
    }
}
