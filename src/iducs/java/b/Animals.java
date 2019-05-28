package iducs.java.b;

public interface Animals {
	//public final double Height=172.3;
	public final String species = "동물";
	//public final 생략해도 자동으로 붙음.
	
	void move(); // public abstract 생략되어 있음
	void eat();
	void sound();
	void breathe();
}
