# 88. 合并两个有序数组

![难度](https://img.shields.io/badge/难度-简单-5cb85c.svg?logo=leetcode&style=flat)  ![类型](https://img.shields.io/badge/类型-经典变形-violet.svg?style=flat)

---

## 题目描述

给定两个有序整数数组 nums1 和 nums2，将 nums2 合并到 nums1 中，使得 num1 成为一个有序数组。

**说明:**

- 初始化 nums1 和 nums2 的元素数量分别为 m 和 n。
- 你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。

**示例:**

**输入:**

`nums1 = [1,2,3,0,0,0], m = 3`  
`nums2 = [2,5,6],       n = 3`

**输出:** `[1,2,2,3,5,6]`

> 来源：力扣（LeetCode）
> 链接：https://leetcode-cn.com/problems/merge-sorted-array
> 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

---

## 解题说明

归并排序的 `merge` 函数