package io.sqm.app.entity.converter;

import io.sqm.app.entity.Currency;

import javax.persistence.AttributeConverter;

public class CurrencyConverter implements AttributeConverter<Currency, Integer> {

    @Override
    public Integer convertToDatabaseColumn(Currency currency) {
        if (currency != null) {
            return currency.getCurrency();
        } else return null;
    }

    @Override
    public Currency convertToEntityAttribute(Integer code) {
        if (code != null) {
            return Currency.find(code);
        } else return null;
    }
}
