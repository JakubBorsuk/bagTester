/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bagtester;

/**
 *
 * @author 342720539
 */
public class SchoolBag {

    private String style;
    private Binder [] binder = new Binder [2];
    
    final double emptyBag = 1000; //in grams
    
    public SchoolBag(String s, Binder b1, Binder b2){
        this.style = s;
        this.binder[0] = b1;
        this.binder[1] = b2;
    }
}
