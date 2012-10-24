/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import model.Donviquanly;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import model.Khoidonviquanly;
import model.Phongban;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

/**
 *
 * @author Admin
 */
public class InstituteDAO {

    /**
     *
     * @return Danh sách đơn vị quản lý
     */
    public static List<Donviquanly> findAllInstitute(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        List<Donviquanly> dvqlList = new ArrayList<Donviquanly>();
        try{
            tx = session.beginTransaction();
            List list = session.createQuery("from Donviquanly").list();
            for(Iterator interator = list.iterator(); interator.hasNext();){
                Donviquanly dt = (Donviquanly)interator.next();
                dvqlList.add(dt);
            }
            tx.commit();

        }catch(HibernateException e){
            tx.rollback();
            e.printStackTrace();
        }
        return dvqlList;
    }

    /**
     *
     * @param idKhoidonvi
     * @return
     */
    public static List<Donviquanly> findAllInstituteByIdKhoidonvi(int idKhoidonvi){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        List<Donviquanly> dvqlList = new ArrayList<Donviquanly>();
        try{
            tx = session.beginTransaction();
            String hql = "from Donviquanly where idkhoidonviquanly ="+idKhoidonvi;
            List list = session.createQuery(hql).list();
            for(Iterator interator = list.iterator(); interator.hasNext();){
                Donviquanly dt = (Donviquanly)interator.next();
                dvqlList.add(dt);
            }
            tx.commit();

        }catch(HibernateException e){
            tx.rollback();
            e.printStackTrace();
        }
        return dvqlList;
    }

    /**
     * 
     * @param id mã đơn vị quản lý
     * @return Đơn vị quản lý
     */
    public static Donviquanly findInstituteById(int id){
        Session session = HibernateUtil.getSessionFactory().openSession();       
        Donviquanly dvql = null;
        try{
            dvql = (Donviquanly) session.get(Donviquanly.class, id);
        }catch(HibernateException e){
            System.err.println(e);
        }finally{
            session.close();
        }
        return dvql;
    }

    /**
     * 
     * @param ten
     * @param idKhoiDVQL
     * @param duongdananh
     * @param diachi
     * @param email
     * @param sodienthoai
     * @param fax
     * @param chucnang
     * @param nhiemvu
     */
    public static void addInstitute(String ten, int idKhoiDVQL, String duongdananh, String diachi, String email, String sodienthoai, String fax, String chucnang, String nhiemvu){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Donviquanly dvql = new Donviquanly();
        Transaction tx = null;
        try{
            tx = session.beginTransaction();
            dvql.setTen(ten);
            dvql.setKhoidonviquanly((Khoidonviquanly) session.get(Khoidonviquanly.class, idKhoiDVQL));
            dvql.setDuongdananh(duongdananh);
            dvql.setDiachitruso(diachi);
            dvql.setEmail(email);
            dvql.setDienthoai(sodienthoai);
            dvql.setFax(fax);
            dvql.setChucnang(chucnang);
            dvql.setNhiemvu(nhiemvu);
            session.save(dvql);
            tx.commit();
        }catch(HibernateException e){
            tx.rollback();
            e.printStackTrace();
        }finally{
            session.close();
        }
    }

    /**
     * 
     * @param dvql
     * @param ten
     * @param duongdananh
     * @param diachi
     * @param email
     * @param sodienthoai
     * @param fax
     * @param chucnang
     * @param nhiemvu
     */
    public static void updateInstitute(Donviquanly dvql){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;

        try{
            tx = session.beginTransaction();           
            session.update(dvql);
            session.flush();
            tx.commit();
        }catch(HibernateException e){
            tx.rollback();
            e.printStackTrace();
        }finally{
            session.close();
        }
    }

    /**
     * 
     * @param idDonviquanly
     */
    public static void deleteInstitute(int idDonviquanly){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        Donviquanly dvql = (Donviquanly) session.get(Donviquanly.class, idDonviquanly);
        try{
            tx = session.beginTransaction();
            session.delete(dvql);
            session.flush();
            tx.commit();
        }catch(HibernateException e){
            tx.rollback();
            e.printStackTrace();
        }finally{
            session.close();
        }
    }

    /**
     *
     * @return
     */
    public static List<Phongban> findAllPhongban(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        List<Phongban> phongbanList = new ArrayList<Phongban>();
        try{
            tx = session.beginTransaction();
            List list = session.createQuery("from Phongban").list();
            for(Iterator interator = list.iterator(); interator.hasNext();){
                Phongban pb = (Phongban)interator.next();
                phongbanList.add(pb);
            }
            tx.commit();

        }catch(HibernateException e){
            tx.rollback();
            e.printStackTrace();
        }
        return phongbanList;
    }

    /**
     * 
     * @param idVien
     * @return
     */
    public static List<Phongban> findAllPhongBanByIdVien(int idVien){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        List<Phongban> phongbanList = new ArrayList<Phongban>();
        try{
            tx = session.beginTransaction();
            String hql = "from Phongban where iddonviquanly = "+idVien;
            List list = session.createQuery(hql).list();
            for(Iterator interator = list.iterator(); interator.hasNext();){
                Phongban phongban = (Phongban)interator.next();
                phongbanList.add(phongban);
            }
            tx.commit();

        }catch(HibernateException e){
            tx.rollback();
            e.printStackTrace();
        }
        return phongbanList;
    }

    /**
     * 
     * @param idPhongban
     * @return
     */
    public static Phongban findPhongBanByIdPhongBan(int idPhongban){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Phongban phongban = null;
        try{
            phongban = (Phongban) session.get(Phongban.class, idPhongban);
        }catch(HibernateException e){
            
            e.printStackTrace();
        }
        return phongban;
    }

    /**
     * 
     * @return
     */
    public static List<Khoidonviquanly> findAllKhoidonviquanly(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        List<Khoidonviquanly> kdvqlList = new ArrayList<Khoidonviquanly>();
        try{
            tx = session.beginTransaction();
            String hql = "from Khoidonviquanly";
            List list = session.createQuery(hql).list();
            for(Iterator interator = list.iterator(); interator.hasNext();){
                Khoidonviquanly kdvql = (Khoidonviquanly)interator.next();
                kdvqlList.add(kdvql);
            }
            tx.commit();

        }catch(HibernateException e){
            tx.rollback();
            e.printStackTrace();
        }
        return kdvqlList;
    }
}
