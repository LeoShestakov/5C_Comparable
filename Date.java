/**
  Represent a date
 */
public class Date implements Comparable{
    private int y,m,d;
    
	public int compareTo( Object otherObj){
		Date asDate = (Date) otherObj;
		int days0 = y * 365 + m * 30 + d;
		int days1 = asDate.y * 365 + asDate.m * 30 + asDate.d;
		return Integer.compare(days0, days1);
    }
	
    // -------- previously-written code --------
    // constructor
    public Date( int y, int m, int d) {
        this.y = y;
        this.m = m;
        this.d = d;
    }
    
    /**
      @return a string representation of this instance
     */
    public String toString() {
        // ISO 8601 rules!
        return String.format("%4d-%02d-%02d",y, m, d);
    }

}