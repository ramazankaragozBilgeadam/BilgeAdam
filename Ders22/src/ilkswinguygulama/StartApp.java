package ilkswinguygulama;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartApp {

    public static void main(String[] args) {

        JFrame ilkPencere=new JFrame("İlk Penceremiz");
        //ilkPencere.setTitle("İlk Penceremiz");
        //Penceremizin boyutunu ayarlıyoruz.
        ilkPencere.setSize(400,400);
        //Penceremizin görünürlüğünü ayarlıyoruz.
        ilkPencere.setVisible(true);
        //Penceremizin konumunu ayarlamak için
        //Center(orta) kısımda açılması için null set ediyoruz.
        ilkPencere.setLocationRelativeTo(null);
        //Penceremizin kaptılması için default close ayarını yapıyoruz.
        ilkPencere.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Penceremizdeki componentleri konumlandırmak için panel oluşturuyoruz.
        JPanel panel=new JPanel();
        //Componentlerimizin soldan sağa doğru sıralanması için layout oluşturduk.
        FlowLayout flowLayout=new FlowLayout(FlowLayout.LEFT,40,40);
        //Layout objemizi set ediyoruz.
        panel.setLayout(flowLayout);

        //Etiket componentimizi oluşturuyoruz.
        JLabel jLabel=new JLabel("Adı: ");

        //İnput componentini oluşturuyoruz kullanıcıdan bir değer almak için.
        JTextField jTextField=new JTextField(20);

        JButton jButton=new JButton("Kaydet");

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Buton submit(tıklandığında) olduğun da yapılacak işlemi ele alır.

                if (!jTextField.getText().equals("")) {
                    System.out.println(jTextField.getText());
                    //jTextField.setText("");
                }
                Pencere pencere=new Pencere(new JLabel(jTextField.getText()));
            }
        });

        //Label componentini ekliyoruz.
        panel.add(jLabel);
        panel.add(jTextField);
        panel.add(jButton);
        ilkPencere.add(panel);






    }
}
