package com.challengers.auth.controller;

import com.challengers.auth.dto.AuthDto;
import com.challengers.auth.dto.LogInRequest;
import com.challengers.auth.dto.TokenDto;
import com.challengers.auth.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
public class AuthController {
    private final AuthService authService;

    @PostMapping("/api/signup")
    public ResponseEntity<String> signUp(@Valid @RequestBody AuthDto authDto){
        return authService.signUp(authDto);
    }

    @PostMapping("/api/signin")
    public ResponseEntity<TokenDto> signIn(@Valid @RequestBody LogInRequest logInRequest){
        return authService.signIn(logInRequest);
    }
}
