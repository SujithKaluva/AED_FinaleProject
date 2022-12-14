/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Orders;

import Business.Clinic.Clinic;
import Business.Ecosystem.Ecosystem;
import Business.Role.SalesPerson;
import Business.vaccine.Vaccine;
import java.util.Date;

/**
 *
 * @author sujithkaluva
 */
public class Orders {
    
    private Clinic clinic;
    private Vaccine vaccine;
    private int Quantity;
    private int price;
    private SalesPerson salesperson;
    private String status;
    private Date date;
    private Date delivereddate;
    private String comments;
    private String orderid;
    public static int count=1;
    Ecosystem ecosystem = Ecosystem.getInstance();

    public Orders(Clinic clinic, Vaccine vaccine, int Quantity, int price, SalesPerson salesperson, String status, Date date, Date delivereddate, String comments) {
        this.clinic = clinic;
        this.vaccine = vaccine;
        this.Quantity = Quantity;
        this.price = price;
        this.salesperson = salesperson;
        this.status = status;
        this.date = date;
        this.delivereddate = delivereddate;
        this.comments = comments;
        this.orderid="Order_"+count;
        count++;
        ecosystem.getOrderDirectory().addOrders(this);
        
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    
    public Clinic getClinic() {
        return clinic;
    }

    public void setClinic(Clinic clinic) {
        this.clinic = clinic;
    }

    public Vaccine getVaccine() {
        return vaccine;
    }

    public void setVaccine(Vaccine vaccine) {
        this.vaccine = vaccine;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public SalesPerson getSalesperson() {
        return salesperson;
    }

    public void setSalesperson(SalesPerson salesperson) {
        this.salesperson = salesperson;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDelivereddate() {
        return delivereddate;
    }

    public void setDelivereddate(Date delivereddate) {
        this.delivereddate = delivereddate;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
    
}
