package swingmvc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentRegisterController {

    private StudentRegisterView view;
    private StudentRegisterModel model;

    public StudentRegisterController(StudentRegisterView view,StudentRegisterModel model){

        this.view=view;
        this.model=model;

        this.view.getSaveButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                model.onSaveButtonAction(
                        view.getNameField().getText(),
                        view.getSurnameField().getText(),
                        view.getPhoneField().getText(),
                        view.getAddressField().getText());

            }
        });


        this.view.getListButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.writeStudentList();
            }
        });



    }

}
