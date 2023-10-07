package umg.desarrolloweb.northwind.services.impl;

import org.springframework.stereotype.Service;
import umg.desarrolloweb.northwind.commons.CommonSvcImpl;
import umg.desarrolloweb.northwind.models.Category;
import umg.desarrolloweb.northwind.repositories.CategoryRepository;
import umg.desarrolloweb.northwind.services.CategorySvc;

@Service
public class CategorySvcImpl extends CommonSvcImpl<Category, CategoryRepository> implements CategorySvc {
}

