public class Main 
{
    public static void main( String[] args )
    {
        IndividualHolder obj= new IndividualHolder(AccountHolder.getNextID(), "3400 Poly Vista", "Student", "PQRS1234");
		Account acc = new Account(5000, obj);
		
		System.out.println("The current Balance is: " +acc.getBalance());
		acc.withdraw(2000); 
		System.out.println("The updated Balance is: " +acc.getBalance());
		
		System.out.println("The name is: " +obj.getName());

		obj.setName("Rahul");
		System.out.println(obj.getName());
    }
}