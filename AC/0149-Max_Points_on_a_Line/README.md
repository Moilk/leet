# 149. 直线上最多的点数

![难度](https://img.shields.io/badge/难度-困难-d9534f.svg?logo=leetcode&style=flat)  ![类型](https://img.shields.io/badge/类型-set/map+滑动窗口-violet.svg?style=flat)

---

## 题目描述

给定一个二维平面，平面上有 n 个点，求最多有多少个点在同一条直线上。

**示例 1:**

 **输入:** `[[1,1],[2,2],[3,3]]`

**输出:** `3`

**解释:**

```
^
|
|        o
|     o
|  o  
+------------->
0  1  2  3  4
```

**示例 2:**

**输入:** `[[1,1],[3,2],[5,3],[4,1],[2,3],[1,4]]`

**输出:** `4`

**解释:**

```
^
|
|  o
|     o        o
|        o
|  o        o
+------------------->
0  1  2  3  4  5  6
```

> 来源：力扣（LeetCode）  
链接：https://leetcode-cn.com/problems/contains-duplicate-ii
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。  

---
