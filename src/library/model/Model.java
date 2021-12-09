package library.model;

public class Model {

    private ListOfBooks bookList;
    private ListOfMagazines listOfMagazines;
    private ListOfNewspapers listOfNewspapers;
    private ListOfReviews listOfReviews;
    private ListOfUsers listOfUsers;

    public void createListOfBooks() {bookList = new ListOfBooks();}

    public void createListOfMagazines() { listOfMagazines = new ListOfMagazines(); }

    public void createNewspapers() { listOfNewspapers = new ListOfNewspapers(); }

    public void createListOfReviews() { listOfReviews = new ListOfReviews(); }

    public void createListOfUsers() { listOfUsers = new ListOfUsers(); }

    public ListOfBooks getBookList() {
        return bookList;
    }

    public void setBookList(ListOfBooks bookList) {
        this.bookList = bookList;
    }

    public ListOfMagazines getListOfMagazines() {
        return listOfMagazines;
    }

    public void setListOfMagazines(ListOfMagazines listOfMagazines) {
        this.listOfMagazines = listOfMagazines;
    }

    public ListOfNewspapers getListOfNewspapers() {
        return listOfNewspapers;
    }

    public void setListOfNewspapers(ListOfNewspapers listOfNewspapers) {
        this.listOfNewspapers = listOfNewspapers;
    }

    public ListOfReviews getListOfReviews() {
        return listOfReviews;
    }

    public void setListOfReviews(ListOfReviews listOfReviews) {
        this.listOfReviews = listOfReviews;
    }

    public ListOfUsers getListOfUsers() {
        return listOfUsers;
    }

    public void setListOfUsers(ListOfUsers listOfUsers) {
        this.listOfUsers = listOfUsers;
    }


}
