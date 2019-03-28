package com.neo.bean;

public class User {
  private int id;
  private String userName;
  private String passWord;
  private String user_sex;
  private String nick_name;
  
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getPassWord() {
	return passWord;
}
public void setPassWord(String passWord) {
	this.passWord = passWord;
}
public String getUser_sex() {
	return user_sex;
}
public void setUser_sex(String user_sex) {
	this.user_sex = user_sex;
}
public String getNick_name() {
	return nick_name;
}
public void setNick_name(String nick_name) {
	this.nick_name = nick_name;
}
 
  public User() {
	// TODO Auto-generated constructor stub
}
public User(int id, String userName, String passWord, String user_sex, String nick_name) {
	super();
	this.id = id;
	this.userName = userName;
	this.passWord = passWord;
	this.user_sex = user_sex;
	this.nick_name = nick_name;
}
@Override
public String toString() {
	return "User [id=" + id + ", userName=" + userName + ", passWord=" + passWord + ", user_sex=" + user_sex
			+ ", nick_name=" + nick_name + "]";
}
  
}
