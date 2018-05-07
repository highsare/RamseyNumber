import java.util.*;

public class MakeBinaryCode {
	
	public static ArrayList<String> makeCode(int length, int num) {
		
		if (num > Math.pow(2,length)) {
			System.out.println("Wrong Number");
			return null;
		}
		
		ArrayList<String> list = new ArrayList<>();
		
		for (int i = length - 1; i >= 0; i--) {
			if (num >= Math.pow(2, i)) {
				num -= Math.pow(2, i);
				list.add("1");
			} else {
				list.add("0");
			}
		}
		
		return list;
	}
}
