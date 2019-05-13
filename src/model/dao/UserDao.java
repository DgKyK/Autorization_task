package model.dao;

import model.UserInfo;

import java.util.List;

public interface UserDao {
    List<UserInfo> getAll();
}
