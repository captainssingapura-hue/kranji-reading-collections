package kranji.library.zuowen;

import kranji.reading.library.ArticleCollection;
import kranji.reading.library.ArticleRef;
import kranji.reading.library.CollectionId;

import java.util.List;

/**
 * 作文 — model compositions, one series per examination.
 *
 * <h2>Why compositions are a group of their own</h2>
 *
 * <p>A PSLE composition is a story, and 故事 already holds stories. It is kept
 * apart because it is read for a different reason: a child facing the paper
 * reads a model piece for its shape — the weather that opens it, the turn in
 * the fourth paragraph, the sentence that closes it — and for the set phrases
 * an examiner rewards. 骨瘦如柴, 怒不可遏, 如愿以偿 are here because a marker
 * expects them, not because a storyteller would reach for them. That is a
 * register, and a register is worth a shelf of its own so that a reader who
 * wants it can find it and one who does not is not handed it as a story.</p>
 *
 * <h2>The length is the syllabus's</h2>
 *
 * <p>Around six hundred characters, against a library median of thirty-eight.
 * That is what the examination asks for, and shortening it would remove the
 * thing being shown. It is the longest prose in the library by some way,
 * which is a reason to keep the paragraphs as the writer set them — six, each
 * one move of the story — rather than a reason to cut.</p>
 *
 * <h2>Readings</h2>
 *
 * <p>Model compositions lean on polyphones more than plain prose does — 背着,
 * 一只, 挣扎, 倒吸, 少年 — and every one of them is overridden in the text where
 * the principal is wrong for the word. The warning report is read line by line
 * for each piece added; that is the step the build cannot do.</p>
 */
public final class ZuoWenCollections {

    private ZuoWenCollections() {}

    private record Bundle(CollectionId id, String title, String summary,
                          List<ArticleRef> articles) implements ArticleCollection {}

    private static ArticleCollection bundle(String id, String title, String summary,
                                            ArticleRef... articles) {
        return new Bundle(CollectionId.named("kranji.library.zuowen." + id),
                title, summary, List.of(articles));
    }

    /** {@code .ktxt}, as 电子游戏 says: the same format under the merged name. */
    private static ArticleRef a(String slug, String title) {
        return ArticleRef.of(slug, title, "/kranji/articles/zuowen/" + slug + ".ktxt");
    }

    /** One series, one examination; pieces in the order they were written. */
    public static final ArticleCollection PSLE = bundle("psle",
            "PSLE 作文系列", "Model compositions for the PSLE Chinese paper.",
            a("xiao-mao-de-xin-jia", "小猫的新家"),
            a("jing-xin-she-ji-de-pian-ju", "精心设计的骗局"),
            a("xiao-shi-de-yi-kuai-qian", "消失的一块钱"),
            a("xiao-shi-de-yi-yuan-qian", "消失的一元钱"),
            a("cong-ming-fan-bei-cong-ming-wu", "聪明反被聪明误"),
            a("ni-hui-zuo-shen-me-ne", "你会做什么呢？"),
            a("xi-shou", "洗手"),
            a("shu-xue-e2k-qian-de-wu-can", "数学E2K课前的午餐"),
            a("mei-you-shang-xue-de-yi-tian", "没有上学的一天"));

    public static List<ArticleCollection> all() {
        return List.of(PSLE);
    }
}
