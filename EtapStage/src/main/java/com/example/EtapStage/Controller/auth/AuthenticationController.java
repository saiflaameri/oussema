package com.example.EtapStage.Controller.auth;


import com.example.EtapStage.Security.JwtService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin(origins ="http://localhost:4200")

@RequiredArgsConstructor
public class AuthenticationController {

    private final AuthentificationService service;
    private final JwtService jwtService;

    @PostMapping("/register")
    public ResponseEntity<AuthenticationResponse> register(
            @RequestBody RegisterRequest request
    ){
       return ResponseEntity.ok(service.register(request));
    }


    @PostMapping("/authenticate")
    public ResponseEntity<?> authenticate(
            @RequestBody AuthenticationRequest request
    ){
        try {
            return ResponseEntity.ok(service.authenticate(request));
        } catch (Exception e) {
            return ResponseEntity.status(403).body("Invalid email or password");
        }
    }
    @GetMapping("/getnom")
    public ResponseEntity<String> getNom(@RequestHeader("Authorization") String authHeader) {
        try {
            String token = authHeader.substring(7); // Remove "Bearer " prefix
            String nom = jwtService.extractUsername(token); // Assuming this method extracts the name
            return ResponseEntity.ok(nom); // Ensure the response is a plain text string or JSON
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.FORBIDDEN).body("Error extracting nom from token");
        }
    }
    @GetMapping("/getimage")
    public ResponseEntity<?> getImage(@RequestHeader("Authorization") String authHeader) {
        try {
            String token = authHeader.substring(7); // Remove "Bearer " prefix
            String image = jwtService.extractUsername(token);

            return ResponseEntity.ok(image);
        } catch (RuntimeException e) {
            return ResponseEntity.status(403).body(e.getMessage());
        }
    }

}
