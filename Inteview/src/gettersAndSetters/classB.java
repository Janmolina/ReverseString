package gettersAndSetters;

public class classB extends classA{

    public  classB(String name, String race, String status) {
        super(name, race, status);

    }

    public void informtation() {
        System.out.println(" your " + super.getName());
    }

    public void white() {
        System.out.println(" your " + super.getRace());

    }

    public void status() {
        System.out.println(" your " + super.getRace());
    }


	
	
}
