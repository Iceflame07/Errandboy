package walkingcompiler.controllers;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import walkingcompiler.data.models.Card;
import walkingcompiler.data.models.CardDto;
import walkingcompiler.services.CardService;
import walkingcompiler.utils.CardMapper;

@RestController("/api")
@RequiredArgsConstructor
public class CardController {

    private final CardService cardService;

    @PostMapping("/atm")
    public ResponseEntity<CardDto> atm(@RequestBody CardDto atm) {
        Card atmCard = cardService.findByCardLength(String.valueOf(atm));
        return new ResponseEntity<>(CardMapper.mapToCardDto(atmCard), HttpStatus.CREATED);
    }

    @PostMapping("/type")
    public ResponseEntity<CardDto> type(@RequestBody Card type) {
        Card found = cardService.findByCardType(type);
        Card holder = CardMapper.mapToCard(found);
        return new ResponseEntity<>(CardMapper.mapToCardDto(found), HttpStatus.OK);
    }
}
