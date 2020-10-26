package exam.exam_test4;

import java.util.Scanner;
import java.util.Stack;

class Main3 {

	static public class StrClass{
		char pre;
		public StringBuilder str;

		public StrClass(char pre){
			this.pre = pre;
			this.str = new StringBuilder("");
		}
	}
	private static void solution(int numOfOrder, String[] orderArr) {
		String[] res = new String[numOfOrder];
		char [] orderChar = null;
		Stack<StrClass> strStack = new Stack<StrClass>();
		int cnt = 1;
		for(int idx = 0; idx < res.length; idx++)
		{
			orderChar = orderArr[idx].toCharArray();
			strStack.push(new StrClass('\0'));
			for(int orderIdx = 0; orderIdx < orderChar.length; orderIdx++)
			{
				if (Character.isDigit(orderChar[orderIdx]))
					cnt = Character.getNumericValue(orderChar[orderIdx]);
				else if(Character.isUpperCase(orderChar[orderIdx]))
				{
					for (int i = 0; i < cnt; i++)
						strStack.peek().str.append(orderChar[orderIdx]);
					cnt = 1;
				}
				else if(orderChar[orderIdx] == '('){
					char tempChar = orderIdx > 0 ? orderChar[orderIdx - 1] : '\0';
					if (tempChar == ')')
						tempChar = strStack.peek().str.charAt(strStack.peek().str.length() - 1);
					strStack.push(new StrClass(tempChar));
					cnt = 1;
				}
				else if(orderChar[orderIdx] == ')')
				{
					if (strStack.peek().pre == '\0')
						break;
					StrClass stc = strStack.pop();
					if (Character.isDigit(stc.pre))
						for(int i = 0; i < Character.getNumericValue(stc.pre); i++)
							strStack.peek().str.append(stc.str);
					else
					{
						StringBuilder temp = new StringBuilder(""+stc.str.charAt(0));
						for (int i = 1; i < stc.str.length(); i++)
							temp.append(stc.pre+""+stc.str.charAt(i));
						strStack.peek().str.append(temp);
					}
				}
			}
			while(strStack.size() > 1)
			{
				StrClass temp = strStack.pop();
				strStack.peek().str.append(temp.str);
			}
			res[idx] = strStack.pop().str.toString();
			strStack.clear();
		}
		for(String s : res)
			System.out.println(s);
	}

	private static class InputData {
		int numOfOrder;
		String[] orderArr;
	}

	private static InputData processStdin() {
		InputData inputData = new InputData();

		try (Scanner scanner = new Scanner(System.in)) {
			inputData.numOfOrder = Integer.parseInt(scanner.nextLine().replaceAll("\\s+", ""));

			inputData.orderArr = new String[inputData.numOfOrder];
			for (int i = 0; i < inputData.numOfOrder; i++) {
				inputData.orderArr[i] = scanner.nextLine().replaceAll("\\s+", "");
			}
		} catch (Exception e) {
			throw e;
		}

		return inputData;
	}

	public static void main(String[] args) throws Exception {
		InputData inputData = processStdin();

		solution(inputData.numOfOrder, inputData.orderArr);
	}
}