class Solution {
    public int nextGreaterElement(int n) {
        char[] num = String.valueOf(n).toCharArray();
        
        for (int i = num.length - 2; i >= 0; i--) {
            for (int j = num.length - 1; j > i; j--) {
                if (num[j] > num[i]) {
                    char tmp = num[i];
                    num[i] = num[j];
                    num[j] = tmp;
                    
                    Arrays.sort(num, i + 1, num.length);
                    
                    int res = -1;
                    try {
                        res = Integer.parseInt(new String(num));
                     } catch (Exception e) {
                        res = -1;    
                     }
                
                    return res;
                }
            }
        }
        
        return -1;
    }
}