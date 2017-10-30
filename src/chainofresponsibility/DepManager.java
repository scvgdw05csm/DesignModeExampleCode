package chainofresponsibility;

public class DepManager extends Handler {

    @Override
    public String handleFeeRequest(String user, double fee) {
        String str = "";
        if (fee < 1000) {
            if ("li".equals(user)) {
                str = "department manager agree " + user + " fee " + fee;
            } else {
                str = "department manager don't agree " + user + " fee " + fee;
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
