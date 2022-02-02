import java.util.*;


public class EmPayComparator implements Comparator<Employeed>
{
	@Override
	public int compare(Employeed e1, Employeed e2)
	{
		if(e1.getPay() == e2.getPay())
			return 0;
		if(e1.getPay() > e2.getPay())
			return 1;
		else
			return -1;
	}
}