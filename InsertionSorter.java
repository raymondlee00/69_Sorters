/**
  Implement an insertion sort, in the Sorters structure
 */
import java.util.ArrayList;

public class InsertionSorter extends Sorter {


    /**
      Construct an instance to process the user's data
     */
    public InsertionSorter(  ArrayList< String> usersData) {
      	super(usersData);
    }


    /**
      sort the user's data, implementing insertion sort
     */
    public void mySort() {
      	for(int i = 1; i <= elements.size(); i++) {
      		insert1(elements, i);
      	}
    }

  	public void insert1(ArrayList<String> list, int numSorted) {
      	for(int i = numSorted - 1; numSorted >= 0; i--) {
          	if (list.get(numSorted).compareTo(list.get(i)) > 0) {
          		list.add(list.remove(numSorted));
              	break;
          	}
      	}
  	}
}
