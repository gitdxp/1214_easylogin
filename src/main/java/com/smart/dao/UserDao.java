package com.smart.dao;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Repository;
import com.smart.domain.User;

@Repository //通过Spring注解定义一个DAO
public class UserDao {
    private JdbcTemplate jdbcTemplate;

    @Autowired//自动注入JdbcTemplate 的Bean
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    public int getMatchCount(String userName,String password){
        String sqlStr = "select count(*) from t_user "
                + " where user_name = ? and password = ?";
        return jdbcTemplate.queryForObject(sqlStr, new Object[]{userName,password}, Integer.class);
    }
}
