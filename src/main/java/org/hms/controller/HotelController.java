package org.hms.controller;

import java.util.ArrayList;

import org.hms.model.HotelBooking;
import org.hms.service.BookingService;
import org.hms.service.BookingServiceImpl;

public class HotelController {

    private BookingService service =
            new BookingServiceImpl();

    public void start() {

        System.out.println("========================================");
        System.out.println("       HOTEL MANAGEMENT SYSTEM");
        System.out.println("========================================");

        ArrayList<HotelBooking> bookings =
                service.getAllBookings();

        if (bookings.isEmpty()) {

            System.out.println("No booking data found.");

            return;
        }

        for (HotelBooking booking : bookings) {

            System.out.println("----------------------------------------");

            System.out.println("Booking ID      : "
                    + booking.getBookingId());

            System.out.println("Guest Name      : "
                    + booking.getGuestName());

            System.out.println("Phone Number    : "
                    + booking.getPhone());

            System.out.println("Room Number     : "
                    + booking.getRoomNo());

            System.out.println("Room Type       : "
                    + booking.getRoomType());

            System.out.println("Check-In Date   : "
                    + booking.getCheckInDate());

            System.out.println("Check-Out Date  : "
                    + booking.getCheckOutDate());

            System.out.println("Amount          : "
                    + booking.getAmount());
        }

        System.out.println("----------------------------------------");
    }
}