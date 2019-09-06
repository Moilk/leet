# 552. 学生出勤记录 II

![难度](https://img.shields.io/badge/难度-困难-d9534f.svg?logo=leetcode&style=flat)  ![类型](https://img.shields.io/badge/类型-动态规划-violet.svg?style=flat)

---

## 题目描述

给定一个正整数 n，返回长度为 n 的所有可被视为可奖励的出勤记录的数量。 答案可能非常大，你只需返回结果mod 109 + 7的值。

学生出勤记录是只包含以下三个字符的字符串：

1. **'A'** : Absent，缺勤  
2. **'L'** : Late，迟到  
3. **'P'** : Present，到场  

如果记录不包含多于一个**'A'（缺勤）**或**超过两个连续的'L'（迟到）**，则该记录被视为可奖励的。

**示例 1:**

&emsp;**输入:** n = 2  
&emsp;**输出:** 8   
&emsp;**解释：**  
&emsp;有8个长度为2的记录将被视为可奖励：  
&emsp;"PP" , "AP", "PA", "LP", "PL", "AL", "LA", "LL"  
&emsp;只有"AA"不会被视为可奖励，因为缺勤次数超过一次。  

**注意：**n 的值不会超过100000。

> 来源：力扣（LeetCode）  
> 链接：https://leetcode-cn.com/problems/student-attendance-record-ii  
> 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。  

---

## 解题说明

定义四个状态：

- dpP： 最后一个记录是 P 且不存在 L
- dpA： 最后一个记录是 A 且不存在 L
- dpLP： 最后一个记录是 P 且存在一个 L
- dpLA： 最后一个记录是 A 且存在一个 L

有：

```
---> 首先，忘掉有 L 这回事，

以 P 结尾：
|  ···  P|P|   ,   |  ···  A|P| 
如果最后一个记录是 P，那么倒数第二个记录可以是 P 也可以是 A
所以，
dpP[n] = dpP[n - 1] + dpP[n - 1]

以 A 结尾：
|  ···  P|A|   ,   |  ··  P|A|A| 
如果最后一个记录是 A，那么倒数第二个记录也可以是 P 和 A，
但是如果是 A，这样就达到了 A 的最大连续数，所以倒数第三个必须是 P。
所以，
dpA[n] = dpP[n - 1] + dpP[n - 2]

---> 下面考虑存在一个 L 的情况，注意是有且仅有一个 L，

以 P 结尾：
|  ···  L|P|
如果倒数第二个是 L，那么前面不能再有 L，所以，
dpLP[n] = dpP[n - 2] + dpA[n - 2]
|  ···  P|P|   ,   |  ···  A|P|
如果倒数第二个不是 L，那么前面还得有 L，所以，
dpLP[n] = dpLP[n - 1] + dpLA[n - 1]
综上，
dpLP[n] = dpP[n - 2] + dpA[n - 2] + dpLP[n - 1] + dpLA[n - 1]

以 A 结尾：
|  ···  L|A|
同样，如果倒数第二个是 L，有，
dpLA[n] = dpP[n - 2] + dpA[n - 2]
|  ···  P|A|   ,   |  ···  P|A|A|   ,   |  ···  C|A|A|
如果倒数第二个不是 L，那么前面还得有 L，
另外如果倒数第二个是 A，那么倒数第三个不能再为 A，只能是 P 或 C，有
dpLA[i] = dpLP[i - 1] + dpLP[i - 2] + dpP[i - 3] + dpA[i - 3]
综上，
dpLA[i] = dpP[i - 2] + dpA[i - 2] + dpLP[i - 1] + dpLP[i - 2] + dpP[i - 3] + dpA[i - 3]

至于最终结果，可以不包含 L，也可以包含 L 且以 P 或者 A 结尾，还可以以 L 结尾，
所以,最后的结果为：
dp[n] = dpP[n] + dpA[n] + dpLP[n] + dpLA[n] + dpP[n - 1] + dpA[n - 1]
       |     不包含L     |  包含L且以P/A结尾   |         以L结尾        |
```

