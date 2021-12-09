package library;

import library.controller.Controller;
import library.model.Model;
import library.view.View;

public class Injector {
    public static void main(String[] args) {
        Model model = new Model();
        Controller controller = new Controller(model);
        View view = new View(controller);

        view.initialize();
    }
}
