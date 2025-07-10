package walkingcompiler.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CardDto {

    @Id
    private String cardType;
    private String cardLength;
    private String visaCard;
    private String masterCard;

    public static String cardFigures(String number){

        if(number.startsWith("4")){
            return "visaCard";
        }

        if(number.startsWith("5")){
            return "masterCard";
        }

        return "invalid cardFigures";
    }

    public static String cardValidator(String number){

        int cardLength = 16;
        int card = 0;

        for(int cardFigure = 0; cardFigure < cardLength; cardFigure++)

            if(cardFigure <= 16){
                return "This is a valid card";
            }  else {
                return "This is an invalid card";
            }
        return "Try again";
    }


}