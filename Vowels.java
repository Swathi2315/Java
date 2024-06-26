public class Vowels{
   public static void main(String args[])
   {
      char arr[]={'a','o','s','e','p','i','M','U'};
      int vowCount=0;
      int consCount=0;
	  for(int index = 0;index < arr.length;index++)
	  {
	    if(arr[index] == 'a'|| arr[index]=='e' || arr[index]=='i' || arr[index]=='o' || arr[index]=='u' || arr[index]=='A'|| arr[index]=='E' || arr[index]=='I' || arr[index]=='O' || arr[index]=='U')
		{ 
	       System.out.println("Vowels are : ");
		   System.out.print(arr[index] + " ");
                   vowCount++;
		}
		else
		{
			System.out.println("Consonents are : ");
			System.out.print(arr[index] + " ");
                        consCount++;
		}
	  }
          System.out.println("total vowels : "+vowCount);
          System.out.println("total consonant : "+ consCount);
	 }
	}