package org.hms.main;

import org.hms.controller.HotelController;

public class HotelManagementSystem {

    public static void main(String[] args) {

        HotelController controller = new HotelController();

        controller.start();
    }
}