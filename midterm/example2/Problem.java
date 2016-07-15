/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author kamillus
 */
public class Problem {
    private Integer priority;
    private String name;
    
    public Problem()
    {
        this.priority = 0;
        this.name = "No Problem";
        
        System.out.format("Hello from problem: %s%n", this.name); 

    }
    
    public Problem(int priority, String name)
    {
        priority = new Integer(priority * 2);
        this.name = name;
        
        System.out.format("Hello from a different problem: %s%n", this.name); 
        
    }
    
    public String whatProblem()
    {
        return this.name + " problem!";
    }
}
