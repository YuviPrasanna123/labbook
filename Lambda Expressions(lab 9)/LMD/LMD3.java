package LMD;
interface Authentication {
	
	boolean checkIdentity(String username, String password);

}
public class LMD3 {

	public static void main(String[] args) {

		String name = "Yuvi";
		String pass = "yuvi@1999";
		Authentication p = ((username, password) -> {
			if (username.equals(name) && password.equals(pass))
				return true;
			else
				return false;
		});
		System.out.println(p.checkIdentity("Yuvi", "yuvi@1999"));
	}
}