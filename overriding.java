package polymorphism;

class shapes {
	void structure() {
		System.out.println("Every shape have different structure");
	}
}
class square extends shapes{
	void structure() {
		System.out.println("square had four sides");
	}
}

public class overriding{
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shapes sh= new shapes();
		sh.structure();

	}

}
