package model.dao.Impl;

import model.UserInfo;
import model.dao.UserDao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

public class ImplUserDao implements UserDao {
    private Connection connection;
    private final String SELECT_ALL = "SELECT * FROM userinfo";

    public ImplUserDao(Connection connection) {
        this.connection = connection;
    }


    @Override
    public List<UserInfo> getAll() {
        List<UserInfo> usersFromDb = new LinkedList<>();
        try (Statement st = connection.createStatement()) {
            ResultSet rs = st.executeQuery(SELECT_ALL);

            while( rs.next()) {
                UserInfo temp = buildUserFromResultSet(rs);
                usersFromDb.add(temp);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return usersFromDb;
    }

    private UserInfo buildUserFromResultSet(ResultSet rs) throws SQLException {
        UserInfo temp = new UserInfo();
        temp.setFirstName(rs.getString("first_name"));
        temp.setSecondName(rs.getString("second_name"));
        temp.setNickName(rs.getString("nick_name"));
        return temp;
    }
}
