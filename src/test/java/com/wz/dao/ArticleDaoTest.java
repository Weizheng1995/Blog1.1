package com.wz.dao;

import com.wz.pojo.Article;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by zheng on 2017/6/2.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class ArticleDaoTest {
    @Resource
    private ArticleDao articleDao;
    @Test
    public void testQueryAll(){
        List<Article> list=articleDao.queryAll();
        if(list!=null){
            for(Article article:list){
                System.out.println(article.getArticleId()+"-->"+article.getArticleTitle()+"-->"+article.getArticleContent());
            }
        }else{
            System.out.println("查询失败或不存在");
        }
    }
    @Test
    public void testQueryById(){
        Article article=articleDao.queryById(1);
        if(article!=null){
            System.out.println(article.getArticleId()+"-->"+article.getArticleTitle()+"-->"+article.getArticleContent());
        }else{
            System.out.println("查询失败或不存在");
        }
    }
    @Test
    public void testCreate(){
        Article article=new Article();
        article.setArticleTitle("这是测试标题2");
        article.setArticleContent("用了一夜去试尝狂欢的滋味。\n" +
                "\n" +
                "夜生活，一个充斥着颓糜，腐朽的字眼。那些只活跃于灯红酒绿的生活，是开心，还是为了释放？\n" +
                "\n" +
                "只是，不是所有的狂欢都是那么的肆无忌惮；同样的，也不是所有的狂欢都是这么如她般的压抑。\n" +
                "\n" +
                "她不适合这样的夜，确切地说，是她不适合这样的场合。\n" +
                "\n" +
                "即便不是向阳的植物花草，却也无法强令自己去硬着接受阴沉潮湿的地表。\n" +
                "\n" +
                "她很细腻，是株纤细，风吹即倒的柔弱。她还想活，还想接受一天天愈来愈灿烂的阳光，不想让今日的霜冻无缘无故地僵冻自己的生命。\n" +
                "\n" +
                "可那盆倾盆的滋润是否也似乎太没稳定性了？\n" +
                "\n" +
                "这是要给她滋润，让她继续如花的前程，还是想一下一下地拗断她的茎叶？\n" +
                "\n" +
                "谁能给她答案？谁也不能。因为，她的委屈，谁也不知，谁也不想去知。\n" +
                "\n" +
                "她宁可就那样地继续挣扎在看不到未来的现在，也不要这样被人努力欣赏后，再被连根拔起。\n" +
                "\n" +
                "天亮了，是吗？\n" +
                "\n" +
                "她可以，是否可以做回自己了？是否可以脱下所有夜色胧起的雾色？\n" +
                "\n" +
                "如果，没有这个夜晚，没有这个季节，她会有更多的牵挂，她会有更多的笑声。\n" +
                "\n" +
                "但事实是，她的茎在没有生气的夜里早就失去了滋润，错过太多吸水的空间，所有曼妙的舞姿，一下都被截留在回忆中。\n" +
                "\n" +
                "如果还有机会，她不会选择成其悲戚的草。\n" +
                "\n" +
                "她是花，想花开花落的情调。\n" +
                "\n" +
                "她是花，一株需要太多养分的野草；所以，终究要的太多，便也早早体会什么叫自生自灭。\n" +
                "\n" +
                "也许在这之前，她会那么那么地倔强。只怪，那夜色太过弥漫，所有的抹杀了她的一切。\n" +
                "\n" +
                "祈求天亮，祈求自己能活着，哪怕贱贱地还是一棵草。");
        article.setArticleAuthor(1);
        article.setArticleCategory(3);
        Date date=new Date();
        SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        article.setArticleCreatetime(date);
        article.setArticleViewcount(223);
        if(articleDao.create(article)>0){
            System.out.println("添加文章成功");
        }else{
            System.out.println("添加文章失败");
        }
    }
    @Test
    public void testDelete(){
        if(articleDao.delete(2)>0){
            System.out.println("删除成功");
        }else{
            System.out.println("删除失败");
        }
    }
    @Test
    public void testUpdate(){
        Article article=articleDao.queryById(1);
        article.setArticleContent("有时候，只是偶尔想起你。\n" +
                "\n" +
                "真的！偶尔想起你，便是一个春天。\n" +
                "\n" +
                "春天，梦想出发的季节。就在一个草长莺飞、桃红梨白的季节，偶然遇见了你，春风扑面，似曾相识，就这样映了眼、入了心。痴痴地想，能够遇见一个丁香一样幽怨的你，即使在梦里想过千百回，却不曾想过你我相识在春天里。相识在春天，惊艳了一个轮回；相识在春天，葳蕤了四季；相识在春天，生动了故事；相识在春天，芬芳了年华。\n" +
                "\n" +
                "点点相思随春草，春来又发伴君老。念君方知相思苦，撇下相思有多少？\n" +
                "\n" +
                "偶尔想起你，心潮也会澎湃，望窗前娇花含羞，是否像极了你偶尔想我的模样？南飞燕，归旧巢，远方的你，可曾踏上来时路？阑干倚透，秋水望穿，不见娇花临水。在怅惘的夜里，还心儿生疼地翘首企盼，月移花影动，疑是故人来。\n" +
                "\n" +
                "西窗剪烛蛾飞纱，撷来红豆闻琵琶。最恨相思无处藏，朝朝暮暮伴天涯。\n" +
                "\n" +
                "“两情若是久长时，又岂在朝朝暮暮。”一个人的时候，这句诗已经读了千百遍。隔了千里，隔了时空，你却一直在我的左右，如影随形......\n" +
                "\n" +
                "“你我相遇纯属一次偶然......”一曲《邂逅》，单曲循环，百听不厌，一次次问自己：是否是演绎着我俩的故事，从相遇到相识......\n" +
                "\n" +
                "点点相思随春草，春来又发伴君老。鱼雁无字犹传情，牵牵绊绊到海角。\n" +
                "\n" +
                "总想，在明媚的三月里，借一缕春风，赊一段时光，去看有你的城，闻那淡淡的桃花香，呷一口回忆的酒，那丝丝的甜，却醉了三月的天空。\n" +
                "\n" +
                "是谁设定了开场白，谁还在演绎故事的结局？你我只是两棵树，相互遥望，相互祝福，相互牵念，这种唯美已经抛弃了世俗，在无垠的时光里，我已经成了你，你也变成了我。\n" +
                "\n" +
                "你的笑容在梦里，还是那样甜。哦！想起来了。你原本就是这三月的一朵春花，在前世我为你的惊艳匆匆一瞥，就注定今生还会遇见。只是，我们相隔了万水千山，我只能把你的名字读成一首诗，在梦里反复吟哦......\n" +
                "\n" +
                "点点相思随春草，春来又发伴君老。一寸相思比梦长，化作青藤为君绕。");
        if(articleDao.update(article)>0){
            System.out.println("更新文章成功");
        }else{
            System.out.println("更新文章失败");
        }
    }
    @Test
    public void testUpdateViewcount(){
        Article article=articleDao.queryById(1);
        if(articleDao.updateViewcount(article)>0){
            System.out.println("更新文章浏览数成功");
        }else{
            System.out.println("更新文章浏览数失败");
        }

    }
}
