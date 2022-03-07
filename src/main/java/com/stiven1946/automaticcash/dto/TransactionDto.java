package com.stiven1946.automaticcash.dto;

import java.util.ArrayList;

public class TransactionDto {

    public Integer identifierSystem;
    public Integer referenceNumber;
    public Integer totalPurchase;
    public String directionPurchase;
    public CardDto card;
    public ArrayList amountTransactions;

    public Integer getIdentifierSystem() {
        return identifierSystem;
    }

    public void setIdentifierSystem(Integer identifierSystem) {
        this.identifierSystem = identifierSystem;
    }

    public Integer getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(Integer referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public Integer getTotalPurchase() {
        return totalPurchase;
    }

    public void setTotalPurchase(Integer totalPurchase) {
        this.totalPurchase = totalPurchase;
    }

    public String getDirectionPurchase() {
        return directionPurchase;
    }

    public void setDirectionPurchase(String directionPurchase) {
        this.directionPurchase = directionPurchase;
    }

    public CardDto getCard() {
        return card;
    }

    public void setCard(CardDto card) {
        this.card = card;
    }

    public ArrayList getAmountTransactions() {
        return amountTransactions;
    }

    public void setAmountTransactions(ArrayList amountTransactions) {
        this.amountTransactions = amountTransactions;
    }
}
