# 237. 删除链表中的节点

![难度](https://img.shields.io/badge/难度-简单-5cb85c.svg?logo=leetcode&style=flat)  ![类型](https://img.shields.io/badge/类型-链表-violet.svg?style=flat)

---

## 题目描述

请编写一个函数，使其可以删除某个链表中给定的（非末尾）节点，你将只被给定要求被删除的节点。  
现有一个链表 -- `head = [4,5,1,9]`，它可以表示为:

![img](assets/237_example.png)

**示例 1:**

&emsp;**输入:** `head = [4,5,1,9]`, `node = 5`  
&emsp;**输出:** `[4,1,9]`  
&emsp;**解释:** 给定你链表中值为 5 的第二个节点，那么在调用了你的函数之后，该链表应变为 `4 -> 1 -> 9`.

**示例 2:**

&emsp;**输入:** `head = [4,5,1,9]`, `node = 1`  
&emsp;**输出:** `[4,5,9]`  
&emsp;**解释:** 给定你链表中值为 1 的第三个节点，那么在调用了你的函数之后，该链表应变为 `4 -> 5 -> 9`.

**说明:**

- 链表至少包含两个节点。
- 链表中所有节点的值都是唯一的。
- 给定的节点为非末尾节点并且一定是链表中的一个有效节点。
- 不要从你的函数中返回任何结果。

> 来源：力扣（LeetCode）  
> 链接：https://leetcode-cn.com/problems/delete-node-in-a-linked-list  
> 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。  

---

## 解题说明

一开始觉得这不现实，看了答案才明白，链表相关的操作也不完全是指针的修改。  
这里可以把目标元素的后一个元素的数据赋值到目标元素，然后把后一个元素移除掉，就相当于把目标元素删除了