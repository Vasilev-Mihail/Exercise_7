package CardDrunk;

import java.util.Stack;
import java.util.Scanner;

public class CardDrunk 
{
	int count = 0;
	
	Stack<Integer> first = new Stack<>();
	Stack<Integer> second = new Stack<>();
	
	Scanner sc = new Scanner(System.in);
	
	public void addNumCard()
	{
		for(int i = 0; i < 10; i++)
		{
			if(i < 5)
			{
				first.push(sc.nextInt());
			}
			else
			{
				second.push(sc.nextInt());
			}
		}
	}
	
	public void CardsGame()
	{
		while(!first.empty() && !second.empty() && count != 106)
		{
			if (first.firstElement() > second.firstElement())
			{
                if (second.firstElement() != 0 )
                {
                    first.push(first.firstElement());
                    first.remove(first.firstElement());
                    first.push(second.firstElement());
                    second.remove(second.firstElement());
                }
                else
                {
                    second.push(second.firstElement());
                    second.remove(second.firstElement());
                    second.push(first.firstElement());
                    first.remove(first.firstElement());
                }

            }	
			else
            {
                if (first.firstElement() != 0)  
                {
                	second.push(second.firstElement());
                    second.remove(second.firstElement());
                    second.push(first.firstElement());
                    first.remove(first.firstElement());
                }
                else
                {
                	first.push(first.firstElement());
                    first.remove(first.firstElement());
                    first.push(second.firstElement());
                    second.remove(second.firstElement());
                }
            }
			count++;
		}
	}
	
	public void ConcWin()
	{
		if(first.empty())
		{
			System.out.print("Second win");
		}
		else
		{
			System.out.print("first win");
		}
		
		System.out.print(" "+ count);
	}
	
}
