package ziz.org.ecommerce.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor @AllArgsConstructor @Data
public class Products {
    private String pname;
    private String description;
    private String price;
    private String image;
    private String category;
    private String pid;
    private String date;
    private String time;
}
