package com.example;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.BlockingQueue;

public class StudyCollections {
    public static void main(String[] args) {
        // Linear Collection (Value)
        // contains(value)
        // List  : * ArrayList, LinkedList
        //         Ordered (get(4)) -> Sortable, Duplicate
                   // contains() -> O(n)

        // Set   : * HashSet, LinkedHashSet, TreeSet (Sorted -> RedBlack Tree), EnumSet
        //         Unordered -> Unsorted, Unique
                   // HashSet -> O(1) : contains()
                   // LoadFactor : 0.75,
        Set<Integer> set = new HashSet<>(1_334);
        // rehashing : 1_334 -> capacity * load_factor = ~1000

        // Deque : ArrayDeque, BlockingDeque
        //         LIFO (Stack), FIFO (Queue)

        // Queue : BlockingQueue
        //         FIFO

        // Associative Collection (Key -> Value) (Pair -> Entry)
        // Map   : * HashMap, LinkedHashMap, TreeMap, EnumMap,
        //         IdentityMap, WeakHashMap, ConcurrentHashMap
        // O(1) : get(key) --> value

        // JDK Collection API
        // 1. Guava (Google) (https://github.com/google/guava)
        // 2. Eclipse Collections (Performance -> Space + Time) (Goldman Sachs -> Eclipse Foundation) (https://www.eclipse.org/collections/)
    }
}
