package com.zlc.mybatis.demos.service.iml;

import com.zlc.mybatis.demos.entity.xs;
import com.zlc.mybatis.demos.mapper.XsMapper;
import com.zlc.mybatis.demos.service.XsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class xsService implements XsService {

    @Autowired
    private XsMapper xsMapper;

    @Override
    public xs getById(int id) {
        return xsMapper.selectById(id);
    }

    @Override
    public xs deleteById(int id) {
        xsMapper.deleteById(id);
        return xsMapper.selectById(id);
    }

    @Override
    public void insert(xs xs) {
        xsMapper.insert(xs);
    }

    @Override
    public void update(xs xs){
         xsMapper.updateById(xs);

    }

    @Override
    public List<xs> selectAll() {
        return xsMapper.selectList(null);
    }
}
