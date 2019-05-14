package stringcalculator;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class StringCalculator {

    private List<Integer> numbers = new ArrayList<>();

    public StringCalculator(String formula) {
        if (StringUtils.isBlank(formula)) {
            numbers.add(0);
        }
        if (isCustomDelimiter(formula)) {
            numbers = getNumbersByCustomDelimiter(formula);
        }


        throw new RuntimeException("잘못된 문자열입니다.");
    }

    private List<Integer> getNumbersByCustomDelimiter(String formula) {
        Matcher m = Pattern.compile("//(.)\n(.*)").matcher(formula);
        m.find();
        String customDelimiter = m.group(1);
        return Arrays.stream(m.group(2).split(customDelimiter)).map(Integer::parseInt).collect(Collectors.toList());
    }

    public int calculate() {
        return numbers.stream().reduce(0, Integer::sum);
    }

    private boolean isCustomDelimiter(String formula) {
        return Pattern.compile("//(.)\n(.*)").matcher(formula).find();
    }
}