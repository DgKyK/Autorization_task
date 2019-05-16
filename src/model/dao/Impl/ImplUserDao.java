package model.dao.Impl;

import model.UserInfo;
import model.dao.UserDao;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class ImplUserDao implements UserDao {
    private Connection connection;
    private final String SELECT_ALL = "SELECT * FROM userinfo";
    private final String SELECT_BY_NICK_NAME = "SELECT * FROM userinfo WHERE nick_name = ?";

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

    @Override
    public UserInfo findByNickName(String nickName) {
        try (PreparedStatement ps = connection.prepareStatement(SELECT_BY_NICK_NAME)) {
            ps.setString(1,nickName);
            ResultSet rs = ps.executeQuery();
            if(rs.next()) {
                UserInfo temp = buildUserFromResultSet(rs);
                return temp;
            }
        } catch(SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    private UserInfo buildUserFromResultSet(ResultSet rs) throws SQLException {
        UserInfo temp = new UserInfo();
        temp.setFirstName(rs.getString("first_name"));
        temp.setSecondName(rs.getString("second_name"));
        temp.setNickName(rs.getString("nick_name"));
        return temp;
    }
}
