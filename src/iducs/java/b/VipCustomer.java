
package iducs.java.b;

public class VipCustomer extends Customer {
	private double RATE = 0.8;
	@Override
	double applySale(double price) {
		// TODO Auto-generated method stub
		return price * RATE;
	}
	// ��ø : overloading
	public void buy(String item, double p) {
		System.out.println(item + "�� " + applySale(p) 
				+ "�������� �����Ѵ�.");
	}
}
