package daos;

import java.util.List;


public interface ICRUD <T>{
    public abstract Boolean insert(T t);
    public abstract Boolean update(T t);
    public abstract T selectById(Integer id);
    public abstract List<T> selectAll();
    public abstract void delete(Object id);
    public abstract  void close();
}
