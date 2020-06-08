package com.datasource.druid;

import com.datasource.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DruidDemo2Utils { //自己写的，应该用try catch
    public static void main(String[] args) throws SQLException {
        //1.获取连接
        final Connection conn = JDBCUtils.getConnection();
            conn.setAutoCommit(false);//开启事务
        //2.定义sql
        String sql = "update account set  balance = ? where id =?;";
        //3..获取执行sql的对象
        final PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setDouble(1,10000);
        pstm.setInt(2,1);
        //4.执行sql
        final int i = pstm.executeUpdate();
            //提交事务
            conn.commit();
        System.out.println(i); //影响的行数
        //5.关闭
        JDBCUtils.close(pstm,conn);
    }
}
