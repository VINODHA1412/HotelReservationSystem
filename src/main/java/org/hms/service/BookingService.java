package org.hms.service;

import java.util.ArrayList;

import org.hms.model.HotelBooking;

public interface BookingService {

    ArrayList<HotelBooking> getAllBookings();
}