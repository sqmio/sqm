package io.sqm.app.entity;

import io.sqm.app.entity.converter.CurrencyConverter;
import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "claim")
public class Claim {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "claim_id_seq")
    @SequenceGenerator(name = "claim_id_seq", sequenceName = "seq_clm", allocationSize = 1, initialValue = 50)
    @Access(AccessType.PROPERTY)
    private Long id;

    @Column(name = "short_description")
    private String shortDescription;

    @Column(name = "description", columnDefinition = "text")
    private String description;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private User customer;

    @ManyToOne
    @JoinColumn(name = "status_id")
    private ClaimStatus status;

    @Column(name = "req_money")
    private BigDecimal reqMoney;

    @Convert(converter = CurrencyConverter.class)
    @Column(name = "req_currency")
    private Currency reqCurrency;

    @ManyToOne
    @JoinColumn(name = "assigned_group_id")
    private Group assignedGroup;
}
