package library.model;

import java.util.ArrayList;
import java.util.List;

public class ListOfMagazines implements MyList<Magazine> {

        List<Magazine> listOfMagazine = new ArrayList<>();

@Override
public void add(Magazine magazine) { listOfMagazine.add(magazine); }

@Override
public void remove(Magazine magazine) { listOfMagazine.remove(magazine); }

@Override
public void renew(Magazine magazine) { }

public void find(long id) { listOfMagazine.get((int) id);}

@Override
public List<Magazine> findAll() {return listOfMagazine;}

@Override
public void get(int id) {

}
}
