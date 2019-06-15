package com.adammendak.crosswords.utils;

import com.adammendak.crosswords.domain.User;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Getter
public class AppState {

    public static User user;

    public static String userName;

    public static void setUser(User user) {
        AppState.user = user;
    }

    public static void setUserName(String userName) {
        AppState.userName = userName;
    }
}
