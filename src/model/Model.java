package model;

import exception.NickNameNotExclusiveException;
import model.dao.DaoFactory;
import model.dao.UserDao;

import java.util.List;


public class Model {
    private UserDao userDao;


    public Model(){

    }

    public boolean isNickNameExclusive(String inputedNickName) throws NickNameNotExclusiveException {
        DaoFactory factory = DaoFactory.getInstance();
        userDao = factory.createUserDao();
        if(userDao.findByNickName(inputedNickName) != null){
            NickNameNotExclusiveException exception = new NickNameNotExclusiveException(inputedNickName);
            throw exception;
        }

        return true;
    }
}
