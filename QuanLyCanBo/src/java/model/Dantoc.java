package model;
// Generated Jun 4, 2012 10:01:31 PM by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Dantoc generated by hbm2java
 */
public class Dantoc  implements java.io.Serializable {


     private Integer iddantoc;
     private String ten;
     private Set soyeulylichs = new HashSet(0);

    public Dantoc() {
    }

    public Dantoc(String ten, Set soyeulylichs) {
       this.ten = ten;
       this.soyeulylichs = soyeulylichs;
    }
   
    public Integer getIddantoc() {
        return this.iddantoc;
    }
    
    public void setIddantoc(Integer iddantoc) {
        this.iddantoc = iddantoc;
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




}


