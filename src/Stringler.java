import java.sql.SQLOutput;

public class Stringler {


   public static void StringCalisma(){
      int g = 100234;
      double d = 4.3;

      String a = "Esenyurt Belediyesi";
      String b = new String("Esenyurt Belediyesi");
      System.out.println(a==b);//false
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
      System.out.printf("contains String ifadenin istenilen karakteri barındırma kontrolünü yapar %s",a.contains("a"));
      System.out.printf("%s",a.startsWith("B"));
      System.out.printf("Valueof %s stringe çevirir",String.valueOf(g));
      System.out.printf("toString stringe çevirir %s",Integer.toString(g));
      System.out.println(Double.toString(d));



   }

   public static void StringBuilderCalisma(){
      StringBuilder yeniString = new StringBuilder("String Builder Oluşturma");
      yeniString.append(" Yeni Ekleme");
      System.out.println(yeniString);
      System.out.println(yeniString.reverse());


   }












}
