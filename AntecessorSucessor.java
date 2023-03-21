//william da cunha


public class AntecessorSucessor {
	
	int num;
	
	public AntecessorSucessor(int num) {
		this.num = num;
}

	void imprimeAntesDepois() {
	
		System.out.println("Antecessor: " + (num - 1));
		System.out.println("Sucessor: " + (num + 1));
		
}
		
	public static void main(String[] args) {
		AntecessorSucessor nas = new AntecessorSucessor(10);
		nas.imprimeAntesDepois();
	}
}