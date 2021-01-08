package com.chencj.bos.mapper.base;

import java.util.List;

public interface IBaseMapper<T> {

    //查询
    //T selectOne(T t);

    //List<T> select(T var1);

    List<T> selectAll();

    //int selectCount(T t);

    T selectByPrimaryKey(Object key);

    boolean existsWithPrimaryKey(Object key);

    //插入
    int insert(T t);

    //更新
    int updateByPrimaryKey(T t);

    //删除
    //int delete(T t);

    int deleteByPrimaryKey(Object key);
}
