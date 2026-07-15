package com.coforge.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.coforge.Product;

public class ProductDAO {
    // Database connection parameters (Change port/credentials if necessary)
    private String jdbcURL = "jdbc:mysql://localhost:3306/stock_db?useSSL=false";
    private String jdbcUsername = "root";
    private String jdbcPassword = "Bjpop@20"; // <--- Put your MySQL password here

    // SQL Queries
    private static final String INSERT_PRODUCT_SQL = "INSERT INTO products (name, category, quantity, price) VALUES (?, ?, ?, ?);";
    private static final String SELECT_PRODUCT_BY_ID = "SELECT id, name, category, quantity, price FROM products WHERE id = ?;";
    private static final String SELECT_ALL_PRODUCTS = "SELECT * FROM products;";
    private static final String DELETE_PRODUCT_SQL = "DELETE FROM products WHERE id = ?;";
    private static final String UPDATE_PRODUCT_SQL = "UPDATE products SET name = ?, category = ?, quantity = ?, price = ? WHERE id = ?;";

    // Helper method to establish connection
    protected Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // loading the database driver 
            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword); // connection establishment 
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection;
    }

    // 1. CREATE: Insert a new product row
    public void insertProduct(Product product) throws SQLException {
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_PRODUCT_SQL)) {
            
            preparedStatement.setString(1, product.getName());
            preparedStatement.setString(2, product.getCategory());
            preparedStatement.setInt(3, product.getQuantity());
            preparedStatement.setDouble(4, product.getPrice());
            
            preparedStatement.executeUpdate();
        }
    }

    // 2. READ: Fetch all products from the table
    public List<Product> selectAllProducts() {
        List<Product> products = new ArrayList<>();
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_PRODUCTS);
             ResultSet rs = preparedStatement.executeQuery()) {

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String category = rs.getString("category");
                int quantity = rs.getInt("quantity");
                double price = rs.getDouble("price");
                
                // Using the 5-parameter constructor because data already has an ID from DB
                products.add(new Product(id, name, category, quantity, price));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return products;
    }

    // 3. READ: Fetch a single product by its ID (Used when opening the edit form)
    public Product selectProduct(int id) {
        Product product = null;
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_PRODUCT_BY_ID)) {
            
            preparedStatement.setInt(1, id);
            try (ResultSet rs = preparedStatement.executeQuery()) {
                if (rs.next()) {
                    String name = rs.getString("name");
                    String category = rs.getString("category");
                    int quantity = rs.getInt("quantity");
                    double price = rs.getDouble("price");
                    
                    product = new Product(id, name, category, quantity, price);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return product;
    }

    // 4. UPDATE: Modify an existing product record
    public boolean updateProduct(Product product) throws SQLException {
        boolean rowUpdated;
        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement(UPDATE_PRODUCT_SQL)) {
            
            statement.setString(1, product.getName());
            statement.setString(2, product.getCategory());
            statement.setInt(3, product.getQuantity());
            statement.setDouble(4, product.getPrice());
            statement.setInt(5, product.getId());

            rowUpdated = statement.executeUpdate() > 0;
        }
        return rowUpdated;
    }

    // 5. DELETE: Permanently remove a product record
    public boolean deleteProduct(int id) throws SQLException {
        boolean rowDeleted;
        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement(DELETE_PRODUCT_SQL)) {
            
            statement.setInt(1, id);
            rowDeleted = statement.executeUpdate() > 0;
        }
        return rowDeleted;
    }
}