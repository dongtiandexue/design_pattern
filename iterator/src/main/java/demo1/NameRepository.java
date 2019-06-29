package demo1;

import java.util.List;

/**
 * @ClassName NameRepository
 * @Description 包含一组name的数据集
 * @Date 2019/6/29 14:40
 * @Version 1.0
 **/
public class NameRepository implements Container {

    public List<String> names = null;

    public NameRepository(List<String> names) {
        this.names = names;
    }

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    /**
     * 使用内部类的方式
     */
    private class NameIterator implements Iterator {

        int index;

        @Override
        public Object first() {
            return names.get(0);
        }

        @Override
        public Object last() {
            return names.get(names.size() - 1);
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return names.get(index++);
            }
            return null;
        }

        @Override
        public Boolean hasNext() {
            if (index < names.size()) {
                return true;
            }
            return false;
        }
    }
}
