package muhly.booksmith.web.Item;

import lombok.Getter;
import muhly.booksmith.domain.item.Category;

import java.util.List;

@Getter
public class CreateItemRequest {
    private Long id;

    private String name;
    private String author;
    private String publisher;
    private int price;
    private Category category;
}
