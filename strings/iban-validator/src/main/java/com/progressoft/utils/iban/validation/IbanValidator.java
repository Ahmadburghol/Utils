package com.progressoft.utils.iban.validation;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import static java.util.Objects.*;

/**
 * Created by Ahmad AbuLaban on 10/5/17.
 */
public class IbanValidator {

    private static final Map<String, Integer> COUNTRIES_IBAN_LENGTHS = new HashMap<String, Integer>() {
        {
            put("JO", 30);
        }
    };

    public boolean isValidIban(String iban) {
        if (isNull(iban))
            throw new InvalidIbanException();
        iban = iban.replace(" ", "").toUpperCase();
        if (iban.isEmpty() || iban.length() < 2)
            return false;
        if (wrongIbanSpecification(iban))
            return false;
        if (new BigDecimal(decodeIban(iban)).remainder(BigDecimal.valueOf(97)).intValue() == 1)
            return true;
        return false;
    }

    private boolean wrongIbanSpecification(String iban) {
        String countryCode = iban.substring(0, 2);
        if(!COUNTRIES_IBAN_LENGTHS.containsKey(countryCode))
            return false;
        return iban.length() != COUNTRIES_IBAN_LENGTHS.get(countryCode);
    }

    private String decodeIban(String iban) {
        StringBuilder decodedIban = new StringBuilder();
        for(char character : rearrangeIban(iban).toCharArray()) {
            if (!Character.isLetter(character))
                decodedIban.append(character);
            else
                decodedIban.append(String.valueOf((character - 'A') + 10));
        }
        return decodedIban.toString();
    }

    private String rearrangeIban(String iban) {
        String firstFourCharacters = iban.substring(0, 4);
        return iban.substring(4) + firstFourCharacters;
    }

    public static class InvalidIbanException extends RuntimeException {
    }
}
