package org.example.tests.crud;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.example.base.BaseTest;
import org.example.endpoints.APIConstants;
import org.testng.annotations.Test;

public class CreateBooking extends BaseTest {

    @Owner("Saurabh")
    @Description("Verify create booking for restful booker")
    @Test(priority = 1)
    public void test_create_booking()
    {
        requestSpecification.basePath(APIConstants.Create_update_Booking);
        requestSpecification.body(payloadManager.createbookingpayload());



    }

}
