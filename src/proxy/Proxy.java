package proxy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Proxy implements UserModelApi {

    private UserModel realSubject = null;
    private boolean loaded = false;
    
    public Proxy(UserModel realSubject) {
        this.realSubject = realSubject;
    }
    
    @Override
    public String getUserId() {
        return realSubject.getUserId();
    }

    @Override
    public void setUserId(String userId) {
        realSubject.setUserId(userId);
    }

    @Override
    public String getName() {
        return realSubject.getName();
    }

    @Override
    public void setName(String name) {
        realSubject.setName(name);
    }

    @Override
    public String getDepId() {
        if (!loaded) {
            reload();
            loaded = true;
        }
        return realSubject.getDepId();
    }

    @Override
    public void setDepId(String depId) {
        realSubject.setDepId(depId);
    }

    @Override
    public String getSex() {
        if (loaded) {
            reload();
            loaded = true;
        }
        return realSubject.getSex();
    }

    @Override
    public void setSex(String sex) {
        realSubject.setSex(sex);
    }
    
    private void reload() {
        System.out.println("reload database to get entire user data, userId:" + realSubject.getUserId());
        
        Connection conn = null;
        try {
            conn = getConnection();
            String sql = "select * from tbl_user where userId=?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, realSubject.getUserId());
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                realSubject.setDepId(rs.getString("depId"));
                realSubject.setSex(rs.getString("sex"));
            }
            rs.close();
            pstmt.close();
        } catch (Exception err) {
            err.printStackTrace();
        } finally {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    
    public String toString() {
        return "userId:" + getUserId() + ", name:" + getName() + ", depId:" + getDepId() + ", sex:" + getSex();
    }
    
    private Connection getConnection() throws Exception {
        Class.forName("xxxxx");// driver class of your database
        return DriverManager.getConnection("url", "username", "password");
    }
}
