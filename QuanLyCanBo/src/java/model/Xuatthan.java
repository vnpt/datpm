package model;
// Generated Jun 4, 2012 10:01:31 PM by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Xuatthan generated by hbm2java
 */
public class Xuatthan  implements java.io.Serializable {


     private Integer idxuatthan;
     private String ten;
     private Set soyeulylichs = new HashSet(0);

    public Xuatthan() {
    }

    public Xuatthan(String ten, Set soyeulylichs) {
       this.ten = ten;
       this.soyeulylichs = soyeulylichs;
    }
   
    public Integer getIdxuatthan() {
        return this.idxuatthan;
    }
    
    public void setIdxuatthan(Integer idxuatthan) {
        this.idxuatthan = idxuatthan;
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

