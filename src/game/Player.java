package game;

import equipment.*;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private List<Card> cards;
    private int score;



    //دسته نیروهای مرتبط با هر بازیکن
    private List<EquipmentGroup> equipmentGroups;

    public Player(String name) {
        this.name = name;
        equipmentGroups = new ArrayList<>();
        cards = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }

    public List<EquipmentGroup> getEquipmentGroups() {
        return equipmentGroups;
    }

    public void setEquipmentGroups(List<EquipmentGroup> equipmentGroups) {
        this.equipmentGroups = equipmentGroups;
    }

    public void setAlliedEquipments() {
        //3 daste tank
        for (int i = 0; i < 3; i++) {
            equipmentGroups.add(Tank.initializeGroupForAllied());
        }
        //8 daste pyade nezam
        for (int i = 0; i < 8; i++) {
            equipmentGroups.add(Infantry.initializeGroup());
        }
        //2 daste toop
        for (int i = 0; i < 2; i++) {
            equipmentGroups.add(Artillery.initializeGroup());
        }
    }

    public void setAxisEquipments() {
        //6 daste tank
        for (int i = 0; i < 6; i++) {
            equipmentGroups.add(Tank.initializeGroupForAxis());
        }
        //7 daste pyade nezam
        for (int i = 0; i < 7; i++) {
            equipmentGroups.add(Infantry.initializeGroup());
        }
    }

    public void printAvailableCards(){
        List<Card> cards = getCards();
        for (int i = 0; i < cards.size(); i++) {
            System.out.println(i+1 + "- "+ cards.get(i).getTitle());
        }
    }

    public Card remove(int selectedCard) {
        return cards.remove(selectedCard);
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
