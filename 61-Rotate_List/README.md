# 61. 旋转链表

![难度](https://img.shields.io/badge/难度-中等-f0ad4e.svg?logo=leetcode&style=flat)  ![类型](https://img.shields.io/badge/类型-链表-violet.svg?style=flat)

---

## 题目描述

给定一个链表，旋转链表，将链表每个节点向右移动 k 个位置，其中 k 是非负数。

**示例 1:**

&emsp;**输入:** `1->2->3->4->5->NULL`, `k = 2`  
&emsp;**输出:** `4->5->1->2->3->NULL`  
&emsp;**解释:**  
&emsp;&emsp;向右旋转 1 步: `5->1->2->3->4->NULL`  
&emsp;&emsp;向右旋转 2 步: `4->5->1->2->3->NULL`  

**示例 2:**

&emsp;**输入:** `0->1->2->NULL`, `k = 4`  
&emsp;**输出:** `2->0->1->NULL`  
&emsp;**解释:**  
&emsp;&emsp;向右旋转 1 步: `2->0->1->NULL`  
&emsp;&emsp;向右旋转 2 步: `1->2->0->NULL`  
&emsp;&emsp;向右旋转 3 步: `0->1->2->NULL`  
&emsp;&emsp;向右旋转 4 步: `2->0->1->NULL`  

> 来源：力扣（LeetCode）
> 链接：https://leetcode-cn.com/problems/rotate-list
> 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

---
