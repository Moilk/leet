# 23. 合并K个排序链表

![难度](https://img.shields.io/badge/难度-困难-d9534f.svg?logo=leetcode&style=flat)  ![类型](https://img.shields.io/badge/类型-经典算法变形-violet.svg?style=flat)

---

## 题目描述

合并 k 个排序链表，返回合并后的排序链表。请分析和描述算法的复杂度。

**示例:**

&emsp;**输入:**

```
[
  1->4->5,
  1->3->4,
  2->6
]
```

&emsp;**输出:** `1->1->2->3->4->4->5->6`

> 来源：力扣（LeetCode）  
> 链接：https://leetcode-cn.com/problems/merge-k-sorted-lists  
> 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。  

## 解题说明

类似快速幂的思路，使用分治的思想，先两两合并，合并完了之后再两两合并，这样对于 k 个链表就只需要合并 $log_2k$ 次，总的复杂度就是 $n\times{\log_2k}$

