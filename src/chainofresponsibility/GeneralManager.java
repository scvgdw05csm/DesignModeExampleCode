package chainofresponsibility;

public class GeneralManager extends Handler {

    @Override
    public String handleFeeRequest(String user, double fee) {
        String str = "";
        if (fee >= 1000) {
            if ("li".equals(user)) {
                str = "general manager agree " + user + " fee " + fee;
            } else {
                str = "general manager don't agree " + user + " fee " + fee;
            }
            return str;
        } else {
            if (successor != null) {
                return successor.handleFeeRequest(user, fee);
            }
        }
        return str;
    }
}
