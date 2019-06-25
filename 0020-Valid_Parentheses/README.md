# 20. 有效的括号

![难度](https://img.shields.io/badge/难度-简单-5cb85c.svg?logo=leetcode&style=flat)  ![类型](https://img.shields.io/badge/类型-stack-violet.svg?style=flat)

---

## 题目描述

给定一个只包括 `(`，`)`，`{`，`}`，`[`，`]` 的字符串，判断字符串是否有效。

有效字符串需满足：

1. 左括号必须用相同类型的右括号闭合。  
2. 左括号必须以正确的顺序闭合。

注意空字符串可被认为是有效字符串。

**示例 1:**

&emsp;**输入:** `()`  
&emsp;**输出:** `true`

**示例 2:**

&emsp;**输入:** `()[]{}`  
&emsp;**输出:** `true`

**示例 3:**

&emsp;**输入:** `(]`  
&emsp;**输出:** `false`

**示例 4:**

&emsp;**输入:&& `([)]`  
&emsp;**输出:&& `false`

**示例 5:**

&emsp;**输入:** `{[]}`  
&emsp;**输出:** `true`

> 来源：力扣（LeetCode）  
> 链接：https://leetcode-cn.com/problems/valid-parentheses  
> 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。  

---

## 解题说明

遇到左括号就压栈，遇到右括号就去除栈顶元素，判断是否匹配，如果不匹配，直接返回 `false`，最后如果栈为空，就返回 `true`，否则返回 `false`。