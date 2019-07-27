# 120. 三角形最小路径和 

![难度](https://img.shields.io/badge/难度-中等-f0ad4e.svg?logo=leetcode&style=flat)  ![类型](https://img.shields.io/badge/类型-动态规划-violet.svg?style=flat)

---

## 题目描述

给定一个三角形，找出自顶向下的最小路径和。每一步只能移动到下一行中相邻的结点上。

例如，给定三角形：

```
[
     [2],
    [3,4],
   [6,5,7],
  [4,1,8,3]
]
```

自顶向下的最小路径和为 `11`（即，`2 + 3 + 5 + 1 = 11`）。

**说明：**

如果你可以只使用 `O(n)` 的额外空间（`n` 为三角形的总行数）来解决这个问题，那么你的算法会很加分。

> 来源：力扣（LeetCode）  
> 链接：https://leetcode-cn.com/problems/triangle  
> 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。  

---

## 解题说明

`last[i]` 表示到达上次层第i个节点所需要的最短路径，`cur[i]` 表示到达当前行第 `i` 个元素的最短路径，可得

```
cur[i] = min(last[i], last[i - 1]) + 当前节点的值
```

为了处理边界问题，一开始让两个数组的初值都为 `Integer.MAX_VALUE`，`last[1] = 0`。  
每操作完一行之后，交换 `last` 和 `cur`，最后找到 `last` 的最小值返回即可。  
