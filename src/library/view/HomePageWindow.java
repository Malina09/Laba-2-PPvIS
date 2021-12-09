package library.view;

import library.controller.ControllerMainPageProcessing;
import library.view.HomePageWindow;

import javax.swing.*;
import java.util.Arrays;
import javax.swing.JButton;


public class HomePageWindow extends JFrame{

    ControllerMainPageProcessing controllerMainPageProcessing;


    public HomePageWindow(ControllerMainPageProcessing controllerMainPageProcessing) {

        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 300, 300);

        JButton btnCancel = new JButton("Cancel");
        btnCancel.addActionListener(e -> dispose());

        JButton btnAuthorization = new JButton("Авторизация");

        btnAuthorization.addActionListener(e ->{
            JOptionPane.showMessageDialog(this,
                    "Вы ввели неправильный логин или пароль",
                    "Ошибка авторизации",
                    JOptionPane.ERROR_MESSAGE);

        });
        this.controllerMainPageProcessing = controllerMainPageProcessing;
        //operationChoiceWindow = new OperationChoiceWindow(operationChoiceController);

    }

    public void display() {
        setVisible(true);
    }
}


