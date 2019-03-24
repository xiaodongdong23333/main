package com.example.demo;

import com.alibaba.druid.pool.DruidDataSource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestDatasource {

    private DataSource dataSource;
    @Autowired
    public void setDatasource(DataSource dataSource){
        this.dataSource = dataSource;
    }

    @Test
    public void contextLoads() throws SQLException {
        // 查看配置数据源信息
        System.out.println("数据源" + dataSource.getClass());
        Connection connection = dataSource.getConnection();
        System.out.println("数据连接" + connection);
        System.out.println("数据连接地址" + connection.getMetaData().getURL());

        DruidDataSource druidDataSource = (DruidDataSource) dataSource;
        System.out.println("druidDataSource 数据源最大连接数：" + druidDataSource.getMaxActive());
        System.out.println("druidDataSource 数据源初始化连接数：" + druidDataSource.getInitialSize());

        connection.close();

    }
}
