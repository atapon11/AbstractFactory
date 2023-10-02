
public class Application {
	 private GUIFactory factory;
	    private Button button;
	    private Manu manu;

	    public Application(GUIFactory factory) {
	        this.factory = factory;
	        this.button = factory.createButton();
	    }

	    public void render() {
	        button.render();
	        manu.render();
	    }

}
