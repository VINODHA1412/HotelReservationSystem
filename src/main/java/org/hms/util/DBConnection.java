package org.hms.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    private static final String URL =
            "jdbc:mysql://localhost:3306/hotel_management";

    private static final String USER =
            "root";

    private static final String PASSWORD =
            "vino1412";

    public static Connection getConnection()
            throws Exception {

        return DriverManager.getConnection(
                URL,
                USER,
                PASSWORD
        );
    }
}
