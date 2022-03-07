package com.stiven1946.automaticcash.dto;

import java.util.ArrayList;

public class CardDto {

    public Integer cardNumber;
    public String cardType; // Credit or Debit
    public Integer identifierSystem;
    public Integer numberValidation;
    public Integer condition;
    public UserDto user;
    public ArrayList quantityCards;

    public Integer getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(Integer cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public Integer getIdentifierSystem() {
        return identifierSystem;
    }

    public void setIdentifierSystem(Integer identifierSystem) {
        this.identifierSystem = identifierSystem;
    }

    public Integer getNumberValidation() {
        return numberValidation;
    }

    public void setNumberValidation(Integer numberValidation) {
        this.numberValidation = numberValidation;
    }

    public Integer getCondition() {
        return condition;
    }

    public void setCondition(Integer condition) {
        this.condition = condition;
    }

    public UserDto getUser() {
        return user;
    }

    public void setUser(UserDto user) {
        this.user = user;
    }

    public ArrayList getQuantityCards() {
        return quantityCards;
    }

    public void setQuantityCards(ArrayList quantityCards) {
        this.quantityCards = quantityCards;
    }
}
