import java.util.*;

/**
 * 把罗马数字转换成阿拉伯数字
 */
class Solution {
    public int romanToInt(String s) {
    	char[] data = s.toCharArray();

    	int res = 0;
    	int[] tmp = placeToInt(data, 0, 'M', '\0', '\0');
    	res += tmp[0] * 1000;
    	tmp = placeToInt(data, tmp[1], 'C', 'D', 'M');
    	res += tmp[0] * 100;
    	tmp = placeToInt(data, tmp[1], 'X', 'L', 'C');
    	res += tmp[0] * 10;
    	tmp = placeToInt(data, tmp[1], 'I', 'V', 'X');
    	res += tmp[0];

    	return res;
    }

    public static int[] placeToInt(char[] s, int offset, char I, char V, char X) {
    	int n = s.length;

    	if(n <= offset)	return new int[]{0, offset};

    	if (n > offset + 1 && s[offset] == I && s[offset + 1] == X) {
    		return new int[]{9, offset + 2};
    	}

    	if (n > offset + 1 && s[offset] == I && s[offset + 1] == V) {
    		return new int[]{4, offset + 2};
    	}

    	int res = 0;
    	if (s[offset] == V) {
    		res += 5;
    		offset++;
    	}

    	while(offset < n) {
    		if(s[offset] == I) {
    			offset++;
    			res++;
    		} else {
    			break;
    		}
    	}

    	return new int[]{res, offset};
    }

    public static void main(String[] args) {
    	Solution s = new Solution();
    	System.out.println(s.romanToInt("MCMXCIV"));
    }
}