package service1;

public class LoginAuth {

	public static  boolean checkLogin(String username, String password) {
		if( username.equals("david") && password.equals("1234")) {
	    	return true;
	    }
		return false;
	}
}
