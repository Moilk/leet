# 556. 下一个更大元素 III

![难度](https://img.shields.io/badge/难度-中等-f0ad4e.svg?logo=leetcode&style=flat)  ![类型](https://img.shields.io/badge/类型-数组-violet.svg?style=flat)

---

## 题目描述

给定一个32位正整数 n，你需要找到最小的32位整数，其与 n 中存在的位数完全相同，并且其值大于 n。如果不存在这样的32位整数，则返回-1。

**示例 1:**  

&emsp;**输入:** 12  
&emsp;**输出:** 21  

**示例 2:**  

&emsp;**输入:** 21  
&emsp;**输出:** -1  

> 来源：力扣（LeetCode）  
> 链接：https://leetcode-cn.com/problems/next-greater-element-iii  
> 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。  

---

## 解题说明

先把数字转成 `char[]`，然后从数组末尾开始遍历，对于第 i 个数字，寻找 `[i + 1， N - 1]` 中有没有比它大的，  
如果有，就交换两个元素，然后再把 i 后面的元素从小到大排序。这样得到的数字就是下一个更大的元素，再把 `char[]` 转回数字。  
注意这时候可能溢出，如果溢出的话就返回 `-1`。
