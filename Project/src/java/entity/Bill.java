

package entity;

public class Bill {
    private int bid;
    private String cdate;
    private String rname;
    private String rAddress;
    private String rphone;
    private Double total;
    private int status;
    private int cid;

    public Bill() {
    }

    public Bill(int bid, String cdate, String rname, String rAddress, String rphone, Double total, int status, int cid) {
        this.bid = bid;
        this.cdate = cdate;
        this.rname = rname;
        this.rAddress = rAddress;
        this.rphone = rphone;
        this.total = total;
        this.status = status;
        this.cid = cid;
    }

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public String getCdate() {
        return cdate;
    }

    public void setCdate(String cdate) {
        this.cdate = cdate;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    public String getrAddress() {
        return rAddress;
    }

    public void setrAddress(String rAddress) {
        this.rAddress = rAddress;
    }

    public String getRphone() {
        return rphone;
    }

    public void setRphone(String rphone) {
        this.rphone = rphone;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    
      public int getCid() {
        return status;
    }

    public void setCids(int cid) {
        this.cid = cid;
    }

}
