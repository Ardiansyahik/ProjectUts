package id.ac.polinema.ProjectUts.models;

public class Gunung_Logo {
    private String logo, name, description ;

    public Gunung_Logo(String logo, String name, String description) {
        this.logo = logo;
        this.name = name;
        this.description = description;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLogo() {
        return logo;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
