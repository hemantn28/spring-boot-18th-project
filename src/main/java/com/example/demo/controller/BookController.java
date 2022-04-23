package com.example.demo.controller;

import com.example.demo.model.Book;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class BookController {

    ArrayList<Book> bookArrayList=new ArrayList<>();

    //1. Create => Add

    @RequestMapping("/add_book")
    public String add(){
        Book book=new Book("Swami Vivekanand",146,"Narendra Kohli");
        bookArrayList.add(book);
        return "book added successfully ";
    }

    //2. Read => Get

    @RequestMapping("/get_book")
    public ArrayList<Book> getBookArrayList() {
        return bookArrayList;
    }


    //3. Update

    @RequestMapping("/update_book")
    public String update(){
        bookArrayList.get(1).setPrice(200);
        return "price updated successfully";
    }

    //4. Delete

    @RequestMapping("/delete_book")
    public String delete(){
        bookArrayList.remove(0);
        return "book deleted successfully";
    }
}
