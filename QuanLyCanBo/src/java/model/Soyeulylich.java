package model;
// Generated Jun 4, 2012 10:01:31 PM by Hibernate Tools 3.2.1.GA


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Soyeulylich generated by hbm2java
 */
public class Soyeulylich  implements java.io.Serializable {


     private Integer idsoyeulylich;
     private Capuy capuy;
     private Phongban phongban;
     private Danhhieu danhhieu;
     private Xuatthan xuatthan;
     private Hocham hocham;
     private Hocvi hocvi;
     private Phanquyen phanquyen;
     private Chucvu chucvu;
     private Tongiao tongiao;
     private Hesoluong hesoluong;
     private Dantoc dantoc;
     private Donviquanly donviquanly;
     private Giaoducphothong giaoducphothong;
     private String tendangnhap;
     private String matkhau;
     private Integer sohieucongchuc;
     private String chungminhnhandan;
     private String hoten;
     private String gioitinh;
     private String duongdananh;
     private String tenthuongdung;
     private Date ngaysinh;
     private String noisinh;
     private String quequan;
     private String noiohiennay;
     private String sodienthoai;
     private String ngayvaodangdubi;
     private String ngayvaodangchinhthuc;
     private String tencntn1;
     private String namtn1;
     private String tencntn2;
     private String namtn2;
     private String tencntn3;
     private String namtn3;
     private Integer idquocgia;
     private Date ngaycapnhat;
     private Set quatrinhnghiencuus = new HashSet(0);
     private Set dienbienhocvis = new HashSet(0);
     private Set quatrinhdinuocngoais = new HashSet(0);
     private Set dienbienluongs = new HashSet(0);
     private Set dienbienhochams = new HashSet(0);
     private Set sachxuatbans = new HashSet(0);

    public Soyeulylich() {
    }

	
    public Soyeulylich(String tendangnhap, String matkhau) {
        this.tendangnhap = tendangnhap;
        this.matkhau = matkhau;
    }
    public Soyeulylich(Capuy capuy, Phongban phongban, Danhhieu danhhieu, Xuatthan xuatthan, Hocham hocham, Hocvi hocvi, Phanquyen phanquyen, Chucvu chucvu, Tongiao tongiao, Hesoluong hesoluong, Dantoc dantoc, Donviquanly donviquanly, Giaoducphothong giaoducphothong, String tendangnhap, String matkhau, Integer sohieucongchuc, String chungminhnhandan, String hoten, String gioitinh, String duongdananh, String tenthuongdung, Date ngaysinh, String noisinh, String quequan, String noiohiennay, String sodienthoai, String ngayvaodangdubi, String ngayvaodangchinhthuc, String tencntn1, String namtn1, String tencntn2, String namtn2, String tencntn3, String namtn3, Integer idquocgia, Date ngaycapnhat, Set quatrinhnghiencuus, Set dienbienhocvis, Set quatrinhdinuocngoais, Set dienbienluongs, Set dienbienhochams, Set sachxuatbans) {
       this.capuy = capuy;
       this.phongban = phongban;
       this.danhhieu = danhhieu;
       this.xuatthan = xuatthan;
       this.hocham = hocham;
       this.hocvi = hocvi;
       this.phanquyen = phanquyen;
       this.chucvu = chucvu;
       this.tongiao = tongiao;
       this.hesoluong = hesoluong;
       this.dantoc = dantoc;
       this.donviquanly = donviquanly;
       this.giaoducphothong = giaoducphothong;
       this.tendangnhap = tendangnhap;
       this.matkhau = matkhau;
       this.sohieucongchuc = sohieucongchuc;
       this.chungminhnhandan = chungminhnhandan;
       this.hoten = hoten;
       this.gioitinh = gioitinh;
       this.duongdananh = duongdananh;
       this.tenthuongdung = tenthuongdung;
       this.ngaysinh = ngaysinh;
       this.noisinh = noisinh;
       this.quequan = quequan;
       this.noiohiennay = noiohiennay;
       this.sodienthoai = sodienthoai;
       this.ngayvaodangdubi = ngayvaodangdubi;
       this.ngayvaodangchinhthuc = ngayvaodangchinhthuc;
       this.tencntn1 = tencntn1;
       this.namtn1 = namtn1;
       this.tencntn2 = tencntn2;
       this.namtn2 = namtn2;
       this.tencntn3 = tencntn3;
       this.namtn3 = namtn3;
       this.idquocgia = idquocgia;
       this.ngaycapnhat = ngaycapnhat;
       this.quatrinhnghiencuus = quatrinhnghiencuus;
       this.dienbienhocvis = dienbienhocvis;
       this.quatrinhdinuocngoais = quatrinhdinuocngoais;
       this.dienbienluongs = dienbienluongs;
       this.dienbienhochams = dienbienhochams;
       this.sachxuatbans = sachxuatbans;
    }
   
    public Integer getIdsoyeulylich() {
        return this.idsoyeulylich;
    }
    
    public void setIdsoyeulylich(Integer idsoyeulylich) {
        this.idsoyeulylich = idsoyeulylich;
    }
    public Capuy getCapuy() {
        return this.capuy;
    }
    
    public void setCapuy(Capuy capuy) {
        this.capuy = capuy;
    }
    public Phongban getPhongban() {
        return this.phongban;
    }
    
    public void setPhongban(Phongban phongban) {
        this.phongban = phongban;
    }
    public Danhhieu getDanhhieu() {
        return this.danhhieu;
    }
    
    public void setDanhhieu(Danhhieu danhhieu) {
        this.danhhieu = danhhieu;
    }
    public Xuatthan getXuatthan() {
        return this.xuatthan;
    }
    
    public void setXuatthan(Xuatthan xuatthan) {
        this.xuatthan = xuatthan;
    }
    public Hocham getHocham() {
        return this.hocham;
    }
    
    public void setHocham(Hocham hocham) {
        this.hocham = hocham;
    }
    public Hocvi getHocvi() {
        return this.hocvi;
    }
    
    public void setHocvi(Hocvi hocvi) {
        this.hocvi = hocvi;
    }
    public Phanquyen getPhanquyen() {
        return this.phanquyen;
    }
    
    public void setPhanquyen(Phanquyen phanquyen) {
        this.phanquyen = phanquyen;
    }
    public Chucvu getChucvu() {
        return this.chucvu;
    }
    
    public void setChucvu(Chucvu chucvu) {
        this.chucvu = chucvu;
    }
    public Tongiao getTongiao() {
        return this.tongiao;
    }
    
    public void setTongiao(Tongiao tongiao) {
        this.tongiao = tongiao;
    }
    public Hesoluong getHesoluong() {
        return this.hesoluong;
    }
    
    public void setHesoluong(Hesoluong hesoluong) {
        this.hesoluong = hesoluong;
    }
    public Dantoc getDantoc() {
        return this.dantoc;
    }
    
    public void setDantoc(Dantoc dantoc) {
        this.dantoc = dantoc;
    }
    public Donviquanly getDonviquanly() {
        return this.donviquanly;
    }
    
    public void setDonviquanly(Donviquanly donviquanly) {
        this.donviquanly = donviquanly;
    }
    public Giaoducphothong getGiaoducphothong() {
        return this.giaoducphothong;
    }
    
    public void setGiaoducphothong(Giaoducphothong giaoducphothong) {
        this.giaoducphothong = giaoducphothong;
    }
    public String getTendangnhap() {
        return this.tendangnhap;
    }
    
    public void setTendangnhap(String tendangnhap) {
        this.tendangnhap = tendangnhap;
    }
    public String getMatkhau() {
        return this.matkhau;
    }
    
    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }
    public Integer getSohieucongchuc() {
        return this.sohieucongchuc;
    }
    
    public void setSohieucongchuc(Integer sohieucongchuc) {
        this.sohieucongchuc = sohieucongchuc;
    }
    public String getChungminhnhandan() {
        return this.chungminhnhandan;
    }
    
    public void setChungminhnhandan(String chungminhnhandan) {
        this.chungminhnhandan = chungminhnhandan;
    }
    public String getHoten() {
        return this.hoten;
    }
    
    public void setHoten(String hoten) {
        this.hoten = hoten;
    }
    public String getGioitinh() {
        return this.gioitinh;
    }
    
    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }
    public String getDuongdananh() {
        return this.duongdananh;
    }
    
    public void setDuongdananh(String duongdananh) {
        this.duongdananh = duongdananh;
    }
    public String getTenthuongdung() {
        return this.tenthuongdung;
    }
    
    public void setTenthuongdung(String tenthuongdung) {
        this.tenthuongdung = tenthuongdung;
    }
    public Date getNgaysinh() {
        return this.ngaysinh;
    }
    
    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }
    public String getNoisinh() {
        return this.noisinh;
    }
    
    public void setNoisinh(String noisinh) {
        this.noisinh = noisinh;
    }
    public String getQuequan() {
        return this.quequan;
    }
    
    public void setQuequan(String quequan) {
        this.quequan = quequan;
    }
    public String getNoiohiennay() {
        return this.noiohiennay;
    }
    
    public void setNoiohiennay(String noiohiennay) {
        this.noiohiennay = noiohiennay;
    }
    public String getSodienthoai() {
        return this.sodienthoai;
    }
    
    public void setSodienthoai(String sodienthoai) {
        this.sodienthoai = sodienthoai;
    }
    public String getNgayvaodangdubi() {
        return this.ngayvaodangdubi;
    }
    
    public void setNgayvaodangdubi(String ngayvaodangdubi) {
        this.ngayvaodangdubi = ngayvaodangdubi;
    }
    public String getNgayvaodangchinhthuc() {
        return this.ngayvaodangchinhthuc;
    }
    
    public void setNgayvaodangchinhthuc(String ngayvaodangchinhthuc) {
        this.ngayvaodangchinhthuc = ngayvaodangchinhthuc;
    }
    public String getTencntn1() {
        return this.tencntn1;
    }
    
    public void setTencntn1(String tencntn1) {
        this.tencntn1 = tencntn1;
    }
    public String getNamtn1() {
        return this.namtn1;
    }
    
    public void setNamtn1(String namtn1) {
        this.namtn1 = namtn1;
    }
    public String getTencntn2() {
        return this.tencntn2;
    }
    
    public void setTencntn2(String tencntn2) {
        this.tencntn2 = tencntn2;
    }
    public String getNamtn2() {
        return this.namtn2;
    }
    
    public void setNamtn2(String namtn2) {
        this.namtn2 = namtn2;
    }
    public String getTencntn3() {
        return this.tencntn3;
    }
    
    public void setTencntn3(String tencntn3) {
        this.tencntn3 = tencntn3;
    }
    public String getNamtn3() {
        return this.namtn3;
    }
    
    public void setNamtn3(String namtn3) {
        this.namtn3 = namtn3;
    }
    public Integer getIdquocgia() {
        return this.idquocgia;
    }
    
    public void setIdquocgia(Integer idquocgia) {
        this.idquocgia = idquocgia;
    }
    public Date getNgaycapnhat() {
        return this.ngaycapnhat;
    }
    
    public void setNgaycapnhat(Date ngaycapnhat) {
        this.ngaycapnhat = ngaycapnhat;
    }
    public Set getQuatrinhnghiencuus() {
        return this.quatrinhnghiencuus;
    }
    
    public void setQuatrinhnghiencuus(Set quatrinhnghiencuus) {
        this.quatrinhnghiencuus = quatrinhnghiencuus;
    }
    public Set getDienbienhocvis() {
        return this.dienbienhocvis;
    }
    
    public void setDienbienhocvis(Set dienbienhocvis) {
        this.dienbienhocvis = dienbienhocvis;
    }
    public Set getQuatrinhdinuocngoais() {
        return this.quatrinhdinuocngoais;
    }
    
    public void setQuatrinhdinuocngoais(Set quatrinhdinuocngoais) {
        this.quatrinhdinuocngoais = quatrinhdinuocngoais;
    }
    public Set getDienbienluongs() {
        return this.dienbienluongs;
    }
    
    public void setDienbienluongs(Set dienbienluongs) {
        this.dienbienluongs = dienbienluongs;
    }
    public Set getDienbienhochams() {
        return this.dienbienhochams;
    }
    
    public void setDienbienhochams(Set dienbienhochams) {
        this.dienbienhochams = dienbienhochams;
    }
    public Set getSachxuatbans() {
        return this.sachxuatbans;
    }
    
    public void setSachxuatbans(Set sachxuatbans) {
        this.sachxuatbans = sachxuatbans;
    }




}

