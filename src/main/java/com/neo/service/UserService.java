package com.neo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neo.bean.User;
import com.neo.mapper.UserMapper;


@Service
public class UserService {
@Autowired
private   UserMapper  userMapper;

public List<User> getMessage(){
    List<User> list = new ArrayList<User>();
    list.add(userMapper.selectByPrimaryKey("xtt"));
    //list = mapper.selectAll();
    return list;
}

public List<User> getAllMessage(){
    List<User> list = new ArrayList<User>();
    list = userMapper.selectAll();
    return list;
}

public int addMessage(User User) {
   return userMapper.insert(User);
}

public List<User> getMessageById(String id) {
   return userMapper.getMessById(id);
}

public int delMessage(String id) {
   return userMapper.deleteByPrimaryKey(id);
}

public User dologin(User users) {
    users=this.userMapper.login(users.getNick_name(), users.getPassWord());
     System.out.println("到这了么");
    return users;
}

}
