package com.adammendak.crosswords.utils;

import com.adammendak.crosswords.domain.User;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Getter
@Setter
public class AppState {

    public static User user;
}
