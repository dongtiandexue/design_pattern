package demo1;

/**
 * 迭代器接口
 * 定义迭代顺序
 */
public interface Iterator {

    /**
     * 获取迭代顺序的第一个元素
     * @return
     */
    Object first();

    /**
     * 获取迭代顺序的最后一个元素
     * @return
     */
    Object last();

    /**
     * 获取迭代顺序的下一个元素
     * @return
     */
    Object next();

    /**
     * 判断是否还有下一个元素
     * @return
     */
    Boolean hasNext();
}
