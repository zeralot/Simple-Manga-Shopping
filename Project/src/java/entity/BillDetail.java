/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entity;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class BillDetail {
    private int bid;
    private String pid;
    private int quantity;
    private Double price;

    public BillDetail() {
    }

    public BillDetail(int bid, String pid, int quantity, Double price) {
        this.bid = bid;
        this.pid = pid;
        this.quantity = quantity;
        this.price = price;
    }

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
    
    
    

}
