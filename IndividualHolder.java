public class IndividualHolder extends AccountHolder implements Util {
    private String name; 
    private String SSN; 
    
    public IndividualHolder(int ID, String address, String name, String SSN){
        super(ID ,address);
        this.name = name; 
        this.address = address; 
    }
    public String getName(){
        return name; 
    }
    public void setName(String name){
       this.name = convertNameUpperCase(name); 
    }

    public String getSSN(){
        return SSN;
    }
    public void setSSN(String Social){
        SSN = Social; 
    }
	@Override
	public String convertNameUpperCase(String name) {
		return name.toUpperCase();
	}
}