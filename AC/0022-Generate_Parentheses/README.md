# 22. 括号生成

![难度](https://img.shields.io/badge/难度-中等-f0ad4e.svg?logo=leetcode&style=flat)  ![类型](https://img.shields.io/badge/类型-回溯法-violet.svg?style=flat)

---

## 题目描述

给出 n 代表生成括号的对数，请你写出一个函数，使其能够生成所有可能的并且有效的括号组合。

例如，给出 n = 3，生成结果为：

```
[
  "((()))",
  "(()())",
  "(())()",
  "()(())",
  "()()()"
]
```

> 来源：力扣（LeetCode）  
> 链接：https://leetcode-cn.com/problems/generate-parentheses  
> 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。  

## 解题说明

使用回溯法，函数带两个参数，left 表示剩余左括号数，right 表示剩余右括号数。  
当 left 和 right 都为 0 的时候，提交一次结果。  
对于每次递归，有两种选择，放左括号，或者放右括号，  
但是有个条件，就是 left < right 时，才能放右括号。  