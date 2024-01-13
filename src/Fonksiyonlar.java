public class Fonksiyonlar {

    public static void FonkDeneme (){
        System.out.println("Public method çağrıldı");


    }
    public static int IntDeneme(int a, int b){

        return a*b;
    }
    public static int IntDeneme(int a, int b, int c){

        return a*b*c;
    }
    public static int IntDeneme(int a){

        return a;
    }

    public static void RideMethod (){

    }
    public void NesneGerektiren(){

        System.out.println("Bu methodun çağrılması için nesne üretilmesi gerekir.");
    }
public int Max(int sayi1,int sayi2){
        if(sayi1>sayi2) return sayi1;
        else return sayi2;

}
public static int Topla(int a){
        if (a == 1) return 1;
        return a + Topla(a-1);

}
}
