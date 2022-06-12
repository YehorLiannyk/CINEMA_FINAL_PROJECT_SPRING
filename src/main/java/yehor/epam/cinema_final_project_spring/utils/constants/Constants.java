package yehor.epam.cinema_final_project_spring.utils.constants;

import java.time.Duration;

public final class Constants {
    public static final int DEFAULT_PAGING_SIZE = 2;

    public static final String PAGE_NUMBER_PARAM = "page";
    public static final String PAGE_AMOUNT_PARAM = "pageAmount";

    public static final int PASSWORD_ENCODE_STRENGTH = 10;

    public static final String USER_ROLE = "USER";
    public static final String ADMIN_ROLE = "ADMIN";

    /**
     * Lifetime of Cookie login in seconds, equal to 90 days
     */
    public static final int COOKIE_LOGIN_LIFETIME = (int) Duration.ofDays(90).toSeconds();
    /**
     * Lifetime of Cookie Local in seconds, equal to 360 days
     */
    public static final int COOKIE_LANG_LIFETIME = (int) Duration.ofDays(360).toSeconds();

    private Constants() {
    }
}