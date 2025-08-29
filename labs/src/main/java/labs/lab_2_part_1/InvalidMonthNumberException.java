package labs.lab_2_part_1;

public class InvalidMonthNumberException extends Exception {
    private int monthNumber;

    public InvalidMonthNumberException() {
        super("InvalidMonthNumberException: Month number must be between 1 and 12, inclusive.\n");
    }

    public InvalidMonthNumberException(int monthNumber) {
        super("InvalidMonthNumberException: Month number must be between 1 and 12, inclusive.\n");
        this.monthNumber = monthNumber;
    }

    public int getMonthNumber() {
        return monthNumber;
    }
}
