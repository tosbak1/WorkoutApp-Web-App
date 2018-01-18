package webapp.login;



public class RegisterService {

	public boolean canUserRegister(String user, String email, String password, String reenterPass){
		if(this.isUsernameValid(user) && this.isValidEmailAddress(email) && this.isValidPassword(password) && this.passwordMatch(password, reenterPass)){
			return true;
		}
		return false;
	}
	
	public boolean isUsernameValid(String user){
		if(user.isEmpty() || user.equals("")){
			return false;
		}
		else{
			return true;
		}
	}
	public boolean isValidEmailAddress(String email) {
		/*
		   boolean result = true;
		   try {
		      InternetAddress emailAddr = new InternetAddress(email);
		      emailAddr.validate();
		   } catch (AddressException ex) {
		      result = false;
		   }
		   return result;
		   */
		return true;
	}
	
	public boolean isValidPassword(String password){
		if(password.length() > 8){
			return true;
		}
		return false;
	}
	
	public boolean passwordMatch(String pass1, String pass2){
		if(pass1.equals(pass2)){
			return true;
		}
		return false;
	}
}
