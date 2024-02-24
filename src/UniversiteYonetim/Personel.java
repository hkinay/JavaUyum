package UniversiteYonetim;

public abstract class Personel {

    private String isim;
    private  int id;
    private String soyisim;
    public int maas = 40000;

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    private int yas;

    public Personel(String isim, int id, String soyisim, int yas) {
        this.isim = isim;
        this.id = id;
        this.soyisim = soyisim;
        this.yas = yas;
    }

    void MaasAlma(int maas){
        System.out.println("Maaşınız " + maas);
    }

    void BilgiGoster(){
        System.out.println("Bilgileriniz : "+ isim +" " + soyisim + " " +  yas + " " + id );
    }


}
