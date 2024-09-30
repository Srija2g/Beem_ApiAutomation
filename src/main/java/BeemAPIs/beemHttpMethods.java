package BeemAPIs;

import AppBase.baseClass;
import BeemAPIsPayload.cognitoSigninCodePayload;
import BeemAPIsPayload.cognitoSigninPayload;
import BeemAPIsPayload.createNewSubscriptionPayload;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.reporters.XMLConstants;

public class beemHttpMethods extends baseClass {

    public static Response getSessionID(){
        Response responseObj = RestAssured.
                given().log().all().
                contentType("application/json").
                header("appversion","4.0.86").
                body(cognitoSigninCodePayload.cognitoSigninCodeGetSessionIDPayload).
                when().log().all().
                post()
                .then().log().all().
                extract().response();
        return responseObj;
    }


    public static Response getIDToken(String sessionID){
        Response responseObj = RestAssured.
                given().log().all().
                contentType("application/json").
            //    header("appversion","4.0.86").
                body(cognitoSigninPayload.cognitoSigninGetIDTokenPayload(sessionID)).
                when().log().all().
                post()
                .then().log().all().
                extract().response();
        return responseObj;
    }


    public static Response createNewSubscription(String tokenID){
        System.out.println(tokenID);
        Response responseObj = RestAssured.
                given().log().all().
                contentType("application/json").
                header("Authorization",tokenID).
                        body(createNewSubscriptionPayload.createNewSubscriptionGetSubscriptionIDPayload()).
                when().log().all().
                post()
                .then().log().all().
                extract().response();
        return responseObj;
    }

}
