package library.model;

import java.util.ArrayList;
import java.util.List;

public class ListOfNewspapers implements MyList<Newspaper> {

        List<Newspaper> listOfNewspaper = new ArrayList<>();

@Override
public void add(Newspaper newspaper) { listOfNewspaper.add(newspaper); }

@Override
public void remove(Newspaper newspaper) { listOfNewspaper.remove(newspaper); }

@Override
public void renew(Newspaper newspaper) { }

public void find(long id) {  listOfNewspaper.get((int) id);}

@Override
public List<Newspaper> findAll() {return listOfNewspaper;}

@Override
public void get(int id) {

        }
}
