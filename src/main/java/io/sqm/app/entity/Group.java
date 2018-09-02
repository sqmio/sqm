package io.sqm.app.entity;

import lombok.*;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "groups")
public class Group {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "groups_id_seq")
    @SequenceGenerator(name = "groups_id_seq", sequenceName = "seq_groups", allocationSize = 1, initialValue = 50)
    @Access(AccessType.PROPERTY)
    private Long id;

    @Column(name = "name", unique = true)
    private String name;
}
