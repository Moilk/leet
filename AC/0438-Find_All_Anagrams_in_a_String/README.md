# 438. 找到字符串中所有字母异位词

![难度](https://img.shields.io/badge/难度-简单-5cb85c.svg?logo=leetcode&style=flat)  ![类型](https://img.shields.io/badge/类型-滑动窗口-violet.svg?style=flat)

---

## 题目描述

给定一个字符串 s 和一个非空字符串 p，找到 s 中所有是 p 的字母异位词的子串，返回这些子串的起始索引。

字符串只包含小写英文字母，并且字符串 s 和 p 的长度都不超过 20100。

**说明：**

- 字母异位词指字母相同，但排列不同的字符串。
- 不考虑答案输出的顺序。

**示例 1:**

&emsp;**输入:**  
&emsp;`s: "cbaebabacd" p: "abc"`

&emsp;**输出:**  
&emsp;`[0, 6]`

&emsp;**解释:**  
&emsp;起始索引等于 0 的子串是 "cba", 它是 "abc" 的字母异位词。  
&emsp;起始索引等于 6 的子串是 "bac", 它是 "abc" 的字母异位词。

**示例 2:**

&emsp;**输入:**  
&emsp;`s: "abab" p: "ab"`

&emsp;**输出:**
&emsp;`[0, 1, 2]`

&emsp;**解释:**  
&emsp;起始索引等于 0 的子串是 "ab", 它是 "ab" 的字母异位词。  
&emsp;起始索引等于 1 的子串是 "ba", 它是 "ab" 的字母异位词。  
&emsp;起始索引等于 2 的子串是 "ab", 它是 "ab" 的字母异位词。

> 来源：力扣（LeetCode）  
> 链接：https://leetcode-cn.com/problems/find-all-anagrams-in-a-string  
> 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。  

---
