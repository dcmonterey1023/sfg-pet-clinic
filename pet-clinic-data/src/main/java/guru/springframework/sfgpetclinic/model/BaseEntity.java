package guru.springframework.sfgpetclinic.model;

import java.io.Serializable;

/**
 * @author d.monterey on 09/07/2020
 */
public class BaseEntity implements Serializable {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
