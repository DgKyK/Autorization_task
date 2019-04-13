package Controller;


import Model.Model;
import View.View;
import Model.UserInfo;
import Exception.NickNameNotExclusiveException;

import static Controller.GlobalConstants.*;
import static Controller.RegexData.*;


public class MainController {
    private Model model;
    private UserInfo userInfo;
    private View view;
    private InputedInfo inputedInfo;

    public MainController(Model model, View view){
        this.model = model;
        this.view = view;
        this.inputedInfo = new InputedInfo();
        this.userInfo = new UserInfo();
    }

    public void startAction(){
        view.printMessage(view.stringConcat(View.bundle.getString(INVITATION_MESSAGE),
                                            View.bundle.getString(INPUT_MESSAGE)));
        inputProcess();
        view.printMessage(userInfo.toString());
    }

    /* help methods*/
    private void inputProcess(){
        userInfo.setFirstName(inputedInfo.InputAndChekValid(View.bundle.getString(INPUT_NAME), NAME_REGEX));
        userInfo.setSecondName(inputedInfo.InputAndChekValid(View.bundle.getString(INPUT_SURNAME), SURNAME_REGEX));
        userInfo.setNickName(inputAndCheckNicName());
    }

    private String inputAndCheckNicName(){
        String inputedNickname;
        while(true){
            try{
                inputedNickname = inputedInfo.InputAndChekValid(View.bundle.getString(INPUT_NICKNAME), NICK_NAME_REGEX);
                inputedInfo.isNickNameExclusive(inputedNickname);
                break;
            }catch(NickNameNotExclusiveException e){
                view.printMessage(view.stringConcat(e.getWrongNickName(),View.bundle.getString(NICKNAME_ALREADY_EXIST),
                        View.bundle.getString(INPUT_ANOTHER_NICKNAME)));
            }
        }

        return inputedNickname;
    }
}
