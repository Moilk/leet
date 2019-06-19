# 454. 四数相加 II

![难度](https://img.shields.io/badge/难度-简单-5cb85c.svg?logo=leetcode&style=flat)  ![类型](https://img.shields.io/badge/类型-set/map-violet.svg?style=flat)

---

## 题目描述

给定四个包含整数的数组列表 A , B , C , D ,计算有多少个元组 `(i, j, k, l)` ，使得 `A[i] + B[j] + C[k] + D[l] = 0`。

为了使问题简单化，所有的 A, B, C, D 具有相同的长度 N，且 0 ≤ N ≤ 500 。所有整数的范围在 -2^28^ 到 2^28^ - 1 之间，最终结果不会超过 2^31^ - 1 。

**例如:**

&emsp;**输入:**
&emsp;A = [ 1, 2]
&emsp;B = [-2,-1]
&emsp;C = [-1, 2]
&emsp;D = [ 0, 2]

&emsp;**输出:**
&emsp;2

&emsp;**解释:**
&emsp;两个元组如下:
&emsp;1. (0, 0, 0, 1) -> A[0] + B[0] + C[0] + D[1] = 1 + (-2) + (-1) + 2 = 0
&emsp;2. (1, 1, 0, 0) -> A[1] + B[1] + C[0] + D[0] = 2 + (-1) + (-1) + 0 = 0

> 来源：力扣（LeetCode）
> 链接：https://leetcode-cn.com/problems/4sum-ii
> 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。