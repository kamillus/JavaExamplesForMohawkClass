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
public class Vehicle {
    private int type;
    private int odometer;
    private String name;
    private static int total;
    
    public Vehicle(int type, int odometer)
    {
        this.type=type;
        this.odometer = odometer;
        
        if(type == 0)
        {
            name = "Bicycle";
        }
        else if(type == 1)
        {
            name = "Car";
        }
        
        System.out.format("This  %s has an odometer reading of %d%n",  this.getName(), this.odometer);
        
    }
    
    public void move()
    {
        odometer += type == 0? 5: 0;
        odometer += type == 1? 30: 0;
        total += odometer;
        
        System.out.format(name + " Odometer: %d Total: %d%n", getOdometer(), total); 
        
        if(total > 60)
        {
            System.out.println("You're going too far, " + this.getName() + "!");
        }
    }

    public int getType() {
        return type;
    }

    public int getOdometer() {
        return odometer;
    }

    public String getName() {
        return name;
    }
}
