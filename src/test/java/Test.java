/**
 * Created by yvanme on 2017/2/26.
 */
import javax.annotation.Resource;

import com.loong.pojo.User;
import com.loong.service.UserService;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})

public class Test {
    @Resource
    private UserService userService;

    @org.junit.Test
    public void getUserInfo() throws Exception {
        User user = userService.info("1");
        System.out.println(user.getUserName());
    }
}
