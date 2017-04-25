/*
 * This project answers the following:
 * 1. How to iterate through TreeMap
 * 2. How to copy Map content to another TreeMap
 * 3.  
 * 4. 
 * 5.
 * 6.
 * 7.
 * 8.
 */
package pkg4.pkg25.pkg17.treemap;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author Michael Juarez
 */

public class TreeMapHelper {
    
    TreeMap<String, Integer> tm = new TreeMap();
    
    public TreeMapHelper(TreeMap<String, Integer> treemap)
    {
        tm = treemap;
    }
    
    //Step 1. How to iterate through TreeMap
    public void iteratePrint(TreeMap<String, Integer> tree)
    {
        //Returns the set of entries
        Set set = tree.entrySet();
        
        //Get an interator
        Iterator i = set.iterator();
        
        while (i.hasNext())
        {
            //Create a Map Entry Object and Cast the set's iterator as a Map Entry Object
            //Then print the values to the console
            Map.Entry me = (Map.Entry)i.next();
            System.out.println("Key: " + me.getKey() + ", Value: " + me.getValue());
        }        
    }   
    
    //Step 2. How to copy Map content to another TreeMap
    public TreeMap<String, Integer> copyTree(TreeMap<String, Integer> tree)
    {
        //Declare a new blank TreeMap
        TreeMap<String, Integer> treeCopy = new TreeMap();
        
        //Copy all mappings from tm TreeMap to the copy (treeCopy)
        tree.putAll(treeCopy);
        
        return treeCopy;
    }
    
    public TreeMap<String, Integer> getTree()
    {
        return tm;
    }
    
}
