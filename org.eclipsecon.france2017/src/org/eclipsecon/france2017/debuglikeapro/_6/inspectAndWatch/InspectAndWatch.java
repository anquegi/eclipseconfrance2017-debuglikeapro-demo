package org.eclipsecon.france2017.debuglikeapro._6.inspectAndWatch;

import org.eclipsecon.france2017.debuglikeapro.HashUser;
import org.eclipsecon.france2017.debuglikeapro.User;

public class InspectAndWatch {

	
	public static void main(String[] args) {
		User brian = new HashUser("Brian", 33, true, false);
		System.out.println(brian.getName());
	}
}
