# 322. 零钱兑换

![难度](https://img.shields.io/badge/难度-中等-f0ad4e.svg?logo=leetcode&style=flat)  ![类型](https://img.shields.io/badge/类型-动态规划-violet.svg?style=flat)

---

## 题目描述

给定不同面额的硬币 coins 和一个总金额 amount。编写一个函数来计算可以凑成总金额所需的最少的硬币个数。如果没有任何一种硬币组合能组成总金额，返回 -1。

**示例 1:**

&emsp;**输入:** coins = [1, 2, 5], amount = 11  
&emsp;**输出:** 3   
&emsp;**解释:** 11 = 5 + 5 + 1  

**示例 2:**

&emsp;**输入:** coins = [2], amount = 3  
&emsp;**输出:** -1  

**说明:**  
你可以认为每种硬币的数量是无限的。

**相关企业：**   
字节跳动、腾讯、阿里巴巴、作业帮、今日头条、哈啰出行、Shopee、华为、小米

> 来源：力扣（LeetCode）  
> 链接：https://leetcode-cn.com/problems/coin-change  
> 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。  

## 解题说明

令 dp[n] 表示总金额为 n 时，最少找零的硬币数。我们知道找零的硬币数最多只能是 amount 个，所以我们令 $dp[i] \gt amount$ 表示不能找零。

要求出 dp[n]，我们需要遍历所有硬币，找出所有面值不超过 n 的，如果用这些硬币来找零，那么找完之后剩余 $n - coins[i]$，剩余的钱最少找零的硬币数为 $dp[n - coins[i]]$。

所以，$dp[n] = 1 + min(dp[n - coins[i]])$
