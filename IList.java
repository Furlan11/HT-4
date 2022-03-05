/**
 * 
 */


/**
 * @author Guillermo Furlan 20713 
 * @author Wilfredo Gallegos 20399
 */
public interface IList<T> {

    void InsertAtStart(T value);

    void InsertAtEnd(T value);

    void Insert(T value, int index);

    T Delete(int index);

    T DeleteAtStart();

    T DeleteAtEnd();

    T Get(int index);

    boolean IsEmpty();
    
    int Count();
}
