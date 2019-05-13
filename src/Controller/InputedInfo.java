package Controller;


import View.View;

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
}
