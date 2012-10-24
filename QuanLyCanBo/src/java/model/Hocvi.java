package model;
// Generated Jun 4, 2012 10:01:31 PM by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Hocvi generated by hbm2java
 */
public class Hocvi  implements java.io.Serializable {


     private Integer idhocvi;
     private String ten;
     private Set dienbienhocvis = new HashSet(0);
     private Set soyeulylichs = new HashSet(0);

    public Hocvi() {
    }

    public Hocvi(String ten, Set dienbienhocvis, Set soyeulylichs) {
       this.ten = ten;
       this.dienbienhocvis = dienbienhocvis;
       this.soyeulylichs = soyeulylichs;
    }
   
    public Integer getIdhocvi() {
        return this.idhocvi;
    }
    
    public void setIdhocvi(Integer idhocvi) {
        this.idhocvi = idhocvi;
    }
    public String getTen() {
        return this.ten;
    }
    
    public void setTen(String ten) {
        this.ten = ten;
    }
    public Set getDienbienhocvis() {
        return this.dienbienhocvis;
    }
    
    public void setDienbienhocvis(Set dienbienhocvis) {
        this.dienbienhocvis = dienbienhocvis;
    }
    public Set getSoyeulylichs() {
        return this.soyeulylichs;
    }
    
    public void setSoyeulylichs(Set soyeulylichs) {
        this.soyeulylichs = soyeulylichs;
    }




}

