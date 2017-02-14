package cn.trusteye.integration.ssm.dao;

import cn.trusteye.integration.ssm.pojo.User;

/**
 * Created by Rayman on 2017/2/14.
 */
public interface UserDao {
    public User findUserById(int id) throws Exception;
}
