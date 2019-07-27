# 215. 数组中的第K个最大元素

![难度](https://img.shields.io/badge/难度-中等-f0ad4e.svg?logo=leetcode&style=flat)  ![类型](https://img.shields.io/badge/类型-经典变形-violet.svg?style=flat)

---

## 题目描述

在未排序的数组中找到第 k 个最大的元素。请注意，你需要找的是数组排序后的第 k 个最大的元素，而不是第 k 个不同的元素。

**示例 1:**

&emsp;**输入:** `[3,2,1,5,6,4]` 和 `k = 2`  
&emsp;**输出:** 5

示例 2:

&emsp;**输入:** `[3,2,3,1,2,4,5,5,6]` 和 `k = 4`  
&emsp;**输出:** 4

**说明:**

你可以假设 k 总是有效的，且 1 ≤ k ≤ 数组的长度。

> 来源：力扣（LeetCode）  
> 链接：https://leetcode-cn.com/problems/kth-largest-element-in-an-array  
> 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。  

---

## 解题说明

快速排序算法变形题