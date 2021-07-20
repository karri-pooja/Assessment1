package assessement;

class SalariedWorker extends Worker implements Comparable<SalariedWorker>{
		
		SalariedWorker(String name,int salary){
			
			this.name=name;
			this.salary=salary;
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
			return "SalariedWorker [name=" + name + ", salary=" + salary + "]";
		}
		@Override
		public int compareTo(SalariedWorker o) {
			// TODO Auto-generated method stub
			return 0;
		}	
	}

