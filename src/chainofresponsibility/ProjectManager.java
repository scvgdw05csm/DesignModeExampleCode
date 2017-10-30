package chainofresponsibility;

public class ProjectManager extends Handler {

    @Override
    public String handleFeeRequest(String user, double fee) {
        String str = "";
        if (fee < 500) {
            if ("li".equals(user)) {
                str = "project manager agree " + user + " fee " + fee;
            } else {
                str = "project manager don't agree " + user + " fee " + fee;
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
