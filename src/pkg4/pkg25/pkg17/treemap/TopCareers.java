/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4.pkg25.pkg17.treemap;

import java.util.Comparator;
import java.util.TreeMap;

/**
 *
 * @author Michael Juarez
 */
public class TopCareers implements Comparable {
    
    String career;
    int salary;
            
    public TopCareers(String n, int s)
    {
        career = n;
        salary = s;
    }
        
    public TopCareers getTreeMap()
    {
        return this;
    }
    
    public int getSalary()
    {
        return salary;
    }
    
    //Step 7.  How to sort keys in TreeMap by using Comparator with user define objects?
    @Override
    public int compareTo(Object otherTC) {        
        return (((TopCareers) otherTC).getSalary() - salary);
    }
    
    @Override
    public String toString()
    {
        return ("Career: " + career + ", Salary: " + salary);
    }
        
}
