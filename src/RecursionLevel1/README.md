# Recursion & Backtracking Level-1: Master Sheet

A complete collection of Recursion and Backtracking problems designed to build deep mental models of recursion tree execution, stack mechanics, state management, and backtracking space-pruning.

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

### Phase 3: Recursion with Arraylists (Get Series)
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
#### 💡 Technical Interview Context & Theory
* **Core Concept:** Pre-Order Traversal / Going-Down Phase.
* **Theory Asked in Interviews:** Evaluates if the candidate understands doing work *before* pushing recursive calls to the stack.
* **Common Question:** "What happens if $N = 10^6$?"
  * *Answer:* Causes `StackOverflowError` due to memory limits ($\mathcal{O}(N)$ frames).

#### 📝 Problem Statement
Given a positive integer $N$, print all numbers from $N$ down to $1$, each on a new line.

#### 📥 Input Format
- An integer $N$.

#### 📤 Output Format
- Numbers from $N$ down to $1$ on separate lines.

#### 🧪 Sample Test Case
**Input:** `5`  
**Output:** `5 4 3 2 1` (on separate lines)

---

### 2. Print Increasing
#### 💡 Technical Interview Context & Theory
* **Core Concept:** Post-Order Traversal / Stack Unwinding Phase.
* **Theory Asked in Interviews:** Tests execution during stack popping (returning phase).

#### 📝 Problem Statement
Given a positive integer $N$, print all numbers from $1$ up to $N$, each on a new line.

#### 📥 Input Format
- An integer $N$.

#### 📤 Output Format
- Numbers from $1$ up to $N$ on separate lines.

#### 🧪 Sample Test Case
**Input:** `5`  
**Output:** `1 2 3 4 5` (on separate lines)

---

### 3. Print Decreasing Increasing
#### 💡 Technical Interview Context & Theory
* **Core Concept:** Pre-Order and Post-Order Execution within a single frame.

#### 📝 Problem Statement
Given an integer $N$, print numbers from $N$ down to $1$, and then $1$ up to $N$.

#### 📥 Input Format
- An integer $N$.

#### 📤 Output Format
- $2 \times N$ lines printed.

#### 🧪 Sample Test Case
**Input:** `3`  
**Output:** `3 2 1 1 2 3` (on separate lines)

---

### 4. Factorial
#### 💡 Technical Interview Context & Theory
* **Core Concept:** Principle of Mathematical Induction (PMI) & Base Cases.
* **Theory Asked in Interviews:** Why must $0! = 1$? (Multiplicative identity base case).

#### 📝 Problem Statement
Compute the factorial of $N$ using recursion ($N! = N \times (N-1)!$).

#### 📥 Input Format
- An integer $N$.

#### 📤 Output Format
- Single integer representing $N!$.

#### 🧪 Sample Test Case
**Input:** `5`  
**Output:** `120`

---

### 5. Power (Linear)
#### 💡 Technical Interview Context & Theory
* **Complexity:** Time $\mathcal{O}(N)$, Space $\mathcal{O}(N)$.

#### 📝 Problem Statement
Compute $x^n$ using linear recursion.

#### 📥 Input Format
- Integer $x$ on line 1, integer $n$ on line 2.

#### 📤 Output Format
- Single integer representing $x^n$.

#### 🧪 Sample Test Case
**Input:** `2`, `5`  
**Output:** `32`

---

### 6. Power (Logarithmic)
#### 💡 Technical Interview Context & Theory
* **Core Concept:** Divide and Conquer Optimization.
* **Theory Asked in Interviews:** How to optimize $\mathcal{O}(N) \rightarrow \mathcal{O}(\log N)$ using $x^{n/2} \times x^{n/2}$.

#### 📝 Problem Statement
Compute $x^n$ in $\mathcal{O}(\log n)$ time complexity.

#### 📥 Input Format
- Integer $x$ on line 1, integer $n$ on line 2.

#### 📤 Output Format
- Single integer representing $x^n$.

#### 🧪 Sample Test Case
**Input:** `2`, `10`  
**Output:** `1024`

---

### 7. Tower of Hanoi
#### 💡 Technical Interview Context & Theory
* **Recurrence Relation:** $T(N) = 2T(N-1) + 1 \implies \mathcal{O}(2^N)$. Minimum moves = $2^N - 1$.

#### 📝 Problem Statement
Move $N$ disks from Tower $A$ to Tower $B$ using Tower $C$ following Hanoi rules.

#### 📥 Input Format
- Line 1: $N$. Line 2: Tower $A$. Line 3: Tower $B$. Line 4: Tower $C$.

#### 📤 Output Format
- Move steps in format: `[disk_number][source -> destination]`.

#### 🧪 Sample Test Case
**Input:** `3`, `10`, `20`, `30`  
**Output:** `1[10 -> 20]`, `2[10 -> 30]`, `1[20 -> 30]`, `3[10 -> 20]`, `1[30 -> 10]`, `2[30 -> 20]`, `1[10 -> 20]`

---

## 🔹 Phase 2: Recursion in Arrays

### 8. Display Array
#### 💡 Technical Interview Context & Theory
* Pass indices instead of slicing arrays to avoid $\mathcal{O}(N^2)$ space complexity.

#### 📝 Problem Statement
Print all array elements from index $0$ to $N-1$ using recursion.

#### 📥 Input Format
- Line 1: $N$. Next $N$ lines: array elements.

#### 📤 Output Format
- Elements printed on separate lines.

#### 🧪 Sample Test Case
**Input:** `4`, `10`, `20`, `30`, `40`  
**Output:** `10 20 30 40` (on separate lines)

---

### 9. Display Array in Reverse
#### 📝 Problem Statement
Print array elements from index $N-1$ down to $0$ recursively.

#### 🧪 Sample Test Case
**Input:** `4`, `10`, `20`, `30`, `40`  
**Output:** `40 30 20 10` (on separate lines)

---

### 10. Max of an Array
#### 📝 Problem Statement
Find the maximum element in an array using recursion.

#### 🧪 Sample Test Case
**Input:** `5`, `15`, `32`, `8`, `91`, `42`  
**Output:** `91`

---

### 11. First Index of Occurrence
#### 💡 Technical Interview Context & Theory
* **Best-case Time Complexity:** $\mathcal{O}(1)$ due to early exit in Pre-Order traversal.

#### 📝 Problem Statement
Find the first index where $x$ occurs. Return `-1` if absent.

#### 🧪 Sample Test Case
**Input:** `6`, `5 8 2 8 4 8`, `8`  
**Output:** `1`

---

### 12. Last Index of Occurrence
#### 💡 Technical Interview Context & Theory
* Handover mechanics during stack unwinding (`return fiisa;`).

#### 📝 Problem Statement
Find the last index where $x$ occurs. Return `-1` if absent.

#### 🧪 Sample Test Case
**Input:** `6`, `5 8 2 8 4 8`, `8`  
**Output:** `5`

---

### 13. All Indices of Array
#### 💡 Technical Interview Context & Theory
* Memory allocation trick: Pass counter (`fsf` - Found So Far) to allocate a static array at the base case.

#### 📝 Problem Statement
Return an array of all zero-based indices where key $x$ appears.

#### 🧪 Sample Test Case
**Input:** `6`, `2 3 8 3 4 3`, `3`  
**Output:** `1 3 5` (on separate lines)

---

## 🔹 Phase 3: Recursion with ArrayLists (Get Series)

### 14. Get Subsequence
#### 💡 Technical Interview Context & Theory
* Total subsequences = $2^N$. Base case returns `[""]` so combinations can append.

#### 📝 Problem Statement
Return all subsequences of a string in an `ArrayList<String>`.

#### 🧪 Sample Test Case
**Input:** `abc`  
**Output:** `[, c, b, bc, a, ac, ab, abc]`

---

### 15. Get Keypad Combinations (KPC)
#### 📝 Problem Statement
Given a numeric string (e.g., `57`), return all mobile keypad letter combinations.

#### 🧪 Sample Test Case
**Input:** `78`  
**Output:** `[tv, tw, tx, uv, uw, ux, vv, vw, vx]`

---

### 16. Get Stair Paths
#### 💡 Technical Interview Context & Theory
* Base case differentiation: `n == 0` returns `[""]`, `n < 0` returns `[]`.

#### 📝 Problem Statement
Return all paths to climb $N$ stairs taking jumps of size $1$, $2$, or $3$.

#### 🧪 Sample Test Case
**Input:** `3`  
**Output:** `[111, 12, 21, 3]`

---

### 17. Get Maze Paths
#### 📝 Problem Statement
Return all paths from $(1, 1)$ to $(H, W)$ taking $1$ step Right ($h$) or $1$ step Down ($v$).

#### 🧪 Sample Test Case
**Input:** `2`, `2`  
**Output:** `[hv, vh]`

---

### 18. Get Maze Paths with Jumps
#### 💡 Technical Interview Context & Theory
* Dynamic branch branching using variable jump sizes ($1$ to $N$).

#### 📝 Problem Statement
Return paths from $(1, 1)$ to $(H, W)$ taking horizontal, vertical, or diagonal jumps of variable length.

#### 🧪 Sample Test Case
**Input:** `2`, `2`  
**Output:** `[h1, v1, d1]`

---

## 🔹 Phase 4: Recursion On the Way Up (Print Series)

### 19. Print Subsequence
#### 💡 Technical Interview Context & Theory
* **Space Optimization:** Eliminates $\mathcal{O}(2^N)$ space complexity by printing combinations directly on the way up rather than returning an `ArrayList`.

#### 📝 Problem Statement
Print all subsequences of a string directly on reaching base case.

#### 🧪 Sample Test Case
**Input:** `abc`  
**Output:** `abc`, `ab`, `ac`, `a`, `bc`, `b`, `c`, `""` (printed line by line)

---

### 20. Print Keypad Combinations
#### 📝 Problem Statement
Print all phone keypad combinations on the way up.

#### 🧪 Sample Test Case
**Input:** `67`  
**Output:** All string combinations printed on new lines.

---

### 21. Print Stair Paths
#### 📝 Problem Statement
Print all path strings for $N$ stairs using jumps $1, 2, 3$ without `ArrayList`.

#### 🧪 Sample Test Case
**Input:** `3`  
**Output:** `111`, `12`, `21`, `3`

---

### 22. Print Maze Paths
#### 📝 Problem Statement
Print all maze paths from $(1,1)$ to $(H,W)$ using $h$ and $v$ on the way up.

#### 🧪 Sample Test Case
**Input:** `2`, `2`  
**Output:** `hv`, `vh`

---

### 23. Print Maze Paths with Jumps
#### 📝 Problem Statement
Print all maze paths with multi-step jumps on the way up.

#### 🧪 Sample Test Case
**Input:** `2`, `2`  
**Output:** `h1`, `v1`, `d1`

---

### 24. Print Permutations
#### 💡 Technical Interview Context & Theory
* Total permutations = $N!$. Tree branch factor decreases at each level ($N \times (N-1) \times \dots$).

#### 📝 Problem Statement
Print all permutations of a given string.

#### 🧪 Sample Test Case
**Input:** `abc`  
**Output:** `abc`, `acb`, `bac`, `bca`, `cab`, `cba`

---

### 25. Print Encodings
#### 💡 Technical Interview Context & Theory
* Checks invalid encodings (e.g., numbers starting with `'0'`) and double-digit bounds ($\le 26$).

#### 📝 Problem Statement
Given a numeric string (1='a', 2='b'... 26='z'), print all valid decoded character strings.

#### 🧪 Sample Test Case
**Input:** `123`  
**Output:** `abc`, `aw`, `lc`

---

## 🔹 Phase 5: Backtracking & Classic Problems

### 26. Flood Fill
#### 💡 Technical Interview Context & Theory
* **Core Concept:** 4-directional matrix exploration + visited matrix state resetting (backtracking).

#### 📝 Problem Statement
Given a 2D matrix where `0` is open and `1` is an obstacle, find all paths from $(0,0)$ to $(R-1, C-1)$ moving Top, Left, Down, Right without revisiting cells.

#### 📥 Input Format
- $R, C$ followed by matrix values, then starting cell.

#### 🧪 Sample Test Case
**Input:**
```text
3 3
0 0 0
0 1 0
0 0 0
