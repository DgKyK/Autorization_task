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
        String result = GlobalConstants.NONE;
        if(sc.hasNext()){
            while(!(((result = sc.next()) != null) && result.matches(regex))){
                view.printMessage(view.stringConcat(GlobalConstants.WRONG_INPUT,
                        GlobalConstants.SPACE,GlobalConstants.TRY_AGAIN));
            }
        }

        return result;
    }
}
