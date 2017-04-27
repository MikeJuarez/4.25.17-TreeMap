package pkg4.pkg25.pkg17.treemap;

import java.util.Set;
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
        
        //Step 1.How to iterate through TreeMap
        //Print the tree from tmh
        System.out.println("");
        System.out.println("Step 1. How to iterate through TreeMap");
        System.out.println("---------------");
        tmh.iteratePrint();
        
        ////2. How to copy Map content to another TreeMap
        System.out.println("");
        System.out.println("Step 2. How to copy Map content to another TreeMap");
        System.out.println("---------------");
        
        //Create a blank tree and copy original tree into the copy        
        TreeMap<String, Integer> copyOfTree = tmh.copyTree();
               
        //Add 6th State and Population in new copy to differentiate original
        copyOfTree.put("Illinois", 12801539);
        
        //Create a TreeMapHelper for the copied version
        TreeMapHelper tmc = new TreeMapHelper(copyOfTree);
        
        //Just for testing, print both trees to see difference        
        System.out.println("Original TreeMap: ");        
        tmh.iteratePrint();
        System.out.println("Entry Count: " + tmh.getTree().size());
        
        System.out.println("");
        System.out.println("------------------");
        System.out.println("Copy of TreeMap: ");        
        tmc.iteratePrint();
        System.out.println("Entry Count: " + tmc.getTree().size());        
        
        //Step 3. How to search a key in a TreeMap? Print result to console.
        System.out.println("");
        System.out.println("Step 3. How to search a key in a TreeMap? Print result to console.");
        System.out.println("------------------");
        
        String key = "Illinois";        
        
        tmh.hasKey(key);
        
        System.out.println("");
        System.out.println("------------------");
        tmc.hasKey(key);
        
        //Step 4. How to search a value in TreeMap? Print result to console. 
        System.out.println("");
        System.out.println("Step 4. How to search a value in TreeMap? Print result to console.");
        System.out.println("------------------"); 
        
        int value = 12801539;                
        
        tmh.hasValue(value);
        tmc.hasValue(value);
        
        //Step 5. How to remove all elements in TreeMap.
        System.out.println("");
        System.out.println("Step 5. How to remove all elements in TreeMap.");
        System.out.println("------------------"); 
        
        //Make copy of a TreeMapHelper - prepping for Step 5.
        TreeMapHelper tmhClearMe = tmh;       
        
        //Print to ensure copy was done corretly               
        tmhClearMe.iteratePrint();
        
        //Clear all mappings in copy
        tmhClearMe.removeAll();
        
        //Re-print to ensure mappings are clear
        System.out.println("Printing mappings after clearing: ");
        tmhClearMe.iteratePrint();
        
        
        //Step 6.  How to sort keys in TreeMap by using Comparator?
        System.out.println("");
        System.out.println("Step 6.  How to sort keys in TreeMap by using Comparator?");
        System.out.println("------------------"); 
        
        //Create a new TreeMap with Strings only
        TreeMap<String, String> tmcapitals = new TreeMap();
        
        //Add states plus their capitals to new TreeMap
        tmcapitals.put("California", "Sacramento");
        tmcapitals.put("Texas", "Austin");
        tmcapitals.put("Florida", "Tallahassee");
        tmcapitals.put("New York", "Albany");
        tmcapitals.put("Pennsylvania", "Harrisburg");       
        
        //Print out the list - sorting was used
        System.out.println(tmcapitals);             
        
        //Step 7.  How to sort keys in TreeMap by using Comparator with user define objects?
        System.out.println("");
        System.out.println("Step 7.  How to sort keys in TreeMap by using Comparator with user define objects?");
        System.out.println("------------------");
        
        TreeMap<TopCareers, Double> tmCareers = new TreeMap();
       
        //Add customer object (TopCareers), plus unemployment rate for that career
        tmCareers.put(new TopCareers("Dentist", 142750), 0.7);
        tmCareers.put(new TopCareers("Nurse", 65790), 2.0);
        tmCareers.put(new TopCareers("Pharmacist", 113410), 3.2);
        tmCareers.put(new TopCareers("Computer_Systems_Analyst", 78670), 2.5);
        tmCareers.put(new TopCareers("Physician", 183270), 0.7);
        
        //Pull EntrySet from new TreeMap
        Set<TopCareers> tmCareersSet = tmCareers.keySet();
                
        //Iterate through keyset and print mappings in tmCareerSet
        for (TopCareers topC: tmCareersSet)
        {
            System.out.println("Key: " + topC + ", Unemployment Rate: " + tmCareers.get(topC));
        }
        
        
        
        //Step 8.  How to get sorted sub-map from TreeMap?
        System.out.println("");
        System.out.println("Step 8.  How to get sorted sub-map from TreeMap?");
        System.out.println("------------------"); 
        
        //Step 9.  How to get first key element from TreeMap (Sorted Map)?
        System.out.println("");
        System.out.println("Step 9.  How to get first key element from TreeMap (Sorted Map)?");
        System.out.println("------------------"); 
        
        //Step 10.  How to get last key element from TreeMap (Sorted Map)?
        System.out.println("");
        System.out.println("Step 10.  How to get last key element from TreeMap (Sorted Map)?");
        System.out.println("------------------"); 
        
        //Step 11.  How to reverse sorted keys in a TreeMap?
        System.out.println("");
        System.out.println("Step 11.  How to reverse sorted keys in a TreeMap?");
        System.out.println("------------------"); 
        
    }
    
}
