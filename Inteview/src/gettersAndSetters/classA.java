package gettersAndSetters;



public class classA {
	
	private String name;
    private String race;
    private String status;
    //default constructor 
    public  classA() {
    	
    }
    //Parameterized  constructor 
    public  classA(String name, String race, String status) {
        this.name = name;
        this.race = race;
        this.status = status;

    }

    public String getName() {
        return name;
    }

    public String getRace() {
        return race;
    }

    public String getStatus() {
        return status;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public void setStatus(String status) {
        this.status = status;
    }



}
