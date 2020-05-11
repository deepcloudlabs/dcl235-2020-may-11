package com.example.banking.domain;

/**
 * @author Binnur Kurt <binnur.kurt@gmail.com>
 */
// Value Object --> Immutable Class
public final class Iban {
    private final String value;

    private Iban(String value) {
        this.value = value;
    }

    public static Iban valueOf(String iban){
        // validation, caching, ...
        if (!isValidIban(iban))
            throw new IllegalArgumentException("This is not a valid iban");
        return new Iban(iban);
    }

    private static boolean isValidIban(String iban) {
        return true;
    }

    public String getValue() {
        return value;
    }
}
