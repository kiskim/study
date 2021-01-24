package programmers.level2.p44_candidate_key;

import java.util.HashSet;

public class Solution {
    public int solution(String[][] relation) {
        int colLen = relation[0].length;
        int rowLen = relation.length;
        HashSet<String> selects = new HashSet<String>();
        HashSet<Integer> candidates = new HashSet<Integer>();
        // 2진법으로 부분 집합 만들기 
        for(int biSet = 1 ; biSet < (1<<colLen) ; biSet++) {
            
            selects.clear();
            // 모든 데이터에 대해 
            for(int r = 0 ; r < rowLen ; r++ ) {
                // biSet에서 1로 켜진 부분의 순번 갖고오기  
                String data = "";
                for(int th = 0 ; th < colLen ; th++) {
                    // 켜진 부분들의 데이터를 갖고온다. 
                    if( (biSet & (1<<th)) != 0) {
                        data += relation[r][th] + ",";
                    }
                }
                selects.add(data);
            }
            if(selects.size() == rowLen ) {
                push(candidates, biSet);
            }
        }
        return candidates.size();
    }
    static void push(HashSet<Integer> candidates, int set) {
        for (int key : candidates) {
            if((key & set) == key ) {
                return;
            }
        }
        candidates.add(set);
	}
	public static void main(String[] args) {
		String [][] relation =  {{"100","ryan","music"}
								,{"200","apeach","math"}
								,{"300","tube","computer"}
								,{"400","con","computer"}
								,{"500","muzi","music"}
								,{"600","apeach","music"}};
		new Solution().solution(relation);
	}
}
