package assessement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

class Worker{
	
	String name;
	int salary;
}

public class Program4 {

	public static void main(String[] args) {
		
		DailyWorker d1=new DailyWorker("alias");
		d1.pay(3);
		DailyWorker d2=new DailyWorker("bob");
		d2.pay(5);
		DailyWorker d3=new DailyWorker("charm");
		d3.pay(6);
		DailyWorker d4=new DailyWorker("charles");
		d4.pay(6);
		
		SalariedWorker s1=new SalariedWorker("sam",3500);
		SalariedWorker s2=new SalariedWorker("alex",3700);
		SalariedWorker s3=new SalariedWorker("cherry",4200);
		SalariedWorker s4=new SalariedWorker("david",3300);
		SalariedWorker s5=new SalariedWorker("natasha",3850);
		
		
		List<DailyWorker> l1=new ArrayList<DailyWorker>();
		l1.add(d1);
		l1.add(d2);
		l1.add(d3);
		l1.add(d4);
		List<SalariedWorker> l2=new ArrayList<SalariedWorker>();
		l2.add(s1);
		l2.add(s2);
		l2.add(s3);
		l2.add(s4);
		l2.add(s5);
		

		Collections.sort(l1, new Comparator<DailyWorker>() {

			@Override
			public int compare(DailyWorker o1, DailyWorker o2) {

				if (o1.getSalary() > o2.getSalary())
					return 1;
				else
					return -1;
			}
		});
		
		Iterator<DailyWorker> iterator= l1.iterator();
		
		while(iterator.hasNext()) {
			
			DailyWorker temp=iterator.next();
			System.out.println(temp);
		}
		
		
		Collections.sort(l2, new Comparator<SalariedWorker>() {

			@Override
			public int compare(SalariedWorker o1, SalariedWorker o2) {

				if (o1.getSalary() > o2.getSalary())
					return 1;
				else
					return -1;
			}
		});
		
		Iterator<SalariedWorker> iterator1= l2.iterator();
		
		while(iterator1.hasNext()) {
			
			SalariedWorker temp=iterator1.next();
			System.out.println(temp);
		}
		

	}

}
