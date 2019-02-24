package kompozisyon;

public class Motor {

    private int motorGucu;


    public Motor() {
        this.motorGucu=130;
    }

    public void motoruCalistir(){

        if (motorGucu>0){
            System.out.println("Motor çalışıyor.");
        }else {
            System.out.println("Motor çalıştırılmadı.");
        }

    }

    public void motoruDurdur(){
        System.out.println("Motor durduruldu...");
        this.motorGucu=0;
    }
}
