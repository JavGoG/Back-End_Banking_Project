package com.javier.cc.bank.models;

import javax.persistence.*;

@Embeddable
public enum TypeAccount{


    SAVINGS, MARKET, BROKERAGE;
}
