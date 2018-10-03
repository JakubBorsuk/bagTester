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
public class Binder {

    private String label;
    private String colour;
    private int numSheets;

    final int emptyBinder = 200; //in grams
    final double paperWeight = 4.5; //in grams
    double binderWeight; //in grams
    
    public Binder(String lbl, String clr, int sheets){
        this.label = lbl;
        this.colour = clr;
        this.numSheets = sheets;
    }
    
    public void addSheets(int amt){
        this.setNumSheets(this.getNumSheets() + amt);
    }
    
    public double totalWeight(){
        binderWeight = emptyBinder + (this.getNumSheets()*paperWeight);
        
        return binderWeight;
    }
    
    public Binder compareWeight(Binder b){
        if(this.totalWeight()>= b.totalWeight()){
            return this;
        }else{
            return b;
        }
    }
    
    @Override
    public String toString(){
        return "Label: "+this.getLabel()+", Colour "+this.getColour()+", Sheets: "+this.getNumSheets();
    }

    /**
     * @return the label
     */
    public String getLabel() {
        return label;
    }

    /**
     * @param label the label to set
     */
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * @return the colour
     */
    public String getColour() {
        return colour;
    }

    /**
     * @param colour the colour to set
     */
    public void setColour(String colour) {
        this.colour = colour;
    }

    /**
     * @return the numSheets
     */
    public int getNumSheets() {
        return numSheets;
    }

    /**
     * @param numSheets the numSheets to set
     */
    public void setNumSheets(int numSheets) {
        this.numSheets = numSheets;
    }
}
