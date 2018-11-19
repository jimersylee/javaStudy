package Primary.Array;

/**
 * 实现ArrayList
 * 数组
 * 数组的自动扩充
 * 增删改查,获取长度
 * Created by jimersylee on 17-8-20.
 */
public class MyArrayList<E> {
    private E[] elements = null;
    private int size = 0;
    private final int DEFAULT_CAPACITY = 10;

    public MyArrayList() {
        clear();
    }

    public MyArrayList(int size) {
        this.size = size;
        ensureCapacity(size);
    }

    public void clear() {
        size = 0;
        ensureCapacity(DEFAULT_CAPACITY);
    }


    /**
     * 获取ArrayList的长度
     *
     * @return int:长度
     */
    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * 扩充数组size
     *
     * @param newCapacity
     * @return
     */
    public boolean ensureCapacity(int newCapacity) {
        if (newCapacity < size) {
            return false;
        }

        E[] old = elements;
        elements = (E[]) new Object[newCapacity];
        for (int i = 0; i < size; i++) {
            elements[i] = old[i];
        }
        return true;
    }

    /**
     * 增加数组成员
     *
     * @param e:增加的数组成员对象
     * @return bool
     */
    public boolean add(E e) {

        add(size, e);
        return true;
    }

    public void add(int index, E e) {
        if (size == elements.length) {
            ensureCapacity(size * 2 + 1);
        }

        elements[index] = e;
        size++;
    }


    /**
     * 通过索引删除
     *
     * @param index
     * @return
     */
    public boolean remove(int index) {
        //判断索引是否合法
        if (index < 0 || index >= size) {
            return false;
        }
        size--;
        for (int i = index; i < size; i++) {
            elements[i] = elements[i + 1];
        }
        return true;
    }

    /**
     * 获取某个索引的值
     *
     * @param index:索引
     * @return E|null 泛型或者null
     */
    public E get(int index) {
        if (index < 0 || index >= size) {
            return null;
        }

        return elements[index];
    }

    /**
     * 设置某个索引的值
     *
     * @param index:索引
     * @param value:值
     * @return bool 成功或者失败
     */
    public boolean set(int index, E value) {
        if (index < 0 || index >= size) {
            return false;
        }

        elements[index] = value;
        return true;
    }

}
