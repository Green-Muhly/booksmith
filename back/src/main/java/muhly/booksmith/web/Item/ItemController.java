package muhly.booksmith.web.Item;

import lombok.RequiredArgsConstructor;
import muhly.booksmith.domain.item.Item;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
public class ItemController {

    private final ItemService itemService;

    @PostMapping("/item/new")
    public ResponseEntity create(@RequestBody @Valid CreateItemRequest request) {
        Item item = new Item();
        item.setName(request.getName());
        item.setPrice(request.getPrice());
        item.setAuthor(request.getAuthor());
        item.setPublisher(request.getPublisher());
        item.setCategories(request.getCategories());
        itemService.saveItem(item);
        return new ResponseEntity("SUCCESS", HttpStatus.ACCEPTED);
    }

    @PostMapping("item/{itemId}/update")
    public ResponseEntity update(@PathVariable("itemId") Long itemId,  @RequestBody @Valid EditItemRequest request) {
        Item item = itemService.findById(itemId);
        itemService.updateItem(itemId, request.getName(), request.getPrice());
        return new ResponseEntity("SUCCESS", HttpStatus.ACCEPTED);
    }

}
