package ziz.org.ecommerce.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
public class Users {

    private String name;
    private String phone;
    private String password;
    private String image;
    private String addresse;

    public Users(String name, String phone, String image, String addresse) {
        this.name = name;
        this.phone = phone;
        this.image = image;
        this.addresse = addresse;
    }

    public Users(String name, String phone, String addresse) {
        this.name = name;
        this.phone = phone;
        this.image = image;
        this.addresse = addresse;
    }
}
