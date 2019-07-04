# 62. 不同路径

![难度](https://img.shields.io/badge/难度-中等-f0ad4e.svg?logo=leetcode&style=flat)  ![类型](https://img.shields.io/badge/类型-动态规划-violet.svg?style=flat)

---

## 题目描述

一个机器人位于一个 `m x n` 网格的左上角 （起始点在下图中标记为“Start” ）。

机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为“Finish”）。

问总共有多少条不同的路径？

![img](assets/robot_maze.png)

例如，上图是一个7 x 3 的网格。有多少可能的路径？

**说明：**m 和 n 的值均不超过 100。

**示例 1:**

&emsp;**输入:** m = 3, n = 2  
&emsp;**输出:** 3  
&emsp;**解释:**  
&emsp;从左上角开始，总共有 3 条路径可以到达右下角。  
&emsp;1. 向右 -> 向右 -> 向下  
&emsp;2. 向右 -> 向下 -> 向右  
&emsp;3. 向下 -> 向右 -> 向右  

**示例 2:**

&emsp;**输入:** `m = 7`, `n = 3`  
&emsp;**输出:** `28`  

> 来源：力扣（LeetCode）  
> 链接：https://leetcode-cn.com/problems/unique-paths  
> 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。  

---
