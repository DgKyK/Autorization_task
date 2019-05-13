import controller.MainController;
import model.Model;
import view.View;

public class TestClass {
    public static void main(String[] args){
        Model model = new Model();
        View view = new View();
        MainController controller = new MainController(model, view);
        controller.startAction();
    }
}
