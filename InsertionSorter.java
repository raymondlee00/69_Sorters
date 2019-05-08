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
      precondition:
      abstraction: For element index i from 1 to the size of the list, insert the element at i as an element at k
      such that k<i and the elements whose indices are less than i are lexicographically sorted
      postcondition: index of element to insert >= size of arraylist
     */
    public void mySort() {
      	for(int elToInsertIndex = 1; elToInsertIndex < elements.size(); elToInsertIndex++) {
      		insert1(elements, elToInsertIndex);
          // for debugging
          System.out.println( "    dbg: "
            + "after inserting element " + elements.get(elToInsertIndex)
            + " elements: " + elements
            );
      	}
    }

    /**
      sort the user's data, implementing insertion sort
      precondition:
      abstraction: For element index i from 1 to the size of the list, insert the element at i as an element at k
      such that k<i and the elements whose indices are less than i are lexicographically sorted
      postcondition: value to compare < 0
     */
  	public void insert1(ArrayList<String> list, int index) {
      	for(int valToCompareIndex = index - 1; valToCompareIndex >= 0; valToCompareIndex--) {
            if (list.get(0).compareTo(list.get(valToCompareIndex)) > 0 || list.get(index).compareTo(list.get(valToCompareIndex)) >= 0) {
                list.add(valToCompareIndex, list.remove(index));
                break;
          	}
      	}
  	}
}
