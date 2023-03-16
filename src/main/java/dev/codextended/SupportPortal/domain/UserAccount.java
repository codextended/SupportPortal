package dev.codextended.SupportPortal.domain;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String userId;
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private String email;
    private String profileImageUrl;
    private LocalDate lasLoginDate;
    private LocalDate lasLoginDateDisplay;
    private LocalDate joinDate;
    private String[] roles;
    private String[] authorities;
    private boolean isActive;
    private boolean isNotLocked;
}
