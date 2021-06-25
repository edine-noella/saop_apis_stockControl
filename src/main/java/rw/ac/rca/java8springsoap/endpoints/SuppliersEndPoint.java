package rw.ac.rca.java8springsoap.endpoints;

import jaxb.classes.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import rw.ac.rca.java8springsoap.repositories.SupplierRepository;
import rw.ac.rca.java8springsoap.models.Supplier;

import java.util.List;
import java.util.Optional;

@Endpoint
public class SuppliersEndPoint {
    private final SupplierRepository supplierRepository;

    @Autowired
    public SuppliersEndPoint(SupplierRepository repository) {
        this.supplierRepository = repository;
    }

    @PayloadRoot(namespace = "https://rca.ac.rw/Edine-noella/soap-app", localPart = "NewSupplierDTORequest")
    @ResponsePayload
    public NewSupplierDTOResponse create(@RequestPayload NewSupplierDTOResponse dto) {
    	jaxb.classes.Supplier __supplier = dto.getSupplier();

        Supplier _supplier = new Supplier(__supplier.getNames(), __supplier.getEmail(), __supplier.getMobile());

        Supplier supplier = supplierRepository.save(_supplier);

        NewSupplierDTOResponse response = new NewSupplierDTOResponse();

        __supplier.setId(supplier.getId());

        response.setSupplier(__supplier);

        return response;
    }

    @PayloadRoot(namespace = "https://rca.ac.rw/Edine-noella/soap-app", localPart = "GetAllSuppliersRequest")
    @ResponsePayload
    public GetAllSuppliersResponse findAll(@RequestPayload GetAllSuppliersRequest request){

        List<Supplier> suppliers = supplierRepository.findAll();

        GetAllSuppliersResponse response = new GetAllSuppliersResponse();

        for (Supplier supplier: suppliers){
        	jaxb.classes.Supplier _supplier = mapsupplier(supplier);

            response.getSupplier().add(_supplier);
        }

        return response;
    }

    @PayloadRoot(namespace = "https://rca.ac.rw/Edine-noella/soap-app", localPart = "GetSupplierDetailsRequest")
    @ResponsePayload
    public GetSupplierDetailsResponse findById(@RequestPayload GetSupplierDetailsRequest request){
        Optional<Supplier> _supplier = supplierRepository.findById(request.getId());

        if(!_supplier.isPresent())
            return new GetSupplierDetailsResponse();

        Supplier supplier = _supplier.get();

        GetSupplierDetailsResponse response = new GetSupplierDetailsResponse();

        jaxb.classes.Supplier __supplier = mapsupplier(supplier);

       response.setSupplier(__supplier);

       return response;
    }

    @PayloadRoot(namespace = "https://rca.ac.rw/Edine-noella/soap-app", localPart = "DeleteSupplierRequest")
    @ResponsePayload
    public DeleteSupplierResponse delete(@RequestPayload DeleteSupplierRequest request){
        supplierRepository.deleteById(request.getId());
        DeleteSupplierResponse response = new DeleteSupplierResponse();
        response.setMessage("Successfully deleted a message");
        return response;
    }

    @PayloadRoot(namespace = "https://rca.ac.rw/Edine-noella/soap-app", localPart = "UpdateSupplierRequest")
    @ResponsePayload
    public UpdateSupplierResponse update(@RequestPayload UpdateSupplierRequest request){
    	jaxb.classes.Supplier __supplier = request.getSupplier();

        Supplier _supplier = new Supplier(__supplier.getNames(), __supplier.getEmail(), __supplier.getMobile());
        _supplier.setId(__supplier.getId());

        Supplier supplier = supplierRepository.save(_supplier);

        UpdateSupplierResponse supplierDTO = new UpdateSupplierResponse();

        __supplier.setId(supplier.getId());

        supplierDTO.setSupplier(__supplier);

        return supplierDTO;
    }

    private jaxb.classes.Supplier mapsupplier(Supplier supplier){
    	jaxb.classes.Supplier _supplier = new jaxb.classes.Supplier();
        _supplier.setId(supplier.getId());
        _supplier.setNames(supplier.getNames());
        _supplier.setEmail(supplier.getEmail());
        _supplier.setMobile(supplier.getMobile());

        return _supplier;
    }
}
