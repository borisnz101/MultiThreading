
class ComputingThread implements Runnable 
{
	int number;
	
	public ComputingThread(int number) {
		this.number = number;
	}
	
	public void run() {
		
		int i = 0;
		int num = 0;
		String  primeNumbers = "";
		
		 for (i = 1; i <= number; i++)  	   
	      { 		 		  
	         int counter=0; 		  
	         for(num =i; num>=1; num--)
	         {
		    if(i%num==0)
		    {
			counter = counter + 1;
		    }
		 }
		 if (counter ==2)
		 {
		    //Appended the Prime number to the String
		    primeNumbers = primeNumbers + i + " ";
		 }	
	      }	
		 System.out.println("Prime numbers from 1 to " +number+  " are :");
	      System.out.println(primeNumbers);
	}
}
