package iducs.java.b;

public class Human extends Mammal {
	// ������ Ŭ������ �ڵ������� ������ ���� ����
	@Override // <= annotation : java compiler���� �ִ� �ּ�, �Ӽ� ����
	//,  abstract method implementation
	public void move() { // ������ ���� ������ �������� ���� ����
		// TODO Auto-generated method stub
		System.out.println("�Ȱ�, �ٰ�, ���, �޴޸���");
	}
	// Method Overloadi
	
	public void move(String transport) { // ������ ���� ������ �������� ���� ����
		// TODO Auto-generated method stub
		System.out.println(transport + "�� Ÿ�� �̵��Ѵ�.");
	}
	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("���� �Ѵ�");
	}
}
