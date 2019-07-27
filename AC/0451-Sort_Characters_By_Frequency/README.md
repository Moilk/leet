# 451. 根据字符出现频率排序

![难度](https://img.shields.io/badge/难度-中等-f0ad4e.svg?logo=leetcode&style=flat)  ![类型](https://img.shields.io/badge/类型-set/map-violet.svg?style=flat)

---

## 题目描述

给定一个字符串，请将字符串里的字符按照出现的频率降序排列。

**示例 1:**

&emsp;**输入:**  
&emsp;"tree"

&emsp;**输出:**  
&emsp;"eert"

&emsp;**解释:**  
&emsp;'e'出现两次，'r'和't'都只出现一次。  
&emsp;因此'e'必须出现在'r'和't'之前。此外，"eetr"也是一个有效的答案。

**示例 2:**

&emsp;**输入:**  
&emsp;"cccaaa"

&emsp;**输出:**  
&emsp;"cccaaa"

&emsp;**解释:**  
&emsp;'c'和'a'都出现三次。此外，"aaaccc"也是有效的答案。  
&emsp;注意"cacaca"是不正确的，因为相同的字母必须放在一起。

**示例 3:**

&emsp;**输入:**  
&emsp;"Aabb"

&emsp;**输出:**  
&emsp;"bbAa"

&emsp;**解释:**  
&emsp;此外，"bbaA"也是一个有效的答案，但"Aabb"是不正确的。  
&emsp;注意'A'和'a'被认为是两种不同的字符。

> 来源：力扣（LeetCode）  
> 链接：https://leetcode-cn.com/problems/sort-characters-by-frequency  
> 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。  

---
