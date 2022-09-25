package com.MiRedSalud.backend.entities;

import java.util.List;
import javax.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Usuario {
    @Id
    @Column(nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private int edad;

    @Column(nullable = false, unique = true)
    private String email;

    @Getter(value = AccessLevel.NONE)
    @Column(nullable = false)
    private String password;

    @Column(nullable= false)
    private boolean enable;
    
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinColumn(nullable = false)
    private List<Enfermedad> enfermedades;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(nullable = false)
    private List<Familiar> familia;

    public boolean checkPassword(String password){
        return this.password.equals(password);
    }



}
