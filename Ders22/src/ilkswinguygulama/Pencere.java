package ilkswinguygulama;

import javax.swing.*;
import java.awt.*;

public class Pencere extends JFrame {

    private JLabel displayLabel;

    public Pencere(JLabel displayLabel){

        this.displayLabel=displayLabel;

        GridLayout gridLayout=new GridLayout(1,1,40,40);
        this.setLayout(gridLayout);
        this.setTitle("İkinci ilkswinguygulama.Pencere");
        this.setSize(200,200);
        //this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setLocationRelativeTo(null);

        this.add(displayLabel);
    }

}
