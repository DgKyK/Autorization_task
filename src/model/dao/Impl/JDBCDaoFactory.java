package model.dao.Impl;

import model.dao.DaoFactory;
import model.dao.UserDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class JDBCDaoFactory extends DaoFactory {
    @Override
    public UserDao createUserDao() {
        return new ImplUserDao(getConnection());
    }

    private Connection getConnection() {
        ResourceBundle bundle = ResourceBundle.getBundle("dbinfo");
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(bundle.getString("url"),
                    bundle.getString("user"),
                    bundle.getString("password"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}