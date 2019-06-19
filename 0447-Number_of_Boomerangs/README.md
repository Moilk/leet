# 447. 回旋镖的数量

![难度](https://img.shields.io/badge/难度-简单-5cb85c.svg?logo=leetcode&style=flat)  ![类型](https://img.shields.io/badge/类型-set/map+滑动窗口-violet.svg?style=flat)

---

## 题目描述

给定平面上 `n` 对不同的点，“回旋镖” 是由点表示的元组 `(i, j, k)` ，其中 `i` 和 `j` 之间的距离和 `i` 和 `k` 之间的距离相等（**需要考虑元组的顺序**）。

找到所有回旋镖的数量。你可以假设 `n` 最大为 **500*8，所有点的坐标在闭区间 `[-10000, 10000]` 中。

**示例:**

&emsp;**输入:**  
&emsp;[[0,0],[1,0],[2,0]]

&emsp;**输出:**  
&emsp;2

&emsp;**解释:**  
&emsp;两个回旋镖为 `[[1,0],[0,0],[2,0]]` 和 `[[1,0],[2,0],[0,0]]`

> 来源：力扣（LeetCode）
> 链接：https://leetcode-cn.com/problems/number-of-boomerangs
> 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

---
