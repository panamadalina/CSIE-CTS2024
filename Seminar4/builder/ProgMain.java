package builder.resolvedtwo;

import builder.resolvedtwo.User.UserBuilder;

public class ProgMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//nu am acces la constructor
		User user1=new UserBuilder("Madalina","Pana")
				.build();
		User user2=new UserBuilder("Madalina","Pana")
				.birthday("10/04/1997")
				.build();
	}

}
