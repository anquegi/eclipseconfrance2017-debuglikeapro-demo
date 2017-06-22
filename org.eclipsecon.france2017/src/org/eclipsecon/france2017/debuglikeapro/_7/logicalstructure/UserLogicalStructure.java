package org.eclipsecon.france2017.debuglikeapro._7.logicalstructure;

import org.eclipsecon.france2017.debuglikeapro.HashUser;
import org.eclipsecon.france2017.debuglikeapro.OptimizedUser;
import org.eclipsecon.france2017.debuglikeapro.User;

public class UserLogicalStructure {

	public static void main(String[] args) {
		
		User brian = new HashUser("Brian", 33, true, false);
		User bob = new HashUser("Bob", 56, false, true);
		User daphne = new OptimizedUser("Daphné", 24, true, true);
		User alice = new OptimizedUser("Alice", 36, false, true);
		
		System.out.println("UserLogicalStructure.main()");
	}
}
