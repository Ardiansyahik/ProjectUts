package id.ac.polinema.ProjectUts.models;

public class Gunung_Logo {
    private String logo, nama;


    public Gunung_Logo(String logo, String nama) {
        this.logo = logo;
        this.nama = nama;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
