package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;

public class Date {
	private int Month;
	private int Day;
	private int Year;
	private boolean Holiday;
	
	
	/*
	 * param: int month, int day, int year, boolean holiday
	 * return: nothing
	 */
	public Date(int m, int d, int y, boolean h){
		this.Month = m;
		this.Day = d;
		this.Year = y;
		this.Holiday = h;
		
	}
	/*
	 * param: none
	 * return: String
	 */
	public String toString() {
		return this.Month + "/" + this.Day + "/" + this.Year +" Holiday: " + this.Holiday;
	}
	
	
	
	
    @Override
	public int hashCode() {
		return Objects.hash(Day, Month, Year);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return Day == other.Day && Month == other.Month && Year == other.Year;
	}
	public static void main(String[] args) {
Date day1 = new Date(12,21,2003,true);
Date day2 = new Date(11,1,2004,false);
Date day3 = new Date(10,3,2005,true);
Date day4 = new Date(12,5,2004,false);
Date day5 = new Date(12,21,2003,false);

    	
    	if(day1.equals(day2)) {
    		System.out.println("true");
    	}
    	LinkedList<Date> list = new LinkedList<Date>();
    	
    	list.add(day1);
    	list.add(day5);
    	//list.add(day4);
    	//list.add(day2);
    	System.out.print(list);
    	
    	HashSet<Date> set = new HashSet<Date>();
    	set.add(day1);
    	set.add(day5);
    	
    	System.out.print(set);
    	
    }


}
