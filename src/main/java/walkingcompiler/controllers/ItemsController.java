package walkingcompiler.controllers;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import walkingcompiler.data.models.Items;
import walkingcompiler.dto.ItemsDto;
import walkingcompiler.services.ItemsService;
import walkingcompiler.utils.ItemsMapper;

@RestController("/api")
@RequiredArgsConstructor
public class ItemsController {

    public final ItemsService itemsService;

    @PostMapping("/itemId")
    public ResponseEntity<ItemsDto> itemsId(@RequestBody ItemsDto itemsId) {
        Items i = itemsService.findByItemsId(itemsId.getItemsId());
        return new ResponseEntity<>(ItemsMapper.mapToItemsDto(i), HttpStatus.CREATED);
    }

    @PostMapping("/Items")
    public ResponseEntity<ItemsDto> items(@RequestBody ItemsDto itemsCategory) {
        Items found = ItemsMapper.mapToItems(itemsCategory);
        Items user = itemsService.findItems(String.valueOf(found));
        return new ResponseEntity<>(ItemsMapper.mapToItemsDto(user), HttpStatus.OK);
    }
}
