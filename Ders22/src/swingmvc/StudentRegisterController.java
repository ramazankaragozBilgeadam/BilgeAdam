package swingmvc;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

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

                //Model sınıfından listemizi getiriyoruz.
                List<Student> studentList=model.getStudentList();

                //JList bileşenine yeni bir element eklemek için defaultListModel,
                //objesi gerekiyor.Bunun için bu objeyi oluşturuyoruz.
                //Student objelerimizi defaultListmodel objesine ekliyoruz.
                DefaultListModel defaultListModel=new DefaultListModel();

                if (studentList.size()>0){

                    //model'den gelen studentListesini for ile dönerek,
                    //defaultListModel nesnesine tek tek ekliyoruz.
                    for (Student student:studentList){
                        defaultListModel.addElement(student);
                    }

                    //Objelerimizin listelenebilmesi için defaultListModel nesnesini,
                    //JList bileşenine set ediyoruz.
                    view.getStudentJList().setModel(defaultListModel);
                }
            }
        });



    }

}
