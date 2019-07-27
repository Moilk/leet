# 220. 存在重复元素 III

![难度](https://img.shields.io/badge/难度-中等-f0ad4e.svg?logo=leetcode&style=flat)  ![类型](https://img.shields.io/badge/类型-滑动窗口-violet.svg?style=flat)

## 题目描述

给定一个整数数组，判断数组中是否有两个不同的索引 i 和 j，使得 `nums[i]` 和 `nums[j]` 的差的绝对值最大为 t，并且 i 和 j 之间的差的绝对值最大为 ķ。


**示例 1:**

&emsp;**输入:** `nums = [1,2,3,1], k = 3, t = 0`  
&emsp;**输出:** `true`  

**示例 2:**

&emsp;**输入:** `nums = [1,0,1,1], k = 1, t = 2`  
&emsp;**输出:** `true`  

**示例 3:**

&emsp;**输入:** `nums = [1,5,9,1,5,9], k = 2, t = 3`  
&emsp;**输出:** `false`  

> 来源：力扣（LeetCode）  
> 链接：https://leetcode-cn.com/problems/contains-duplicate-iii  
> 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。  
