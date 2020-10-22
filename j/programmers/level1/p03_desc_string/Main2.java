package programmers.level1.p03_desc_string;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Main2 {

	public String solution(String s){
		return Arrays.stream(s.split("")).sorted((o1, o2)->{
			return o2.compareTo(o1);
		}).collect(Collectors.joining());
	}
}
