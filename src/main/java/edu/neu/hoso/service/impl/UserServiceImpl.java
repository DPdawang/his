package edu.neu.hoso.service.impl;

import edu.neu.hoso.example.UserExample;
import edu.neu.hoso.model.User;
import edu.neu.hoso.model.UserMapper;
import edu.neu.hoso.service.UserService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @title: UserServiceImpl
 * @package edu.neu.hoso.service.impl
 * @description: 用户类业务接口实现类
 * @author: Mike
 * @date: 2019-06-11 11:07
 * @version: V1.0
*/
public class UserServiceImpl implements UserService {
    @Resource
    UserMapper userMapper;


    @Override
    public Integer insert(User user) {
        /**
         *@title: insert
         *@description: 插入用户
         *@author: Mike
         *@date: 2019-06-11 11:08
         *@param: [user]
         *@return: java.lang.Integer
         *@throws:
         */
        userMapper.insert(user);
        return user.getUserId();
    }

    @Override
    public void deleteById(Integer id) {
        /**
         *@title: deleteById
         *@description: 删除用户 经id
         *@author: Mike
         *@date: 2019-06-11 11:15
         *@param: [id]
         *@return: void
         *@throws:
         */
        userMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void deleteByLoginname(String loginname) {
        /**
         *@title: deleteByLoginname
         *@description: 删除用户 经loginname
         *@author: Mike
         *@date: 2019-06-11 11:27
         *@param: [loginname]
         *@return: void
         *@throws:
         */
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUserLoginnameEqualTo(loginname);
        userMapper.deleteByExample(userExample);
    }

    @Override
    public void deleteByUserName(String userName) {
        /**  
         *@title: deleteByUserName
         *@description: 删除用户 经userName
         *@author: Mike  
         *@date: 2019-06-11 11:35   
         *@param: [userName]
         *@return: void 
         *@throws:
         */ 
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUserNameEqualTo(userName);
        userMapper.deleteByExample(userExample);
    }

    @Override
    public void update(User user) {
        /**
         *@title: update
         *@description: 更新用户
         *@author: Mike
         *@date: 2019-06-11 11:36
         *@param: [user]
         *@return: void
         *@throws:
         */
        userMapper.updateByPrimaryKeySelective(user);
    }

    @Override
    public User getUserById(Integer id) {
        /**
         *@title: getUserById
         *@description: 查询用户 经id
         *@author: Mike
         *@date: 2019-06-11 11:51
         *@param: [id]
         *@return: edu.neu.hoso.model.User
         *@throws:
         */
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<User> getUserByLoginname(String loginname) {
        /**
         *@title: getUserByLoginname
         *@description: 查询用户 经loginname
         *@author: Mike
         *@date: 2019-06-11 11:55
         *@param: [loginname]
         *@return: java.util.List<edu.neu.hoso.model.User>
         *@throws:
         */
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUserLoginnameEqualTo(loginname);
        return userMapper.selectByExample(userExample);
    }

    @Override
    public List<User> getUserByUserName(String userName) {
        /**
         *@title: getUserByUserName
         *@description: 查询用户 经userName
         *@author: Mike
         *@date: 2019-06-11 11:57
         *@param: [userName]
         *@return: java.util.List<edu.neu.hoso.model.User>
         *@throws:
         */
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUserNameEqualTo(userName);
        return userMapper.selectByExample(userExample);
    }

    @Override
    public List<User> getUserByRoleId(Integer roleId) {
        /**
         *@title: getUserByRoleId
         *@description: 查询用户 经roleId
         *@author: Mike
         *@date: 2019-06-11 11:57
         *@param: [roleId]
         *@return: java.util.List<edu.neu.hoso.model.User>
         *@throws:
         */
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andRoleIdEqualTo(roleId);
        return userMapper.selectByExample(userExample);
    }

    @Override
    public List<User> getUserByUserTitleId(Integer userTitleId) {
        /**
         *@title: getUserByUserTitleId
         *@description: 查询用户 经userTitleId
         *@author: Mike
         *@date: 2019-06-11 11:58
         *@param: [userTitleId]
         *@return: java.util.List<edu.neu.hoso.model.User>
         *@throws:
         */
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUserTitleIdEqualTo(userTitleId);
        return userMapper.selectByExample(userExample);
    }

    @Override
    public List<User> getUserByUserGender(String userGender) {
        /**
         *@title: getUserByUserGender
         *@description: 查询用户 经userGender
         *@author: Mike
         *@date: 2019-06-11 11:59
         *@param: [userGender]
         *@return: java.util.List<edu.neu.hoso.model.User>
         *@throws:
         */
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUserGenderEqualTo(userGender);
        return userMapper.selectByExample(userExample);
    }

    @Override
    public List<User> getAllUser() {
        /**
         *@title: getAllUser
         *@description: 查询所有用户
         *@author: Mike
         *@date: 2019-06-11 12:00
         *@param: []
         *@return: java.util.List<edu.neu.hoso.model.User>
         *@throws:
         */
        UserExample userExample = new UserExample();
        return userMapper.selectByExample(userExample);
    }
}