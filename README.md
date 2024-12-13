# AddressBook System Using JDBC

This project is an **Address Book System** implemented in Java using **JDBC** for database interaction. The application enables users to perform CRUD operations on contact details stored in a database.

## Features

- **Add Contacts**: Add new contact details to the address book.
- **Edit Contacts**: Update existing contact information.
- **Delete Contacts**: Remove contact details from the address book.
- **View Contacts**: Retrieve and display contact details.

## Technologies Used

- **Java**: Core programming language.
- **JDBC**: Java Database Connectivity for database operations.
- **MySQL**: Database used to store contact details.
- **Git**: Version control system.

## Prerequisites

1. Install **Java 8** or higher.
2. Set up **MySQL** and create a database.
3. Install **Git** for version control.
4. Clone the repository:
   ```bash
   git clone https://github.com/omhpatil/AddressBookSystemUsingJDBC.git
   ```

## Database Setup

1. Create a MySQL database named `addressbook`.
2. Run the following SQL script to create the `contacts` table:
   ```sql
   CREATE TABLE contacts (
       id INT AUTO_INCREMENT PRIMARY KEY,
       fname VARCHAR(50),
       lname VARCHAR(50),
       city VARCHAR(50),
       state VARCHAR(50),
       email VARCHAR(100),
       pnumber BIGINT,
       pincode INT
   );
   ```

## How to Run

1. Open the project in an IDE such as **IntelliJ IDEA** or **Eclipse**.
2. Configure your database connection in the `DatabaseConnection` class:
   ```java
   public class DatabaseConnection {
       private static final String URL = "jdbc:mysql://localhost:3306/your_database_name";
       private static final String USER = "your_username";
       private static final String PASSWORD = "your_password";

       public static Connection getConnection() throws SQLException {
           return DriverManager.getConnection(URL, USER, PASSWORD);
       }
   }
   ```
3. Compile and run the application.

## Singleton Pattern Integration

This project uses the Singleton design pattern in the `DatabaseConnection` class to ensure a single database connection instance throughout the application. This helps improve performance and maintain code simplicity.

## Example Commands

### Add Contact
```bash
Enter First Name: John
Enter Last Name: Doe
Enter City: New York
Enter State: NY
Enter Email: john.doe@example.com
Enter Phone Number: 1234567890
Enter Pincode: 10001
```

### Edit Contact
```bash
Enter First Name of Contact to Edit: John
Enter Last Name of Contact to Edit: Doe
Enter New City: Los Angeles
Enter New State: CA
Enter New Email: john.doe@newemail.com
Enter New Phone Number: 9876543210
Enter New Pincode: 90001
```

## File Structure

```
AddressBookSystemUsingJDBC/
├── src/
│   ├── AddressBookMain.java
│   ├── DatabaseConnection.java
│   ├── Contact.java
│   └── Main.java
└── EADME.md
```


## Author

- **Om Patil**

