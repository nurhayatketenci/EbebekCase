package ebebek_case;

public class Employee {
    public String name;
    public double salary;
    public int workHours;
    public int hireYear;
    		
    
	public Employee(String name, double salary, int workHours, int hireYear) {
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}
	
	public double tax() {
		return this.salary < 1000 ? 0  : this.salary*(0.03); 
	}
	 
	public double bonus() {
		 return this.workHours > 40 ? (this.workHours-40)*30 : 0; 
	}
	 
    public double raiseSalary() {
    	
		int currentYear=2021;
		int workYear=currentYear-this.hireYear;
		
		if(workYear < 10) {
		 	return this.salary+bonus()-tax()+(this.salary*(0.05));
		}
	    if(workYear > 9 &&  workYear < 20 ) {
		 	return this.salary+bonus()-tax()+(this.salary*(0.1));
		}
	    if(workYear > 19) {
	    	return this.salary+bonus()-tax()+(this.salary*(0.15));
	    }
	    else {
	    	return this.salary+bonus()-tax();
	    }
	    
	}
    
    
     public String toString() {
    	 return ("Calisanin adi : "+this.name+ 
    			            "\nCalisanin maasi : "+this.salary+
    			            "\nCalisanin calisma saati : "+this.workHours+
    			            "\nCalisanin baslangic yili : "+this.hireYear + 
    			            "\nCalisanin vergisi : "+tax()+
    			            "\nCalisanin bonusu : "+bonus()+
    			            "\nMaas artisi : "+(raiseSalary()-this.salary)+
    			            "\nVergi ve bonuslarla maas : "+raiseSalary());
    }
	 
	
	
}
