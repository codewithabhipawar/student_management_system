<%@ page import="java.sql.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student Data</title>
    <style>
        body { font-family: Arial, sans-serif; background-color: #f4f4f4; }
        table { border-collapse: collapse; width: 70%; margin: 30px auto; background: #fff; }
        th, td { border: 1px solid #ccc; padding: 10px; text-align: center; }
        th { background-color: #007BFF; color: white; }
        h2 { text-align: center; color: #333; }
    </style>
</head>
<body>
    <h2>Student List</h2>

    <%
        // JDBC connection variables
        String jdbcURL = "jdbc:mysql://localhost:3306/school";
        String dbUser = "root";
        String dbPassword = "your_password_here";

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            // Load JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection
            connection = DriverManager.getConnection(jdbcURL, dbUser, dbPassword);

            // Create SQL query
            String sql = "SELECT * FROM students";

            // Execute query
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
    %>

    <table>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Age</th>
            <th>Grade</th>
        </tr>

        <%
            // Loop through the result set
            while (resultSet.next()) {
        %>
            <tr>
                <td><%= resultSet.getInt("id") %></td>
                <td><%= resultSet.getString("name") %></td>
                <td><%= resultSet.getInt("age") %></td>
                <td><%= resultSet.getString("grade") %></td>
            </tr>
        <%
            }
        %>
    </table>

    <%
        } catch (Exception e) {
            out.println("<p style='color:red;text-align:center;'>Error: " + e.getMessage() + "</p>");
        } finally {
            // Close resources
            if (resultSet != null) try { resultSet.close(); } catch (SQLException ignore) {}
            if (statement != null) try { statement.close(); } catch (SQLException ignore) {}
            if (connection != null) try { connection.close(); } catch (SQLException ignore) {}
        }
    %>

</body>
</html>
