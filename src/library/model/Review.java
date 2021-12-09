package library.model;


public class Review {
    private Long identifier;
    private String login;
    private String materialsName;
    private String departureDate;
    private String text;

    public Review() {
    }

    public Review(Long identifier, String login, String materialsName, String departureDate, String text) {
        this.identifier = identifier;
        this.login = login;
        this.materialsName = materialsName;
        this.departureDate = departureDate;
        this.text = text;
    }
    public Long getIdentifier() {
        return identifier;
    }
    public void setIdentifier(Long identifier) { this.identifier = identifier; }


    public String getLogin() { return login;}
    public void setLogin(String login) {this.login = login;}

    public String getMaterialsName() {return materialsName;}
    public void setMaterialsName(String materialsName) {this.materialsName = materialsName;}

    public String getDepartureDate() { return departureDate;}
    public void setDepartureDate(String departureDate) {this.departureDate = departureDate;}

    public String getText() { return text;}
    public void setText(String text) {this.text = text;}

}
