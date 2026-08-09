package app.familygem.model;

import org.folg.gedcom.model.Person;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class PersonWrapper implements Serializable {
    private String personId;
    private String socialEstate;
    private List<Association> associations;

    public PersonWrapper(String personId) {
        this.personId = personId;
        this.associations = new ArrayList<>();
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getSocialEstate() {
        return socialEstate;
    }

    public void setSocialEstate(String socialEstate) {
        this.socialEstate = socialEstate;
    }

    public List<Association> getAssociations() {
        return associations;
    }

    public void setAssociations(List<Association> associations) {
        this.associations = associations;
    }

    public void addAssociation(Association association) {
        this.associations.add(association);
    }
}
