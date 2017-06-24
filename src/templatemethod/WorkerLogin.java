package templatemethod;

public class WorkerLogin extends LoginTemplate {

	@Override
	public LoginModel findLoginUser(String loginId) {
		LoginModel lm = new LoginModel();
		lm.setLoginId(loginId);
		lm.setPwd("workerpwd");
		return lm;
	}
	
	@Override
	public String encryptPwd(String pwd) {
		System.out.println("use MD5 to encrypt");
		return pwd;
	}
}
