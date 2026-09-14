package org.hms.repository;

import java.util.ArrayList;

import org.hms.model.HotelBooking;

public interface BookingRepository {

    ArrayList<HotelBooking> getAllBookings();
}