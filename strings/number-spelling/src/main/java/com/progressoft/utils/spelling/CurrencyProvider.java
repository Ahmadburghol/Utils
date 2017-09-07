package com.progressoft.utils.spelling;

public interface CurrencyProvider {

    String integerPart(String number);
    String fractionPart(String number);
    int fractionsLength();

}
