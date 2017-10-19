package com.bdth.rure.web.test;


import com.bdth.rure.base.api.UserService;
        import com.bdth.rure.base.dao.modle.User;
        import com.bdth.rure.base.dao.modle.UserExample;
        import org.springframework.beans.factory.BeanFactory;
        import org.springframework.context.support.ClassPathXmlApplicationContext;

        import java.util.List;

/**
 * Created by Administrator on 2017/9/30.
 */
public class UserServiceTest {
    public static void main(String[] args) {
        String[] resources = new String[]{"classpath*:applicationContext-dubbo-consumer.xml"};
        BeanFactory factory = new ClassPathXmlApplicationContext(resources);
        UserService userService = (UserService)factory.getBean("userService");
        UserExample userExample = new UserExample();
        userExample.createCriteria().andIdEqualTo("lisi");
        List<User> list = userService.selectByExample(userExample);
        for (User bean: list) {
            System.out.println(bean.toString());
        }
    }
}
