/*
 * package LineFinancial.tests; import static io.restassured.RestAssured.*;
 * import static io.restassured.matcher.RestAssuredMatchers.*; import static
 * org.hamcrest.Matchers.*;
 * 
 * import org.testng.annotations.Test;
 * 
 * import io.restassured.RestAssured;
 * 
 * 
 * public class LoginTest {
 * 
 * @Test public void createSessionID() { RestAssured.baseURI=
 * "https://dev.useline.com/graphql"; String body =
 * "{\"query\":\"mutation cognitoSigninCode ($input: cognitoInput) {\\n    cognitoSigninCode (input: $input)\\n}\",\"variables\":{\"input\":{\"username\":\"+18588844262\",\"isEmail\":false}}}"
 * ;
 * 
 * given().log().all().contentType("application/json")
 * .header("appversion","4.0.86") .body(body) .when().log().all() .post()
 * .then().log().all() .assertThat().statusCode(200); //
 * .extract("data.cognitoSigninCode[1].Session");
 * 
 * 
 * 
 * }
 * 
 * }
 */