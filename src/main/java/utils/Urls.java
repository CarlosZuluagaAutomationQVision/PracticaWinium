package utils;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Urls {

    GMAIL("https://accounts.google.com/"),
    HOTMAIL("https://hotmail.com/"),
    ORANGE("https://opensource-demo.orangehrmlive.com/index.php/auth/login");

    private final String URLS;

}
