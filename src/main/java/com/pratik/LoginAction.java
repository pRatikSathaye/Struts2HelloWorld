package com.pratik;

import com.mongodb.*;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.opensymphony.xwork2.ActionSupport;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Arrays;
import java.util.Iterator;

/**
 * Created by pratik on 7/27/2015.
 */
public class LoginAction extends ActionSupport {

    private String user;
    private String password;
    private String name;

    public String execute() {
        String ret = ERROR;
        /*Connection conn = null;

        try {
            String URL = "jdbc:mysql://localhost/struts_tutorial";
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(URL, "root", "");
            String sql = "SELECT user FROM login WHERE";
            sql+=" user = ? AND password = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, user);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                name = rs.getString(1);
                ret = SUCCESS;
            }
        } catch (Exception e) {
            System.out.println("Exception "+e.getMessage());
            ret = ERROR;
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (Exception e) {
                }
            }
        }*/

        MongoClient mongoClient = new MongoClient( "localhost" , 27017 );

        DB db = mongoClient.getDB("test");// To directly connect to a single MongoDB server (note that this will not auto-discover the primary even
        DBCollection collection = db.getCollection("user");
         DBCursor cursor = collection.find();
        Iterator<DBObject> result = cursor.iterator();
        printDocuments(result);
        collection.insert(new BasicDBObject("username", "google"));
        printDocuments(result);
        return ret;
    }

    private void printDocuments(Iterator<DBObject> result) {
        while(result.hasNext()) {
            DBObject name = result.next();
            System.out.println("Name "+name.get("username"));
        }
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}