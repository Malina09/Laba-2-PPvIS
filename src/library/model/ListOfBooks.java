package library.model;

import java.util.ArrayList;
import java.util.List;


public class ListOfBooks implements MyList<Book> {

    List<Book> bookList = new ArrayList<>();

    @Override
    public void add(Book book) { bookList.add(book); }

    @Override
    public void remove(Book book) { bookList.remove(book); }

    @Override
    public void renew(Book book) { }

    public void find(long id) {  bookList.get((int) id);}

    @Override
    public List<Book> findAll() {return bookList;}

    @Override
    public void get(int id) {

    }
}
