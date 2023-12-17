### String Concepts 

1. How mant ways to create String objects?
    - two :
     ```
      private void fun1() {
        String s1 = new String("Smriti");
        String s2 = "Smriti";
      }
      ```

2. How many objects created here ?
    - two, both at line `String s1 = new String("Smriti");`
    - at line `String s2 = "Smriti";`, **no** new String object is created because of SCP (String constant pool area).
   
3. Prove the above point?
   - `System.out.println(s1.intern().hashCode() == s2.hashCode());` returns true

4. What is String immutability ?
   - Once a String object is created, its state (the sequence of characters it represents) cannot be changed.
   - **Proof** : 
   ```
   String a = "Smriti";
   a.concat(" Sharma");
   ```
   here, a is still `Smriti` and `Smriti Sharma` is stored in some other memory.
   - **Uses** : 
     - **Thread Safe** : Since strings are immutable, they are inherently thread-safe. Multiple threads can access and use strings without the risk of one thread modifying the string's state while another is using it.
     - **Saves Heap space** : When a string literal is created, Java first checks this pool. If a string with the same content already exists, it reuses it instead of creating a new object. This reduces memory usage and enhances performance.
     - **Security** :  Being immutable ensures that once a string containing sensitive information is created, its value cannot be changed accidentally.
     - **Hashing** : As string is immutable, its hashcode will always remain the same. So it can be used in Hash data structure.

5. Alternative of String : StringBuffer and StringBuilder.
   - Both StringBuffer and StringBuilder are mutable.
   - StringBuffer is thread-safe and StringBuilder is not thread-safe
   - StringBuffer is slow and StringBuilder is fast.
   - StringBuffer is used in multi-threading environment and StringBuilder is used in single-threaded environments where high performance is desired.
