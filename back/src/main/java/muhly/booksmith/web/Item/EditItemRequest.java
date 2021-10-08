package muhly.booksmith.web.Item;

import lombok.Getter;
import muhly.booksmith.domain.item.Item;

@Getter
public class EditItemRequest {
    private String name;
    private int Price;

}
