package com.zhh;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TestDemo {
    @Test
    public void connectOrcle() throws Exception {
         Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.204.131:1521:orcl", "system", "root");
        PreparedStatement pst = connection.prepareStatement("SELECT * from person ");
//        pst.setObject(1,"aaa");
        ResultSet resultSet = pst.executeQuery();

        while (resultSet.next()){
            System.out.println(1);
            System.out.println(resultSet.getObject("pname"));
        }

        System.out.println("把他们当一次人吧");
    }
}
