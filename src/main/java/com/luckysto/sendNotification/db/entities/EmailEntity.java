package com.luckysto.sendNotification.db.entities;

import com.luckysto.sendNotification.enumtype.MainCategory;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "email")
public class EmailEntity extends BaseTimeEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "toEmail", nullable = false)
    private String toEmail;


}

