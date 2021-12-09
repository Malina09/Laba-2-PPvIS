package library.view;

import library.controller.ControllerMainPageProcessing;

import javax.swing.*;

public class Autorization extends JFrame {

    ControllerMainPageProcessing controllerMainPageProcessing;


    public Autorization(ControllerMainPageProcessing controllerMainPageProcessing) {

        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 300, 300);

        JButton btnCancel = new JButton("Cancel");
        btnCancel.addActionListener(e -> dispose());

        JButton btnNewspapers = new JButton("Газеты");

        btnNewspapers.addActionListener(e ->{

        });

        JButton btnMagazine = new JButton("Журналы");

        btnMagazine.addActionListener(e ->{

        });

        JButton btnBook = new JButton("Книги");

        btnBook.addActionListener(e ->{

        });



        this.controllerMainPageProcessing = controllerMainPageProcessing;
        this.add(btnNewspapers);
        this.add(btnCancel);
        this.add(btnNewspapers);
        this.add(btnMagazine);
        this.add(btnBook);


    }
}
