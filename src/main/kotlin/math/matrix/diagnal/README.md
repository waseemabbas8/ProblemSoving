# Draw a square diagonal matrix

A square diagonal matrix is a matrix having equal number of rows and columns in which all entries outside the main diagonal are all zero.

```
    [1 0 0 0 0]
    [0 1 0 0 0]
    [0 0 1 0 0]
    [0 0 0 1 0]
    [0 0 0 0 1]
```
The above matrix is a square diagonal matrix of `5 x 5`.

You are required to write a program that draws a square diagonal matrix of given number of rows.


**Example 1:**

```
Input: s = 3
Output: 
[1 0 0]
[0 1 0]
[0 0 1]
Explanation: diagonal matrix of 3x3. 
```
**Example 2:**
```
Input: s = 1
Output: 
[1]
Explanation: diagonal matrix 1x1. 
```
**Example 3:**
```
Input: s = 2
Output: 
[1 0]
[0 1]
Explanation: diagonal matrix of 2x2.
```

**Constraints:**

- `0 < s <= 1000`
