package com.example.demo.service.impl;

import com.example.demo.model.Order;
import com.example.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Service("orderService")
public class OrderServiceImpl implements OrderService {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int save(Order order) {
        return jdbcTemplate.update(
                "insert into tb_order(order_no, amount) values(?, ?)",
                order.getOrderNo(),
                order.getAmount());
    }

    @Override
    public int update(Order order) {
        return jdbcTemplate.update(
                "update tb_order set amount = ? where id = ?",
                order.getAmount(),
                order.getId());
    }

    @Override
    public int delete(int id) {
        return jdbcTemplate.update(
                "delete from tb_order where id = ?",
                id);
    }

    @Override
    public Order findById(int id) {
        return jdbcTemplate.queryForObject(
                "select * from tb_order where id = ?",
                new BeanPropertyRowMapper<Order>(Order.class), //NOTE: will be auto trans column _ to Camel Case
                new Object[]{id}
        );
    }

    @Override
    public List<Order> findAll() {
        return jdbcTemplate.query(
                "select * from tb_order",
                new OrderRowMapper()

        );
    }

    class OrderRowMapper implements RowMapper<Order> {
        @Override
        public Order mapRow(ResultSet rs, int rowNum) throws SQLException {
            Order order = new Order();
            order.setId(rs.getInt("id"));
            order.setOrderNo(rs.getString("order_no")); //NOTE: need to match table column
            order.setAmount(rs.getInt("amount"));
            return order;
        }
    }
}