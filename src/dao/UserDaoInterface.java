package dao;

import java.sql.SQLException;

import model.User;

public interface UserDaoInterface {
public boolean addUser(User user)throws SQLException;
public User reedUser(String username,String password)throws SQLException;
public boolean validate(String username, String password)throws SQLException;

}
