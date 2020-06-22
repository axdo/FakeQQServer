package com.fakeqq.service.impl;

import com.fakeqq.dao.CategoryMapper;
import com.fakeqq.model.Category;
import com.fakeqq.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    CategoryMapper categoryMapper;
    @Override
    public List<Category> list() {
        return categoryMapper.list();
    }
}
