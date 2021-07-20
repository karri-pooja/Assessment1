package assessement;


class DailyWorker extends Worker implements Comparable<DailyWorker>{
	
	DailyWorker(String name){
		
		this.name=name;
	}
	public void pay(int days) {
		 salary=300*days;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	
	
	
	@Override
	public String toString() {
		return "DailyWorker [name=" + name + ", salary=" + salary + "]";
	}
	@Override
	public int compareTo(DailyWorker o) {
		// TODO Auto-generated method stub
		return 0;
	}		
}

