package view;

import model.Mail;

import java.io.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MailListReaderDB {
    public static List<String> read() throws IOException, ClassNotFoundException, SQLException {
        List<String> mailList = new ArrayList<>();

        Class.forName("org.sqlite.JDBC");
        String urlConection="jdbc:sqlite:KATA5.DB";
        Connection connection= DriverManager.getConnection(urlConection);

        Statement statement= connection.createStatement();
        String query="SELECT Mail FROM MAIL";
        ResultSet rs= statement.executeQuery(query);

        while(rs.next()){
            String mail= rs.getString("mail");
            if(!mail.contains("@")) continue;
            mailList.add(mail);
        }
        return mailList;
    }
}
