package cn.trusteye.integration.ssm.dao;

import cn.trusteye.integration.ssm.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

/**
 * Created by Rayman on 2017/2/14.
 */
public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {

    @Override
    public User findUserById(int id) throws Exception {
        SqlSession sqlSession = this.getSqlSession();
        User user = sqlSession.selectOne("user.findUserById",id);
        return user;
    }
}
