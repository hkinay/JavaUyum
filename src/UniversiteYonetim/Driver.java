package UniversiteYonetim;

public class Driver {
    public static void main(String[] args) {

       /* Faculty faculty = new Faculty("Ahmet",20,"Kaplan",35,"Yazılım Mühendisliği");
        faculty.BilgiGoster();
        faculty.MaasAlma(40000);*/


        Hoca a = new Hoca("Hüseyin",11,"Kınay",38,"Bilgisayar Programcılığı","Öğr. Gör.");

        a.MaasAlma(0);
        a.BilgiGoster();
        System.out.println();

        System.out.println("-----------------------------------------");

    IdariYonetim idariYonetim = new IdariYonetim("Jale",19,"Akkor",49,"Personel Daire Başkanlığı");
    idariYonetim.idariAlan();


    Rektor rektor = (Rektor) new IdariYonetim("Hasan",34,"Uğur",45,"Üniversite");
    }
}
