package com.chencj.bos.service.impl;

import com.chencj.bos.domain.Book;
import com.chencj.bos.mapper.IBookMapper;
import com.chencj.bos.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements IBookService {
    @Autowired
    private IBookMapper bookMapper;
    @Override
    public List<Book> selectAll() {
        return bookMapper.selectAll();
    }
}
