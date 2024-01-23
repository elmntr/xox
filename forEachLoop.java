import java.util.Scanner;

public class arrayIOFloSumProHorLoopImplement
{

    public static void main(String[] args)
    	{
    	Scanner input = new Scanner(System.in); // input values
    	Scanner pili = new Scanner(System.in); // used for choices
    	Scanner ulit = new Scanner(System.in); // used of repeatition
    	
    	float[] arrNum = new float[5];
    	float sum = 0;
    	float pro = 1;
		int choice;
		String rep = "y"; 

    	
    	while (rep.equalsIgnoreCase("y"))
    	{
    	
    	
    	System.out.println("Input 5 numbers");

	    	for (int count = 0; count < 5; count++)
	    	{
	    		arrNum [count] = input.nextFloat();
	    	}
    		
    		System.out.println();
		    System.out.println("Please choose the operation that you want to perform?");
		    System.out.println("Type 1 for Addition");
		    System.out.println("Type 2 for Multiplication");
		    System.out.println();
		    choice = pili.nextInt();		
		    		
		    	switch(choice)
		    	{
		    			case 1:
		    			{
		    				System.out.println();
			    				for (int count = 0; count < 5; count++)
			    				{
	
			    					System.out.println("arrNum ["+count+"] = "+arrNum[count]);
			    					//System.out.println(sum+" = "+sum +" + "+arrNum[count]);
			    					//System.out.println();
			    					sum = sum + arrNum[count];
									//System.out.println(sum+" = "+sum +" + "+arrNum[count]);
			    				//	System.out.println(array[count]);
			    				}
		    							    			
			    			
			    			System.out.println();
							System.out.println("The sum is "+sum);
							System.out.println();
							
		    			} 
		    				break;
		    			
			    				case 2:
			    				{
			    					System.out.println();
			    					for (int count = 0; count < 5; count = count + 1)
				    					{
		
				    					System.out.println("arrNum ["+count+"] = "+arrNum[count]);
				    					pro = pro * arrNum[count];
		
				    					//System.out.println(arrNum[count]);
				    					}
					    				System.out.println();
										System.out.println("The product is "+pro);
										System.out.println();
			    				
			    				}
			    					break;
			    					
			    						default: System.out.println("\nWala sa pagpipilian");
		    				
		    					
		    	}		
		    		
		    		
		    		System.out.println("\nDo you want to repeat the Operation?");
		    		System.out.println("Type [y] to repeat or [n] to exit");
		    		System.out.println();
		    		rep = ulit.nextLine();
		    		System.out.println();
		    		
		    		
		    	}	
    	}

}