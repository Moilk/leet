class Solution:
    def lengthOfLongestSubstring(self, s):
        """
        :type s: str
        :rtype: int
        """
        used_chars={}
        head_substr=0
        size_substr_max=0
        for i in range(0,len(s)):
        	if s[i] in used_chars:
        		head_substr=max(used_chars[s[i]]+1,head_substr)
        	size_substr_max=max(size_substr_max,i+1-head_substr)
        	used_chars[s[i]]=i
        return size_substr_max
