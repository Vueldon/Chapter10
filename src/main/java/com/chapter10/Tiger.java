/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chapter10;

/**
 *
 * @author 0788763
 */
public class Tiger extends Animal
{
    private int numberOfStripes;
    
    public Tiger(int numberOfStripes)
    {
        super("African Tiger");
        this.numberOfStripes = numberOfStripes;
    }

    public int getNumberOfStripes() {
        return numberOfStripes;
    }
    
    @Override
    public String getSpeciesName()
    {
        return "This is a tiger";
    }

    public void setNumberOfStripes(int numberOfStripes) {
        this.numberOfStripes = numberOfStripes;
    }

    @Override
    public String toString() {
        return this.getSpeciesName() + "- Stripes: " + numberOfStripes;
    }
    
    
}
