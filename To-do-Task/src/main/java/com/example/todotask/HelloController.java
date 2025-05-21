package com.example.todotask;

import javafx.animation.FadeTransition;
import javafx.animation.ScaleTransition;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.util.Duration;

public class HelloController {

    @FXML
    private Label welcomeLabel;

    @FXML
    private VBox loginForm;

    @FXML
    private VBox signupForm;

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private TextField usernameFieldSignup;

    @FXML
    private PasswordField passwordFieldSignup;

    @FXML
    private PasswordField confirmPasswordField;

    @FXML
    public void initialize() {
        animateWelcomeMessage();
    }

    private void animateWelcomeMessage() {
        // Scale transition
        ScaleTransition scale = new ScaleTransition(Duration.seconds(1), welcomeLabel);
        scale.setFromX(0.5);
        scale.setFromY(0.5);
        scale.setToX(1.0);
        scale.setToY(1.0);

        // Fade transition
        FadeTransition fade = new FadeTransition(Duration.seconds(2), welcomeLabel);
        fade.setFromValue(0.0);
        fade.setToValue(1.0);
        fade.setDelay(Duration.seconds(0.3));

        scale.play();
        fade.play();
    }

    @FXML
    private void showSignupPage() {
        loginForm.setVisible(false);
        signupForm.setVisible(true);
    }

    @FXML
    private void showLoginPage() {
        signupForm.setVisible(false);
        loginForm.setVisible(true);
    }

    @FXML
    private void showLogin() {
        String username = usernameField.getText();
        String password = passwordField.getText();
        System.out.println("Login attempt: " + username + ", " + password);
        // Add real login logic here
    }

    @FXML
    private void showSignUp() {
        String username = usernameFieldSignup.getText();
        String password = passwordFieldSignup.getText();
        String confirmPassword = confirmPasswordField.getText();

        if (!password.equals(confirmPassword)) {
            System.out.println("Passwords do not match!");
            return;
        }

        System.out.println("Sign Up attempt: " + username + ", " + password);
        // Add real signup logic here
    }
}







