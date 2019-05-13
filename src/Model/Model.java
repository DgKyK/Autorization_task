package Model;

import Exception.NickNameNotExclusiveException;
import Model.dao.DaoFactory;
import Model.dao.UserDao;

import java.util.List;


public class Model {
    private UserDao userDao;


    public Model(){

    }

    public boolean isNickNameExclusive(String inputedNickName) throws NickNameNotExclusiveException {
        DaoFactory factory = DaoFactory.getInstance();
        userDao = factory.createUserDao();
        List<UserInfo> userInfoList = userDao.getAll();
        for(UserInfo user : userInfoList){
            if(inputedNickName.equals(user.getNickName())){
                NickNameNotExclusiveException exception = new NickNameNotExclusiveException(inputedNickName);
                throw exception;
            }
        }

        return true;
    }
}
