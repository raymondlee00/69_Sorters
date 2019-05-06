/**
  Implement an selection sort, in the Sorters structure
 */
import java.util.ArrayList;

public class SelectionSorter {
      private ArrayList<Integer> list_iAS;

      /**
        Construct an instance to process the user's data
       */
      public selectionSorter(  ArrayList< String> usersData) {
        	super(usersData);
      }

      //from hw62
      public mySort( ArrayList<Integer> unordered) {
          list_iAS = unordered;  // in place

          // Iterate through each slot that is to be populated.
          for( int next = 0
             ; next < list_iAS.size() -1  // last needs no sort
             ; next++) {

              // for development and debugging
              // System.out.println( 
                  // "so far: " + list_iAS
                // + " smallest element is at index " + dweebIndex( next)
                // + " and has the value " + list_iAS.get( dweebIndex( next)));

                /* Find the next smallest. Swap it into place.
                   Use SET's convenient feature that it returns
                   the value that it replaces.
                */
              list_iAS.set( next
                          , list_iAS.set( dweebIndex( next)
                                        , list_iAS.get( next))
                          );
              }
      }

      //from hw62
      /**
      @return the index of the smallest element of list_iAS
              whose index is >= \startAt,
              using the reigning champ algorithm.
      helper function for constructor
     */
     private int dweebIndex( int startAt) {
        // use the starting element as a first guess
        int dweebAt = startAt;
        Integer dweeb = list_iAS.get( dweebAt);

        for( int testAt = startAt +1
           ; testAt < list_iAS.size()
           ; testAt++)
            if( list_iAS.get( testAt).compareTo( dweeb) < 0) {
                // Found a smaller value. Remember it.
                dweebAt = testAt;
                dweeb = list_iAS.get( dweebAt);
            }
        return dweebAt;
     }
}
