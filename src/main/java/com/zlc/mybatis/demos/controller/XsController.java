package com.zlc.mybatis.demos.controller;


import com.zlc.mybatis.demos.entity.xs;
import com.zlc.mybatis.demos.service.XsService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("crud")
public class XsController {
    @Autowired
    private XsService xsService;

    @GetMapping
    public List<xs> selectAll() {
        System.out.println(666);
        return xsService.selectAll();
    }
    @DeleteMapping("/delete/{id}")
    public  void delete(@PathVariable int id)  {
        xsService.deleteById(id);
        System.out.println("删除成功！");
    }
    @GetMapping("/delete/{id}")
    public  void delete1(int id)  {
        xsService.deleteById(id);
        System.out.println("删除成功！");
    }

    @PostMapping("/insert")
    public void add(@RequestBody xs xs){
        xsService.insert(xs);
        System.out.println("添加成功！");
    }

    @GetMapping("/selectById/{id}")
    public xs selectById(@PathVariable int id){
        return  xsService.getById(id);
    }

    @PostMapping("/update")
    public  void update(@RequestBody xs xs){
        xsService.update(xs);
    }



}
