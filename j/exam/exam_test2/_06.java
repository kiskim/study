package exam.exam_test2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.StringTokenizer;


public class _06 {
	public class Company{
		String name;
		String emp;
		HashMap<String, Integer> wants;
		int num;
		ArrayList<Employee> complete;
		public Company(String info){
			StringTokenizer st = new StringTokenizer(info, " ");
			this.wants = new HashMap<>();
			this.name = st.nextToken();
			int i = 0;
			for(char a : st.nextToken().toCharArray())
				this.wants.put(a+"", i++);
			this.num = Integer.parseInt(st.nextToken());
			this.complete = new ArrayList<>();
		}
	}
	public class Employee implements Comparable<Employee>{
		String name;
		int want;
		public Employee(String name, int want)
		{
			this.name = name;
			this.want = want;
		}

		@Override
		public int compareTo(Employee o) {
			return this.want - o.want;
		}
	}
	public class Applicant{
		String name;
		LinkedList<String> wants;
		int num;
		boolean complete;
		public Applicant(String info)
		{
			StringTokenizer st = new StringTokenizer(info, " ");
			this.name = st.nextToken();
			this.wants = new LinkedList<>();
			for(char a : st.nextToken().toCharArray())
				this.wants.add(a+"");
			this.num = Integer.parseInt(st.nextToken());
			complete = false;
		}
	}
    public String[] solution(String[] companies, String[] applicants) {
		String[] answer = {};
		ArrayList<Company> com = new ArrayList<>();
		ArrayList<Applicant> app = new ArrayList<>();
		for(String comp: companies)
			com.add(new Company(comp));
		for(String info: applicants)
			app.add(new Applicant(info));
		for(int i = 0; i < 4; i++)
		{
			for(Company c : com)
			{
				for(Applicant a : app)
				{
					if(a.wants.peek().equals(c.name))
					{
						c.complete.add(new Employee(a.name, c.wants.get(a.name)));
					}
				}
				if(c.complete.size() > c.num)
				{
					Collections.sort(c.complete);
					while(c.complete.size() < c.num)
					{
						for(Applicant a : app)
						{
							
						}
						c.complete.remove(c.num);
					}
				}
			}
		}
        return answer;
    }
}
