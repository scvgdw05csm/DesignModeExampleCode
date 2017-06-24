package templatemethod;

public class NormalLogin extends LoginTemplate {

	@Override
	public LoginModel findLoginUser(String loginId) {
		LoginModel lm = new LoginModel();
		lm.setLoginId(loginId);
		lm.setPwd("testpwd");
		return lm;
	}
}
