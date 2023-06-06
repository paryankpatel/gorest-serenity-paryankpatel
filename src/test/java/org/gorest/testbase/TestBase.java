package org.gorest.testbase;

import io.restassured.RestAssured;
import org.gorest.constants.Path;
import org.gorest.util.PropertyReader;
import org.junit.BeforeClass;

public class TestBase {
    public static PropertyReader propertyReader;

    @BeforeClass
    public static void init() {
        propertyReader = PropertyReader.getInstance();
        RestAssured.baseURI = propertyReader.getProperty("baseUrl");
        RestAssured.basePath = Path.USER;
    }
}
