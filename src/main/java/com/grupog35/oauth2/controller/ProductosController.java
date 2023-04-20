package com.grupog35.oauth2.controller;


import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ProductosController {

    @GetMapping("/productos")
    public OAuth2User obtener(@AuthenticationPrincipal OAuth2User user){
        return user;
    }
}
