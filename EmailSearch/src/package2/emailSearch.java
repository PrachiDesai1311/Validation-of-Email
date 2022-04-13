package package2;

import java.util.Scanner;

public class emailSearch {
	
	 public static void main(String[] args)
	   {
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter a String to be search");
	      String s = sc.nextLine();
	      String[] strArray = { "prachi1456@gmail.com", "rucha45222@gmail.com", "neil9010@gmail.com" };
	      boolean found = false;
	      int index = 0;
	      for (int i = 0; i < strArray.length; i++)
	      {
	         if(s.equals(strArray[i]))
	         {
	           index = i; found = true;
	           break;
	         }
	      }
	      if(found)
	        System.out.println(s +" Email Address found at the index "+index);
	      else
	        System.out.println(s +" Email Address not found");
	   }
}
