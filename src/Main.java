
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");
        System.out.println("Merhaba Dünya");
        int a;
        double b;
        float c;
        char k;
        a = 5;
        b= 11.0;
        c = 12.2f;
        long l;
        short y;
        boolean t = true;

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
        System.out.println(x);
        x += 1;
        System.out.println(x);
        x++;
        System.out.println(x);
        ++x;
        System.out.println(x);


    }
}