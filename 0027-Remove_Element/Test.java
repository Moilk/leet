import java.util.*;

public class Test {
	public static void main(String[] args) {
		Solution s = new Solution();

		int[][] data = {
			{3,2,2,3},
			{0,1,2,2,3,0,4,2}
		};

		int[] vals = {3,2};

		for(int i=0; i<data.length; i++) {
			System.out.println(s.removeElement(data[i], vals[i]));
			System.out.println(Arrays.toString(data[i]));
		}
	}
}