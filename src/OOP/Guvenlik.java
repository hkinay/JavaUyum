package OOP;

public class Guvenlik extends Personel{
    private  boolean sertifikali;
    private String guvenlikSeviyesi;

    public Guvenlik(String name, String id, String sigortasicil, int maas, boolean sertifikali, String securityClearanceLevel) {
        super(name, id, sigortasicil, maas);
       this.sertifikali = sertifikali;
        this.guvenlikSeviyesi = securityClearanceLevel;
    }



}
