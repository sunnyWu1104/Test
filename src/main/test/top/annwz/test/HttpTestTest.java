package top.annwz.test;

/**
 * Created by huahui.wu on 2017/3/21.
 */
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
/**
 * 测试类
 * 3个测试链接：
 * 1）百科网页
 * 2）浏览器模拟获取接口数据
 * 3）获取普通接口数据
 * @author Administrator -> junhong
 *
 * 2016年12月27日
 */
public class HttpTestTest {
    String[] seeds = {"http://baike.baidu.com/view/1.htm","http://m.ximalaya.com/tracks/26096131.json","http://remyapi.yeezhao.com/api/query?wd=%E5%91%A8%E6%98%9F%E9%A9%B0%E7%9A%84%E7%94%B5%E5%BD%B1"};
    final static String DEFAULT_CHARSET = "UTF-8";
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("--- down ---");
    }

    @Test
    public void testGetResponseCode() throws Exception{
        for(String seed:seeds){
            int responseCode = HttpTest.getResponseCode(seed);
            System.out.println("ret="+responseCode);
        }
    }

    @Test
    public void testJDKFetch() throws Exception{
        for(String seed:seeds){
            String ret = HttpTest.JDKFetch(seed, DEFAULT_CHARSET);
            System.out.println("ret="+ret);
        }
    }

    @Test
    public void testURLFetch() throws Exception{
        for(String seed:seeds){
            String ret = HttpTest.URLFetch(seed, DEFAULT_CHARSET);
            System.out.println("ret="+ret);
        }
    }

    @Test
    public void testHttpClientFetch()throws Exception {
        for(String seed:seeds){
            String ret = HttpTest.httpClientFetch(seed, DEFAULT_CHARSET);
            System.out.println("ret="+ret);
        }
    }

    @Test
    public void testCommonsIOFetch()throws Exception {
        for(String seed:seeds){
            String ret = HttpTest.commonsIOFetch(seed, DEFAULT_CHARSET);
            System.out.println("ret="+ret);
        }
    }

    @Test
    public void testJsoupFetch() throws Exception{
        for(String seed:seeds){
            String ret = HttpTest.jsoupFetch(seed);
            System.out.println("ret="+ret);
        }
    }

}