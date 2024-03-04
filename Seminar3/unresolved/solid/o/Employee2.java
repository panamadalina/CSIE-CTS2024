package unresolved.solid.o;

public class Employee2 {
	 private int ID;
		private String Name;
		private String EmployeeType;//new requirement

		Employee2() { }
	    public Employee2(int id, String name, String type)
	    {
	        this.ID = id;
	        this.Name = name;
	        this.EmployeeType = type;
	    }

	    

	    public int getID() {
			return ID;
		}
		public void setID(int iD) {
			ID = iD;
		}
		public String getName() {
			return Name;
		}
		public void setName(String name) {
			Name = name;
		}
		public String getEmployeeType() {
			return EmployeeType;
		}
		public void setEmployeeType(String employeeType) {
			EmployeeType = employeeType;
		}
		@Override
		public String toString() {
			return "Employee [ID=" + ID + ", Name=" + Name + ", EmployeeType=" + EmployeeType + "]";
		}
		//new requirement:
		public float CalculateBonus(float salary)
	    {
			if (this.EmployeeType == "FTE")
			    return salary * .1f;
			else
			    return salary * .05f;
	        		
	    }
}

