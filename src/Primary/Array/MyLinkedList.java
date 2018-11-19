package Primary.Array;

/**
 * 简易LinkedList实现
 * Created by jimersylee on 17-8-20.
 */
public class MyLinkedList<E> {
    private static class Node<E> {
        public E data;
        public Node<E> prev;
        public Node<E> next;

        public Node(E data, Node<E> prev, Node<E> next) {
            this.data = data;
            this.prev = prev;
            this.next = next;
        }
    }

    private int size;
    private int modCount;
    private Node<E> beginMarker;
    private Node<E> endMarker;

    public MyLinkedList() {
        clear();
    }

    public void clear() {
        beginMarker = new Node<E>(null, null, null);
        endMarker = new Node<E>(null, beginMarker, null);
        beginMarker.next = endMarker;
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public boolean add(E e) {
        return add(getSize(), e);
    }

    public boolean add(int index, E e) {
        return addBefore(getNode(index), e);
    }

    private boolean addBefore(Node<E> prev, E e) {
        Node<E> newNode = new Node<E>(e, prev.prev, prev);
        newNode.prev.next = newNode;
        prev.prev = newNode;
        this.size++;
        this.modCount++;
        return true;
    }

    public E get(int index) {
        Node<E> node = getNode(index);
        if (node == null) {
            return null;
        }
        return node.data;
    }


    private Node<E> getNode(int index) {
        if (index < 0 || index > getSize()) {
            return null;
        }

        Node<E> prev;
        //判断索引位置离起点还是终点近,来选择从哪头开始
        if (index <= getSize() / 2) {
            prev = beginMarker.next;
            for (int i = 0; i < index; i++) {
                prev = prev.next;
            }
        } else {
            prev = endMarker;
            for (int i = getSize(); i > index; i--) {
                prev = prev.prev;
            }
        }

        return prev;

    }

    /**
     * 查找是否有x这个数据
     *
     * @param x:欲查找的数据
     * @return bool 找到还是未找到
     */
    public boolean find(E x) {
        Node<E> point = beginMarker.next;
        for (int i = 0; i < getSize(); i++) {


            if (point.data.equals(x)) {
                return true;
            }

            point = point.next;
        }

        return false;
    }

    public String toString() {
        StringBuilder string = new StringBuilder();
        Node<E> point = beginMarker.next;
        for (int i = 0; i < getSize(); i++) {
            string.append(point.data.toString()).append(",");
            point = point.next;
        }
        return string.toString();
    }


}
