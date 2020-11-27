package programmers.level2.p20_tuple;

import java.util.*;

public class Solution {
    public int[] solution(String s) {
		String [] arr = s.replaceAll("[\\{\\}]", " ").trim().split(" , ");
		ArrayList<String> l = new ArrayList<String>();
		Arrays.sort(arr, (a, b)->{return a.length() - b.length();});
		int i = 0;
		int[] answer = new int[arr.length];

		for(String str : arr){
			for(String n: str.split(",")){
				if(!l.contains(n)){
					l.add(n);
					answer[i++] = Integer.parseInt(n);
				}
			}
		}
		return answer;
	}
    public int[] solution2(String s) {
		int[] answer = null;
		String [] arr = s.replaceAll("\\{", "").split("\\}");
		ArrayList<String[]> list = new ArrayList<String[]>();
		ArrayList<String> l = new ArrayList<String>();

		for(int i = 0;  i < arr.length; i++){
			if(arr[i].charAt(0) == ',')
				arr[i] = arr[i].replaceFirst(",", "");
			list.add(arr[i].split(","));
		}
		Collections.sort(list, new Comparator<String[]>(){

			@Override
			public int compare(String[] o1, String[] o2) {
				return o1.length - o2.length;
			}
			
		});
		for(int i = 0;  i < list.size(); i++){
			for(int j = 0; j < list.get(i).length; j++){
				if(!l.contains(list.get(i)[j]))
				l.add(list.get(i)[j]);
			}
		}	
		answer = new int[l.size()];
		for(int i = 0; i < l.size(); i++)
			answer[i] = Integer.parseInt(l.get(i));
		return answer;
    }
	public static void main(String[] args) {
		String str = 	"{{1,2,3},{2,1},{1,2,4,3},{2}}";
		new Solution().solution(str);
	}
}
