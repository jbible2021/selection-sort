/*
 * Author: Joshua Bible, jbible2021@my.fit.edu
 * Course: CSE 1002, Section 02, Spring 2021
 * Project: Selection Sort
 */
public class Main {
   // public static void sort (final List<Integer> data) {
   //    for (int i = 0; i < data.size(); i++) {
   //        /* find the min element in the unsorted data[i, i+1, .., n-1] */
         
   //        /* assume initially that min is the first element in the range */
   //        int min = /* */;
         
   //        for (int j = i + 1; j < data.size(); j++) {
   //            /* if the 'j'th element is less, then it is the new minimum */
   //            if ( /*  ... */ ) {
   //                /* found new minimum; remember its index */
   //                min = j;
   //            }
   //        }
         
   //        /* swap data at 'min' with data at 'i' */
   //        /* ... */
   //    }
   // }
   public static void main (final String[] args) throws NoSuchMethodException, ClassNotFoundException,
   InstantiationException, IllegalAccessException, InvocationTargetException {
      final int size = Integer.parseInt (args[0]);
      
      // uses reflection on list type given as cmdline arg
      final Class<?> clazz = Class.forName(args[1]);
      @SuppressWarnings("unchecked")
      final java.util.List<Integer> list = (java.util.List<Integer>) clazz.getDeclaredConstructor().newInstance();

      // initialize list
      for (int i = 0; i < size; i++) {
         for (Integer j = 1; j <= size; j++) {
            list.add (j);
         }
      }
   System.out.print (list. toString());
   }
}
