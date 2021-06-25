package rw.ac.rca.java8springsoap.endpoints;

import jaxb.classes.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import rw.ac.rca.java8springsoap.repositories.ItemRepository;
import rw.ac.rca.java8springsoap.models.Item;

import java.util.List;
import java.util.Optional;

@Endpoint
public class ItemsEndPoint {
    private final ItemRepository itemRepository;

    @Autowired
    public ItemsEndPoint(ItemRepository repository) {
        this.itemRepository = repository;
    }

    @PayloadRoot(namespace = "https://rca.ac.rw/Edine-noella/soap-app", localPart = "NewItemDTORequest")
    @ResponsePayload
    public NewItemDTOResponse create(@RequestPayload NewItemDTORequest dto) {
        jaxb.classes.Item __item = dto.getItem();

        rw.ac.rca.java8springsoap.models.Item _item = new rw.ac.rca.java8springsoap.models.Item(__item.getName(),
        		__item.getItemCode(),  __item.getStatus(), __item.getPrice(), __item.getSupplier());
        
        Item item = itemRepository.save(_item);

        NewItemDTOResponse response = new NewItemDTOResponse();

        __item.setId(item.getId());

        response.setItem(__item);

        return response;
    }

    @PayloadRoot(namespace = "https://rca.ac.rw/Edine-noella/soap-app", localPart = "GetAllItemsRequest")
    @ResponsePayload
    public GetAllItemsResponse findAll(@RequestPayload GetAllItemsRequest request){

        List<Item> items = itemRepository.findAll();

        GetAllItemsResponse response = new GetAllItemsResponse();

        for (Item item: items){
            jaxb.classes.Item _item = mapItem(item);

            response.getItem().add(_item);
        }

        return response;
    }

    @PayloadRoot(namespace = "https://rca.ac.rw/Edine-noella/soap-app", localPart = "GetItemDetailsRequest")
    @ResponsePayload
    public Object findById(@RequestPayload GetItemDetailsRequest request){
        Optional<Item> _item = itemRepository.findById(request.getId());

        if(!_item.isPresent())
            return new GetItemDetailsRequest();

        Item item = _item.get();

        GetItemDetailsResponse response = new GetItemDetailsResponse();

        jaxb.classes.Item __item = mapItem(item);

        response.setItem(__item);

        return response;
    }

    @PayloadRoot(namespace = "https://rca.ac.rw/Edine-noella/soap-app", localPart = "DeleteItemRequest")
    @ResponsePayload
    public DeleteItemResponse delete(@RequestPayload DeleteItemRequest request){
        itemRepository.deleteById(request.getId());
        DeleteItemResponse response = new DeleteItemResponse();
        response.setMessage("Successfully deleted a message");
        return response;
    }


    @PayloadRoot(namespace = "https://rca.ac.rw/Edine-noella/soap-app", localPart = "UpdateItemRequest")
    @ResponsePayload
    public UpdateItemResponse update(@RequestPayload UpdateItemResponse request){
        jaxb.classes.Item __item = request.getItem();

        Item _item = new Item(__item.getName(), __item.getItemCode(),__item.getStatus(),__item.getPrice(),__item.getSupplier());
        _item.setId(__item.getId());

        Item item = itemRepository.save(_item);

        UpdateItemResponse itemDTO = new UpdateItemResponse();

        __item.setId(item.getId());

        itemDTO.setItem(__item);

        return itemDTO;
    }

    private jaxb.classes.Item mapItem(Item item){
    	jaxb.classes.Item _item = new jaxb.classes.Item();
        _item.setId(item.getId());
        _item.setItemCode(item.getItemCode());
        _item.setName(item.getName());
        _item.setStatus(item.getStatus());
        _item.setPrice(item.getPrice());
        _item.setSupplier(item.getSupplier());

        return _item;
    }
}
