package library.view;

import library.controller.ControllerMainPageProcessing;

import javax.swing.*;

public class TextMaterialInterface extends JFrame{

    ControllerMainPageProcessing controllerMainPageProcessing;


    public TextMaterialInterface(ControllerMainPageProcessing controllerMainPageProcessing) {

        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 300, 300);

        JButton btnCancel = new JButton("Cancel");
        btnCancel.addActionListener(e -> dispose());

        JButton btnRemoveTextMaterial = new JButton("Удалить текстовый материал");

        btnRemoveTextMaterial.addActionListener(e ->{

        });

        JButton btnAddTextMaterial = new JButton("Добавить текстовый материал");

        btnAddTextMaterial.addActionListener(e ->{

        });

        JButton btnRenewTextMaterial = new JButton("Обновить текстовый материал");

        btnRenewTextMaterial.addActionListener(e ->{

        });

        JButton btnViewTheTextMaterial = new JButton("Просмотреть текстовый материал");

        btnViewTheTextMaterial.addActionListener(e ->{

        });



        this.controllerMainPageProcessing = controllerMainPageProcessing;
        this.add(btnAddTextMaterial);
        this.add(btnCancel);
        this.add(btnRemoveTextMaterial);
        this.add(btnRenewTextMaterial);
        this.add(btnViewTheTextMaterial);


    }
}
