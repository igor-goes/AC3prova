package com.mycompany.sprint3.igor;

import org.apache.commons.dbcp2.BasicDataSource;

public class conexao {

    private BasicDataSource dataSource;

    public conexao() {
        dataSource = new BasicDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://54.173.83.99:3306/sprintigor?useTimezone=true&serverTimezone=UTC");
        dataSource.setUsername("root");
        dataSource.setPassword("urubu100");
    }

    public BasicDataSource getDataSource() {
        return dataSource;
    }

}
