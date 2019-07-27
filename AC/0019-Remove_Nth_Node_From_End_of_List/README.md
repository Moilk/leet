# 19. 删除链表的倒数第N个节点

![难度](https://img.shields.io/badge/难度-中等-f0ad4e.svg?logo=leetcode&style=flat)  ![类型](https://img.shields.io/badge/类型-链表-violet.svg?style=flat)

---

## 题目描述

给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。

**示例：**

&emsp;给定一个链表: `1->2->3->4->5`, 和 `n = 2`.

&emsp;当删除了倒数第二个节点后，链表变为 `1->2->3->5`.

**说明：**

给定的 n 保证是有效的。

**进阶：**

你能尝试使用一趟扫描实现吗？

> 来源：力扣（LeetCode）
> 链接：https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list
> 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

---

## 解题说明

双指针法，先让tail指针挪动挪到第N+1个，然后让pre指向虚拟头结点，然后两个指针一起向后挪，知道tail挪到链表末尾，pre就指向了倒数第N个的前一个节点。
