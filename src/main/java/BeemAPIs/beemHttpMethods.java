package BeemAPIs;

import AppBase.baseClass;
import BeemAPIsPayload.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class beemHttpMethods extends baseClass {
public static Response responseObj;

    public static Response getSessionID(){
         responseObj = RestAssured.
                given().
                contentType("application/json").
                header("appversion","4.3.295(2)").
                body(cognitoSigninCodePayload.cognitoSigninCodeGetSessionIDPayload).
                when().
                post()
                .then().
                extract().response();
        System.out.println(responseObj.asString());
        return responseObj;
    }


    public static Response getIDToken(String sessionID){
         responseObj = RestAssured.
                given().
                contentType("application/json").
                header("appversion","4.3.295(2)").
                body(cognitoSigninPayload.cognitoSigninGetIDTokenPayload(sessionID)).
                when().
                post()
                .then().
                extract().response();
        return responseObj;
    }

    public static Response getUserInfo(String idToken){
        responseObj = RestAssured.
                given().contentType("application/json").
                header("Authorization",idToken).
                header("appVersion","4.3.295(2)").
                body(getUserPayload.getUserPayloadUsingIDToken()).
                when().
                post()
                .then().extract().response();
        return responseObj;
    }

    public static Response getUserFundsSummaryInfo(String idToken){
        responseObj = RestAssured.
                given().contentType("application/json").
                header("Authorization" , idToken).
                header("appVersion" , "4.3.295(2)").
                body(FundsSummaryPayload.fundsSummaryPayloadUsingIdToken()).
                when().
                post().
                then().extract().response();
        return responseObj;
    }


    public static Response createNewSubscription(String tokenID){
        System.out.println(tokenID);
        responseObj = RestAssured.
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
