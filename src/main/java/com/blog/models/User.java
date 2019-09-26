/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blog.models;

import java.time.LocalDateTime;
import javax.validation.constraints.NotEmpty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;


/**
 *
 * @author eduardo.lopes
 */
@RequiredArgsConstructor
@EqualsAndHashCode
public class User {
    
    @Getter @Setter
    private Long id;
    
    @NotEmpty
    @Getter @Setter
    private String userName;
    
    @NotEmpty
    @Getter @Setter
    private String email;
    
    @NotEmpty
    @Getter @Setter
    private String password;
    
    @NotEmpty
    @Getter @Setter
    private String firstName;
    
    @NotEmpty
    @Getter @Setter
    private String lastName;
    
    @DateTimeFormat
    private LocalDateTime dateRegister;
    
    @DateTimeFormat
    private LocalDateTime dateUpdate;
    
    @NotEmpty
    @Getter @Setter
    private Long zipCode;
    
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @NotEmpty
    @Getter @Setter
    private LocalDateTime birthday;
    
    @Getter @Setter
    private String description;
}
