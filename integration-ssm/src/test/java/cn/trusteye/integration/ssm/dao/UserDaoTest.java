package cn.trusteye.integration.ssm.dao;

import cn.trusteye.integration.ssm.pojo.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Rayman on 2017/2/15.
 * 测试原始DAO方式
 */
public class UserDaoTest {
    private ApplicationContext applicationContext;
    /**
     * 得到spring容器
     */
    @Before
    public void init(){
        applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
}

    @Test
    public void testUserDao() throws Exception {
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        User user = userDao.findUserById(1);
        System.out.println(user);
    }
}
