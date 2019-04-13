package Controller;

import DB.DBUsers;
import View.View;
import Exception.NickNameNotExclusiveException;

import java.util.Scanner;

public class InputedInfo{
    private Scanner sc;
    private View view;

    public InputedInfo(){
        this.sc = new Scanner(System.in);
        this.view = new View();
    }

    public String InputAndChekValid(String message, String regex){
        view.printMessage(message);
        String result;
        while(!(sc.hasNext() && (result = sc.next()).matches(regex))){
            view.printWrongInput();
        }
        return result;
    }

    public boolean isNickNameExclusive(String inputedNickName) throws NickNameNotExclusiveException{
        DBUsers[] dbUsers = DBUsers.values();
        for(DBUsers user : dbUsers){
            if(inputedNickName.equals(user.getNickName())){
                NickNameNotExclusiveException exception = new NickNameNotExclusiveException(inputedNickName);
                throw exception;
            }
        }
        return true;

    }
}
