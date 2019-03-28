package com.neo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.neo.bean.User;
@Mapper
public interface UserMapper {
	int deleteByPrimaryKey(String id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    
    List<User> selectAll();

    List<User> getMessById(String id);
    
    public User login(String userName, String passWord);
}
