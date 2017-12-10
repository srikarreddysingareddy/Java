import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		System.out.println("Enter the string to check palindrome");
		String name = new Scanner(System.in).nextLine();
		System.out.println(ispalindrome(name) + "");
		
	}
	// one method
	  public static boolean IsPalindrome(String name){
		  int n = name.length();
		  for(int i = 0; i < n/2 ;i++){
			  if(name.charAt(i) != name.charAt(n-i-1))  return false;
			   }
		return true;
	  }
	  // 2nd method
	  public static boolean ispalindrome(String name){
		  return name.equals(new StringBuilder(name).reverse().toString());
	  }

	  
	}


