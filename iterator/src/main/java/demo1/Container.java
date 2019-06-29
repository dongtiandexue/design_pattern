package demo1;

/**
 * 通用接口用于获取迭代器对象
 */
public interface Container {

    /**
     * 获取迭代器对象
     * @return
     */
    Iterator getIterator();
}
