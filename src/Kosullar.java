import java.util.Scanner;

public class Kosullar {
    public static void main(String[] args) {
        //INPUT ALMAYI SAĞLAYAN SINIF SCANNER
        Scanner al = new Scanner(System.in);
        System.out.println("Yaşınızı Giriniz : ");
        int yas = al.nextInt();

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

        System.out.println("Matematik puanınızı giriniz : ");
        int matpuan = al.nextInt();
        if(matpuan >= 80){
            System.out.println("Yüksek");
        }
        else if (matpuan >= 60){
            System.out.println("Orta");
        }
        else if(matpuan>=40){
            System.out.println("Vasat");
        }
        else{
            System.out.println("Kötü");
        }


    }


}
