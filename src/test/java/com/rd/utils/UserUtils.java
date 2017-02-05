package com.rd.utils;

import com.rd.services.models.User;
import java.util.stream.Collectors;

/**
 *
 * @author Petr
 */
public class UserUtils {

    public static String printUser(User user) {
                
        return String.format(
                "User [%s, %s, %s, %s, [%s]]",
                user.getUsername(),
                user.getEmail(),
                user.getActivationKey(),
                user.getResetPasswordKey(),
                user.getAuthorities()
                        .stream()
                        .map(e -> {
                            return e != null ? String.format(" %s ", e.getName())  : "";
                        })
                        .collect(Collectors.joining(", "))
        );
    }
}
