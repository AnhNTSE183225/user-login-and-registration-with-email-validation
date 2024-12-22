package com.theanh.booknetwork.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "t_token")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Token {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    String token;

    LocalDateTime createdAt;

    LocalDateTime expiresAt;

    LocalDateTime validatedAt;

    @ManyToOne
    User user;
}
