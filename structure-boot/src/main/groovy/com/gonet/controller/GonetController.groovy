package com.gonet.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController
import org.springframework.beans.factory.annotation.Autowired

import com.gonet.services.BeverageService

@RestController
class GonetController {

  @Autowired
  BeverageService beverageService

  @RequestMapping("/")
  @ResponseBody
  List<Category> index(){
    beverageService.categories()
  }

}
