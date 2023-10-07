package umg.desarrolloweb.northwind.services.impl;

import org.springframework.stereotype.Service;
import umg.desarrolloweb.northwind.commons.CommonSvcImpl;
import umg.desarrolloweb.northwind.models.Shipper;
import umg.desarrolloweb.northwind.repositories.ShipperRepository;
import umg.desarrolloweb.northwind.services.ShipperSvc;

@Service
public class ShipperSvcImpl extends CommonSvcImpl<Shipper, ShipperRepository> implements ShipperSvc {
}

