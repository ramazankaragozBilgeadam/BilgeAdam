package swingornek;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController {

    private CalculatorView view;
    private CalculatorModel model;
    private String sayi1;
    private String sayi2;
    private String result;


    public CalculatorController(CalculatorView view, CalculatorModel model) {
        this.view = view;
        this.model = model;

        view.getSumButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                sayi1=view.getSayi1Field().getText();
                sayi2=view.getSayi2Field().getText();

                if (sayi1!=null&&sayi2!=null&&!sayi1.isEmpty()&&!sayi2.isEmpty()) {
                    result = String.valueOf(model.topla(Double.parseDouble(sayi1), Double.parseDouble(sayi2)));
                }

                if (result!=null){

                    view.getResultLabel().setText(result);
                }

            }
        });
    }
}
