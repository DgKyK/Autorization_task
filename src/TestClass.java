import Controller.MainController;
import Model.Model;
import View.View;

public class TestClass {
    public static void main(String[] args){
        Model model = new Model();
        View view = new View();
        MainController controller = new MainController(model, view);
        controller.startAction();
    }
}
