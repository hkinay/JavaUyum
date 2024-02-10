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
    public static void paraUstu(){

        int[] tedavul = new int[7];
        tedavul[0] = 200;
        tedavul[1] = 100;
        tedavul[2] = 50;
        tedavul[3] = 20;
        tedavul[4] = 10;
        tedavul[5] = 5;
        tedavul[6] = 1;

        //int [] tedavul = {200,100,50,20,10,5,1};

        Scanner al = new Scanner(System.in);
        System.out.println("Para Üstünü Giriniz : ");
        int para = al.nextInt();

        for (int i = 0; i < tedavul.length; i++) {
            int sayi = para/tedavul[i];
            if (sayi!=0)
                    System.out.println(sayi + " adet " + tedavul[i]);

            para = para - sayi * tedavul[i];

        }

    }




}
