import java.util.Scanner;

public class Donguler {
    public static void DonguFonksiyonu(){
        Scanner almak = new Scanner(System.in);
        System.out.println("Bir sayı giriniz ");
        int sayi = almak.nextInt();
        System.out.printf("O dan %d sayısına kadar : ",sayi);
        for (int i = 0; i < sayi; i++) {
            System.out.print(i);
            System.out.print(",");

        }
        System.out.println();
        System.out.println("--Çift Sayılar--");
        for(int x = 0;x<sayi;++x){
            if(x%2==0){
                System.out.println(x);

            }

        }

        System.out.println("----------While Döngüsü -------------");
        int a = 0;

        while(a < sayi){

            if (a % 2 == 1){
                System.out.println(a);
            }

            a += 1;
        }







    }
    public static int Faktoriyel(int a){
//Özyinelemeli Fonksiyon kendi kendini çağırır

        if (a == 0 || a == 1) {
            return 1;
        }
        else{
            return a * Faktoriyel(a-1);
        }

    }

    public static void FaktoriyelDongu(){
        Scanner al = new Scanner(System.in); //Scanner objesi oluştu
        System.out.println("Bana bir tamsayı ver: ");
        int n = al.nextInt();

        int faktoriyeltoplam = 1;
        for (int i = 1;i<=n;++i){

            faktoriyeltoplam *= i;
        }
        System.out.println(faktoriyeltoplam);

    }
    public static void IciceDongu(){
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%4d",i);

            for (int j = 1; j <=10; j++) {
                System.out.printf("%4d", i * j);

            }
            System.out.println();

        }
    }
    public static void BreakOrnegi(){
        int i = 1;
        while (i>0){
            if (i == 8 ) {
                break;
            }
            else if (i == 4) {
                continue;
            }
            else{
                System.out.println(i);
            }
            i++;

        }
    }

}
