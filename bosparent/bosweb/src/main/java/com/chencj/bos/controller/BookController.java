package com.chencj.bos.controller;

import com.chencj.bos.domain.Book;
import com.chencj.bos.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@ResponseBody
@RequestMapping("book/")
public class BookController {
    @Autowired
    private IBookService bookService;

    @RequestMapping("all")
    public List<Book> selectAll(){
        return bookService.selectAll();
    }
}
