package swingornek;

import javax.swing.*;
import java.awt.*;

public class CalculatorView extends JFrame {

    JLabel sayi1Label;
    JLabel sayi2Label;
    JLabel sumLabel;
    JLabel resultLabel;

    JTextField sayi1Field;
    JTextField sayi2Field;

    JButton sumButton;

    JPanel sayi1Panel;
    JPanel sayi2Panel;
    JPanel buttonPanel;
    JPanel resultPanel;

    public CalculatorView(){

        this.setTitle("Calculator");
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400,400);

        this.setLayout(new BoxLayout(getContentPane(),BoxLayout.PAGE_AXIS));

        sayi1Label=new JLabel("Sayi1: ");
        sayi2Label=new JLabel("Sayi2: ");
        sumLabel=new JLabel("Toplam: ");
        resultLabel=new JLabel("0");

        sayi1Field=new JTextField(20);
        sayi2Field=new JTextField(20);

        sumButton=new JButton("Topla");

        sayi1Panel=new JPanel();
        sayi1Panel.setLayout(new GridLayout(1,2));
        sayi1Panel.add(sayi1Label);
        sayi1Panel.add(sayi1Field);

        sayi2Panel=new JPanel();
        sayi2Panel.setLayout(new GridLayout(1,2));
        sayi2Panel.add(sayi2Label);
        sayi2Panel.add(sayi2Field);

        buttonPanel=new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
        buttonPanel.add(sumButton);

        resultPanel=new JPanel();
        resultPanel.setLayout(new FlowLayout(FlowLayout.LEFT,40,40));
        resultPanel.add(sumLabel);
        resultPanel.add(resultLabel);

        this.add(sayi1Panel);
        this.add(sayi2Panel);
        this.add(buttonPanel);
        this.add(resultPanel);
        this.pack();


    }


    public JLabel getSayi1Label() {
        return sayi1Label;
    }

    public JLabel getSayi2Label() {
        return sayi2Label;
    }

    public JLabel getSumLabel() {
        return sumLabel;
    }

    public JLabel getResultLabel() {
        return resultLabel;
    }

    public JTextField getSayi1Field() {
        return sayi1Field;
    }

    public JTextField getSayi2Field() {
        return sayi2Field;
    }

    public JButton getSumButton() {
        return sumButton;
    }
}
