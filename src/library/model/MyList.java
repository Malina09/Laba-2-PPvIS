package library.model;


import java.util.List;

public interface MyList<T> {

     void add(T t);
     void remove(T t);
     void renew(T t);
     void find(long id);
     List<T> findAll();

     void get(int id);
}
