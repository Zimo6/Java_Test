package com.datasource.druid;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Properties;

/***
 * Druid演示
 * 1. 步骤：
 * 		1. 导入jar包 druid-1.0.9.jar  * 不要忘记导入数据库驱动jar包mysql-connector-java-5.1.37-bin.jar
 * 		2. 定义配置文件：
 * 			* 是properties形式的
 * 			* 可以叫任意名称，可以放在任意目录下
 * 		3. 加载配置文件。Properties
 * 		4. 获取数据库连接池对象：通过工厂来来获取  DruidDataSourceFactory
 * 		5. 获取连接：getConnection
 */
public class DruidDemo1 {
    public static void main(String[] args) throws Exception {
        //1.导入jar包
        //2.定义配置文件
        //3.加载配置文件
        Properties pro = new Properties();
        ClassLoader cl = DruidDemo1.class.getClassLoader();

        InputStream inputStream = cl.getResourceAsStream("druid.properties");
        pro.load(inputStream);


        //4.获取连接池对象
        DataSource ds = DruidDataSourceFactory.createDataSource(pro);
        //5.获取连接
         Connection conn = ds.getConnection();
        System.out.println(conn);


    }
}
