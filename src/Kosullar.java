import java.sql.SQLOutput;
import java.util.Scanner;

public class Kosullar {
    public static void Kosul() {
        //INPUT ALMAYI SAĞLAYAN SINIF SCANNER
        Scanner almak = new Scanner(System.in);
        System.out.println("Yaşınızı Giriniz : ");
        int yas = almak.nextInt();

        //koşul cümlesi

        if (yas >= 18){
            System.out.println("Ehliyet alabilirsiniz");
        }
        else{
            System.out.println("yaşınız küçüktür");
        }

        //Ternary Operatörü
        System.out.println("Ternary Operatörü Kullanımı");
        if (yas>=18) System.out.println("Ehliyet alabilirsin 2");

        /*
        Ternary
        durum ? a:b;
         */
        int x = 10;
        int y;

        y = (x==1) ? 45:50;
        System.out.println(y);
        System.out.println(x>y);


        //IF - ELSE IF - ELSE
        System.out.println("Matematik puanınızı giriniz : ");
        int matpuan = almak.nextInt();
        if(matpuan >= 80){
            System.out.println("Yüksek");
        }

     else if (matpuan >= 60){
            System.out.println("Orta");
        }
       else if(matpuan >= 40){
            System.out.println("Vasat");
        }
        else{
            System.out.println("Kötü");
        }

        //SWITCH - CASE
        System.out.println("Bir sayı giriniz :");
        int gun = almak.nextInt();
        switch (gun){
            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("Salı");
                break;
            case 3:
                System.out.println("Çarşamba"); // break yok
            case 4:
                System.out.println("Perşembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;
            default:
                System.out.println("Bu varsayılan bir durumdur");
        }
        int sayi = 3;
        switch (sayi){
            case 1:
                System.out.println("Bu 1. case dir");
                break;
            case 2:
                System.out.println("Bu 2. case dir"); // break yok
            case 5:
                System.out.println("Bu 3. case dir");
                break;
            default:
                System.out.println("bu varsayılan olarak çalışır");

        }




    }


}
