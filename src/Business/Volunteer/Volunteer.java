/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Volunteer;

import Business.DiscardedItem.DiscardedItem;
import Business.WarehouseOrder.WarehouseOrder;
import java.util.ArrayList;

/**
 *
 * @author nidhitiwari
 */
public class Volunteer {
    private String name;
    private String firstName;
    private String lastName;
    private String userName;
    private int id = 1001;
    private int volunteerId = 101;
    private static int count = 1001;
    private static int deliCount = 101;
    private String contact;
    private String address;
    private String city;
    private String state;
    private String emailId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    private ArrayList<WarehouseOrder> orderList;

    public ArrayList<WarehouseOrder> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<WarehouseOrder> orderList) {
        this.orderList = orderList;
    }
    
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    public Volunteer(String UserName){
        this.userName=UserName;
        orderList = new ArrayList<WarehouseOrder>();
        volunteerId++;
    }
    
    public Volunteer(){
        orderList = new ArrayList<WarehouseOrder>();
        volunteerId++;
    }
     
    public void addOrder(String warehouseName, String customerName, String volunteer, ArrayList<DiscardedItem> Order, Double price, String deliveryAddress) {
        WarehouseOrder order=new WarehouseOrder();
        order.setOrderID(String.valueOf(id));
        order.setCustomerName(customerName);
        order.setWarehouseName(warehouseName);
        order.setVolunteer(volunteer);
        order.setWarehouseOrder(Order);
        order.setPrice(price);
        order.setDeliveryAddress(deliveryAddress);
        order.setStatus("New Order");
        orderList.add(order);
        id++;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
    
    @Override
    public String toString() {
        return name;
    }
}
