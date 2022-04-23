package com.example.demo.controller;

import com.example.demo.model.Pen;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class PenController {

    ArrayList<Pen> penArrayList=new ArrayList<>();

    //1. Create => Add

    @RequestMapping("/add_pen")
    public String add(){
        Pen pen=new Pen("Reynolds",10,"Gel Pen");
        penArrayList.add(pen);
        return "pen added successfully";
    }


    //2. Read => Get

    @RequestMapping("/get_pen")
    public ArrayList<Pen> getPenArrayList() {
        return penArrayList;
    }


    //3. Update

    @RequestMapping("/pen_updated")
    public String update(){
        penArrayList.get(1).setType("BallPoint");
        return "pen updated successfully";
    }

    //4. Delete

    @RequestMapping("/delete_pen")
    public String delete(){
        penArrayList.remove(1);
        return "pen deleted successfully";
    }
}
