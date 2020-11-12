package programmers.level2.p12_joystick;

import java.util.Arrays;

public class Solution {
    public int get_count(String name) {
		int answer = 0;
		char [] name_char = name.toCharArray();
		for(int i = 0; i < name_char.length; i++)
		{
			answer += Math.abs(name_char[i] - 'A') > Math.abs('Z' - name_char[i]) + 1 ?
			Math.abs('Z' - name_char[i]) + 1 : Math.abs(name_char[i] - 'A');
		}
        return answer;
	}
    public int solution(String name) {
		int answer = get_count(name);
		int i = 0;
		boolean dir = true; // true ->, false <-
		char [] name_char = name.toCharArray();
		char [] comp = new char[name.length()];
		Arrays.fill(comp,'\0');
		while (true){
			if (comp[i] != name_char[i])
				comp[i] = name_char[i];
			dir = get_direct(name_char, comp, i);
			
			i = dir ? 1 : -1;
			if (comp.equals(name_char))
				break;
		}
		return answer;
	}

	boolean get_direct(char [] s, char []now, int idx)
	{
		int before_idx = 0;
		int after_idx = 0;
		int before_len = 0;
		int after_len = 0;
		for (int i = 0; i < idx; i++)
		{
			if (s[i] != 'A' && s[i] != now[i])
			{
				before_idx = i;
				break;
			}
		}
		for (int i = idx; i < s.length; i++)
		{
			if (s[i] != 'A' && s[i] != now[i])
			{
				after_idx = i;
				break;
			}
		}
		before_len = Math.abs(before_idx - idx) > Math.abs((s.length - idx) + before_idx) ?
			Math.abs((s.length - idx) + before_idx) : Math.abs(before_idx - idx);
		after_len = Math.abs(after_idx - idx) > Math.abs((s.length - idx) + after_idx) ?
			Math.abs((s.length - idx) + after_idx) : Math.abs(after_idx - idx);
		return after_len > before_len;
	}

	public int solution2(String name) {
                
        // 1. 위, 아래 최소 이동
        int ans = 0;
        for(int i = 0 ; i < name.length() ; i++) {
            if(name.charAt(i)!= 'A') {
                int up = name.charAt(i) - 'A';
                int down = 1 + 'Z' - name.charAt(i);
                ans += (up < down)? up : down;
            }
        }
        
        // 2. A 아닌 모든 문자를 들릴 수 있는 최소 좌우 이동 
        // 모든 위치에서 역으로 돌아가는 경우 최소를 찾는다. 
        int minMove = name.length() - 1;
        for(int i = 0 ; i < name.length() ; i++) {
            if(name.charAt(i) != 'A') {
                int next = i+1;
                while(next < name.length() && name.charAt(next) == 'A') {
                    next++;
                }
                int move = 2 * i + name.length() - next;
                minMove = Math.min(move, minMove);
            }
        }
        
        return ans + minMove;
    }
	public static void main(String[] args) {
	}
}
