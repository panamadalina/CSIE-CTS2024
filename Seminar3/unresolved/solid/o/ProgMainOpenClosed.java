package unresolved.solid.o;

public class ProgMainOpenClosed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee empJohn = new Employee(1, "John" );
        Employee empJason = new Employee(2, "Jason");

//		 Employee2 empJohn = new Employee2(1, "John", "FTE" );
//         Employee2 empJason = new Employee2(2, "Jason", "Vendor");

         System.out.println(empJohn.toString()+" Bonus: "+ empJohn.CalculateBonus(100000));
         System.out.println(empJason.toString()+" Bonus: "+ empJason.CalculateBonus(100000));
	}

}
