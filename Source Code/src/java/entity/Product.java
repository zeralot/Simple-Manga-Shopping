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
public class Product {
    private String pid;
    private String pname;
    private int quantiy;
    private double price;
    private String images;
    private String description;
    private int status;
    private int ctid;

    public Product() {
    }

    public Product(String pid, String pname, int quantiy, double price, String images, String description, int status, int ctid) {
        this.pid = pid;
        this.pname = pname;
        this.quantiy = quantiy;
        this.price = price;
        this.images = images;
        this.description = description;
        this.status = status;
        this.ctid = ctid;
    }

    public Product(String pname, int quantiy, double price, String images, String description, int status, int ctid) {
        this.pname = pname;
        this.quantiy = quantiy;
        this.price = price;
        this.images = images;
        this.description = description;
        this.status = status;
        this.ctid = ctid;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public int getQuantiy() {
        return quantiy;
    }

    public void setQuantiy(int quantiy) {
        this.quantiy = quantiy;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getCtid() {
        return ctid;
    }

    public void setCtid(int ctid) {
        this.ctid = ctid;
    }

    @Override
    public String toString() {
        return "Product{" + "pid=" + pid + ", pname=" + pname + ", quantiy=" + quantiy + ", price=" + price + ", images=" + images + ", description=" + description + ", status=" + status + ", ctid=" + ctid + '}';
    }
    
    
}
