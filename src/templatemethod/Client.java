package templatemethod;

public class Client {

	public static void main(String[] args) {
		LoginModel lm = new LoginModel();
		lm.setLoginId("admin");
		lm.setPwd("workerpwd");
		
		LoginTemplate lt = new WorkerLogin();
		LoginTemplate lt2 = new NormalLogin();
		
		boolean flag = lt.login(lm);
		System.out.println("can login worker platform=" + flag);
		
		boolean flag2 = lt2.login(lm);
		System.out.println("can login as normal client=" + flag2);
		
		NormalLoginModel nlm = new NormalLoginModel();
		nlm.setLoginId("testUser");
		nlm.setPwd("testpwd");
		nlm.setQuestion("testQuestion");
		nlm.setAnswer("testAnswer");
		LoginTemplate lt3 = new NormalLogin2();
		boolean flag3 = lt3.login(nlm);
		System.out.println("can login as normal client plus=" + flag3);
	}
}
