package library.model;

public abstract class TextMaterial {

    private String name;
    private int numberOfPages;
    private Long identifier;

    public TextMaterial(){

    }

    public TextMaterial(Long identifier) {this.identifier = identifier;}
    public Long getIdentifier() {
        return identifier;
    }
    public void setIdentifier(Long identifier) { this.identifier = identifier; }

    public TextMaterial(String name) {this.name = name;}
    public String getName() {
        return name;
    }
    public void setName(String name) { this.name = name; }

    public TextMaterial(int numberOfPages) {this.numberOfPages = numberOfPages;}
    public int getNumberOfPages() {
        return numberOfPages;
    }
    public void setNumberOfPages(int numberOfPages) { this.numberOfPages = numberOfPages; }
}
