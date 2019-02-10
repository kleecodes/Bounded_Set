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
    // else if() return false;
    else if(this.size == this.capacity) return false;
    else{
      this.array[size] = element;
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


  public static void main(String[] args){
    BoundedSet<Integer> array = new BoundedSet<Integer>(10);
    array.add(50);
    array.add(4);
    array.add(23);
    array.add(21);
  }
}
