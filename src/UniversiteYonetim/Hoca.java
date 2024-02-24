package UniversiteYonetim;

public class Hoca extends Faculty{

    public String titre;


    public Hoca(String isim, int id, String soyisim, int yas, String bolum,String titre) {
        super(isim, id, soyisim, yas, bolum);
        this.titre = titre;
    }

    @Override
    void BilgiGoster() {
        System.out.printf("Hocanın Bilgileri: %s,%s,%d,%s",getIsim(),getSoyisim(),getId(),titre);

    }
}
