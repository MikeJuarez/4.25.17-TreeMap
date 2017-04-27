/*
 * This project answers the following:
 * 1. How to iterate through TreeMap
 * 2. How to copy Map content to another TreeMap
 * 3. How to search a key in TreeMap?
 * 4. How to search a value in TreeMap?
 * 5. How to delete all elements from TreeMap?
 * 6. How to sort keys in TreeMap by using Comparator?
 * 7. How to sort keys in TereMap by using Comparator with user define objects?
 * 8. How to get sorted sub-map from TreeMap?
 * 9. How to get first key element from TreeMap (Sorted Map)?
 * 10. How to get last key element from TreeMap (Sorted Map)?
 * 11. How to reverse sorted keys in a TreeMap?
 */
package pkg4.pkg25.pkg17.treemap;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author Michael Juarez
 */

public class TreeMapHelper implements Comparator<String>{
    
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
    
    //Step 5.  How to delete all elements from TreeMap?    
    public void removeAll()
    {
        tm.clear();
    }
    
    //Step 6.  How to sort keys in TreeMap by using Comparator?        
    @Override
    public int compare(String a, String b)
    {
        return a.compareTo(b);
    }
    
    //Step 7.  How to sort keys in TreeMap by using Comparator with user define objects?
    //Added this step in new Class: TopCareers    
    
    //Step 8.  How to get sorted sub-map from TreeMap?
    //Step 9.  How to get first key element from TreeMap (Sorted Map)?
    //Step 10.  How to get last key element from TreeMap (Sorted Map)?
    //Step 11.  How to reverse sorted keys in a TreeMap?
    
}
