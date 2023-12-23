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








    }

}
