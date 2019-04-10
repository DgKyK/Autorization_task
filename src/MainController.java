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
        view.printMessage(view.stringConcat(GlobalConstants.INVITATION_MESSAGE,
                                            GlobalConstants.SPACE,
                                            GlobalConstants.INPUT_MESSAGE));
        inputProcess();
        view.printMessage(model.getStringUserInfo());
    }

    /* help methods*/
    private void inputProcess(){
        model.setUserName(inputedInfo.InputAndChekValid(GlobalConstants.INPUT_NAME, GlobalConstants.NAME_REGEX));
        model.setUserSurName(inputedInfo.InputAndChekValid(GlobalConstants.INPUT_SURNAME,GlobalConstants.SURNAME_REGEX));
        model.setUserNickName(inputedInfo.InputAndChekValid(GlobalConstants.INPUT_NICKNAME,GlobalConstants.NICK_NAME_REGEX));
    }


}
