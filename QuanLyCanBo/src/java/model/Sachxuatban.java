package model;
// Generated Jun 4, 2012 10:01:31 PM by Hibernate Tools 3.2.1.GA



/**
 * Sachxuatban generated by hbm2java
 */
public class Sachxuatban  implements java.io.Serializable {


     private Integer idsachxuatban;
     private Soyeulylich soyeulylich;
     private String ten;
     private Integer namxuatban;

    public Sachxuatban() {
    }

	
    public Sachxuatban(Soyeulylich soyeulylich) {
        this.soyeulylich = soyeulylich;
    }
    public Sachxuatban(Soyeulylich soyeulylich, String ten, Integer namxuatban) {
       this.soyeulylich = soyeulylich;
       this.ten = ten;
       this.namxuatban = namxuatban;
    }
   
    public Integer getIdsachxuatban() {
        return this.idsachxuatban;
    }
    
    public void setIdsachxuatban(Integer idsachxuatban) {
        this.idsachxuatban = idsachxuatban;
    }
    public Soyeulylich getSoyeulylich() {
        return this.soyeulylich;
    }
    
    public void setSoyeulylich(Soyeulylich soyeulylich) {
        this.soyeulylich = soyeulylich;
    }
    public String getTen() {
        return this.ten;
    }
    
    public void setTen(String ten) {
        this.ten = ten;
    }
    public Integer getNamxuatban() {
        return this.namxuatban;
    }
    
    public void setNamxuatban(Integer namxuatban) {
        this.namxuatban = namxuatban;
    }




}


