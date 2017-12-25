/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Koneksi;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author damaikurnia
 */
public class Koneksi {
    //pasw google ph6CX4Em8ju3
    private static String jdbcURL = "jdbc:mysql://localhost:3306/pgsd";
    private static String user = "root";
//    private static String password = "root";//linux database
    private static String password = "";//windows database
    private static Connection connection = null;

    public static Connection getKoneksi() {
        try {
            Class.forName("org.gjt.mm.mysql.Driver");
            connection = DriverManager.getConnection(jdbcURL, user, password);
//            System.out.println("koneksi berhasil");
            return connection;
        } catch (Exception ex) {
            System.out.println("message: " + ex.getMessage() + "\nTidak konek");
            return null;
        }
    }

    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        Koneksi proses = new Koneksi();
        proses.getKoneksi();
    }
}
