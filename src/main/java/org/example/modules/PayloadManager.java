package org.example.modules;

import com.google.gson.Gson;
import org.example.pojos.Booking;
import org.example.pojos.BookingResponse;
import org.example.pojos.Bookingdates;

public class PayloadManager {

    public String createbookingpayload()
    {
        Booking booking = new Booking();
        booking.setFirstname("JaiShree");
        booking.setLastname("Ram");
        booking.setDepositpaid(true);
        booking.setTotalprice(10000);

        Bookingdates bookingdates = new Bookingdates();
        bookingdates.setCheckin("2010-01-01");
        bookingdates.setCheckout("2019-01-01");
        booking.setBookingdates(bookingdates);

        Gson gson = new Gson();
        String jsonStringbooking=gson.toJson(booking);
        return jsonStringbooking;

    }

    public BookingResponse bookingResponse(String response)
    {
        Gson gson = new Gson();
        BookingResponse responseasString = gson.fromJson(response, BookingResponse.class);
        return responseasString;

    }

    public String fullupdatebooking()
    {
        Booking booking = new Booking();
        booking.setFirstname("SHREE");
        booking.setLastname("RAM");
        booking.setDepositpaid(true);
        booking.setTotalprice(1900);

        Bookingdates bookingdates = new Bookingdates();
        bookingdates.setCheckin("2022-02-02");
        bookingdates.setCheckout("2024-02-02");
        booking.setAdditionalneeds("Lunch");
        booking.setBookingdates(bookingdates);

        Gson gson = new Gson();
        String updatejsonstring=gson.toJson(booking);
        return updatejsonstring;

    }

    public Booking getbookingresponse(String response)
    {
        Gson gson = new Gson();
        Booking updatestringresponse=gson.fromJson(response,Booking.class);
        return updatestringresponse;

    }

}
