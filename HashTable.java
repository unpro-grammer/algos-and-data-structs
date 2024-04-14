import java.util.*;

// hastable by default has capacity of 11 and load factor of 0.75 (when 75% full, size increases
// dynamically to accommodate more)
// table is like buckets... everything is placed in index key.hashCode() % <capacity>
// two or more things in same bucket = collision. treat like linked list. existing stored key points
// to the additional key-value entry. less efficiency with more collisions.

// fast insertion, look up, deletion of key/value pairs
// not ideal for small data sets, great with large data sets

// hashing = takes a key and computes an integer (with a key_type-specific formula)

// runtime complexity: best case: O(1) with no collisions; worst case: O(n) when EVERYTHING collides

public class HashTable {
  // collection of key-value pairs
  public static void main(String[] args) {
    Hashtable<String, String> table = new Hashtable<>(10);

    table.put("100", "Spongebob");
    table.put("123", "Patrick");
    table.put("321", "Sandy");
    table.put("555", "Squidward");
    table.put("777", "Gary");

    // table.remove(777);

    for (String key : table.keySet()) {
      System.out.println(key.hashCode() % 10 + "\t" + key + "\t" + table.get(key));
    }
  }
}
