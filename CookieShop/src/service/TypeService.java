package service;

import dao.TypeDao;
import model.Type;

import java.sql.SQLException;
import java.util.List;

public class TypeService {
    TypeDao tDao=new TypeDao();
    public List<Type> GetAllType()
    {
        List<Type> list=null;
        try {
            list=tDao.GetAllType();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
    public Type selectTypeNameByID(int typeid)
    {
        Type type=null;
        try {
            type=tDao.selectTypeNameByID(typeid);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return type;
    }
    public Type select(int id) {
        Type t=null;
        try {
            t = tDao.select(id);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return t;
    }
    public void insert(Type t) {
        try {
            tDao.insert(t);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public void update(Type t) {
        try {
            tDao.update(t);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public boolean delete(int id) {
        try {
            tDao.delete(id);
            return true;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return false;
        }
    }
}
