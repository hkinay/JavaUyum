package UniversiteYonetim;

public class IdariYonetim extends Personel{

    public String alan;

    public IdariYonetim(String isim, int id, String soyisim, int yas, String alan) {
        super(isim, id, soyisim, yas);
        this.alan = alan;
    }

    void idariAlan(){

        System.out.printf("%s, %s idare ediyor",getIsim(),alan);
    }
}
