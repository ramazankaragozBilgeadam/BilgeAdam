package swingornek;

import javax.swing.*;

public class StartApp {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CalculatorController(new CalculatorView(),new CalculatorModel());
            }
        });

    }
}
