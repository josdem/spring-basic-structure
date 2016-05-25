package com.gonet.services.impl

import org.springframework.stereotype.Service
import org.springframework.beans.factory.annotation.Autowired

import com.gonet.services.BeverageService
import com.gonet.repository.CategoryRepository
import com.gonet.model.Category

@Service
class BeverageServiceImpl implements BeverageService {

  @Autowired
  CategoryRepository categoryRepository

  List<Category> categories(){
    categoryRepository.findAll()
  }

}
