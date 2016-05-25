package com.gonet.repository

import org.springframework.data.repository.CrudRepository
import com.gonet.model.Category

interface CategoryRepository extends CrudRepository<Category,Long> {
}
