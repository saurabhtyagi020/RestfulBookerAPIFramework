package org.example.tests.crud;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.example.base.BaseTest;
import org.example.endpoints.APIConstants;
import org.example.pojos.BookingResponse;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;

public class CreateBooking extends BaseTest {

    @Owner("Saurabh")
    @Description("Verify create booking for restful booker")
    @Test(priority = 1)
    public void test_create_booking()
    {
        requestSpecification.basePath(APIConstants.Create_update_Booking);
        requestSpecification.body(payloadManager.createbookingpayload());

        response =requestSpecification.when().post();

        validatableResponse= response.then().statusCode(200);

        Assert.assertEquals(200,response.getStatusCode());

        BookingResponse bookingResponse = payloadManager.bookingResponse(response.asString());
        Integer BookID = bookingResponse.getBookingid();
        Assert.assertNotNull(BookID);
        assertThat(bookingResponse.getBookingid()).isNotNull().isNotNegative();

        String fName=bookingResponse.getBooking().getFirstname();
        System.out.println(fName);

        Assert.assertEquals(fName,"JaiShree");

        assertThat(bookingResponse.getBooking().getFirstname()).isEqualTo("JaiShree").isNotEmpty().isNotNull().isNotBlank();

    }

}
