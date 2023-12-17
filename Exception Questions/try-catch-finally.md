### Try-Catch-Finally

What will this code return?

1. 
    ```
    private static int fun() {
        try {
            return 1;
        } catch (Exception e) {
            return 2;
        } finally {
            return 3;
        }
    }
    ```
    ans : 3

2.  ```
    private static int fun() {
        try {
            return 1;
        } catch (Exception e) {
            return 2;
        }
    }
    ```
    ans : 1

3. ```
    private static int fun() {
        try {
            System.out.println(10 / 0);
            return 1;
        } catch (Exception e) {
            return 2;
        }
    }
    ```
    ans : 2

4.
    ```
    private static int fun() {
        try {
            System.out.println(10 / 0);
            return 1;
        } catch (Exception e) {
            return 2;
        } finally {
            return 3;
        }
    }
    ```
   ans : 3

5. Exceptions when finally will not execute?
   - System.exit(0) ;
   - some exception is thrown inside finally block itself.

6. ```
   private static int fun() {
     try {
       System.out.println(10/0);;
       return 1;
     } catch (Exception e) {
       System.exit(0);
       return 2;
     } finally {
       return 3;
     }
   }
   ```
   ans : finally is **not** executed because `Process finished with exit code 0`
