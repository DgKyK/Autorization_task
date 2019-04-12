package View;

import Controller.GlobalConstants;

import java.util.Locale;
import java.util.ResourceBundle;

public class View{
    static String MESSAGES_BUNDLE_NAME = "messages";
    public static final ResourceBundle bundle =
            ResourceBundle.getBundle(
                    MESSAGES_BUNDLE_NAME,
                    new Locale("rus", "RUS"));

    public void printMessage(String message){
        System.out.println(message);
    }

    public String stringConcat(String...v){
        StringBuilder result = new StringBuilder();
        for (String i : v){
            result.append(i);
        }
        return new String(result);
    }
    public void printWrongInput(){
        printMessage(stringConcat(bundle.getString(GlobalConstants.WRONG_INPUT),
                bundle.getString(GlobalConstants.TRY_AGAIN)));
    }
}
