package com.progressoft.utils.spelling.english;

import com.progressoft.utils.spelling.NumberFamilyHanlder;

import java.math.BigInteger;

public class UpperBoundHandler {

    public final BigInteger upperBound;
    public final NumberFamilyHanlder handler;

    private UpperBoundHandler(BigInteger upperBound, NumberFamilyHanlder handler) {
        this.upperBound = upperBound;
        this.handler = handler;
    }

    public static UpperBoundHandler make(BigInteger upperBound, NumberFamilyHanlder handler) {
        return new UpperBoundHandler(upperBound, handler);
    }

}
