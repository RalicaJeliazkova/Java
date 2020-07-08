package f71917.test1.view;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import f71917.test1.game.Card;
import f71917.test1.game.Countable;
import f71917.test1.game.DeckOfCards;
import f71917.test1.game.Suits;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;

public class GameSceneController {


    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnDealCards;

    @FXML
    private HBox btnSuit;
    @FXML
    private TextArea txtInput;

    private TextArea txtInput2;
    private DeckOfCards deck;
    int[] countSuits;

    private String dealCards() {
        Card[] hand = deck.dealFive(); // there is no time for a new jar and rebuild

        class Count implements Countable {
            @Override
            public String count(Card[] cards) {
                StringBuilder result = new StringBuilder();
                for (int i = 0; i < cards.length; i++) {
                    if (cards[i] != null) {
                        result.append(cards[i].toString()).append('\n');
                    } else {
                        result.append("There is no deal cards").append('\n');
                    }
                }
                return result.toString();
            }
        }
        return deck.countHand(new Count());
    }


    void setCountSuits(Card[] hand) {
    }


    @FXML
    void btnDealCardsOnAcction(ActionEvent event) {

        String input1 = dealCards();
        txtInput.setText(input1);


    }

    @FXML
    void btnSuirOnAction(MouseEvent event) {

        String input2 = countHand();
        txtInput2.setText(input2);
    }

    @FXML
    void txtInput(MouseEvent event) {

    }

    @FXML
    void txtInput2(MouseEvent event) {

    }

    void initialize() {
        deck = new DeckOfCards();
        countSuits = new int[5];
        for (int i = 0; i < 5; i++) {
            countSuits[i] = 0;
        }
    }

    void countSuits(Card[] hand) {
        for (int i = 0; i < 5; i++) {
            if (hand[i].getSuit() == Suits.CLUBS) {
                countSuits[1]++;
            } else if (hand[i].getSuit() == Suits.DIAMONDS) {
                countSuits[2]++;
            } else if (hand[i].getSuit() == Suits.HEARTS) {
                countSuits[3]++;
            } else if (hand[i].getSuit() == Suits.SPADES) {
                countSuits[4]++;
            }
        }
    }


}
