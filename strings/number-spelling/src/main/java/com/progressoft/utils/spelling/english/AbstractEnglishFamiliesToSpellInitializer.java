package com.progressoft.utils.spelling.english;

import com.progressoft.utils.spelling.Constants;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public abstract class AbstractEnglishFamiliesToSpellInitializer {

    public static final BigInteger TEN = BigInteger.valueOf(10L);
    public static final BigInteger HUNDRED = BigInteger.valueOf(100);
    public static final BigInteger THOUSAND = BigInteger.valueOf(1000L);
    public static final BigInteger MILLION = BigInteger.valueOf(1_000_000L);

    private List<UpperBoundHandler> list;

    public AbstractEnglishFamiliesToSpellInitializer(List<String> families) {
        this.list = new LinkedList<>();
        fillFamiliesHandlersList(families);
    }

    public List<UpperBoundHandler> initializedList() {
        return new ArrayList<>(list);
    }

    private void fillFamiliesHandlersList(List<String> families) {
        addNotPatternedFamilies();
        addPatternedFamilies(families);
    }

    private void addPatternedFamilies(List<String> families) {
        BigInteger base = MILLION;
        for (String family : families) {
            final BigInteger toDiv = base.divide(THOUSAND);
            list.add(UpperBoundHandler.make(base, (number) -> spellPositionalNumber(number, toDiv, family)));
            base = base.multiply(THOUSAND);
        }
    }

    private void addNotPatternedFamilies() {
        list.add(UpperBoundHandler.make(HUNDRED, (number) -> Constants.SPELLED_NUMBER.get(number.divide(TEN).multiply(TEN)) + "-" + Constants.SPELLED_NUMBER.get(number.mod(TEN))));
        list.add(UpperBoundHandler.make(THOUSAND, (number) -> spellPositionalNumber(number, HUNDRED, "hundred")));
    }

    protected abstract String spellPositionalNumber(BigInteger number, BigInteger position, String family);

}
