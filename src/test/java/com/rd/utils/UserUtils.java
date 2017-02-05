package com.rd.utils;

import com.rd.services.models.User;

/**
 *
 * @author Petr
 */
public class UserUtils {

    public static String printUser(User user) {
        int counter = 0;

        return String.format(
                "User %d [%s, %s, %s, %s, Authorities [%s]]",
                ++counter,
                user.getUsername(),
                user.getEmail(),
                user.getActivationKey(),
                user.getResetPasswordKey(),
                user.getAuthorities()
                        .stream()
                        .map(e -> {
                            return String.format(" %s ", e.getName());
                        }));
    }
}
