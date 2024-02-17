package OOP;

public abstract class Personel {
    private String name;
    private String id;
   private String sigortasicil;
   private int maas;

    public Personel(String name, String id, String sigortasicil, int maas) {
        this.name = name;
        this.id = id;
        this.sigortasicil = sigortasicil;
        this.maas = maas;
    }
    public void bilgiGoster() {
        System.out.println("İsmi " + name + " ve ID si" + id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSigortasicil() {
        return sigortasicil;
    }

    public void setSigortasicil(String sigortasicil) {
        this.sigortasicil = sigortasicil;
    }

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }
}
