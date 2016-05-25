package com.gonet.services

import com.gonet.model.Category
import com.gonet.model.Beverage

interface BeverageService {
  List<Category> categories()
}
