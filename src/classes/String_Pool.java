package classes;

public class String_Pool {

	public static void main(String[] args) {
		String str = "Ram";
		String str1 = "Shyam";
		String str3 = "Mohan";
		String str4 = "Ram";
		
		String str5 = new String ("Shyam");
		String str6 =  new String("Mohan");
		String str7 = new String ("Shyam");
		System.out.println(str.equals(str4));
		System.out.println(str==str4);
		System.out.println(str5.equals(str7));
		System.out.println(str5==str7);
		}

}