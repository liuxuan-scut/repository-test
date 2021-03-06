package com.bingai.dao;

import com.bingai.domain.User;

import java.util.List;

/**
 * 用户持久层接口
 * @author bingai
 * @create 2019-12-17 18:13
 */
public interface IUserDao {

    /**
     * 查询所有操作
     * @return
     */
    List<User> findAll();

}
