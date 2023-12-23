import java.util.Random;
import java.util.Scanner;

public class SayiTahmin {
    public static void SayiOyunu(){

        Scanner sayial = new Scanner(System.in);
        int hak = 3;
        //int uretilensayi = 15;
        Random uret = new Random();
        int ust = 100;
        int uretilensayi = uret.nextInt(ust);
        System.out.println(uretilensayi);


        while (hak > 0){
            System.out.println("Bir sayı tahmin ediniz :");
            int kullanicisayisi = sayial.nextInt();
            hak = hak - 1;
            if (kullanicisayisi == uretilensayi){
                System.out.println("Tebrikler");
                break;
            }
            else{
                System.out.println("Bilemediniz. Kalan Hakkınız : " + hak);
                }


        }
        if (hak == 0){
            System.out.println("Oyunu kaybettiniz. Bilemediğiniz sayı : " + uretilensayi);

        }



    }
}
