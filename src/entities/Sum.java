package entities;

public class Sum {
	
	int n1, n2;
	
	public Sum(int number_1, int number_2) {
		this.n1 = number_1;
		this.n2 = number_2;
	}
	
	public int Result() {
		return n1 + n2;
	}
}
