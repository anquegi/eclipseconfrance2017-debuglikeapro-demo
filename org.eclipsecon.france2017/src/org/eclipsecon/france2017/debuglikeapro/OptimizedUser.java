package org.eclipsecon.france2017.debuglikeapro;

import java.util.BitSet;

public class OptimizedUser implements User {

	BitSet booleanProperties = new BitSet(2);
	String name;
	int age;
	
	public OptimizedUser(String name, int age, boolean isTraveling, boolean isBoss) {
		this.name = name;
		this.age = age;
		booleanProperties.set(0, isTraveling);
		booleanProperties.set(1, isBoss);
	}
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getAge() {
		return age;
	}

	@Override
	public boolean isTravelling() {
		return booleanProperties.get(0);
	}

	@Override
	public boolean isBoss() {
		return booleanProperties.get(1);
	}

}
