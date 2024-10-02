package AppBase;

import java.sql.Connection;
import java.util.Properties;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

//import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.SecureRandom;
import java.sql.*;
import java.text.SimpleDateFormat;

public class baseClass {
	
	
	protected static Properties properties;

  //  protected static WebDriver driver;
    protected static Connection con;



    public baseClass() {    
    try {
        properties = new Properties();
        FileInputStream ip = new FileInputStream(System.getProperty("user.dir")
                + "/src/main/java/BeemDataSource/BeemAppConstants.properties");
        properties.load(ip);
    } catch (FileNotFoundException ex) {
        ex.printStackTrace();
        System.out.println("file not found");
    } catch (IOException e) {
        System.out.println("io exception");
    }  
    
}
    
    
    protected static void setbaseURL(String env) {
        String baseUrl = "";
        if ( env.equalsIgnoreCase("dev")) {
            baseUrl = properties.getProperty("DevBaseURL_BEEM");
        }
       
        RestAssured.baseURI = baseUrl;
    }

    public static JsonPath jsonpath(Response response) {
        JsonPath jpath = new JsonPath(response.asString());
        return jpath;
    }

    public static void verifyStatusCode_OK(Response response) {
        int statusCode = response.getStatusCode();
        System.out.println("Status code is : "+statusCode);
        Assert.assertEquals(statusCode, 200);
        System.out.println("Validation of Status Code completed ");
    }

    public static void verifyBadStatusCode_OK(Response response, String statuscode) {
        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, Integer.parseInt(statuscode));
        System.out.println("Validation of Status Code completed :" +statuscode+ " Bad Request ");
        System.out.println("Response Message : "+response.statusLine());
    }

    public static void verify(Response response) {
        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, 400);
        System.out.println("Validation of Status Code completed : ");
        System.out.println("Response Message : "+response.statusLine());
    }



}
