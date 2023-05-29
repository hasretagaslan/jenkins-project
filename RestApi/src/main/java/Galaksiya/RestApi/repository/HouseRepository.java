package Galaksiya.RestApi.repository;

import Galaksiya.RestApi.model.HousePrice;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface HouseRepository extends MongoRepository<HousePrice,String> {
}


