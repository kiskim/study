package exam.exam8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
/*
1. 완주수
2. 상급 코스 우선 1 > 2
3. 획득한 메달 수
1/12 금, 1/4 은, 1/2 동
4. 완수 시간 총합
5. 사전 순
*/
public class test_01 {
	public class Record implements Comparable<Record>{
		String name;
		int []tracks;
		int []medal;

		public Record(){
			super();
			tracks = new int[5];
			medal = new int[3];
		}
		public int cntTracks(){
			int cnt = 0;
			for(int track: this.tracks){
				if(track != 0)
					cnt++;
			}
			return cnt;
		}
		public int getTotalTime(){
			int tot = 0;
			for(int track : this.tracks)
				tot += track;
			return tot;
		}
		@Override
		public int compareTo(Record o) {
			if(this.cntTracks() != o.cntTracks())
				return o.cntTracks() - this.cntTracks();
			for(int i = o.tracks.length - 1; i >= 0; i--){
				if(this.tracks[i] == 0 || o.tracks[i] == 0)
					return this.tracks[i] == 0 ? 1 : -1;
			}
			for(int i = 0; i < 3; i++){
				if(this.medal[i] != o.medal[i])
					return o.medal[i] - this.medal[i];
			}
			if (this.getTotalTime() != o.getTotalTime())
				return o.getTotalTime() - this.getTotalTime();
			return this.name.compareTo(o.name);
		}
	}
	public void setMedal(ArrayList<Record> list, int i){
		Collections.sort(list, new Comparator<Record>(){
			@Override
			public int compare(Record o1, Record o2) {
				if(o1.tracks[i] == 0 || o2.tracks[i] == 0)
					return o1.tracks[i] == 0 ? 1 : -1;
				return o1.tracks[i] - o2.tracks[i];
			}
			
		});
		for(int j = 0; j < list.size(); j++){
			if(j + 1 <= Math.round((long)(list.size() / 12)) || j + 1 == 1)
				list.get(j).medal[0]++;
			else if(j + 1 <= Math.round((long)(list.size() / 4)))
				list.get(j).medal[1]++;
			else if(j + 1 <= Math.round((long)(list.size() / 2)))
				list.get(j).medal[2]++;
		}
	}
    public String[] solution(String[] record) {
		String[] answer = null;
		ArrayList<Record> list = new ArrayList<>();
		for(String r : record){
			String [] s = r.split(":");
			Record m = new Record();
			int i = 0;
			m.name = s[0];
			for(String time: s[1].split(",")){
				m.tracks[i] = Integer.parseInt(time);
				i++;
			}
			list.add(m);
		}
		for(int i = 0; i < list.get(0).tracks.length; i++)
			setMedal(list, i);
		Collections.sort(list);
		answer = new String[list.size()];
		for(int i = 0; i < list.size(); i++)
			answer[i] = list.get(i).name;
        return answer;
	}
	
	public static void main(String[] args) {
		String [] record = {"jack:9,10,13,9,15","jerry:7,7,14,10,17","jean:0,0,11,20,0","alex:21,2,7,11,4","kevin:8,4,5,0,0","brown:3,5,16,3,18","ted:0,8,0,0,8","lala:0,12,0,7,9","hue:17,16,8,6,10","elsa:11,13,10,4,13"};
		new test_01().solution(record);
	}
}
