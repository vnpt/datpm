package model;
// Generated Jun 4, 2012 10:01:31 PM by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Hocham generated by hbm2java
 */
public class Hocham  implements java.io.Serializable {


     private Integer idhocham;
     private String ten;
     private Set soyeulylichs = new HashSet(0);
     private Set dienbienhochams = new HashSet(0);

    public Hocham() {
    }

    public Hocham(String ten, Set soyeulylichs, Set dienbienhochams) {
       this.ten = ten;
       this.soyeulylichs = soyeulylichs;
       this.dienbienhochams = dienbienhochams;
    }
   
    public Integer getIdhocham() {
        return this.idhocham;
    }
    
    public void setIdhocham(Integer idhocham) {
        this.idhocham = idhocham;
    }
    public String getTen() {
        return this.ten;
    }
    
    public void setTen(String ten) {
        this.ten = ten;
    }
    public Set getSoyeulylichs() {
        return this.soyeulylichs;
    }
    
    public void setSoyeulylichs(Set soyeulylichs) {
        this.soyeulylichs = soyeulylichs;
    }
    public Set getDienbienhochams() {
        return this.dienbienhochams;
    }
    
    public void setDienbienhochams(Set dienbienhochams) {
        this.dienbienhochams = dienbienhochams;
    }




}


