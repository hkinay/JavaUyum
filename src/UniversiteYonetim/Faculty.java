package UniversiteYonetim;


public class Faculty extends Personel {

    public final int maasartisi = 2500;

    private String bolum;

    public Faculty(String isim, int id, String soyisim, int yas,String bolum) {
        super(isim, id, soyisim, yas);
        this.bolum = bolum;
    }

    @Override
    void MaasAlma(int maas) {
        maas = maas + maasartisi;
        super.MaasAlma(maas);

    }
}
