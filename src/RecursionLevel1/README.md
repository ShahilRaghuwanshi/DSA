# 🚀 Pepcoding Level-1 Recursion & Backtracking: Official Problem Set

Welcome to the comprehensive repository of **Pepcoding Level-1 Recursion and Backtracking** problems. This README serves as a complete problem bank featuring problem descriptions, explicit input/output formats, sample test cases with explanations, constraints, and technical interview theory questions as asked in technical assessment rounds.

---

## 📋 Table of Contents

### Phase 1: Introduction to Recursion
1. [Print Decreasing](#1-print-decreasing)
2. [Print Increasing](#2-print-increasing)
3. [Print Decreasing Increasing](#3-print-decreasing-increasing)
4. [Factorial](#4-factorial)
5. [Power (Linear)](#5-power-linear)
6. [Power (Logarithmic)](#6-power-logarithmic)
7. [Tower of Hanoi](#7-tower-of-hanoi)

### Phase 2: Recursion in Arrays
8. [Display Array](#8-display-array)
9. [Display Array in Reverse](#9-display-array-in-reverse)
10. [Max of an Array](#10-max-of-an-array)
11. [First Index of Occurrence](#11-first-index-of-occurrence)
12. [Last Index of Occurrence](#12-last-index-of-occurrence)
13. [All Indices of Array](#13-all-indices-of-array)

### Phase 3: Recursion with ArrayLists (Get Series)
14. [Get Subsequence](#14-get-subsequence)
15. [Get Keypad Combinations (KPC)](#15-get-keypad-combinations-kpc)
16. [Get Stair Paths](#16-get-stair-paths)
17. [Get Maze Paths](#17-get-maze-paths)
18. [Get Maze Paths with Jumps](#18-get-maze-paths-with-jumps)

### Phase 4: Recursion On the Way Up (Print Series)
19. [Print Subsequence](#19-print-subsequence)
20. [Print Keypad Combinations](#20-print-keypad-combinations)
21. [Print Stair Paths](#21-print-stair-paths)
22. [Print Maze Paths](#22-print-maze-paths)
23. [Print Maze Paths with Jumps](#23-print-maze-paths-with-jumps)
24. [Print Permutations](#24-print-permutations)
25. [Print Encodings](#25-print-encodings)

### Phase 5: Backtracking & Classic Problems
26. [Flood Fill](#26-flood-fill)
27. [Target Sum Subsets](#27-target-sum-subsets)
28. [N-Queens](#28-n-queens)
29. [Knights Tour](#29-knights-tour)

---

## 🔹 Phase 1: Introduction to Recursion

### 1. Print Decreasing

#### 📜 Problem Description
1. You are given a positive integer $N$.
2. You are required to print all numbers from $N$ down to $1$ in decreasing order using recursion.
3. You must complete the body of `printDecreasing(int n)` function.
4. **Constraint:** You are strictly forbidden from using any iterative loops (`for`, `while`, `do-while`).

#### ⏱️ Constraints
* $1 \le N \le 1000$

#### 📥 Input Format
- A single line containing an integer $N$.

#### 📤 Output Format
- Numbers printed from $N$ down to $1$, each on a new line.

#### 🧪 Sample Test Case
**Sample Input:**
```text
5
```
**Sample Output:**
```text
5
4
3
2
1
```

#### 🔍 Explanation
For $N = 5$, `printDecreasing(5)` prints $5$ during the Pre-Order (going down phase) and delegates the task of printing $4$ down to $1$ to `printDecreasing(4)`. This continues until the base case $N = 0$ is reached.

#### 💡 Technical Interview Context
* **Theory Concept:** Tests understanding of **Pre-Order Execution** (doing work *before* pushing recursive calls to the stack).
* **Common Interviewer Question:** *"What happens to memory if $N = 10^6$?"*
  * **Answer:** It results in a `StackOverflowError` because each function call consumes stack memory, exceeding the call stack capacity limit ($\mathcal{O}(N)$ memory frames).

---

### 2. Print Increasing

#### 📜 Problem Description
1. You are given a positive integer $N$.
2. You are required to print all numbers from $1$ up to $N$ in increasing order using recursion.
3. You must complete the body of `printIncreasing(int n)` function.
4. **Constraint:** No loops allowed.

#### ⏱️ Constraints
* $1 \le N \le 1000$

#### 📥 Input Format
- A single line containing an integer $N$.

#### 📤 Output Format
- Numbers printed from $1$ up to $N$, each on a new line.

#### 🧪 Sample Test Case
**Sample Input:**
```text
5
```
**Sample Output:**
```text
1
2
3
4
5
```

#### 🔍 Explanation
When `printIncreasing(5)` is called, it first delegates printing $1$ to $4$ to `printIncreasing(4)`. Printing of $5$ is delayed until `printIncreasing(4)` completes. Thus, output is produced during Post-Order (stack unwinding).

#### 💡 Technical Interview Context
* **Theory Concept:** Tests understanding of **Post-Order Execution** / Stack Unwinding (delayed execution during function return).

---

### 3. Print Decreasing Increasing

#### 📜 Problem Description
1. You are given a positive integer $N$.
2. You are required to print numbers from $N$ down to $1$, and then from $1$ up to $N$ using recursion.
3. Complete the body of `pdi(int n)` function.

#### ⏱️ Constraints
* $1 \le N \le 1000$

#### 📥 Input Format
- A single line containing an integer $N$.

#### 📤 Output Format
- Numbers from $N$ down to $1$, followed by $1$ up to $N$, printed on separate lines.

#### 🧪 Sample Test Case
**Sample Input:**
```text
3
```
**Sample Output:**
```text
3
2
1
1
2
3
```

#### 🔍 Explanation
In call frame $N = 3$:
1. Pre-Order step prints `3`.
2. Recursive call `pdi(2)` is made.
3. Post-Order step prints `3` after `pdi(2)` returns.

#### 💡 Technical Interview Context
* **Theory Concept:** Evaluates combining Pre-Order and Post-Order work within the same call frame.

---

### 4. Factorial

#### 📜 Problem Description
1. You are given a non-negative integer $N$.
2. You are required to calculate and return $N!$ (factorial of $N$) using recursion.
3. Formula: $N! = N \times (N-1)!$ where $0! = 1$.

#### ⏱️ Constraints
* $0 \le N \le 12$ (Fits in standard 32-bit `int`)

#### 📥 Input Format
- A single line containing integer $N$.

#### 📤 Output Format
- An integer representing $N!$.

#### 🧪 Sample Test Case
**Sample Input:**
```text
5
```
**Sample Output:**
```text
120
```

#### 🔍 Explanation
$5! = 5 \times 4! = 5 \times 24 = 120$.

#### 💡 Technical Interview Context
* **Theory Concept:** Base Case justification in Mathematical Induction ($0! = 1$ acts as the multiplicative identity base case).

---

### 5. Power (Linear)

#### 📜 Problem Description
1. You are given two numbers, $x$ and $n$.
2. You are required to calculate $x$ raised to the power $n$ ($x^n$) using linear recursion.
3. Complete the function `power(int x, int n)`.

#### ⏱️ Constraints
* $1 \le x \le 10$
* $0 \le n \le 9$

#### 📥 Input Format
- Line 1: Integer $x$
- Line 2: Integer $n$

#### 📤 Output Format
- Integer value representing $x^n$.

#### 🧪 Sample Test Case
**Sample Input:**
```text
2
5
```
**Sample Output:**
```text
32
```

#### 🔍 Explanation
`power(2, 5)` calculates $2 \times \text{power}(2, 4)$, taking $\mathcal{O}(N)$ time and stack memory operations.

---

### 6. Power (Logarithmic)

#### 📜 Problem Description
1. You are given two numbers, $x$ and $n$.
2. You are required to calculate $x^n$ using logarithmic recursion in $\mathcal{O}(\log n)$ time.
3. Complete the function `power(int x, int n)`.

#### ⏱️ Constraints
* $1 \le x \le 10$
* $0 \le n \le 10^9$

#### 📥 Input Format
- Line 1: Integer $x$
- Line 2: Integer $n$

#### 📤 Output Format
- Integer value representing $x^n$.

#### 🧪 Sample Test Case
**Sample Input:**
```text
2
10
```
**Sample Output:**
```text
1024
```

#### 🔍 Explanation
Instead of calling $n$ times, compute $x^{n/2}$ once:
* If $n$ is even: $x^n = x^{n/2} \times x^{n/2}$
* If $n$ is odd: $x^n = x \times x^{n/2} \times x^{n/2}$
This reduces stack depth from $10$ to $\log_2(10) \approx 4$.

---

### 7. Tower of Hanoi

#### 📜 Problem Description
1. There are 3 towers named $T_1$, $T_2$, and $T_3$. Tower $T_1$ holds $N$ disks arranged in increasing order of size from top to bottom.
2. You need to move all $N$ disks from Tower $T_1$ to Tower $T_2$ using Tower $T_3$ as a helper.
3. Rules:
   - Move only 1 disk at a time.
   - Never place a larger disk on top of a smaller disk.
   - You can only move the top disk of any tower.
4. Print instructions in the format: `[disk_number][source_tower -> destination_tower]`

#### ⏱️ Constraints
* $1 \le N \le 10$

#### 📥 Input Format
- Line 1: Integer $N$ (Number of disks)
- Line 2: String/int $t_1id$ (Source Tower ID)
- Line 3: String/int $t_2id$ (Destination Tower ID)
- Line 4: String/int $t_3id$ (Helper Tower ID)

#### 📤 Output Format
- Printed move instructions, one per line.

#### 🧪 Sample Test Case
**Sample Input:**
```text
3
10
20
30
```
**Sample Output:**
```text
1[10 -> 20]
2[10 -> 30]
1[20 -> 30]
3[10 -> 20]
1[30 -> 10]
2[30 -> 20]
1[10 -> 20]
```

#### 💡 Technical Interview Context
* **Recurrence Relation:** $T(N) = 2T(N-1) + 1 \implies \mathcal{O}(2^N)$ Total Moves = $2^N - 1$.

---

## 🔹 Phase 2: Recursion in Arrays

### 8. Display Array

#### 📜 Problem Description
1. You are given an array `arr` of $N$ integers.
2. You are required to display all elements of the array from index $0$ to $N-1$ using recursion.
3. Complete the function `displayArray(int[] arr, int idx)`.

#### ⏱️ Constraints
* $1 \le N \le 10^4$
* $-10^9 \le arr[i] \le 10^9$

#### 📥 Input Format
- Line 1: Integer $N$
- Next $N$ lines: Elements of the array.

#### 📤 Output Format
- Array elements printed sequentially on separate lines.

#### 🧪 Sample Test Case
**Sample Input:**
```text
4
10
20
30
40
```
**Sample Output:**
```text
10
20
30
40
```

---

### 9. Display Array in Reverse

#### 📜 Problem Description
1. You are given an array `arr` of $N$ integers.
2. You are required to display all elements in reverse order (from index $N-1$ down to $0$) using recursion.
3. Complete the function `displayArrayReverse(int[] arr, int idx)`.

#### 🧪 Sample Test Case
**Sample Input:**
```text
4
10
20
30
40
```
**Sample Output:**
```text
40
30
20
10
```

---

### 10. Max of an Array

#### 📜 Problem Description
1. You are given an array `arr` of $N$ integers.
2. Find and return the maximum element in the array using recursion.
3. Complete the function `maxOfArray(int[] arr, int idx)`.

#### 🧪 Sample Test Case
**Sample Input:**
```text
5
15
32
8
91
42
```
**Sample Output:**
```text
91
```

---

### 11. First Index of Occurrence

#### 📜 Problem Description
1. You are given an array `arr` of $N$ integers and a target value $x$.
2. Find the **first index** at which $x$ occurs in the array using recursion.
3. If $x$ is not present in the array, return `-1`.

#### 🧪 Sample Test Case
**Sample Input:**
```text
6
5
8
2
8
4
8
8
```
**Sample Output:**
```text
1
```

---

### 12. Last Index of Occurrence

#### 📜 Problem Description
1. You are given an array `arr` of $N$ integers and a target value $x$.
2. Find the **last index** at which $x$ occurs in the array using recursion.
3. If $x$ is not present in the array, return `-1`.

#### 🧪 Sample Test Case
**Sample Input:**
```text
6
5
8
2
8
4
8
8
```
**Sample Output:**
```text
5
```

---

### 13. All Indices of Array

#### 📜 Problem Description
1. You are given an array `arr` of $N$ integers and a target key $x$.
2. Find **all zero-based indices** where $x$ occurs and return them stored in a newly allocated 1D integer array.
3. **Constraint:** You are NOT allowed to use dynamic lists (like `ArrayList`). You must pass a counter parameter `fsf` (Found So Far) to allocate an exact size array at the base case.

#### 🧪 Sample Test Case
**Sample Input:**
```text
6
2
3
8
3
4
3
3
```
**Sample Output:**
```text
1
3
5
```

---

## 🔹 Phase 3: Recursion with ArrayLists (Get Series)

### 14. Get Subsequence

#### 📜 Problem Description
1. You are given a string `str`.
2. You are required to compute all subsequences of `str` and return them stored in an `ArrayList<String>`.
3. A subsequence is formed by deleting zero or more characters from a string without changing the relative order of the remaining characters.

#### 🧪 Sample Test Case
**Sample Input:**
```text
abc
```
**Sample Output:**
```text
[, c, b, bc, a, ac, ab, abc]
```

---

### 15. Get Keypad Combinations (KPC)

#### 📜 Problem Description
1. You are given a numeric string `str` representing button presses on a feature phone keypad:
   * `0` $\rightarrow$ `.?`
   * `1` $\rightarrow$ `abc`
   * `2` $\rightarrow$ `def`
   * `3` $\rightarrow$ `ghi`
   * `4` $\rightarrow$ `jkl`
   * `5` $\rightarrow$ `mno`
   * `6` $\rightarrow$ `pqrs`
   * `7` $\rightarrow$ `tu`
   * `8` $\rightarrow$ `vwx`
   * `9` $\rightarrow$ `yz`
2. Return all possible character combinations in an `ArrayList<String>`.

#### 🧪 Sample Test Case
**Sample Input:**
```text
78
```
**Sample Output:**
```text
[tv, tw, tx, uv, uw, ux, vv, vw, vx]
```

---

### 16. Get Stair Paths

#### 📜 Problem Description
1. You are standing at step $N$ and want to reach step $0$.
2. You can take steps of length $1$, $2$, or $3$ at any point.
3. Return all valid path strings in an `ArrayList<String>`.

#### 🧪 Sample Test Case
**Sample Input:**
```text
3
```
**Sample Output:**
```text
[111, 12, 21, 3]
```

---

### 17. Get Maze Paths

#### 📜 Problem Description
1. You are given two integers $H$ and $W$ representing a grid of $H$ rows and $W$ columns.
2. You are standing at cell $(1, 1)$ and want to reach cell $(H, W)$.
3. From cell $(r, c)$, you can move 1 step Right (`h`) to $(r, c+1)$ or 1 step Down (`v`) to $(r+1, c)$.
4. Return all valid path strings in an `ArrayList<String>`.

#### 🧪 Sample Test Case
**Sample Input:**
```text
2
2
```
**Sample Output:**
```text
[hv, vh]
```

---

### 18. Get Maze Paths with Jumps

#### 📜 Problem Description
1. You are at cell $(1, 1)$ in an $H \times W$ grid, target cell $(H, W)$.
2. You can take horizontal jumps (`h1`, `h2`...), vertical jumps (`v1`, `v2`...), or diagonal jumps (`d1`, `d2`...) of any magnitude as long as you stay within grid boundaries.
3. Return all path strings in an `ArrayList<String>`.

#### 🧪 Sample Test Case
**Sample Input:**
```text
2
2
```
**Sample Output:**
```text
[h1v1, v1h1, d1]
```

---

## 🔹 Phase 4: Recursion On the Way Up (Print Series)

### 19. Print Subsequence

#### 📜 Problem Description
1. You are given a string `str`.
2. Compute and print all subsequences directly upon hitting the base case (Recursion on the way up / Space Optimized).
3. Do NOT return an `ArrayList`.

#### 🧪 Sample Test Case
**Sample Input:**
```text
abc
```
**Sample Output:**
```text
abc
ab
ac
a
bc
b
c
```

---

### 20. Print Keypad Combinations

#### 📜 Problem Description
1. You are given a numeric string `str`.
2. Print all phone keypad combinations on the way up without using an `ArrayList`.

#### 🧪 Sample Test Case
**Sample Input:**
```text
67
```
**Sample Output:**
```text
pt
pu
qt
qu
rt
ru
st
su
```

---

### 21. Print Stair Paths

#### 📜 Problem Description
1. You are at step $N$ going to step $0$ with jumps $1$, $2$, or $3$.
2. Print all path strings directly on reaching base case $n = 0$.

#### 🧪 Sample Test Case
**Sample Input:**
```text
3
```
**Sample Output:**
```text
111
12
21
3
```

---

### 22. Print Maze Paths

#### 📜 Problem Description
1. Print all maze paths from cell $(1,1)$ to $(H,W)$ using `h` and `v` on the way up.

#### 🧪 Sample Test Case
**Sample Input:**
```text
2
2
```
**Sample Output:**
```text
hv
vh
```

---

### 23. Print Maze Paths with Jumps

#### 📜 Problem Description
1. Print all maze paths with variable horizontal, vertical, and diagonal jumps on the way up.

#### 🧪 Sample Test Case
**Sample Input:**
```text
2
2
```
**Sample Output:**
```text
h1v1
v1h1
d1
```

---

### 24. Print Permutations

#### 📜 Problem Description
1. You are given a string `str`.
2. Print all $N!$ permutations of the string, each on a new line.

#### 🧪 Sample Test Case
**Sample Input:**
```text
abc
```
**Sample Output:**
```text
abc
acb
bac
bca
cab
cba
```

---

### 25. Print Encodings

#### 📜 Problem Description
1. You are given a numeric string `str` representing an encoded message where:
   * `'1'` $\rightarrow$ `a`, `'2'` $\rightarrow$ `b` ... `'26'` $\rightarrow$ `z`.
2. Print all valid decoded letter strings.
3. Invalid rules:
   * An encoding cannot start with `'0'`.
   * Double-digit values cannot exceed `26`.

#### 🧪 Sample Test Case
**Sample Input:**
```text
123
```
**Sample Output:**
```text
abc
aw
lc
```

---

## 🔹 Phase 5: Backtracking & Classic Problems

### 26. Flood Fill

#### 📜 Problem Description
1. You are given an $R \times C$ 2D matrix where `0` represents an open cell and `1` represents an obstacle.
2. You are standing at cell $(0,0)$ and want to reach cell $(R-1, C-1)$.
3. You can move 1 step in 4 directions:
   * Top (`t`)
   * Left (`l`)
   * Down (`d`)
   * Right (`r`)
4. You cannot step on cells containing `1` or re-visit cells already part of your current path.
5. Print all valid paths from source to destination.

#### 🧪 Sample Test Case
**Sample Input:**
```text
3 3
0 0 0
0 1 0
0 0 0
```
**Sample Output:**
```text
rddr
rrdl
```

---

### 27. Target Sum Subsets

#### 📜 Problem Description
1. You are given an array `arr` of $N$ integers and a target number `tar`.
2. Find and print all subsets of elements whose sum is equal to `tar`.
3. Print each subset in comma-separated format ending with a period.

#### 🧪 Sample Test Case
**Sample Input:**
```text
5
10
20
30
40
50
60
```
**Sample Output:**
```text
10, 20, 30.
10, 50.
20, 40.
```

---

### 28. N-Queens

#### 📜 Problem Description
1. You are given an $N \times N$ chessboard and $N$ queens.
2. Place all $N$ queens on the board such that no two queens attack each other (no two queens share the same row, column, or diagonal).
3. Print all valid placement configurations.

#### 🧪 Sample Test Case
**Sample Input:**
```text
4
```
**Sample Output:**
```text
0-1, 1-3, 2-0, 3-2, .
0-2, 1-0, 2-3, 3-1, .
```

---

### 29. Knights Tour

#### 📜 Problem Description
1. You are given an $N \times N$ chessboard and starting coordinates $(r, c)$ for a Knight.
2. Print all paths such that the Knight visits **every cell on the board exactly once**.
3. Display the board configuration at each valid completion, showing the step number ($1$ to $N^2$) in each cell.

#### 🧪 Sample Test Case
**Sample Input:**
```text
5
0
0
```
**Sample Output:**
```text
1 10 15 20 23 
14 19 22 9 16 
11 2 7 24 21 
18 13 4 17 8 
3 12 11 6 25 
```
