package umg.desarrolloweb.northwind.services.impl;

import org.springframework.stereotype.Service;
import umg.desarrolloweb.northwind.commons.CommonSvcImpl;
import umg.desarrolloweb.northwind.models.Supplier;
import umg.desarrolloweb.northwind.repositories.SupplierRepository;
import umg.desarrolloweb.northwind.services.SupplierSvc;

import java.util.List;

@Service
public class SupplierSvcImpl extends CommonSvcImpl<Supplier, SupplierRepository> implements SupplierSvc {
}

