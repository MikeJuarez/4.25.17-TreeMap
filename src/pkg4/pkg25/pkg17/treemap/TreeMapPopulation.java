package pkg4.pkg25.pkg17.treemap;

import java.util.TreeMap;

/**
 *
 * @author Michael Juarez
 */
public class TreeMapPopulation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      
        TreeMap<String, Integer> tm = new TreeMap<>();
        
        //Top 5 States by Population numbers
        tm.put("California", 39250017);
        tm.put("Texas", 27862596);
        tm.put("Florida", 20612439);
        tm.put("New York", 19745289);
        tm.put("Pennsylvania", 12802503);
        
        //Create a new TreeMapHelper which will do the grunt work.
        TreeMapHelper tmh = new TreeMapHelper(tm);
        
        //Get the tree in tmh
        TreeMap<String, Integer> treeToCopy = tmh.getTree();
        
        //Print the tree from tmh
        tmh.iteratePrint(treeToCopy);
                
        //Create a blank tree - prepping to be copied
        TreeMap<String, Integer> copyOfTree = new TreeMap();
        
        //Copy the original tree to the new blank tree
        copyOfTree = tmh.copyTree(treeToCopy);
        
        //Add 6th State and Population in new copy to differentiate original
        copyOfTree.put("Illinois", 12801539);
        
        //Just for testing, print both trees to see difference
        System.out.println("");
        System.out.println("------------------");
        System.out.println("Original TreeMap: ");
        tmh.iteratePrint(treeToCopy);
        
        System.out.println("");
        System.out.println("------------------");
        System.out.println("Copy of TreeMap: ");
        tmh.iteratePrint(copyOfTree);
        
        
    }
    
}
