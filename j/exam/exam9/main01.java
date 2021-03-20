import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class main01{
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Date start_input[] = new Date[n];
		Date end_input[] = new Date[n];
		SimpleDateFormat format = new SimpleDateFormat("HH:mm");
		for(int i = 0; i < n; i++)
		{
			String input[] = br.readLine().split(" ~ ");
			start_input[i] = format.parse(input[0]);
			end_input[i] = format.parse(input[1]);
		}
		Arrays.sort(start_input);
		Arrays.sort(end_input);
		if(start_input[n-1].compareTo(end_input[0]) < 0)
			System.out.println(format.format(start_input[n-1])+" ~ "+format.format(end_input[0]));
		else
			System.out.println("-1");
	}
}