package umg.desarrolloweb.northwind.controllers;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import umg.desarrolloweb.northwind.commons.CommonController;
import umg.desarrolloweb.northwind.models.Category;
import umg.desarrolloweb.northwind.services.CategorySvc;

@Api
@RestController
@RequestMapping("/categories")
public class CategoryController extends CommonController<Category, CategorySvc> {
}

