import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

@Data
//This @Data install all the getters, setters, toString(), Equals, hashcode and canEqual methods if we click install maven
@AllArgsConstructor
//AllArgsConstructor can provide a constructor with all arguments.
public class ProductsDemo {

    @NonNull
    //NonNull provides the code for if condition to check whether the name is present or not.
    private String name;
    private String type;
    private String description;
    private String category;
    private String price;

}
