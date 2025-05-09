package BeemAPIsPayload;

public class FundsSummaryPayload {

    public static String fundsSummaryPayloadUsingIdToken(){
        return "{\r\n"
                + "  \"query\": \"query fundsSummary { fundsSummary}\"\r\n"
                + "}";
    }
}
