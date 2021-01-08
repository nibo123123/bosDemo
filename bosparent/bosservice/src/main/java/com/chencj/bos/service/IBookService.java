package com.chencj.bos.service;

import com.chencj.bos.domain.Book;

import java.util.List;

public interface IBookService {
    List<Book> selectAll();
}
