import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

            //Donguler.DonguFonksiyonu();
          // Kosullar.Kosul();
            //    SayiTahmin.SayiOyunu();

     int sonuc;
     sonuc = Faktoriyel(10);
        System.out.println(sonuc);

    }
    public static int Faktoriyel(int a){
       /* Scanner al = new Scanner(System.in);
        System.out.println("Bana bir sayı ver: ");
        int n = al.nextInt();
*/

        if (a == 0 || a == 1){
            return 1;
        }
        else{
            return a * Faktoriyel(a-1);
        }

    }

    public static void FaktoriyelDongu(){

    }
    public static void DegiskenTanimlama(){
        System.out.println("Merhaba Dünya");
        System.out.print("Bu kısım yanyana gelir");
        System.out.print("boşluk yok");
        System.out.println(); // Notunuzu düşebilirsiniz. Bu ifade 1 satır boşluk bırakır
        System.out.printf("Bu yazı biçimi formatlıdır %s ile kullanılır%n","prinf");
        System.out.println("Alt kısma  n ile geçer ");
        System.out.println("Bu bölümde 'a'  karakterini inceliyoruz.");

        System.out.println("Hello and welcome!");
        System.out.println("Merhaba Dünya");
        int a; //NULL
        double b;
        float c;
        char k;
        a = 5;
        b= 11.0;
        c = 12.2f;
        long l;
        short y;
        boolean t = true;
        String isim = "Ahmet"; // String tanımlama
        isim.charAt(2);

        System.out.println(a);
        System.out.println("a ile b nin toplamı " + a + b);
        System.out.println(Math.pow(a,b));
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(b%a);
        System.out.println(b/a);

        String araba = "Volvo";
        String car = new String("Volvo");
        System.out.println("------------------------------");
        int x = 0;
        x = x + 1;
        System.out.println(x); // x 1 olur
        x += 1;
        System.out.println(x); // x 2 olur
        x++;
        System.out.println(x); // x 3 olur
        ++x;
        System.out.println(x); // x 4 olur








    }


}

