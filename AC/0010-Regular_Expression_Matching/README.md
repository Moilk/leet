# 10. 正则表达式匹配

![难度](https://img.shields.io/badge/难度-困难-d9534f.svg?logo=leetcode&style=flat)  ![类型](https://img.shields.io/badge/类型-递归-violet.svg?style=flat)


## 题目描述

给你一个字符串 `s` 和一个字符规律 `p`，请你来实现一个支持 `.` 和 `*` 的正则表达式匹配。

&emsp;`.` 匹配任意单个字符  
&emsp;`*` 匹配零个或多个前面的那一个元素  

所谓匹配，是要涵盖**整个**字符串 `s` 的，而不是部分字符串。

**说明:**

- s 可能为空，且只包含从 a-z 的小写字母。
- p 可能为空，且只包含从 a-z 的小写字母，以及字符 . 和 *。

**示例 1:**

&emsp;**输入:**  
&emsp;s = "aa"  
&emsp;p = "a"  
&emsp;**输出:** false  
&emsp;**解释:** "a" 无法匹配 "aa" 整个字符串。  

&&示例 2:**

&emsp;**输入:**  
&emsp;s = "aa"  
&emsp;p = "a*"  
&emsp;**输出:** true  
&emsp;**解释:** 因为 `*` 代表可以匹配零个或多个前面的那一个元素, 在这里前面的元素就是 `a`。因此，字符串 "aa" 可被视为 `a` 重复了一次。  

**示例 3:**

&emsp;输入:  
&emsp;s = "ab"  
&emsp;p = ".*"  
&emsp;输出: true  
&emsp;解释: ".*" 表示可匹配零个或多个（`*`）任意字符（`.`）。  

**示例 4:**

&emps;**输入:**  
&emsp;s = "aab"  
&emsp;p = "c*a*b"  
&emsp;**输出:** true  
&emsp;**解释:** 因为 `*` 表示零个或多个，这里 `c` 为 0 个, `a` 被重复一次。因此可以匹配字符串 "aab"。  

**示例 5:**

&emsp;**输入:**  
&emsp;s = "mississippi"  
&emsp;p = "mis*is*p*."  
&emsp;**输出:** false  


> 来源：力扣（LeetCode）  
> 链接：https://leetcode-cn.com/problems/regular-expression-matching  
> 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。  