package template;

public abstract class Field {
	
	public Field(){
		setup();
	}

	private void setup() {
		System.out.println("Field.setup()");
		paint();
	}

	public void paint(){
		System.out.println("In Field.paint()");
	}
}
