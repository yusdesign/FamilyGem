package app.familygem.model;

public class Association {
    private String personId;
    private String relationship; // Священник, Восприемник, Поручитель, etc.
    private String type;         // Социальный, etc.
    private String details;

    public Association() {}

    public Association(String personId, String relationship) {
        this.personId = personId;
        this.relationship = relationship;
    }

    // Getters and Setters
    public String getPersonId() { return personId; }
    public void setPersonId(String personId) { this.personId = personId; }

    public String getRelationship() { return relationship; }
    public void setRelationship(String relationship) { this.relationship = relationship; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public String getDetails() { return details; }
    public void setDetails(String details) { this.details = details; }
}
