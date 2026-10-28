# 1. Print Decreasing

## 📝 Problem Statement
You are given a positive integer \(n\). You are required to print the counting from \(n\) down to 1. 

### Crucial Constraints:
* You are strictly forbidden from using any loops (`for`, `while`, or `do-while`). 
* You must achieve this solely by utilizing the call stack through recursion.

---

## 📥 Input Format
* A single line containing a positive integer \(n\).

## 📤 Output Format
* \(n\) lines, with each line printing numbers in decreasing order from \(n\) down to 1.

---

## 💻 Sample Test Case

### Sample Input
```text
5
```

### Sample Output
```text
5
4
3
2
1
```

---

## 💡 Technical Explanation & Interview Expectations
This problem evaluates your fundamental understanding of the **Call Stack** and **Pre-Order Execution**. 

1. **Pre-Order Operation**: The value of $n$ must be processed *before* the recursive call moves deeper into the call stack. This ensures that the numbers are logged in the order they are visited ($n \rightarrow n-1 \rightarrow n-2 \dots$).
2. **Base Case**: The recursion must safely stop when $n$ reaches a terminating condition. Without this check, the function will continuously add frames to the call stack, resulting in a `StackOverflowError`.

### Complexity Target:
* **Time Complexity**: $\mathcal{O}(n)$ 
* **Auxiliary Space Complexity**: $\mathcal{O}(n)$ due to the recursive call stack.
