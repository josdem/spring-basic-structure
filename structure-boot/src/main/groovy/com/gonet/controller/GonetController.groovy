package com.gonet.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class GonetController {

  @RequestMapping("/")
  String index(){
    'Hello from Gonet!'
  }

}
