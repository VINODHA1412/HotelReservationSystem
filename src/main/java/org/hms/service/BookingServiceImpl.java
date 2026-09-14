package org.hms.service;

import java.util.ArrayList;

import org.hms.model.HotelBooking;
import org.hms.repository.BookingRepository;
import org.hms.repository.BookingRepositoryImpl;

public class BookingServiceImpl implements BookingService {

    private BookingRepository repository =
            new BookingRepositoryImpl();

    @Override
    public ArrayList<HotelBooking> getAllBookings() {

        return repository.getAllBookings();
    }
}