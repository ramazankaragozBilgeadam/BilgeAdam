package swingmvc;

import javax.swing.*;
import java.awt.*;

public class StudentRegisterView extends JFrame {

    private JLabel nameLabel;
    private JLabel surnameLabel;
    private JLabel phoneLabel;
    private JLabel addresslabel;

    private JTextField nameField;
    private JTextField surnameField;
    private JTextField phoneField;
    private JTextArea addressField;

    private JButton saveButton;
    private JButton listButton;
    private JButton removeButton;
    private JList studentJList;

    private JScrollPane jScrollPane;

    private JPanel namePanel;
    private JPanel surnamePanel;
    private JPanel addressPanel;
    private JPanel phonePanel;
    private JPanel buttonPanel;
    private JPanel listPanel;

    public StudentRegisterView(){

        this.setTitle("Student Register");
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setSize(500,400);

        this.setLayout(new BoxLayout(getContentPane(),BoxLayout.PAGE_AXIS));

        this.nameLabel=new JLabel("Name: ");
        this.surnameLabel=new JLabel("Surname: ");
        this.phoneLabel=new JLabel("Phone: ");
        this.addresslabel=new JLabel("Address: ");

        this.nameField=new JTextField(20);
        this.surnameField=new JTextField(20);
        this.phoneField=new JTextField(20);
        this.addressField=new JTextArea(4,20);

        this.saveButton=new JButton("Save");
        this.listButton=new JButton("List");
        this.removeButton=new JButton("Remove");


        //Containerlarımızı oluşturuyoruz
        //Herbirinin layout özelliğini set edip
        //İçerisinde oluşacak bileşenlerimizi ekliyoruz.
        this.namePanel=new JPanel(new GridLayout(1,2));
        this.namePanel.add(nameLabel);
        this.namePanel.add(nameField);

        this.surnamePanel=new JPanel(new GridLayout(1,2));
        this.surnamePanel.add(surnameLabel);
        this.surnamePanel.add(surnameField);

        this.phonePanel=new JPanel(new GridLayout(1,2));
        this.phonePanel.add(phoneLabel);
        this.phonePanel.add(phoneField);

        this.addressPanel=new JPanel();
        this.addressPanel.setLayout(new BoxLayout(addressPanel,BoxLayout.LINE_AXIS));
        this.addressPanel.add(addresslabel);
        this.addressPanel.add(addressField);

        this.buttonPanel=new JPanel();
        buttonPanel.setLayout(new BoxLayout(buttonPanel,BoxLayout.LINE_AXIS));
        buttonPanel.add(saveButton);
        buttonPanel.add(listButton);
        buttonPanel.add(removeButton);


        //Datalarımızı listelemek için JList bileşenini oluşturuyorum.
        studentJList=new JList();
        //JList bileşenime scroll özellği eklemek için scroll pane oluşturuyorum.
        jScrollPane=new JScrollPane();
        //JScrollpane bileşeninin viewPort methodu yardımıyla scroll özelliğini veriyorum.
        jScrollPane.getViewport().add(studentJList);

        listPanel=new JPanel();
        listPanel.setLayout(new BoxLayout(listPanel,BoxLayout.LINE_AXIS));
        //JListimizi görüntülemek için scrollpane bileşenini panele ekliyoruz.
        listPanel.add(jScrollPane);

        //Containerlarımızı penceremize ekliyoruz
        this.add(namePanel);
        this.add(surnamePanel);
        this.add(phonePanel);
        this.add(addressPanel);
        this.add(buttonPanel);
        this.add(listPanel);
        this.pack();

    }

    public JLabel getNameLabel() {
        return nameLabel;
    }

    public JLabel getSurnameLabel() {
        return surnameLabel;
    }

    public JLabel getPhoneLabel() {
        return phoneLabel;
    }

    public JLabel getAddresslabel() {
        return addresslabel;
    }

    public JTextField getNameField() {
        return nameField;
    }

    public JTextField getSurnameField() {
        return surnameField;
    }

    public JTextField getPhoneField() {
        return phoneField;
    }

    public JTextArea getAddressField() {
        return addressField;
    }

    public JButton getSaveButton() {
        return saveButton;
    }

    public JButton getListButton() {
        return listButton;
    }

    public JList getStudentJList() {
        return studentJList;
    }

    public JButton getRemoveButton() {
        return removeButton;
    }
}
