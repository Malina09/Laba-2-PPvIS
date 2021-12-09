package library.view;

import library.controller.ControllerMainPageProcessing;

import javax.swing.*;

public class ReviewInterface extends JFrame {
    ControllerMainPageProcessing controllerMainPageProcessing;


    public ReviewInterface(ControllerMainPageProcessing controllerMainPageProcessing) {

        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 300, 300);

        JButton btnCancel = new JButton("Cancel");
        btnCancel.addActionListener(e -> dispose());

        JButton btnRemoveReview = new JButton("Удалить отзыв");

        btnRemoveReview.addActionListener(e ->{

        });

        JButton btnAddReview = new JButton("Добавить отзыв");

        btnAddReview.addActionListener(e ->{

        });

        JButton btnRenewReview = new JButton("Обновить отзыв");

        btnRenewReview.addActionListener(e ->{

        });

        JButton btnViewTheReview = new JButton("Просмотреть отзыв");

        btnViewTheReview.addActionListener(e ->{

        });



        this.controllerMainPageProcessing = controllerMainPageProcessing;
        this.add(btnAddReview);
        this.add(btnCancel);
        this.add(btnRemoveReview);
        this.add(btnRenewReview);
        this.add(btnViewTheReview);


    }
}
