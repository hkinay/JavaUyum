import java.util.Scanner;

public class Diziler {
    public static void diziCalisma(){
        int [] sayilar = new int[10];

        sayilar[0] = 10;
        sayilar[1] = 12;
        sayilar[9] = 23;

        String[] ogrenciler = {"Ayşe","Mehmet","Hasan","Zeynep"};
        String[] liste2 ={"Kemal","Ali","Beyza"};
        for (int i = 0; i < ogrenciler.length; i++) {
            System.out.print(ogrenciler[i]+ " ");


            }
        System.out.println();
        Scanner al = new Scanner(System.in);
        for (int x = 0; x < sayilar.length; x++) {
            System.out.println("Sayı Giriniz : ");
            sayilar[x]=al.nextInt();


        }
        System.out.print("Sayılar Dizisi: " );
     /*   for (int b = 0; b < sayilar.length; b++) {
            System.out.print(sayilar[b]+" ");


        }*/

        for (int b : sayilar){//foreach
            System.out.print(sayilar[b]+" ");
        }
    }




}
