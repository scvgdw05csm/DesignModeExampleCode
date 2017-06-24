package proxy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;

public class UserManager {

    public Collection<UserModelApi> getUserByDepId(String depId) throws Exception {
        Collection<UserModelApi> col = new ArrayList<UserModelApi>();
        Connection conn = null;
        try {
            conn = getConnection();
            String sql = "select u.userId, u.name from tbl_user u, tbl_dep d where u.depId=d.depId and d.depId like ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, depId + "%");
            
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()) {
                Proxy proxy = new Proxy(new UserModel());
                proxy.setUserId(rs.getString("userId"));
                proxy.setName(rs.getString("name"));
                
                col.add(proxy);
            }
            rs.close();
            pstmt.close();
        } finally {
            conn.close();
        }
        return col;
    }
    
    private Connection getConnection() throws Exception {
        Class.forName("xxxxxx");// driver class of your database
        return DriverManager.getConnection("url", "username", "password");
    }
}
