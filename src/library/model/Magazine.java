package library.model;

import java.util.List;

public class Magazine {
    private String chiefEditor;
    private String publishingHouse;
    private List<String> listOfHeadings;

    public Magazine(){
    }

    public String Magazine(String chiefEditor){ return this.chiefEditor = chiefEditor; }
    public String getChiefEditor() {
        return chiefEditor;
    }
    public void setChiefEditor(String chiefEditor) { this.chiefEditor = chiefEditor; }

    public Magazine(String publishingHouse) {this.publishingHouse = publishingHouse;}
    public String getPublishingHouse() {
        return publishingHouse;
    }
    public void setPublishingHouse(String publishingHouse) { this.publishingHouse = publishingHouse; }

    public Magazine(List<String> listOfHeadings) {this.listOfHeadings = listOfHeadings;}
    public List<String> getListOfHeadings() {
        return listOfHeadings;
    }
    public void setListOfHeadings(List<String> listOfHeadings) { this.listOfHeadings = listOfHeadings; }

}
