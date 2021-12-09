package library.model;



import java.util.List;
import library.model.Model;

public class Book {
    private String description;
    private String genre;
    private List<String> authors;
    private String translator;
    private int yearOfPublication;

    public Book() {
    }

    public Book(String description, String genre, List<String> authors, String translator, int yearOfPublication) {
        this.description = description;
        this.genre = genre;
        this.authors = authors;
        this.translator = translator;
        this.yearOfPublication = yearOfPublication;
    }
    public String getDescription() { return description;}
    public void setDescription(String name) { this.description = description; }

    public String getGenre() { return genre;}
    public void  setGenre(String genre) {this.genre = genre;}

    public List<String> getAuthors() {return  authors;}
    public void setAuthors(List<String> authors) {this.authors = authors;}

    public String getTranslator() { return translator;}
    public void  setTranslator(String translator) {this.translator = translator;}

    public int getYearOfPublication() { return yearOfPublication;}
    public void setYearOfPublication(int yearOfPublication) {this.yearOfPublication = yearOfPublication;}

}
