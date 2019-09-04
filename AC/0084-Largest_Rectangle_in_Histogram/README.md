# 84. 柱状图中最大的矩形

![难度](https://img.shields.io/badge/难度-困难-d9534f.svg?logo=leetcode&style=flat)  ![类型](https://img.shields.io/badge/类型-单调栈-violet.svg?style=flat)

---

## 题目描述

给定 n 个非负整数，用来表示柱状图中各个柱子的高度。每个柱子彼此相邻，且宽度为 1 。

求在该柱状图中，能够勾勒出来的矩形的最大面积。

 ![img](https://img.moilk.top/img/blog/2019-09-04-070455.png)

以上是柱状图的示例，其中每个柱子的宽度为 1，给定的高度为 [2,1,5,6,2,3]。

 ![img](https://img.moilk.top/img/blog/2019-09-04-070503.png)

图中阴影部分为所能勾勒出的最大矩形面积，其面积为 10 个单位。

 

**示例:**

&emsp;**输入:** [2,1,5,6,2,3]  
&emsp;**输出:** 10  

> 来源：力扣（LeetCode）  
> 链接：https://leetcode-cn.com/problems/largest-rectangle-in-histogram  
> 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。  