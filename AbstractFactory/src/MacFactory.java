
public class MacFactory implements GUIFactory {

	public Button createButton() {
		return new MacButton();
	}
	
	public Manu createManu() {
		return new MacManu();
	}

}
