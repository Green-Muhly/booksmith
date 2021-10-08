package muhly.booksmith.web.Item;

import lombok.RequiredArgsConstructor;
import muhly.booksmith.domain.item.Item;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
        item.setCategory(request.getCategory());
        itemService.saveItem(item);
        Long id = item.getId();
        return new ResponseEntity("SUCCESS" + id, HttpStatus.ACCEPTED);
    }

    @PostMapping("item/{itemId}/update")
    public ResponseEntity update(@PathVariable("itemId") Long itemId, @RequestBody @Valid EditItemRequest request) {
        Item item = itemService.findById(itemId);
        itemService.updateItem(itemId, request.getName(), request.getPrice());
        return new ResponseEntity("SUCCESS", HttpStatus.ACCEPTED);
    }

    @DeleteMapping("item/{itemId}/delete")
    public ResponseEntity delete(@PathVariable("itemId") Long itemId) {
        itemService.deleteById(itemId);
        return new ResponseEntity("SUCCESS", HttpStatus.OK);
    }
}
