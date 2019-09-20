//--To insert queries in jdbc program..--//
String sql = "INSERT INTO Users (username, password, fullname, email) VALUES (?, ?, ?, ?)";
 
PreparedStatement statement = conn.prepareStatement(sql);
statement.setString(1, "bill");
statement.setString(2, "secretpass");
statement.setString(3, "Bill Gates");
statement.setString(4, "bill.gates@microsoft.com");
 
int rowsInserted = statement.executeUpdate();
if (rowsInserted > 0) {
    System.out.println("A new user was inserted successfully!");
}