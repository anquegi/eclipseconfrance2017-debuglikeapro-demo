package org.eclipsecon.france2017.debuglikeapro._3.conditonbkpt;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ConditionalBreakpoint {

	public static void main(String[] args) {
		Random r = new Random(5643);
		List<String> l = new ArrayList<>();
		for (int i = 0; i < 512; i++) {
			l.add(Integer.toHexString(r.nextInt()));
		}
		new ConditionalBreakpoint().run(l);
	}

	private void run(List<String> l) {
		for (String s : l) {
			if (s.startsWith("64")) {
				System.out.println(Integer.parseUnsignedInt(s, 16));
			}
		}
	}

}
