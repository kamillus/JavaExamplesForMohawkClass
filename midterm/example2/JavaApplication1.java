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
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Problem[] problems1 = new Problem[97];
        Problem[] problems2 = {new Problem(10, "money"), new Problem(4, "time")};
        Problem[] problems3 = new Problem[problems1.length + problems2.length];
        int total = 0;
        
        for(Problem problem : problems2)
        {
            System.out.println(problem.whatProblem() + " problem");
        }
        
        for(int problemCount = problems3.length; problemCount > 0; )
        {
            if(problemCount-- > problems1.length)
            {
                problems3[problemCount] = problems2[problems1.length + problems2.length - problemCount-1];
                System.out.println("Yo: " + problems3[problemCount].whatProblem());
            }
            else
            {
                problems3[problemCount] = problems1[problemCount];
                total += 10;
            }
        }
        
        System.out.println("Total: " + total);
        
        
        
        
    }
    
}
