package kosulluifadeler;

import java.util.Scanner;

public class SwitchCaseStringApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Hangi gün haftanın kaçıncı günü:");
        String haftaninGunu = input.next();

        switch (haftaninGunu) {
            case "pazartesi":
                System.out.println("Haftanın 1. günüdür.");
                break;
            case "salı":
                System.out.println("Haftanın 2. günüdür.");
                break;
            case "çarşamba":
                System.out.println("Haftanın 3. günüdür.");
                break;
            case "perşembe":
                System.out.println("Haftanın 4. günüdür.");
                break;
            case "cuma":
                System.out.println("Haftanın 5. günüdür.");
                break;
            case "cumartesi":
                System.out.println("Haftanın 6. günüdür.");
                break;
            case "pazar":
                System.out.println("Haftanın 7. günüdür.");
                break;
            default:
                System.out.println("Yanlış ifade girdiniz.");
        }

    }
}
