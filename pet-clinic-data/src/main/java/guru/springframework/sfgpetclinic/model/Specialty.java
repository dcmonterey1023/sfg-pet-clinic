package guru.springframework.sfgpetclinic.model;

/**
 * @author d.monterey on 10/07/2020
 */
public class Specialty extends BaseEntity {

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
