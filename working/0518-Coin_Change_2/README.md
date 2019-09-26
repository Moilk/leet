# 518. 零钱兑换 II

![难度](https://img.shields.io/badge/难度-中等-f0ad4e.svg?logo=leetcode&style=flat)  ![类型](https://img.shields.io/badge/类型-动态规划-violet.svg?style=flat)

---

## 题目描述

给定不同面额的硬币和一个总金额。写出函数来计算可以凑成总金额的硬币组合数。假设每一种面额的硬币有无限个。 

**示例 1:**

&emsp;**输入:** amount = 5, coins = [1, 2, 5]  
&emsp;**输出:** 4  
&emsp;**解释:** 有四种方式可以凑成总金额:  
&emsp;5=5  
&emsp;5=2+2+1  
&emsp;5=2+1+1+1  
&emsp;5=1+1+1+1+1  

**示例 2:**

&emsp;**输入:** amount = 3, coins = [2]  
&emsp;**输出:** 0  
&emsp;**解释:** 只用面额2的硬币不能凑成总金额3。  

**示例 3:**

&emsp;**输入:** amount = 10, coins = [10]   
&emsp;**输出:** 1  
 

**注意:**  
你可以假设：  
- 0 <= amount (总金额) <= 5000  
- 1 <= coin (硬币面额) <= 5000  
- 硬币种类不超过 500 种  
- 结果符合 32 位符号整数  

> 来源：力扣（LeetCode）  
> 链接：https://leetcode-cn.com/problems/coin-change-2  
> 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。  

---

## 解题说明



