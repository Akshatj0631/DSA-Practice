# 6. Zigzag Conversion

## 📝 Problem

The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R


And then read line by line: "PAHNAPLSIIGYIR"

Write the code that will take a string and make this conversion given a number of rows:

string convert(string s, int numRows);


 
Example 1:

Input: s = "PAYPALISHIRING", numRows = 3
Output: "PAHNAPLSIIGYIR"


Example 2:

Input: s = "PAYPALISHIRING", numRows = 4
Output: "PINALSIGYAHRPI"
Explanation:
P     I    N
A   L S  I G
Y A   H R
P     I


Example 3:

Input: s = "A", numRows = 1
Output: "A"


 
Constraints:


	1 <= s.length <= 1000
	s consists of English letters (lower-case and upper-case), ',' and '.'.
	1 <= numRows <= 1000

---

## 💻 Solution

```java
class Solution {
public String convert(String s, int numRows) {
if(numRows == 1 || numRows >= s.length())
return s;
String[] ans = new String[numRows];
for(int i = 0; i < numRows; i++) {
ans[i] = "";
}
int i = 0;
while(i < s.length()) {
for(int row = 0; row < numRows && i < s.length(); row++) {
ans[row] += s.charAt(i++);
}
for(int row = numRows - 2; row > 0 && i < s.length(); row--) {
ans[row] += s.charAt(i++);
}
}
String res = "";
for(String str : ans) {
res += str;
}
return res;
}
}
```

---

## 🔗 LeetCode

[View Problem](https://leetcode.com/problems/zigzag-conversion/)

---

> Automatically synced from LeetCode to GitHub using **LeetCode GitHub Sync**.
