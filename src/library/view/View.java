package library.view;


import library.controller.*;


public class View {

    private Controller controller;

    private HomePageWindow homePageWindow;


    public View(Controller controller) {
        this.controller = controller;
    }

    public void initialize() {
        createHomePageWindow();
        homePageWindow.display();
    }

    public void createHomePageWindow() {

        ControllerMainPageProcessing controllerMainPageProcessing = controller.getControllerMainPageProcessing();

        homePageWindow = new HomePageWindow(controllerMainPageProcessing);

    }
}
