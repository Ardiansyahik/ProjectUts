package id.ac.polinema.ProjectUts.models;

public class Pemula_Logo {
    String Logo;
    String Nama;

    public Pemula_Logo(String logo, String nama) {
        Logo = logo;
        Nama = nama;
    }

    public void setLogo(String logo) {
        Logo = logo;
    }

    public void setNama(String nama) {
        Nama = nama;
    }

    public String getLogo() {
        return Logo;
    }

    public String getNama() {
        return Nama;
    }
}
