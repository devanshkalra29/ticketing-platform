package com.poc.ticketingplatform.service;

import com.poc.ticketingplatform.model.User;
import com.poc.ticketingplatform.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.client.userinfo.DefaultOAuth2UserService;
import org.springframework.security.oauth2.client.userinfo.OAuth2UserRequest;
import org.springframework.security.oauth2.core.OAuth2AuthenticationException;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomOAuth2UserService extends DefaultOAuth2UserService {

    @Autowired
    private UserRepository userRepository;
    private static final Logger logger = LoggerFactory.getLogger(CustomOAuth2UserService.class);

    @Override
    public OAuth2User loadUser(OAuth2UserRequest userRequest) throws OAuth2AuthenticationException {
        OAuth2User oAuth2User = super.loadUser(userRequest);
        logger.info(oAuth2User.toString());
        String email = oAuth2User.getAttribute("email");
        String firstName = oAuth2User.getAttribute("given_name");
        String lastName = oAuth2User.getAttribute("family_name");

        logger.info("WE GOT THE USER INFO: " + email);
        User user = userRepository.findByEmail(email);
        if (user == null) {
            // User doesn't exist, create a new one
            user = new User();
            user.setEmail(email);
            user.setFirstName(firstName);
            user.setLastName(lastName);
            // Set other details
            userRepository.save(user);
        }
        return oAuth2User;

    }
}
