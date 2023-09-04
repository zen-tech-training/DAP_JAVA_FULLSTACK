import java.util.Comparator;

public class IdComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		
		if(o1.getEmployeeId()>o2.getEmployeeId())
			return 100;
		else if(o1.getEmployeeId()<o2.getEmployeeId())
			return -100;
		else
			return 0;
	}

}
