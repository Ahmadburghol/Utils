package com.progressoft.utils.iban.validation;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Ahmad AbuLaban on 10/5/17.
 */
public class IbanValidatorTest {

    private IbanValidator ibanValidator;

    @Before
    public void setup(){
        ibanValidator=new IbanValidator();
    }

    @Test(expected = IbanValidator.InvalidIbanException.class)
    public void givenIbanValidator_whenCallingIsValidIbanWithNullIban_thenShouldThrowException(){
        ibanValidator.isValidIban(null);
    }

    @Test
    public void givenIbanValidator_whenCallingIsValidIbanWithEmptyIban_thenShouldReturnFalse(){
        Assert.assertFalse(ibanValidator.isValidIban(""));
    }

    @Test
    public void givenIbanValidator_whenCallingIsValidIbanWithJordanianIbanThatHasInvalidLength_thenShouldReturnFalse(){
        Assert.assertFalse(ibanValidator.isValidIban("JO94CBJO0010000000000131"));
    }

    @Test
    public void givenIbanValidator_whenCallingIsValidIbanWithValidJordanianIban_thenShouldReturnTrue(){
        Assert.assertTrue(ibanValidator.isValidIban("JO94CBJO0010000000000131000302"));
    }

    @Test
    public void givenIbanValidator_whenCallingIsValidIbanWithValidJordanianIbanStartWithSpaces_thenShouldReturnTrue(){
        Assert.assertTrue(ibanValidator.isValidIban("   JO94CBJO0010000000000131000302"));
    }

    @Test
    public void givenIbanValidator_whenCallingIsValidIbanWithValidJordanianIbanContainSpaces_thenShouldReturnTrue(){
        Assert.assertTrue(ibanValidator.isValidIban("JO94 CBJO 0010 0000 0000 0131 0003 02"));
    }

    @Test
    public void givenIbanValidator_whenCallingIsValidIbanWithValidLowerCaseJordanianIban_thenShouldReturnTrue(){
        Assert.assertTrue(ibanValidator.isValidIban("jo94cbjo0010000000000131000302"));
    }

    @Test
    public void givenIbanValidator_whenCallingIsValidIbanWithInvalidJordanianIban_thenShouldReturnFalse(){
        Assert.assertFalse(ibanValidator.isValidIban("JO94CBJO00100000AHMAD131000302"));
    }


}
