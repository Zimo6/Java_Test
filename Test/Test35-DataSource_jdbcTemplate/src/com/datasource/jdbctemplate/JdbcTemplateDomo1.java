package com.datasource.jdbctemplate;

import com.datasource.utils.JDBCUtils;
import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcTemplateDomo1 {
    public static void main(String[] args) {
        //1.导入jar包
        //2.创建JdbcTemplate对象（可以直接执行sql）
        JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());
        //3.调用方法
        String sql = "update account set balance = 5000 where id =?";
        int count = template.update(sql,3);
        System.out.println(count);
    }
}
