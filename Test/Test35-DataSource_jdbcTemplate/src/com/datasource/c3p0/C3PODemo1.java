package com.datasource.c3p0;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * c3po 演示
 *1. 导入jar包 (两个) c3p0-0.9.5.2.jar   mchange-commons-java-0.2.12.jar ，
 * 			* 不要忘记导入数据库驱动jar包mysql-connector-java-5.1.37-bin.jar
 * 		2. 定义配置文件：
 * 			* 名称： c3p0.properties 或者 c3p0-config.xml
 * 			* 路径：直接将文件放在src目录下即可。
 *
 * 		3. 创建核心对象 数据库连接池对象 ComboPooledDataSource
 * 		4. 获取连接： getConnection
 */
public class C3PODemo1 {
    public static void main(String[] args) throws SQLException {
        //1.创建连接池对象（自动加载配置文件）  使用默认配置
        DataSource ds = new ComboPooledDataSource();
        //2.获取连接对象
        Connection conn = ds.getConnection();
        System.out.println(conn);

    }

    public void TestOtherConfig() throws SQLException {
        //1.创建连接池对象  使用其他配置配置
        DataSource ds = new ComboPooledDataSource("otherc3p0");
        //2.获取连接对象
        Connection conn = ds.getConnection();
        System.out.println(conn);
    }
}
