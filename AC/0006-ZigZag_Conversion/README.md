# 6. Z 字形变换

![难度](https://img.shields.io/badge/难度-中等-f0ad4e.svg?logo=leetcode&style=flat)  ![类型](https://img.shields.io/badge/类型-规律题-violet.svg?style=flat)

---

## 题目描述

将一个给定字符串根据给定的行数，以从上往下、从左到右进行 Z 字形排列。

比如输入字符串为 "LEETCODEISHIRING" 行数为 3 时，排列如下：

```
L   C   I   R
E T O E S I I G
E   D   H   N
```

之后，你的输出需要从左往右逐行读取，产生出一个新的字符串，比如："LCIRETOESIIGEDHN"。

请你实现这个将字符串进行指定行数变换的函数：

```
string convert(string s, int numRows);
```

**示例 1:**

```
输入: s = "LEETCODEISHIRING", numRows = 3
输出: "LCIRETOESIIGEDHN"
```

**示例 2:**

```
输入: s = "LEETCODEISHIRING", numRows = 4
输出: "LDREOEIIECIHNTSG"
解释:

L     D     R
E   O E   I I
E C   I H   N
T     S     G
```

> 来源：力扣（LeetCode）  
> 链接：https://leetcode-cn.com/problems/zigzag-conversion  
> 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。  

## 解题说明

```
0           12            24            36
1        11 13         23 25         35 37
2      10   14       22   26       34   38
3     9     15     21     27     33     39
4   8       16   20       28   32       40
5 7         17 19         29 31         41
6           18            30            42
```

如上所示为 `numRows = 7` 时的情况，数字为字符对应的下标。不难发现：

- 第 0 行，索引的间隔 `step0` 为 `2 * (numRows - 1) -> 12`
- 第 1 行，索引的间隔 `step1` 为 `step0 - 2 * 1` 和 `2 * 1`
- 第 2 行，索引的间隔 `step2` 为 `step0 - 2 * 2` 和 `2 * 2`

...

- 第 n 行，索引的间隔 `stepn` 为 `step0 - 2 * n` 和 `2  * n`

对于第一行行最后一行，按照公式会出现间隔为 0 的情况，所以要保证当 `step == 0` 时，令 `step = step0`。 

按照规律，编写代码即可。