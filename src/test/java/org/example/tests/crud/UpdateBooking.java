package org.example.tests.crud;

import org.example.base.BaseTest;
import org.example.endpoints.APIConstants;

public class UpdateBooking extends BaseTest {

    String bookingid="";
    String token = "";
    public void test_update_booking()
    {
        requestSpecification.basePath(APIConstants.Create_update_Booking+"/"+bookingid);
        requestSpecification.body(payloadManager.createbookingpayload());
        requestSpecification.cookie("token",token);

        response = requestSpecification.when().put();
    }

}
