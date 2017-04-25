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
        
        //Step 1. 1. How to iterate through TreeMap
        //Print the tree from tmh
        tmh.iteratePrint();
        
        ////2. How to copy Map content to another TreeMap
        //Create a blank tree and copy original tree into the copy        
        TreeMap<String, Integer> copyOfTree = tmh.copyTree();
               
        //Add 6th State and Population in new copy to differentiate original
        copyOfTree.put("Illinois", 12801539);
        
        //Create a TreeMapHelper for the copied version
        TreeMapHelper tmc = new TreeMapHelper(copyOfTree);
        
        //Just for testing, print both trees to see difference
        System.out.println("");
        System.out.println("------------cop---");
        System.out.println("Original TreeMap: ");        
        tmh.iteratePrint();
        System.out.println("Entry Count: " + tmh.getTree().size());
        
        System.out.println("");
        System.out.println("------------------");
        System.out.println("Copy of TreeMap: ");        
        tmc.iteratePrint();
        System.out.println("Entry Count: " + tmc.getTree().size());        
        
        //Step 3. How to search a key in a TreeMap? Return True/False
        String key = "Illinois";
        
        tmh.hasKey(key);
        tmc.hasKey(key);
        
        
    }
    
}
