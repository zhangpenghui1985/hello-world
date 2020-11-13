package com.zhangph.test;

import com.hundsun.jres.impl.db.datasource.DataSourceFactory;
import com.hundsun.jres.impl.db.session.DBSessionFactory;
import com.hundsun.jres.impl.db.session.SpringBootDbConfiguration;
import com.hundsun.jres.interfaces.db.session.IDBSession;
import com.hundsun.jres.interfaces.db.session.IDBSessionFactory;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;

@Service("dbtest")
public class DMTest {

    static  {
        System.out.println("bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb");
        //SpringBootDbConfiguration springBootDbConfiguration = new SpringBootDbConfiguration(null);
        //System.out.println("aaaaaaaa:"+SpringBootDbConfiguration.getDbConfigMap().toString());
        //DataSourceFactory ds = new DataSourceFactory();
        //DBSessionFactory dbSessionFactory = new DBSessionFactory();
        IDBSession session = DBSessionFactory.getSession();
        ResultSet rs = null;
        try {
            rs  = session.getResultSet("select * from tbsysarg");
            rs.next();
            System.out.println("bankno:"+rs.getString("bank_no")+" bank_name:"+rs.getString("bank_name") + " init_date:"+rs.getInt("init_date"));
        } catch (SQLException e) {
            e.printStackTrace();
            if (rs != null) {
                try {
                    session.closeResultSetAndStatement(rs);
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }

    }
}
