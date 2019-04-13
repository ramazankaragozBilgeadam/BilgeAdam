package swingmvc;

import javax.swing.*;

public class StartApp {


    public static void main(String[] args) {


        //Componentlerimizi çalışma esnasında threadler yardımıyla güncelleyebilmek için
        //async threadlerimizi çalışabilmesi için SwingUtilities sınıfındaki invoke later methodunu kullanıyoruz.
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {

                StudentRegisterView studentRegisterView=new StudentRegisterView();
                StudentRegisterModel studentRegisterModel=new StudentRegisterModel();

                new StudentRegisterController(studentRegisterView,studentRegisterModel);

            }
        });


    }
}
