package muhly.booksmith.web.Item;

import lombok.RequiredArgsConstructor;
import muhly.booksmith.domain.item.Category;
import muhly.booksmith.domain.item.Item;
import muhly.booksmith.domain.item.ItemRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class ItemService {

    private final ItemRepository itemRepository;

    @Transactional
    public void saveItem(Item item) {
        itemRepository.save(item);
    }

    @Transactional
    public void updateItem(Long itemId, String name, int price) {
        Item findItem = itemRepository.findById(itemId);
        findItem.setPrice(price);
        findItem.setName(name);
    }

    public List<Item> findItems() {
        return itemRepository.findAll();
    }

    public Item findById(Long itemId) {
        return itemRepository.findById(itemId);
    }

    public void deleteById(Long itemId) {
        itemRepository.deleteById(itemId);
    }
}
