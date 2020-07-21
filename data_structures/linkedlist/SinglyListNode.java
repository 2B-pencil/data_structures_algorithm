/**
 * @author Dao
 * @since 2020年07月20日 22:08
 * @param <T>
 */
public class SinglyListNode<T> {
    T data;
    SinglyListNode<T> next;
    int length;

    /**
     * 构造函数
     */
    SinglyListNode(T var) {
        this.data = var;
        this.next = null;
        this.length = 1;
    }

}
