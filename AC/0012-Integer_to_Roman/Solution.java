/**
 * 把十进制数字转换为罗马数字，范围1 ~ 3999
 */
class Solution {

    public String intToRoman(int num) {
    	StringBuilder sb = new StringBuilder();
    	int t = num / 1000;
    	sb.append(placeToRoman(t, 'M', '\0', '\0'));
    	num %= 1000;
    	int h = num / 100;
    	sb.append(placeToRoman(h, 'C', 'D', 'M'));
    	num %= 100;
    	int x = num / 10;
    	sb.append(placeToRoman(x, 'X', 'L', 'C'));
    	num %= 10;
    	sb.append(placeToRoman(num, 'I', 'V', 'X'));

    	return sb.toString();
    }

    private static String placeToRoman(int n, char I, char V, char X) {
    	if(n<=0 || n > 9)	return "";
    	StringBuilder sb = new StringBuilder();
    	if( n == 4) {
    		sb.append(I).append(V);
    	} else if (n == 9) {
    		sb.append(I).append(X);
    	} else {
    		if(n>=5) {
    			sb.append(V);
    			n -= 5;
    		}
    		for(int i = 0; i < n; i++) {
    			sb.append(I);
    		}
    	}

    	return sb.toString();
    }

    public static void main(String[] args) {
    	Solution s = new Solution();
    	int[] testData = { 3999, 2569, 23643, 976, 534, 328, 97, 64, 32, 12, 8, 4, 2 };

    	for(int a : testData) {
    		System.out.println(s.intToRoman(a));
    	}
    }
}