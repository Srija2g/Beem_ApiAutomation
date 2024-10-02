package BeemAPIsPayload;

public class cognitoSigninPayload {
	
	public static String cognitoSigninGetIDTokenPayload(String sessionID) {
		  return "{\"query\":\"mutation cognitoSignin ($input: cognitoInput) {\\n    cognitoSignin (input: $input)\\n}\",\"variables\":{\"input\":{\"attributes\":[\"\"],\"username\":\"+18296677354\",\"session\":\""+sessionID+"\",\"accessToken\":\"\",\"code\":\"9191\",\"token\":\"\",\"isEmail\":false,\"email\":\"\",\"plaidFlow\":true,\"refreshToken\":\"\",\"phoneNumber\":\"\",\"cognitoUpdate\":true,\"otp\":\"\",\"autoLogin\":true,\"verified\":true}}}";
	}

}
