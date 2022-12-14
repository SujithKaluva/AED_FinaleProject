/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Data;

import Business.Clinic.Clinic;
import Business.Orders.Orders;
import java.util.ArrayList;

/**
 *
 * @author sujithkaluva
 */
public class OrdersDirectory {
    
     private ArrayList<Orders> orderdirectory;

    public OrdersDirectory() {
        this.orderdirectory = new ArrayList<>();
    }

    public ArrayList<Orders> getOrderdirectory() {
        return orderdirectory;
    }

    public void setOrderdirectory(ArrayList<Orders> orderdirectory) {
        this.orderdirectory = orderdirectory;
    }
    
    public void addOrders(Orders c){
        this.orderdirectory.add(c);
    }
}
