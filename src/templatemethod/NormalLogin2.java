package templatemethod;

public class NormalLogin2 extends LoginTemplate {

	@Override
	public LoginModel findLoginUser(String loginId) {
		NormalLoginModel nlm = new NormalLoginModel();
		nlm.setLoginId(loginId);
		nlm.setPwd("testpwd");
		nlm.setQuestion("testQuestion");
		nlm.setAnswer("testAnswer");
		return nlm;
	}
	
	@Override
	public boolean match(LoginModel lm, LoginModel dbLm) {
		boolean f1 = super.match(lm, dbLm);
		if (f1) {
			NormalLoginModel nlm = (NormalLoginModel) lm;
			NormalLoginModel dbNlm = (NormalLoginModel) dbLm;
			if (dbNlm.getQuestion().equals(nlm.getQuestion()) && dbNlm.getAnswer().equals(nlm.getAnswer())) {
				return true;
			}
		}
		return false;
	}
}
