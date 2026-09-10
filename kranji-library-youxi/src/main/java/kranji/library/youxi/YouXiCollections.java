package kranji.library.youxi;

import kranji.reading.library.ArticleCollection;
import kranji.reading.library.ArticleRef;
import kranji.reading.library.CollectionId;

import java.util.List;

/**
 * 电子游戏 — a game divides into subjects, and each subject is a shelf.
 *
 * <h2>Why a game gets its own level</h2>
 *
 * <p>Because a reader who comes here comes for a game, not for the category.
 * A single 电子游戏 shelf holding a map guide, a weapon page and a piece about
 * a different game entirely would be a list nobody scans; 反恐精英2 is a name
 * a reader recognises and can decide about in one glance.</p>
 *
 * <p>Under it the split is by what a reader wants to know rather than by
 * anything the game says about itself: 地图 is read once, in order, the way a
 * guide is; 武器与装备 is dipped into, one entry at a time, the way a reference
 * is. Mixing them would put a 170-character note about a grenade in the middle
 * of a run of map guides and make both harder to find. When a second game
 * arrives it repeats this shape rather than disturbing it.</p>
 *
 * <h2>Why the vocabulary is not simplified</h2>
 *
 * <p>人质、匪徒、埋伏、弹道、护甲 are not beginner words, and they are not
 * softened here. A child reading about a map they played last night already
 * holds the concepts — what they are missing is the characters, which is
 * exactly the gap this reader closes. Writing 坏人 for 匪徒 would remove the
 * only thing worth learning from the sentence.</p>
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

    /** One map at a time, an idea each, in the order they were written. */
    public static final ArticleCollection CS2_DITU = bundle("cs2-ditu",
            "地{dì}图", "一次讲一张图，讲它真正考的是什么。",
            a("yi-da-li", "意大利"),
            a("zhi-re-sha-cheng", "炙热沙城"),
            a("huang-mo-mi-cheng", "荒漠迷城"),
            a("lian-yu-xiao-zhen", "炼狱小镇"),
            a("he-zi-wei-ji", "核子危机"));

    /**
     * What you carry, and what it buys you.
     *
     * <p>Ordered as a round is: the guns first, then the four things you throw,
     * then the two purchases nobody remembers making, then the money that
     * decides whether you get any of it. A reader working down the shelf ends
     * up where a player ends up — at the buy menu.</p>
     */
    public static final ArticleCollection CS2_WUQI = bundle("cs2-wuqi",
            "武器与装备", "枪、投掷物，和买不买得起它们。",
            a("bu-qiang", "步枪"),
            a("ju-ji-qiang", "狙击枪"),
            a("shou-qiang", "手枪"),
            a("yan-wu-dan", "烟雾弹"),
            a("shan-guang-dan", "闪光弹"),
            a("ran-shao-dan", "燃烧弹"),
            a("shou-lei", "手雷"),
            a("hu-jia", "护甲和拆弹器"),
            a("mai-qiang", "买枪"));

    public static List<ArticleCollection> all() {
        return List.of(CS2_DITU, CS2_WUQI);
    }
}
