package set;

public class StringNonrepeatingChar {

public static void main(String[] args) {
		String s1 = "gibblegabbler";
		System.out.println("The given string is: " +s1);
		     for (int i = 0; i < s1.length(); i++) {
		     boolean unique = true;
		     for (int j = 0; j < s1.length(); j++) {
		     if (i != j && s1.charAt(i) == s1.charAt(j)) {
		     unique = false;
		     break;
}
		     }
		if (unique) {
		System.out.println("The first non repeated character in String is: " + s1.charAt(i));
		break;
	}
}
}
		

}
