
package individualassignment;


public class ArrayList implements ListInterface {
    
    private static final int INITIAL_CAPACITY = 16;
    private Object [] data = new Object[INITIAL_CAPACITY];
    private int size = 0;
    public ArrayList(){
    }
    
    public ArrayList(Object[] objects){
        data = objects;
        size = objects.length;
    }
    
    public void add(Object o) {
        add(size, o);
    }

    public void add(int index, Object o) {
        for(int i = size -1;i >= index;i--)
            data[i + 1] = data[i];
        data[index] = o;
        size++;
    }
            
    public boolean remove(Object o) {
        for (int i = 0; i < size; i++)
            if(o.equals(data[i])){
                remove(i);
                return true;
            }
        return false;
    }
    
    public Object remove(int index) {
        Object o = data[index];
        for (int j = index; j < size -1;j++)
            data[j] = data [j +1];
        size--;
        return o;
    }

    public Object get(int index) {
        return data[index];
    }

    public Object set(int index, Object o) {
        data[index] = o;
        return o;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    public boolean contains(Object o) {
        for ( int i = 0; i < size; i++)
            if(o.equals(data[i])){
                return true;
            }
        return false;
    }

    
    public void clear() {
        data = new Object[INITIAL_CAPACITY];
    }

    public int indexOf(Object o) {
        for ( int i = 0;i < size; i++)
            if (o.equals(data[i])) return i;
        return -1;
    }

    public int lastIndexOf(Object o) {
        for ( int i = size - 1; i >= 0; i--)
            if (o.equals(data[i]))return i ;
        return -1;
    }
    public String toString(){
        StringBuffer result = new StringBuffer("[");
        
        for ( int i = 0; i < size; i++){
            result.append(data[i]);
            if ( i < size -1) result.append(",");
        }
        return result.toString() + "]";
    }
    
}//end class ArrayList
