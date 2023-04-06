package studio8;

import java.util.Objects;

public class Time {
private int hour;
private int minute;
private boolean mi;

	public Time(int h, int m, boolean mii) {
		this.hour = h;
		this.minute = m;
		this.mi = mii;
			
	}
	
	public String toString() {
		if(this.mi) {
		return this.hour + ":" + this.minute;	
		}
		else {
			if(this.hour>12) {
				return (this.hour-12) + ":" + this.minute + "pm";
			}
			else {
				return this.hour + ":" + this.minute + "am";	
			}
		}
	}

	@Override
	public int hashCode() {
		return Objects.hash(hour, minute);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		return hour == other.hour && minute == other.minute;
	}


}