package programmers.level2.p43_cache;

import java.util.ArrayList;

class Solution {
	/*
		LRU 캐싱 알고리즘
		캐시 메모리에서 없는 데이터를 필요로 할 때 사용한지 가장 오래된 것 부터 제거
	 */
	
    public int solution(int cacheSize, String[] cities) {
		int answer = 0;
		ArrayList<String> list = new  ArrayList<>();
		for(int i = 0; i < cities.length; i++){
			if(list.contains(cities[i].toLowerCase())){
				list.remove(list.indexOf(cities[i].toLowerCase()));
				answer++;
			}
			else{
				answer+=5;
			}
			list.add(0, cities[i].toLowerCase());
			while(list.size() > 0 && list.size() > cacheSize)
				list.remove(list.size() - 1);
		}
        return answer;
	}
	public static void main(String[] args) {
		String [] s1 = {"Jeju", "Pangyo", "NewYork","Seoul",  "LA", "Jeju","Pangyo", "Seoul", "NewYork", "LA"};
		String [] s2 = {"Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul"};
		String [] s3 = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"};
		String [] s4 = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"};
		String [] s5 = {"Jeju", "Pangyo", "NewYork", "newyork"};
		String [] s6 = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA"};
		Solution so = new Solution();
		so.solution(3, s1);
		so.solution(3, s2);
		so.solution(2, s3);
		so.solution(5, s4);
		so.solution(2, s5);
		so.solution(0, s6);
	}
}