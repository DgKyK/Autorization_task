package Controller;

import Controller.InputedInfo;
import Model.Model;
import View.View;

import static Controller.GlobalConstants.*;
import static Controller.RegexData.*;


public class MainController {
    private Model model;
    private View view;
    private InputedInfo inputedInfo;

    public MainController(Model model, View view){
        this.model = model;
        this.view = view;
        this.inputedInfo = new InputedInfo();
    }

    public void startAction(){
        view.printMessage(view.stringConcat(View.bundle.getString(INVITATION_MESSAGE),
                                            View.bundle.getString(INPUT_MESSAGE)));
        inputProcess();
        view.printMessage(model.getStringUserInfo());
    }

    /* help methods*/
    private void inputProcess(){
        model.setUserName(inputedInfo.InputAndChekValid(View.bundle.getString(INPUT_NAME), NAME_REGEX));
        model.setUserSurName(inputedInfo.InputAndChekValid(View.bundle.getString(INPUT_SURNAME), SURNAME_REGEX));
        model.setUserNickName(inputedInfo.InputAndChekValid(View.bundle.getString(INPUT_NICKNAME), NICK_NAME_REGEX));
    }


}
