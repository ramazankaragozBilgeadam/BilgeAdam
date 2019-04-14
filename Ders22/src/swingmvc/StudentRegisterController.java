package swingmvc;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
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


        view.getStudentJList().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent event) {

                if (!event.getValueIsAdjusting()) {

                    if (view.getStudentJList().getSelectedValue() instanceof Student) {
                        Student student = (Student) view.getStudentJList().getSelectedValue();
                        //System.out.println(student);
                        model.setSelectedStudent(student);
                    }
                }

            }
        });


        view.getRemoveButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.deleteStudent(model.getSelectedStudent());
                onStudentList();
            }
        });



    }



    public void onStudentList(){


        List<Student> studentList=model.getStudentList();

        if (studentList.size()>0){

            DefaultListModel defaultListModel=new DefaultListModel();

            for (Student student:studentList){
                defaultListModel.addElement(student);
            }

            view.getStudentJList().setModel(defaultListModel);
        }else if (studentList.size()==0){

            DefaultListModel defaultListModel=new DefaultListModel();
            defaultListModel.addElement(new String("Listede eleman kalmadı."));
            view.getStudentJList().setModel(defaultListModel);

        }

    }

}
