package app.familygem.model;

import org.folg.gedcom.model.Person;
import java.util.ArrayList;
import java.util.List;

public class PersonWrapper {
    private Person person;
    private String socialEstate;
    private List<Association> associations;

    public PersonWrapper(Person person) {
        this.person = person;
        this.associations = new ArrayList<>();
    }

    public Person getPerson() { return person; }
    public void setPerson(Person person) { this.person = person; }

    public String getSocialEstate() { return socialEstate; }
    public void setSocialEstate(String socialEstate) { this.socialEstate = socialEstate; }

    public List<Association> getAssociations() { return associations; }
    public void setAssociations(List<Association> associations) { this.associations = associations; }
}
