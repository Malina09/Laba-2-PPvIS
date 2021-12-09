package library.model;

import java.util.ArrayList;
import java.util.List;




public class ListOfUsers implements MyList<User> {

        List<User> listOfUser = new ArrayList<>();

@Override
public void add(User user) { listOfUser.add(user); }

@Override
public void remove(User user) { listOfUser.remove(user); }

@Override
public void renew(User user) { }

public void find(long id) { listOfUser.get((int) id);}

@Override
public List<User> findAll() {return listOfUser;}

@Override
public void get(int id) {

        }

}
