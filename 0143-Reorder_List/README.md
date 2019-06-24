# 143. 重排链表

![难度](https://img.shields.io/badge/难度-中等-f0ad4e.svg?logo=leetcode&style=flat)  ![类型](https://img.shields.io/badge/类型-链表-violet.svg?style=flat)

---

## 题目描述

给定一个单链表 `L`：`L0→L1→…→Ln-1→Ln` ，  
将其重新排列后变为： `L0→Ln→L1→Ln-1→L2→Ln-2→…`

你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。

**示例 1:**

&emsp;给定链表 `1->2->3->4`, 重新排列为 `1->4->2->3`.

**示例 2:**

&emsp;给定链表 `1->2->3->4->5`, 重新排列为 `1->5->2->4->3`.

> 来源：力扣（LeetCode）  
> 链接：https://leetcode-cn.com/problems/reorder-list  
> 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。  

---

## 解题说明

递归法，类似于[反转链表局部](./0092-Reverse_Linked_List_II)这题的递归解法，为了能指针对撞，左指针需要设成成员变量，并且，为了能在对撞后退出，需要一个flag标志指针对撞了。