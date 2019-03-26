package ueb01;

import java.util.NoSuchElementException;

class Palindrom {
	static boolean istPalindrom(String s) {
		// Verwenden Sie die Klasse CharStackImpl um auf Palindrom zu testen!
		CharStackImpl stack = new CharStackImpl();
		String rueckwaerts = "";

		if(s.length() == 1){
			return true;
		}

		s = s.replaceAll(" ", "");
		s = s.toLowerCase();

		int laenge = s.length();

		char[] array = s.toCharArray();
		for (int i = 0; i< array.length; i++) {
			stack.push(array[i]);
		}

		while(laenge > 0){
			rueckwaerts += stack.pop();
			laenge--;
		}

		if(rueckwaerts.equals(s)){
			return true;
		}
		return false;
	}
}
