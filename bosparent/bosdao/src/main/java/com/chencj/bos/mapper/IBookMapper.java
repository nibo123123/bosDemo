package com.chencj.bos.mapper;

import com.chencj.bos.domain.Book;

import java.util.List;

public interface IBookMapper{
    List<Book> selectAll();

    Book selectByPrimaryKey(Object key);

    boolean existsWithPrimaryKey(Object key);

    //插入
    int insert(Book t);

    //更新
    int updateByPrimaryKey(Book t);

    //删除
    //int delete(T t);

    int deleteByPrimaryKey(Object key);
}
