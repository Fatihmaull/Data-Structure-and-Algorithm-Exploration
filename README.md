# Algorithm and Data Structure Exploration in Java  

This repository contains a collection of fundamental algorithm and data structure concepts, primarily implemented in Java. The goal is to provide clear and concise examples to help learners understand and apply these concepts effectively. Below is the breakdown of topics covered:  

## Table of Contents  
1. **Sorting Algorithms**  
    - [Bubble Sort](#bubble-sort)  
    - [Insertion Sort](#insertion-sort)  
    - [Selection Sort](#selection-sort)  
    - [Shell Sort](#shell-sort)  
    - [Quick Sort](#quick-sort)  
2. **Search Algorithms**  
    - [Array Search](#array-search)  
    - [Binary Search](#binary-search)  
3. **Abstract Data Types (ADT)**  
    - [Static ADT: Array](#static-adt-array)  
    - [Sorting in Collections, ArrayList, and Set](#sorting-in-collections-arraylist-and-set)  
    - [Dynamic ADT: List](#dynamic-adt-list)  
    - [Dynamic ADT: Single Linked List](#dynamic-adt-single-linked-list)  
    - [Dynamic ADT: Double Linked List](#dynamic-adt-double-linked-list)  
4. **Tree Structures**  
    - [Tree and Binary Tree](#tree-and-binary-tree)  
    - [Balanced Binary Tree](#balanced-binary-tree)  
    - [Binary Tree Processing Variations](#binary-tree-processing-variations)  
5. **Dynamic ADT: Hashing**  
    - [Hashing](#hashing)  
6. **Graph Algorithms**  
    - [Depth First Search (DFS)](#depth-first-search-dfs)  
    - [Breadth First Search (BFS)](#breadth-first-search-bfs)  
    - [Minimum Spanning Tree (Prim and Kruskal)](#minimum-spanning-tree-prim-and-kruskal)  

---

### Sorting Algorithms  

#### Bubble Sort  
- A simple comparison-based algorithm.  
- Repeatedly swaps adjacent elements if they are in the wrong order.  
- **Time Complexity:** O(n²).  

#### Insertion Sort  
- Builds the sorted array one element at a time.  
- Efficient for small or partially sorted data.  
- **Time Complexity:** O(n²).  

#### Selection Sort  
- Divides the list into sorted and unsorted parts.  
- Repeatedly selects the smallest element from the unsorted portion.  
- **Time Complexity:** O(n²).  

#### Shell Sort  
- An optimisation of insertion sort.  
- Sorts elements far apart before gradually reducing the gap.  
- **Time Complexity:** O(n log n) (depends on gap sequence).  

#### Quick Sort  
- A divide-and-conquer algorithm.  
- Partitions the array around a pivot element.  
- **Time Complexity:** O(n log n) on average.  

---

### Search Algorithms  

#### Array Search  
- Linear search through all elements.  
- Best suited for small or unsorted arrays.  
- **Time Complexity:** O(n).  

#### Binary Search  
- Searches in a sorted array by repeatedly dividing the search interval in half.  
- **Time Complexity:** O(log n).  

---

### Abstract Data Types (ADT)  

#### Static ADT: Array  
- Fixed size structure.  
- Used for storing and manipulating sequential data.  

#### Sorting in Collections, ArrayList, and Set  
- Utilises built-in Java utilities like `Collections.sort()` and `Arrays.sort()`.  
- Supports custom comparators.  

#### Dynamic ADT: List  
- Includes data structures like `ArrayList` and `LinkedList`.  
- Flexible and dynamic in size.  

#### Dynamic ADT: Single Linked List  
- Nodes containing data and a reference to the next node.  
- Efficient insertion and deletion.  

#### Dynamic ADT: Double Linked List  
- Nodes with references to both previous and next nodes.  
- Allows traversal in both directions.  

---

### Tree Structures  

#### Tree and Binary Tree  
- Hierarchical structures with nodes.  
- Binary Tree: Each node has at most two children.  

#### Balanced Binary Tree  
- Ensures that the depth of subtrees differs by no more than one.  
- Examples: AVL Tree, Red-Black Tree.  

#### Binary Tree Processing Variations  
- **Pre-order Traversal:** Root → Left → Right.  
- **In-order Traversal:** Left → Root → Right.  
- **Post-order Traversal:** Left → Right → Root.  

---

### Dynamic ADT: Hashing  

#### Hashing  
- Stores data in key-value pairs.  
- Efficient for search, insert, and delete operations.  
- **Examples:** HashMap, HashSet.  

---

### Graph Algorithms  

#### Depth First Search (DFS)  
- Explores as far along each branch as possible before backtracking.  
- **Time Complexity:** O(V + E).  

#### Breadth First Search (BFS)  
- Explores all neighbours at the current depth before moving deeper.  
- **Time Complexity:** O(V + E).  

#### Minimum Spanning Tree (Prim and Kruskal)  
- **Prim's Algorithm:** Builds the MST by adding the smallest edge.  
- **Kruskal's Algorithm:** Sorts all edges and adds them while avoiding cycles.  

---

## How to Use  
- Clone the repository:  
  ```bash  
  git clone https://github.com/your-repo-name.git  
  ```  
- Navigate to the topic directory and explore the Java implementation files.  
- Run the code using your favourite IDE or the terminal:  
  ```bash  
  javac FileName.java  
  java FileName  
  ```  

---  

## Contribution  
Contributions are welcome! Feel free to submit issues or pull requests for new algorithms or optimisations.  

---
