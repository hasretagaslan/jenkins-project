package Galaksiya.RestApi.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "test")
public class HousePrice {
    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public void setProperty_Name(String property_Name) {
        Property_Name = property_Name;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public void setHouse_Type(String house_Type) {
        House_Type = house_Type;
    }

    public void setArea_in_sq_ft(String area_in_sq_ft) {
        Area_in_sq_ft = area_in_sq_ft;
    }

    public void setNo_of_Bedrooms(String no_of_Bedrooms) {
        No_of_Bedrooms = no_of_Bedrooms;
    }

    public void setNo_of_Bathrooms(String no_of_Bathrooms) {
        No_of_Bathrooms = no_of_Bathrooms;
    }

    public void setNo_of_Receptions(String no_of_Receptions) {
        No_of_Receptions = no_of_Receptions;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public void setCity_Country(String city_Country) {
        City_Country = city_Country;
    }

    public void setPostal_Code(String postal_Code) {
        this.postal_Code = postal_Code;
    }

    public String getProperty_Name() {
        return Property_Name;
    }

    public String getPrice() {
        return Price;
    }

    public String getHouse_Type() {
        return House_Type;
    }

    public String getArea_in_sq_ft() {
        return Area_in_sq_ft;
    }

    public String getNo_of_Bedrooms() {
        return No_of_Bedrooms;
    }

    public String getNo_of_Bathrooms() {
        return No_of_Bathrooms;
    }

    public String getNo_of_Receptions() {
        return No_of_Receptions;
    }

    public String getLocation() {
        return Location;
    }

    public String getCity_Country() {
        return City_Country;
    }

    public String getPostal_Code() {
        return postal_Code;
    }

    @Id
    private ObjectId id;
    private String Property_Name;
    private String Price;
    private String House_Type;
    private String Area_in_sq_ft;
    private String No_of_Bedrooms;
    private String No_of_Bathrooms;
    private String No_of_Receptions;
    private String Location;
    private String City_Country;
    private String postal_Code;
}

