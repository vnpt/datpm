package model;
// Generated Jun 4, 2012 10:01:31 PM by Hibernate Tools 3.2.1.GA


import java.util.Date;

/**
 * Quatrinhnghiencuu generated by hbm2java
 */
public class Quatrinhnghiencuu  implements java.io.Serializable {


     private Integer idquatrinhnghiencuu;
     private Soyeulylich soyeulylich;
     private Date tungay;
     private Date denngay;
     private String tendetai;
     private String coquanchutri;
     private Date ngaynhiemthu;

    public Quatrinhnghiencuu() {
    }

	
    public Quatrinhnghiencuu(Soyeulylich soyeulylich) {
        this.soyeulylich = soyeulylich;
    }
    public Quatrinhnghiencuu(Soyeulylich soyeulylich, Date tungay, Date denngay, String tendetai, String coquanchutri, Date ngaynhiemthu) {
       this.soyeulylich = soyeulylich;
       this.tungay = tungay;
       this.denngay = denngay;
       this.tendetai = tendetai;
       this.coquanchutri = coquanchutri;
       this.ngaynhiemthu = ngaynhiemthu;
    }
   
    public Integer getIdquatrinhnghiencuu() {
        return this.idquatrinhnghiencuu;
    }
    
    public void setIdquatrinhnghiencuu(Integer idquatrinhnghiencuu) {
        this.idquatrinhnghiencuu = idquatrinhnghiencuu;
    }
    public Soyeulylich getSoyeulylich() {
        return this.soyeulylich;
    }
    
    public void setSoyeulylich(Soyeulylich soyeulylich) {
        this.soyeulylich = soyeulylich;
    }
    public Date getTungay() {
        return this.tungay;
    }
    
    public void setTungay(Date tungay) {
        this.tungay = tungay;
    }
    public Date getDenngay() {
        return this.denngay;
    }
    
    public void setDenngay(Date denngay) {
        this.denngay = denngay;
    }
    public String getTendetai() {
        return this.tendetai;
    }
    
    public void setTendetai(String tendetai) {
        this.tendetai = tendetai;
    }
    public String getCoquanchutri() {
        return this.coquanchutri;
    }
    
    public void setCoquanchutri(String coquanchutri) {
        this.coquanchutri = coquanchutri;
    }
    public Date getNgaynhiemthu() {
        return this.ngaynhiemthu;
    }
    
    public void setNgaynhiemthu(Date ngaynhiemthu) {
        this.ngaynhiemthu = ngaynhiemthu;
    }




}

