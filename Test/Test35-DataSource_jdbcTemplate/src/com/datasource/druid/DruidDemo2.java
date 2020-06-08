package com.datasource.druid;


import com.datasource.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 使用新的工具类
 */
public class DruidDemo2 {

    public static void main(String[] args) {
        /*
         * 完成添加操作：给account表添加一条记录
         */
        Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            //1.获取连接(用了工具类)
            conn = JDBCUtils.getConnection();
            conn.setAutoCommit(false);//开启事务
            //2.定义sql
            String sql = "insert into account values(null,?,?)";
            //3.获取pstmt对象
            pstmt = conn.prepareStatement(sql);
            //4.给？赋值
            pstmt.setString(1,"王五");
            pstmt.setDouble(2,3000);
            //5.执行sql
            int count = pstmt.executeUpdate();
            conn.commit();//提交事务
            System.out.println(count);
        } catch (SQLException e) {
            e.printStackTrace();
            try {
                if (conn!=null){
                    conn.rollback();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }finally {
            //6. 释放资源
            JDBCUtils.close(pstmt,conn);
        }
    }

}
