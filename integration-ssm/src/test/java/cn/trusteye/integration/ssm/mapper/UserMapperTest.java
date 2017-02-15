package cn.trusteye.integration.ssm.mapper;

import cn.trusteye.integration.ssm.pojo.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Rayman on 2017/2/15.
 * 测试MAPPER代理方式
 */
public class UserMapperTest {
    private ApplicationContext applicationContext;

    @Before
    public void init(){
        applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
    }

    @Test
    public void testFindUserById(){
        UserMapper userMapper = (UserMapper) applicationContext.getBean("userMapper");
        User user = userMapper.selectByPrimaryKey(1);
        System.out.println(user);
    }
}
