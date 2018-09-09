package io.sqm.app.rest.form;

import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class ClaimForm implements Serializable {

    private String shortDescription;
    private String description;
    private String customerLogin;
    private BigDecimal reqMoney;
    private int reqCurrency;
}
