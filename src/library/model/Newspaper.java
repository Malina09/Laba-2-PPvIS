package library.model;

public class Newspaper {

    private String tagline;
    private String chiefEditor;
    private String publishingHouse;

    public  Newspaper(){

    }
    public Newspaper(String tagline, String chiefEditor, String publishingHouse) {
        this.tagline = tagline;
        this.chiefEditor = chiefEditor;
        this.publishingHouse = publishingHouse;}
    public String getTagline() {
        return tagline;
    }
    public void setTagline(String tagline) { this.tagline = tagline; }


    public String getChiefEditor() {
        return chiefEditor;
    }
    public void setChiefEditor(String chiefEditor) { this.chiefEditor = chiefEditor; }


    public String getPublishingHouse() {
        return publishingHouse;
    }
    public void setPublishingHouse(String publishingHouse) { this.publishingHouse = publishingHouse; }

}
