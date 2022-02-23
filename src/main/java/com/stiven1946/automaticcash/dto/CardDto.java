package com.stiven1946.automaticcash.dto;

public class CardDto {

    public Integer cardNumber;
    public String cardType; // Credit or Debit
    public Integer identifierSystem;
    public Integer numberValidation;
    public Integer condition;

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
}
