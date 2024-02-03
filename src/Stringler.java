import java.sql.SQLOutput;

public class Stringler {


   public static void StringCalisma(){

      String a = "Esenyurt Belediyesi";
      String b = new String("Esenyurt Belediyesi");
      System.out.println(a==b);
      System.out.println(a.equals(b));

      System.out.println(a.length());//length uzunluğunu gösterir

      for (int i = 0; i < a.length(); i++) {
         System.out.print(a.charAt(i)); // charAt istenilen karakteri yazdırı
         System.out.print(".");

      }
      System.out.println(); //boş satır için kullanılabilir
      System.out.printf("Büyük harf için %s toUpperCase kullanılır%n",a.toUpperCase());
      System.out.printf("Küçük harf için %s toLowerCase%n",a.toLowerCase());
      System.out.printf("Boşlukları gidermek için %s trim kullanılır%n",a.trim());
      System.out.printf("Karakter değiştirmek için %s replace kullanılır%n",a.replace("e","a"));
      System.out.printf("substring istenilen bölümü kesmeyi sağlar %s%n",a.substring(4,8));
      System.out.printf("substring başlangıç belirtilerek de kullanılabilir %s%n",a.substring(8));













   }












}
