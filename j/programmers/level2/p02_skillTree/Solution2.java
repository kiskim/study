package programmers.level2.p02_skillTree;

public class Solution2 {
	public int solution(String skill, String[] skill_trees) {
		int answer = 0;
		for(String tree : skill_trees){
			if(skill.indexOf(tree.replaceAll("[^"+skill+"]", "")) == 0)
				answer++;
		}
		return answer;
	}
	public static void main(String[] args) {
		String s = "CBD";
		String[] tree = { "CQD","BACDE", "CBADF", "AECB", "BDA", "CQQQ"};
		int a = new Solution().solution(s, tree);
		System.out.println(a+"");
	}
}
