package com.adammendak.crosswords.bootstrap;

import com.adammendak.crosswords.domain.CrosswordEntry;
import com.adammendak.crosswords.domain.User;
import com.adammendak.crosswords.service.UserService;
import com.google.common.collect.Lists;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class Bootstrap implements CommandLineRunner {

    private final UserService userService;

    @Override
    public void run(String... args) throws Exception {
        log.info("#### BOOTSTRAPING DATA ####");

        User vaderUser = new User();
        vaderUser.setUserName("Darth Vader");

        User lukeUser = new User();
        lukeUser.setUserName("Luke Skywalker");

        CrosswordEntry crosswordEntryVader1 = new CrosswordEntry();
        crosswordEntryVader1.setValue("tasdf1");
        crosswordEntryVader1.setDescription("test asdfa12");
        crosswordEntryVader1.setUser(vaderUser);

        CrosswordEntry crosswordEntryVader2 = new CrosswordEntry();
        crosswordEntryVader2.setValue("asd");
        crosswordEntryVader2.setDescription("dddddd");
        crosswordEntryVader2.setUser(vaderUser);

        CrosswordEntry crosswordEntryLuke1 = new CrosswordEntry();
        crosswordEntryLuke1.setValue("aaatasdfasdf");
        crosswordEntryLuke1.setDescription("xxsadf");
        crosswordEntryLuke1.setUser(lukeUser);

        CrosswordEntry crosswordEntryLuke2 = new CrosswordEntry();
        crosswordEntryLuke2.setValue("asfwwww");
        crosswordEntryLuke2.setDescription("qwerqwerwqer");
        crosswordEntryLuke2.setUser(lukeUser);

        vaderUser.setEntries(Lists.newArrayList(crosswordEntryVader1, crosswordEntryVader2));
        lukeUser.setEntries(Lists.newArrayList(crosswordEntryLuke1, crosswordEntryLuke2));

        userService.saveUser(vaderUser);
        userService.saveUser(lukeUser);
    }
}
