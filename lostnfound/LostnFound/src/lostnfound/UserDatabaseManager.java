
package lostnfound;

import java.util.List;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;


public class UserDatabaseManager {
    private Connection connection;
    private String URL;
    private String USER;
    private String PASSWORD;

    public UserDatabaseManager(String url, String user, String password) {
        this.URL = url;
        this.USER = user;
        this.PASSWORD = password;
        establishConnection();
    }

    private void establishConnection() {
    try {
        // Load the MySQL JDBC driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Establish the connection
        this.connection = DriverManager.getConnection(this.URL, this.USER, this.PASSWORD);
        System.out.println("Connection established."); // Add a log to check if the connection is successful
    } catch (SQLException | ClassNotFoundException e) {
        e.printStackTrace();
        // Handle exceptions properly, such as logging the error or displaying an error message
    }
}



public void saveItemInfoWithImage(
        String item, String color, String capacity, String addDetails,
        String category, String date, String time, String location, byte[] imageData) {
    PreparedStatement statement = null;
    try {
        String sqlInsert = "INSERT INTO items (item_name, color, capacity, additional_details, category, " +
                "date_lost, time_lost, location, image_data) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        statement = connection.prepareStatement(sqlInsert);
        statement.setString(1, item);
        statement.setString(2, color);
        statement.setString(3, capacity);
        statement.setString(4, addDetails);
        statement.setString(5, category);
        statement.setString(6, date);
        statement.setString(7, time);
        statement.setString(8, location);
        
        statement.setBytes(9, imageData); // Save the image data

        statement.executeUpdate(); // Execute the statement to save the item info with the image

    } catch (SQLException e) {
        handleException(e);
    } finally {
        closeStatement(statement);
    }
}






    private void closeConnection() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        } catch (SQLException e) {
            handleException(e);
        }
    }

    private void closeStatement(PreparedStatement statement) {
        try {
            if (statement != null) {
                statement.close();
            }
        } catch (SQLException e) {
            handleException(e);
        }
    }
 

// Method to retrieve image data for a specific username
public byte[] getImageForUser(String username) {
    byte[] imageData = null;
    try {
        String sql = "SELECT image_data FROM images WHERE username = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, username);
        ResultSet resultSet = statement.executeQuery();
        if (resultSet.next()) {
            Blob blob = resultSet.getBlob("image_data");
            int blobLength = (int) blob.length();
            imageData = blob.getBytes(1, blobLength);
            blob.free();
        }
        resultSet.close();
        statement.close();
    } catch (SQLException e) {
        handleException(e);
    }
    return imageData;
}
    public Map<String, Object> getSearchItemDetails(String itemID) {
        Map<String, Object> itemDetails = new HashMap<>();
        try {
            String sql = "SELECT item_name, color, capacity, additional_details, category, " +
                    "date_lost, time_lost, location, image_data " +
                    "FROM items WHERE id = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, itemID);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                itemDetails.put("item_name", resultSet.getString("item_name"));
                itemDetails.put("color", resultSet.getString("color"));
                itemDetails.put("capacity", resultSet.getString("capacity"));
                itemDetails.put("additional_details", resultSet.getString("additional_details"));
                itemDetails.put("category", resultSet.getString("category"));
                itemDetails.put("date_lost", resultSet.getString("date_lost"));
                itemDetails.put("time_lost", resultSet.getString("time_lost"));
                itemDetails.put("location", resultSet.getString("location"));
               
                
                Blob blob = resultSet.getBlob("image_data");
                if (blob != null) {
                    int blobLength = (int) blob.length();
                    byte[] imageData = blob.getBytes(1, blobLength);
                    itemDetails.put("image_data", imageData);
                }
                blob.free();
            }
            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            handleException(e);
        }
        return itemDetails;
    }

    private void handleException(SQLException e) {
    e.printStackTrace();
    System.err.println("SQLException: " + e.getMessage());
    System.err.println("SQLState: " + e.getSQLState());
    System.err.println("VendorError: " + e.getErrorCode());
}
public List<List<Object>> getAllItemsData() {
        List<List<Object>> tableData = new ArrayList<>();
        try {
            String sql = "SELECT id, item_name, color, capacity, category, date_lost, time_lost, location FROM items";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                List<Object> rowData = new ArrayList<>();
                rowData.add(resultSet.getObject("id"));
                rowData.add(resultSet.getObject("item_name"));
                rowData.add(resultSet.getObject("color"));
                rowData.add(resultSet.getObject("capacity"));
                rowData.add(resultSet.getObject("category"));
                rowData.add(resultSet.getObject("date_lost"));
                rowData.add(resultSet.getObject("time_lost"));
                rowData.add(resultSet.getObject("location"));

                tableData.add(rowData);
            }

            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            handleException(e);
        }
        return tableData;
    }

  public boolean deleteItem(Object itemId) {
       try {
        // Establish a database connection (you can use the existing connection field)
        // Connection connection = /* Your connection logic here */;

        // Prepare the SQL statement
        String sql = "DELETE FROM items WHERE id = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            // Set the parameter (assuming itemId is the primary key)
            preparedStatement.setObject(1, itemId);

            // Execute the delete statement
            int rowsAffected = preparedStatement.executeUpdate();

            // Check if the deletion was successful
            return rowsAffected > 0;
        }
    } catch (SQLException e) {
        // Handle any potential SQLException
        handleException(e); // You can use the existing exception handling method
        return false;
    }

  }
    // Other methods for database operations...
}

