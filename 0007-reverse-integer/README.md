# 7. Reverse Integer

## 📝 Problem

Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

 
Example 1:

Input: x = 123
Output: 321


Example 2:

Input: x = -123
Output: -321


Example 3:

Input: x = 120
Output: 21


 
Constraints:


	-231 <= x <= 231 - 1

---

## 💻 Solution

```java
class Solution {
public int reverse(int x) { 
int num=x;
int res=0;
while(num!=0){
int digit=num%10;
if(res>Integer.MAX_VALUE/10||res==Integer.MAX_VALUE&&digit>7)return 0;
if(res<Integer.MIN_VALUE/10||res==Integer.MIN_VALUE&&digit<-8)return 0;
res=res*10+digit;
num/=10;
}return res;

}
}
```

---

## 🔗 LeetCode

[View Problem](https://leetcode.com/problems/reverse-integer/)

---

> Automatically synced from LeetCode to GitHub using **LeetCode GitHub Sync**.
