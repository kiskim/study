package programmers.level2.p02_skillTree;

import java.util.Arrays;

public class Solution {
    public int solution(String skill, String[] skill_trees) {
		int answer = 0;
		int [] order = new int[skill.length()];
		for(String tree : skill_trees)
		{
			boolean flag = true;
			Arrays.fill(order, 0);
			for(int i = 0; i < skill.length(); i++)
				order[i] = tree.indexOf(skill.charAt(i));
			for(int i = 0; i < skill.length() - 1; i++)
			{
				if(order[i] == -1){
					if(i < skill.length())
						if(order[i+1] != -1){
							flag = false;
							break;
						}
				}
				else if(order[i] > order[i+1] && order[i+1] != -1){
					flag= false;
					break;
				}

			}
			answer = flag ? answer+1: answer;
		}
        return answer;
	}
	
	public static void main(String[] args) {
		String s = "CBD";
		String[] tree = { "CQD","BACDE", "CBADF", "AECB", "BDA", "CQQQ"};
		new Solution().solution(s, tree);
	}
}
