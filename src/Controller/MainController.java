package Controller;


import Model.Model;
import View.View;
import Model.UserInfo;

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
        userInfo.setNickName(inputedInfo.InputAndChekValid(View.bundle.getString(INPUT_NICKNAME), NICK_NAME_REGEX));
    }


}
