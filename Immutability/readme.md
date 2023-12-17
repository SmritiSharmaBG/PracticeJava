## Immutability

#### How can you make your own Immutable class?

1. Declare the class as final : no other class and inherit it.
2. All the variables must be private : no other class and acecss them.
3. All the variables must be final : no function can modify them. 
   - So, we will need to get it initialised in the constructor.
4. No setters, only getters (generating setter will give compile time error anyway).
5. In the getter of the object reference, return a clone instead of returning it directly.
   - Doing this, the getter return a clone of the parameter (and keeps the actual parameter safe) with which the client can use it without altering its actual value.
7. For mutable Objects, we will need to return a deep copy.
