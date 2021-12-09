package library.model;

import java.util.ArrayList;
import java.util.List;


public class ListOfReviews implements  MyList<Review> {

        List<Review> listOfReview = new ArrayList<>();

@Override
public void add(Review review) { listOfReview.add(review); }

@Override
public void remove(Review review) { listOfReview.remove(review); }

@Override
public void renew(Review review) { }

public void find(long id) {  listOfReview.get((int) id);}

@Override
public List<Review> findAll() {return listOfReview;}

@Override
public void get(int id) {

}
}
