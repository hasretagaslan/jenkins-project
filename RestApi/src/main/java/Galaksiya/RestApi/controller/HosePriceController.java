package Galaksiya.RestApi.controller;

import Galaksiya.RestApi.model.HousePrice;

import Galaksiya.RestApi.repository.HouseRepository;
import lombok.Data;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.security.RolesAllowed;
import java.util.List;

@RestController
@RequestMapping(consumes = "application/json; charset=utf-8")
@ResponseBody
@Data
public class HosePriceController {
    private final HouseRepository houseRepository;


    @GetMapping("/findAllHouse")
    @RolesAllowed("admin")
    public List<HousePrice> getHouse() {
        return houseRepository.findAll();
    }

    @GetMapping("/test")
    @RolesAllowed("admin")
    public String test() {
        return "test";
    }

    @PostMapping(path = "/addNewHouse")
    @RolesAllowed("admin")
    public HousePrice createHouse(@RequestBody HousePrice HousePrice) {
        return houseRepository.save(HousePrice);
    }

    @PutMapping("/updateHouse/{id}")
    @RolesAllowed("admin")
    public ResponseEntity<HousePrice> updateHouse(@PathVariable String id, @RequestBody HousePrice house) {
        HousePrice updateHouse = houseRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("House not exist with id: " + id));
        updateHouse.setProperty_Name(house.getProperty_Name());
        updateHouse.setPrice(house.getPrice());
        updateHouse.setHouse_Type(house.getHouse_Type());
        updateHouse.setArea_in_sq_ft(house.getArea_in_sq_ft());
        updateHouse.setNo_of_Bedrooms(house.getNo_of_Bedrooms());
        updateHouse.setNo_of_Bathrooms(house.getNo_of_Bathrooms());
        updateHouse.setNo_of_Receptions(house.getNo_of_Receptions());
        updateHouse.setLocation(house.getLocation());
        updateHouse.setCity_Country(house.getCity_Country());
        updateHouse.setPostal_Code(house.getPostal_Code());
        houseRepository.save(updateHouse);
        return ResponseEntity.ok(updateHouse);
    }
}



