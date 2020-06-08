package com.datasource.c3p0;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/***
 * c3po演示  测试最多10个连接对象
 *
 */
public class C3P0Demo2 {
    public static void main(String[] args) throws SQLException {
        //1.获取连接池对象
        DataSource ds = new ComboPooledDataSource();
        for (int i = 0; i < 11; i++) {
            //2.获取连接对象
            final Connection conn = ds.getConnection();
            System.out.println(i +":"+ conn);

            //如果非要11个人获取连接对象
            if (i==5){
                conn.close();
            }
        }
    }

}
