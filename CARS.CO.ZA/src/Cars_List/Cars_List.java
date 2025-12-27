/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cars_List;

/**
 *
 * @author Wandi Mtshali
 */
public class Cars_List {
    private int ID;
    private String make;
    private String model;
    private int pirce;
    private boolean sold;

    public Cars_List(int ID, String make, String model,int pirce , boolean sold) {
        this.ID = ID;
        this.make = make;
        this.model = model;
        this.sold = sold;
        this.pirce =pirce;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getPrice() {
        return pirce;
    }

    public void setPrice(int pirce) {
        this.pirce = pirce;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isSold() {
        return sold;
    }

    public void setSold(boolean sold) {
        this.sold = sold;
    }

    @Override
    public String toString() {
        return "Cars_List{" + "ID=" + ID + ", make=" + make + ", model=" + model +", price="+ pirce + ", sold=" + sold + '}';
    }
    
    
    
}
