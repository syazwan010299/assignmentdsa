
package individualassignment;


public interface ListInterface {
    public void add(Object o);                  //adds element at the end of the list
    public void add(int index,Object O);        //adds element at the specified index position in the list
    public boolean remove (Object o);           // removes element from the list
    public Object remove (int index);           //removes element at the specified index position in the list 
    public Object get (int index);              // retuns the element at the specified index position in this collection
    public Object set (int index, Object o);    // replaces the element at the specified index position with object o
    public int size();                          // returns the number of element in the list
    public boolean isEmpty ();                  // returns true if the list has no elements
    public boolean contains(Object o);          //returns true if a special objects is an element within the list
    public void clear ();                       // removes all the elements in the list
    public int indexOf(Object o);               // returns the index of the first occurence of the element or returns -1 if this list does not contain
    public int lastIndexOf (Object o);          // returns the index of the last occurence of the element or returns -1 if this list does not contain

}
