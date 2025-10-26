package racingcar;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Validator {
    public static void validateCarNames(String[] names) {
        for (String name : names) {
            validateCarName(name);
        }
        validateDuplicate(names);
    }

    public static void validateCarName(String name) {
        if (name == null || name.isBlank())
            throw (new IllegalArgumentException("자동차 이름은 공백일 수 없습니다"));
        if (name.length() > 5)
            throw (new IllegalArgumentException("자동차 이름은 5자 이하만 가능합니다"));
    }

    public static void validateDuplicate(String[] names) {
        Set<String> checkDuplicateNames = new HashSet<>(List.of(names));

        if(checkDuplicateNames.size()!= names.length)
            throw (new IllegalArgumentException("자동차 이름은 중복될 수 없습니다"));
    }

    public static void validateRaceCount(String input) {
        try {
            int count = Integer.parseInt(input);
            if (count <= 0)
                throw new IllegalArgumentException("시도 횟수는 1회 이상이어야 합니다");
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("시도 횟수가 올바르지 않습니다");
        }
    }
}
