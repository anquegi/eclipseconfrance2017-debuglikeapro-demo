package stringinverter;

public class StringInverter {

	public static void main(String[] args) {
		String str = args[0];
		int len = str.length();
	    char[] c = new char[len];
	    for (int j = len - 1, i = 0; j >= 0; j--, i++) {
	        c[i] = str.charAt(j);
	    }
	    str = String.copyValueOf(c);
	    System.out.println(str);
	}

}
