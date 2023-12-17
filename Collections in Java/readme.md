## Collections Questions

1. Difference between ArrayList and LinkedList. Which is preferable?
- Both are implementations of List interface.
- ArrayList internally uses dynamic array to store elements. Linked List internally uses doubly linked list.
- ArrayList works based on index. LinkedList works based on references.
- Preference depends on the use case. We should prefer arraylist if the major goal is to store and retrieve the elements. Linkedlist should be used if the use case is to add/delete the element from middle as well.
- Random Access : 
  - arraylist - O(1)
  - linkedlist - O(n)
- Insertion/Deletion : 
  - arraylist - O(n)
  - linkedlist - O(1)
2. Difference between list and set.
- List allows duplicates and Set does not.
3. `ArrayList<String> arrayList = new ArrayList<>();`
   `List<String> list = new ArrayList<>();` What is difference between the two?
- In the first one, the compiler will know that the `arrayList` is an arrayList and will allow to access all its functionality.
- In the second one, the compiler gives flexibilty to treat `list` as a List. It is only at runtime that it realises that its actually an arrayList. (Runtime polymorphism).
- `arrayList.trimToSize();` works but `list.trimToSize();` is not correct.
- **Advantage** : If later stage, we want to change `list` from ArrayList to LinkedList, we can do it by changing one line only (declaration line). Rest all implementation will be as it is.
- **Disadvantage** : The methods specific to arraylist will be masked. 
4. Can you modify a list declared as `final`?
- Yes, we can add, delete and insert elements. We can not re-initialise it.
5. Customize ArrayList so that it behaves like a Set.
- ```
  public class UniqueArrayList<T> extends ArrayList<T> {
    @Override
    public boolean add(Object o) {
        if (this.contains(o)) {
            return true;
        } else {
            return super.add((T) o);
        }
    }
  } 
  ```
  
6. Why set does not allow duplicate elements?
- Internally, set uses HashMap which takes the 'key' in the form of hashCode of the element itself.

7. Difference between Comparable and Comparator ?
- Both are interfaces used for comparison.
- - Comparable - java.lang
  - Compara***t***or - java.u***t***il
- - Comparable - implements compareTo() 
  - Comparator - implements compare()
- - Comparable - affects the same class (say, Student) directly that implements it.
  - Comparator - the class that implements it is a comparator, which is used by the class (Student)
- - Comparable - compares the object itself to another
  - Comparator - provides a comparator that can be used to compare 2 or more objects
- - Comparable - `Collections.sort(list)`
  - Comparator - `Collections.sort(list, new MyComparator())`

8. What is fail-fast and fail-safe iterators and how it works?
- Fail fast iterators throw ConcurrentModificationException when modified while iterating. eg : ArrayList and HashMap.
- Fail safe does not throw it. eg : CopyOnWriteArrayList and ConcurrentHashMap
- Fail fast uses internal flag called `modCount`. If a collection is modified, `modCount` is updated. While iteration, if the value of modcount has been updated, ConcurrentModificationException is thrown.


