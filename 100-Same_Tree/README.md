# 100. 相同的树

![难度](https://img.shields.io/badge/难度-简单-5cb85c.svg?logo=leetcode&style=flat)  ![类型](https://img.shields.io/badge/类型-二叉树-violet.svg?style=flat)

---

## 题目描述

给定两个二叉树，编写一个函数来检验它们是否相同。

如果两个树在结构上相同，并且节点具有相同的值，则认为它们是相同的。

**示例 1:**

&emsp;**输入:**

```
       1         1
      / \       / \
     2   3     2   3
  
    [1,2,3],   [1,2,3]
```

&emsp;**输出:** `true`

**示例 2:**

&emsp;**输入:**

```
       1          1
      /           \
     2             2

    [1,2],     [1,null,2]
```

&emsp;**输出:** `false`

**示例 3:**

&emsp;**输入:**

```
       1         1
      / \       / \
     2   1     1   2

    [1,2,1],   [1,1,2]
```

&emsp;**输出:** `false`

> 来源：力扣（LeetCode）  
> 链接：https://leetcode-cn.com/problems/same-tree  
> 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。  

---
