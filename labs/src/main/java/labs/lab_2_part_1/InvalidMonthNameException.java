package labs.lab_2_part_1;

public class InvalidMonthNameException extends Exception {
    private String monthName;

    public InvalidMonthNameException() {
        super("InvalidMonthNameException: Month does not exist!\n");
    }

    public InvalidMonthNameException(String monthName) {
        super("InvalidMonthNameException: Month does not exist!\n");
        this.monthName = monthName;
    }

    public String getMonthName() {
        return monthName;
    }
}
