package unit2;

public class NJTax extends Tax {
	
	NJTax(int nod, double gi, String st) {
		super(nod, gi, st);
		// TODO Auto-generated constructor stub 
	}



	public double adjustForStudents(double tax){
		return tax - 500;
	}
	
	public double calcTax(){
		if (grossIncome < 50000){
			return grossIncome*0.1;
		}
		else {
			return grossIncome*0.13;
		}
	}
	
}
