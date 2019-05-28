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
public class Category {

    private String cname;
    private int status;
    private int ctid;

    public Category() {
    }

    public Category(String cname, int status) {
        this.cname = cname;
        this.status = status;
    }

    public Category(String cname, int status, int ctid) {
        this.cname = cname;
        this.status = status;
        this.ctid = ctid;
    }

    public Category(int ctid, String cname, int status) {
        this.ctid = ctid;
        this.cname = cname;
        this.status = status;

    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
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

}
