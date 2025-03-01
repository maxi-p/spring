package dev.maxpetrushin.data_source;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PurchaseRepo {
    private final JdbcTemplate jdbc;

    @Autowired
    public PurchaseRepo(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public void storePurchase(Purchase purchase) {
        String sql = "INSERT INTO purchase (product, price) VALUES (?, ?);";
        jdbc.update(sql, purchase.getProduct(), purchase.getPrice());
    }

    public List<Purchase> getAllPurchases() {
        String sql = "SELECT * FROM purchase;";

        RowMapper<Purchase> rowMapper = (rs, rowNum) -> {
            Purchase rowObject = new Purchase();
            rowObject.setId(rs.getInt("id"));
            rowObject.setProduct(rs.getString("product"));
            rowObject.setPrice(rs.getBigDecimal("price"));
            return rowObject;
        };

        return jdbc.query(sql, rowMapper);
    }
}
