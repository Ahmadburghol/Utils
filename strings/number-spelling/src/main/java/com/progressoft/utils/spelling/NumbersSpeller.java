package com.progressoft.utils.spelling;

import java.math.BigDecimal;


public interface NumbersSpeller {
    String SPACE = " ";

    String spell(BigDecimal number);

    class InvalidFractionsForProvidedCurrencyException extends RuntimeException{
    }
}
