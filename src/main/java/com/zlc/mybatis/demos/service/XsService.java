package com.zlc.mybatis.demos.service;


import com.zlc.mybatis.demos.entity.xs;

import java.util.List;

/**
 * @author kiss
 */

public interface XsService  {
   xs getById(int id);
   xs deleteById(int id);
   void insert(xs xs);
   void update(xs xs);
    List<xs> selectAll();
}
