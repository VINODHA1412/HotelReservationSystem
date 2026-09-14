package org.hms.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import org.hms.model.HotelBooking;
import org.hms.util.DBConnection;

public class BookingRepositoryImpl implements BookingRepository {

    @Override
    public ArrayList<HotelBooking> getAllBookings() {

        ArrayList<HotelBooking> bookings =
                new ArrayList<>();

        String sql = "SELECT * FROM bookings";

        try {

            Connection connection =
                    DBConnection.getConnection();

            PreparedStatement statement =
                    connection.prepareStatement(sql);

            ResultSet resultSet =
                    statement.executeQuery();

            while (resultSet.next()) {

                HotelBooking booking =
                        new HotelBooking();

                booking.setBookingId(
                        resultSet.getInt("booking_id"));

                booking.setGuestName(
                        resultSet.getString("guest_name"));

                booking.setPhone(
                        resultSet.getString("phone"));

                booking.setRoomNo(
                        resultSet.getInt("room_no"));

                booking.setRoomType(
                        resultSet.getString("room_type"));

                booking.setCheckInDate(
                        resultSet.getString("check_in_date"));

                booking.setCheckOutDate(
                        resultSet.getString("check_out_date"));

                booking.setAmount(
                        resultSet.getDouble("amount"));

                bookings.add(booking);
            }

            resultSet.close();
            statement.close();
            connection.close();

        } catch (Exception e) {

            System.out.println(
                    "Error while reading booking data."
            );

            System.out.println(
                    e.getMessage()
            );
        }

        return bookings;
    }
}