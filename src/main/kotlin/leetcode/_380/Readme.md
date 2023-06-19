# Insert Delete GetRandom O(1)

## Problem Description

Design a data structure that supports all the following operations in average O(1) time:

- `insert(val)`: Inserts an item `val` to the data structure if not already present.
- `remove(val)`: Removes an item `val` from the data structure if present.
- `getRandom()`: Returns a random element from the data structure. All elements should have an equal probability of being returned.

**Example:**

```plaintext
// Init an empty set.
RandomizedSet randomSet = new RandomizedSet();

// Inserts 1 to the set. Returns true as 1 was inserted successfully.
randomSet.insert(1);

// Returns false as 2 does not exist in the set.
randomSet.remove(2);

// Inserts 2 to the set, returns true. Set now contains [1,2].
randomSet.insert(2);

// getRandom should return either 1 or 2 randomly.
randomSet.getRandom();

// Removes 1 from the set, returns true. Set now contains [2].
randomSet.remove(1);

// 2 was already in the set, so return false.
randomSet.insert(2);

// Since 2 is the only number in the set, getRandom always returns 2.
randomSet.getRandom();
```

**Constraints:**

- `-2^31 <= val <= 2^31 - 1`
- At most `2 *` `10^5` calls will be made to `insert`, `remove`, and `getRandom`.
- There will be at least one element in the data structure when `getRandom` is called.

## Approach

The problem can be solved by using a combination of an array and a hash map.

Here are the steps for the approach:

#### **Initialize two data structures:** 

an array nums to store the values and a hash map valToIndex to store the mapping of values to their indices in the array.

#### **For the insert operation:**

Check if the value val already exists in the hash map. If it does, return false as the value is already present.
Append the value val to the end of the array nums.
Add the mapping of the value val to its index in the hash map.
Return true to indicate the successful insertion.

#### **For the remove operation:**

Check if the value val exists in the hash map. If it doesn't, return false as the value is not present.
Retrieve the index of the value val from the hash map.
Swap the value val with the last element in the array nums.
Update the index of the swapped element in the hash map.
Remove the value val and its mapping from the hash map.
Remove the last element from the array nums.
Return true to indicate the successful removal.

#### **For the getRandom operation:**

Generate a random index between 0 and the size of the array nums minus 1.
Return the value at the randomly generated index.
The insert, remove, and getRandom operations have an average time complexity of O(1).
