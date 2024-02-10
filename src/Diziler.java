import java.util.Arrays;
import java.util.Scanner;

public class Diziler {
    public static void diziCalisma(){
        int [] sayilar = new int[10];

        sayilar[0] = 10;
        sayilar[1] = 12;
        sayilar[9] = 23;


        Arrays.toString(sayilar);



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

    public static void ikiBoyutlu(){

        String [][] isimler = {{"Ahmet","Hasan","Ayşe"},{"Kemal","Fatma","Berk"},{"Asaf","Asım","Salih"}};
        int sayilar[][]= new int[3][3];

        sayilar[0][0] = 5;
        sayilar[0][1] = 10;
        sayilar[0][2] = 15;

        sayilar[1][0] = 20;
        sayilar[1][1] = 25;
        sayilar[1][2] = 30;

        sayilar[2][0] = 35;
        sayilar[2][1] = 40;
        sayilar[2][2] = 45;
       // int[][] sayilar2 = {{5,10,15},{20,25,30},{35,40,45}};



      //  System.out.println(isimler[1][2]);

        for (int i = 0; i < sayilar.length; ++i) {
            for (int j = 0; j < sayilar[i].length; ++j) {
                System.out.print(sayilar[i][j]+ " ");

            }
            System.out.println();

        }



    }
    public static void ikiBoyutluKorelasyon(){
        int tablo[][] = new int[5][5];

        /*
        tablo[0][0] = 0;
        tablo[1][1] = 0;
        tablo[1][2] = 1;
        tablo[2][1] = -1;
        */
        for (int i = 0; i < tablo.length; i++) {
            for (int j = 0; j < tablo[i].length; j++) {
                if(i==j)
                    tablo[i][j]=0;
                else if (i<j) {
                    tablo[i][j] = 1;

                }
                else {
                    tablo[i][j]=-1;
                }

                System.out.print(tablo[i][j]+ " ");

            }


        }



    }




}
