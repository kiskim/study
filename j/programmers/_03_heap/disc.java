package programmers._03_heap;

import java.util.*;

public class disc {
	public class Job{
		public int request_time;
		public int work_time;
		
		public Job(int a, int b)
		{
			this.request_time = a;
			this.work_time = b;
		}
	}
    public int solution(int[][] jobs) {
		int answer = 0;
		int time = 0;
		LinkedList<Job> wait = new LinkedList<Job>();
		PriorityQueue<Job> work = new PriorityQueue<>(new Comparator<Job>(){

			@Override
			public int compare(Job o1, Job o2) {
				return o1.work_time - o2.work_time;
			}
			
		});
		for(int [] job : jobs)
			wait.add(new Job(job[0], job[1]));
		Collections.sort(wait, new Comparator<Job>(){

			@Override
			public int compare(Job o1, Job o2) {
				return o1.request_time - o2.request_time;
			}
			
		});
		time = wait.peek().request_time;
		while(!wait.isEmpty() || !work.isEmpty())
		{
			while(!wait.isEmpty() && wait.peek().request_time <= time)
				work.add(wait.poll());
			if(!work.isEmpty()){
				Job j = work.poll();
				time += j.work_time;
				answer += time- j.request_time;
			}
			else
				time++;
		}
        return answer / jobs.length;
    }
}
