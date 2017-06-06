package cn.csm.templatemethod;

public abstract class LoginTemplate {

	public final boolean login(LoginModel lm) {
		LoginModel dbLm = findLoginUser(lm.getLoginId());
		if (dbLm != null) {
			String encryptPwd = encryptPwd(lm.getPwd());
			lm.setPwd(encryptPwd);
			return match(lm, dbLm);
		}
		return false;
	}
	
	public abstract LoginModel findLoginUser(String loginId);
	
	public String encryptPwd(String pwd) {
		return pwd;
	}
	
	public boolean match(LoginModel lm, LoginModel dbLm) {
		if (lm.getLoginId().equals(dbLm.getLoginId()) && lm.getPwd().equals(dbLm.getPwd())) {
			return true;
		}
		return false;
	}
}
