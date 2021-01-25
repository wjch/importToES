package cn.wjch.es;

/**
 * @program: importToES
 * @description:
 * @author: wjch
 * @create: 2021-01-22 14:37
 **/

import java.sql.Connection;
import java.sql.DriverManager;

public class DBHelper {

    public static final String url = "jdbc:mysql://localhost:3306/data1";
    public static final String name = "com.mysql.cj.jdbc.Driver";
    public static final String user = "root";
    public static final String password = "XXXXXX";

    public static Connection conn = null;

    public static Connection getConn() {
        try {
            Class.forName(name);
            conn = DriverManager.getConnection(url, user, password);//获取连接
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
}
