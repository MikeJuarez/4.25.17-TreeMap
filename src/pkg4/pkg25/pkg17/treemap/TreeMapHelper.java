/*
 * This project answers the following:
 * 1. How to iterate through TreeMap
 * 2. How to copy Map content to another TreeMap
 * 3. How to search a key in TreeMap?
 * 4. How to search a value in TreeMap?
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
    public void iteratePrint()
    {
        //Returns the set of entries
        Set set = tm.entrySet();
        
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
    public TreeMap<String, Integer> copyTree()
    {
        //Declare a new blank TreeMap
        TreeMap<String, Integer> treeCopy = new TreeMap();
        
        //Copy all mappings from tm TreeMap to the copy (treeCopy)
        treeCopy.putAll(tm);
        
        return treeCopy;
    }
    
    //Step 3. How to search a key in TreeMap?    
    public void hasKey(String key)
    {        
        if (tm.containsKey(key))
          System.out.println("Yes, the key: " + key + ", does exist in this TreeMap");
        else
          System.out.println("Sorry, the key: " + key + ", does not exist in this TreeMap");  
    }
    
    //Step 4. How to search a value in TreeMap
    public void hasValue(int value)
    {
        if (tm.containsValue(value))
          System.out.println("Yes, the value: " + value + ", does exist in this TreeMap");
        else
          System.out.println("Sorry, the value: " + value + ", does not exist in this TreeMap");  
    }
    
    public TreeMap<String, Integer> getTree()
    {
        return tm;
    }
    
}
