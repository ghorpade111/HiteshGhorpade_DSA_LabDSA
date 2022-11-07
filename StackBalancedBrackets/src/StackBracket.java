import java.util.Scanner;
import java.util.Stack;

public class StackBracket {
	
	private static boolean checkBracket(String input)
	{
		Stack <Character> stack = new Stack<>();
		for(char k:input.toCharArray())
		{
			if(k=='{'||k=='['||k=='(')
			{
			    stack.push(k);
			    continue;
			}
			if(stack.isEmpty())
			  return false;
			char z;
			
		switch(k)
		{
		case '}' :
			z=stack.pop();
			if(z=='['|| z=='(')
			return false;
			break;
			
		case ']' :
			z=stack.pop();
			if(z=='{'|| z=='(')
		    return false;
	        break;
			
		case ')' :
			z=stack.pop();
			if(z=='['|| z=='{')
			return false;
			break;
		}
    }
		return(stack.isEmpty());
		
}

	public static void main(String[] args) {
		String input = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Brackets");
		input =sc.next();
	
		if(input.length()%2 !=0)
		{
			System.out.println("The Entered String Do Not Contain Balanced Brackets");
		}
		else
		{
			if(checkBracket(input))
			{
				System.out.println("Entered String has Balanced Brackets.");
			}
			else
			{
				System.out.println("Entered String has Incomplete Brackets .");
			}
		}
	}

	
}
