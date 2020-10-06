package programmers.level2.p08_prime;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    
    /**
     * 소수 찾기
     * 순열 알고리즘, 에라토테네스의 체
     * 
     * 1. 주어진 문자열에 포함된 숫자 조합 리스트 구하기-> 순열 알고리즘
     * 2. 리스트에서 최대값을 구한 후 최대값 까지의 에라토테네스의 체로 확인
     * 3. 결과 출력
     */
    public ArrayList<Integer> list;
    public boolean [] primeList;
    public void swap(char [] arr, int a, int b)
    {
        char temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public void permSwap(char [] arr, int depth, int r){
        if(depth == r)
        {
            int res = Integer.parseInt(toStr(arr, r));
            if(!list.contains(res))
                list.add(res);
            return;
        }
        for(int i = depth; i < arr.length; i++)
        {
            swap(arr, depth, i);
            permSwap(arr, depth + 1, r);
            swap(arr, depth, i);
        }
    }
    public void setPrime(){
        primeList[0] = false;
        primeList[1] = false;
        for(int i = 2; i < primeList.length; i++)
            primeList[i] = true;
        for(int i = 2; i * i < primeList.length; i++)
        {
            if(primeList[i] == true)
                for(int j = i * i; j < primeList.length; j += i)
                    primeList[j] = false;
        }
    }
    public String toStr(char [] arr, int r)
    {
        String res = "";
        for(int i = 0; i < r; i++)
            res+= arr[i];
        return res;
    }
    public int solution(String numbers) {
        int answer = 0;
        list = new ArrayList<>();
        for(int i = 1; i < numbers.length()+1; i++)
            permSwap(numbers.toCharArray(), 0, i);
        Collections.sort(list);
        primeList = new boolean[list.get(list.size() - 1) + 1];
        setPrime();
        for(int a : list)
        {
            if(primeList[a] == true)
                answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        String inp = "1234";
        System.out.println(s.solution(inp));
    }
}
