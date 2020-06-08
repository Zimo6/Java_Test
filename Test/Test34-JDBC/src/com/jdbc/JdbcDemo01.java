package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
        //   以后都用  prepareStatement  查询请看Demo09
public class JdbcDemo01 {
    public static void main(String[] args) throws Exception {
        //1.导入驱动jar包
        //2.注册驱动（mysql5之后的驱动可以省略注册驱动）
        Class.forName("com.mysql.jdbc.Driver");  //真正注册驱动是java.sql.DriverManager.registerDriver(new Driver());
        //3.获取数据库连接对象
        final Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db2", "root", "123");
        //4.定义sql语句
        String sql = "update account set balance = ? where id=?";
        //5.获取执行sql对象 prepareStatement
        PreparedStatement pstmt = con.prepareStatement(sql);
        //6.执行sql
        pstmt.setDouble(1,5000);
        pstmt.setInt(2,1);
        final int aount = pstmt.executeUpdate();
        //7.处理结果
        System.out.println(aount);//结果为影响的行数，可以判断sql语句是否执行成功
        //8.释放资源
        pstmt.close();
        con.close();

    }
}
