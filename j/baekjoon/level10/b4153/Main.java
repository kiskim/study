package baekjoon.level10.b4153;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		long in[] = new long[3];
		long temp;
		while(true)
		{
			st = new StringTokenizer(br.readLine(), " ");
			for(int i = 0; i < 3; i++)
				in[i] = Long.parseLong(st.nextToken());
			if(in[0] == 0 && in[1] ==0 && in[2] == 0)
				break;
			if(in[0] > in[1])
			{
				temp = in[0];
				in[0] = in[1];
				in[1] = temp;
			}
			if(in[1] > in[2])
			{
				temp = in[1];
				in[1] = in[2];
				in[2] = temp;
			}
			if(in[0] > in[2])
			{
				temp = in[0];
				in[0] = in[2];
				in[2] = temp;
			}
			if(in[0] * in[0] + in[1] * in[1] == in[2] * in[2])
				System.out.println("right");
			else
				System.out.println("wrong");
		}
	}
}