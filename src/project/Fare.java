/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author Owner
 */
public class Fare {
    private CalcFare fare;
    
    /**
     *
     * @param f
     */
    public Fare(CalcFare f) {
        fare=f;
    }
    
    /**
     *
     * @param amount
     * @return
     */
    public double calcfare (double amount) {
        double r=0;
        r=fare.fareAmount(amount);
        return r;
    }
    
}
