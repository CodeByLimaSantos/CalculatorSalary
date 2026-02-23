package Data;

public class employeer {
	public String name;
	public double GrossSalary;
	public double Tax;
	
	public double NetSalary() {
		double NetSalary = GrossSalary - Tax;
		return NetSalary;
	}
	public String toString() {
        return name
            + ", $ "
            + String.format("%.2f", NetSalary());
    }
	public void IncreaseSalary(double percentage) {
	    double increase = GrossSalary * percentage / 100.0;
	    GrossSalary = GrossSalary + increase;
	}
}
