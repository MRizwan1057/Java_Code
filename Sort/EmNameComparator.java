import java.util.*;


public class EmNameComparator implements Comparator<Employeed>
{
	@Override
	public int compare(Employeed e1, Employeed e2)
	{
		if(e1.getName() == e2.getName())
			return 0;
		else
			return e1.getName().compareTo(e2.getName());
	}
}