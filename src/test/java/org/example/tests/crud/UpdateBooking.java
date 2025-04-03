package org.example.tests.crud;

import org.example.base.BaseTest;
import org.example.endpoints.APIConstants;
import org.example.pojos.Booking;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.*;

public class UpdateBooking extends BaseTest {

    String bookingid="1333";
    String token = "5fd7ea5b6f94d68";

    @Test(priority = 2)
    public void test_update_booking()
    {
        requestSpecification.basePath(APIConstants.Create_update_Booking+"/"+bookingid);
        requestSpecification.body(payloadManager.fullupdatebooking());
        requestSpecification.cookie("token",token);

        response = requestSpecification.when().put();

        validatableResponse = response.then().statusCode(200);
        validatableResponse.log().all();

        Assert.assertEquals(200,response.getStatusCode());
        Booking responseasString = payloadManager.getbookingresponse(response.asString());
        String fName=responseasString.getFirstname();
        Assert.assertEquals(fName,"SHREE");

        assertThat(responseasString.getFirstname()).isNotBlank().isEqualTo("SHREE").isNotNull();
        String checkindate= responseasString.getBookingdates().getCheckin();
        System.out.println(checkindate);
        assertThat(responseasString.getBookingdates().getCheckin()).isNotNull();
    }

}
