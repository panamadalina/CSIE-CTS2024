package unresolved.solid.s;

public interface IUser
{
	//app that performs user login & registration & 
	//app sends email with the status of the action
	//app should save the exceptions
	boolean Login(String username, String password);
    boolean Register(String username, String password, String email);
    void LogError(String error);
    boolean SendEmail(String emailContent);
}
