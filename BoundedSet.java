// @author kristen Lee
// @date Feb 7, 2019

public class BoundedSet<E>{
  int size;
  int capacity;
  E array[];
/** Initializes the object, if given capacity, will set to parameter.
  * @param capacity
  */
  @SuppressWarnings("unchecked")
  BoundedSet(int capacity){
    this.capacity = capacity;
    this.size = 0;
    this.array = (E[]) new Object[capacity];
  }
/** Adds a new element to the bounded set.
  * Will fail if element is null
  * if it is already inside the bounded set
  * if the bounded set is already full
  * @param e generic element
  * @return boolean true if sucessful
  */
  @SuppressWarnings("unchecked")
  boolean add(E element){
    if(element == null) return false;
    else if(contains(element)) return false;
    else if(this.size == this.capacity) return false;
    else{
      this.array[size] = element;
      size++;
      return true;
    }
  }
/** Returns whether or not the element is to be found inside the bounded set.
  * @param e element
  * @return boolean true if found, false if not
  */
  boolean contains(E element){
    for(int i = 0; i < this.size; i++){
      if(element == array[i]) return true;
    }
    return false;
  }
/** Returns the maximum number of elements that could be contained.
  * @return integer
  */
  int getCapacity(){
    return this.capacity;
  }
/** Returns the number of elements currently contained in set.
  * @return integer
  */
  int getSize(){
    return this.size;
  }
/** Removes the specified element from the bounded set. will fail and return false if not found.
  * @param element to remove
  * @return boolean whether it suceeded
  */
  boolean remove(E element){
    for(int i = 0; i < this.size; i++){
      if(this.array[i] == element)) {
        this.array[i] = null;
        this.size--;
        return true;
      }
    }
    return false;
  }
/** Returns a string representing the bounded set.
  * @return String
  */
  @Override
  public String toString(){
    StringBuilder builder = new StringBuilder("[");
    for(int i = 0; i < this.size; i++){
      if(i != 0) builder.append(" ,");
      builder.append(array[i]);
    }
    builder.append("]");
    return builder.toString();
  }
/** Return index in which it is located inside the internal array.
  * @param E element
  * @return integer index
  */
  int findIndex(E element){
    for(int i = 0; i < this.size; i++){
      if()
    }
  }


  public static void main(String[] args){
    BoundedSet<Integer> array = new BoundedSet<Integer>(10);
    array.add(50);
    array.add(4);
    array.add(23);
    array.add(21);
    System.out.println(array.toString());
    array.remove(21);
    System.out.println(array.toString());

  }
}
