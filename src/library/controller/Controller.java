package library.controller;


import library.model.Model;

public class Controller {

    private ControllerAuthorization controllerAuthorization;
    private  ControllerMainPageProcessing controllerMainPageProcessing;
    private  ControllerReviewProcessing controllerReviewProcessing;
    private ControllerProcessingTextMaterial controllerProcessingTextMaterial;

    public Controller(Model model) {

    }

    public void createAuthorizationController() {}

    public void createMainPageProcessing() {}

    public void createProcessingTextMaterial() {}

    public void createControllerReviewProcessing() {}

    public ControllerAuthorization getAuthorizationController(){ return controllerAuthorization;}
    public ControllerMainPageProcessing getControllerMainPageProcessing(){ return controllerMainPageProcessing;}
    public ControllerReviewProcessing getControllerReviewProcessing(){ return  controllerReviewProcessing;}
    public ControllerProcessingTextMaterial getControllerProcessingTextMaterial(){ return controllerProcessingTextMaterial;}

}
