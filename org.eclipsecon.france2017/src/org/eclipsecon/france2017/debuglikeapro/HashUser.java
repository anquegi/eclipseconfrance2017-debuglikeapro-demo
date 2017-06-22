package org.eclipsecon.france2017.debuglikeapro;

import java.util.HashMap;
import java.util.Map;

public class HashUser implements User {

	Map<String, Object> properties = new HashMap<>();
	
	public HashUser(String name, int age, boolean isTraveling, boolean isBoss) {
		properties.put("name", name);
		properties.put("age", age);
		properties.put("travelling", isTraveling);
		properties.put("boss", isBoss);
	}
	
	@Override
	public String getName() {
		return (String) properties.get("name");
	}

	@Override
	public int getAge() {
		return (int) properties.get("age");
	}

	@Override
	public boolean isTravelling() {
		return (boolean) properties.get("travelling");
	}

	@Override
	public boolean isBoss() {
		return (boolean) properties.get("boss");
	}

}
