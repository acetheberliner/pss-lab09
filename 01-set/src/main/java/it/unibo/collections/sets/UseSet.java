package it.unibo.collections.sets;

//import java.util.Collection;
import java.util.TreeSet;

/**
 * Example class using {@link java.util.Set}.
 *
 */
public final class UseSet {

    private static final int ELEMS = 20;

    private UseSet() {
    }

    /**
     * @param args
     *            ignored
     */
    public static void main(final String[] args) {
        /*
         * Considering the content of "UseCollection, write a program which, in
         * order:
         *
         * 1) Builds a TreeSet containing Strings
         */
        TreeSet<String> tree = new TreeSet<>();
        TreeSet<String> removeList = new TreeSet<>();
        //---------------------------------------------------------

        /*
         * 2) Populates such Collection with all the Strings representing numbers ranging from "1" to
         * "20" (both included)
        */
        for(int i=1; i<=ELEMS; i+=1){
            tree.add(String.valueOf(i));
        }
        //---------------------------------------------------------

        /*
         * 3) Prints its content
        */
        System.out.println("Initial TreeSet: " + tree);
        System.out.println("");
        //---------------------------------------------------------

        /*
         * 4) Removes all those strings whose represented number is divisible by three.
         * Note: the method removeIf(Predicate) is not allowed.
        */
        for (String x : tree) {
            if(Integer.parseInt(x)%3==0){
                removeList.add(x);
            }
        }
        tree.removeAll(removeList);
        //---------------------------------------------------------

        /*
         * 5) Prints the content of the Set using a for-each construct
        */
        System.out.print("Updated TreeSet: ");
        for (String x : tree) {
            System.out.print(x + " ");
        }

        System.out.println("");
        //---------------------------------------------------------

        /*
         * 6) Verifies whether all the numbers left in the set are even
        */
        boolean even=true;

        while(even==true){
            for (String x : tree) {
                if(Integer.parseInt(x)%2==0){
                }else{
                    even=false;
                    break;
                }
            }
        }

        if(even){
            System.out.println("\nAll of the remaining elements are even");
        }else{
            System.out.println("\nNot all of the remaining elements are even");
        }
        //---------------------------------------------------------
    }
}
