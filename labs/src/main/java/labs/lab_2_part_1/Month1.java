package labs.lab_2_part_1;

public class Month1 {
    /**
     * Number representing the month, i.e. January = 1, February = 2, and so forth.
     */
    private int monthNumber;

    private static String[] months = {
            "January", "February", "March", "April", "May", "June", "July", "August", "September", "October",
            "November", "December"
    };

    public Month1() {
        this.monthNumber = 1;
    }

    public Month1(int monthNumber) {
        this.monthNumber = monthNumber;
        // If month specified is invalid, set to 1.
        if (monthNumber < 1 || monthNumber > 12)
            this.monthNumber = 1;
    }

    public Month1(String month) {
        for (int i = 0; i < months.length; i++) {
            if (month.equalsIgnoreCase(months[i])) {
                this.monthNumber = i + 1;
                return;
            }
        }
        this.monthNumber = 1;
    }

    public void setMonthNumber(int monthNumber) {
        this.monthNumber = monthNumber;
        // If month specified is invalid, set to 1.
        if (monthNumber < 1 || monthNumber > 12)
            this.monthNumber = 1;
    }

    public int getMonthNumber() {
        return monthNumber;
    }

    public String getMonthName(int monthNumber) {
        if (monthNumber < 1 || monthNumber > 12) {
            return null;
        }
        return months[monthNumber - 1];
    }

    @Override
    public String toString() {
        return months[monthNumber - 1];
    }

    public boolean equals(Month1 month1) {
        return month1.getMonthNumber() == monthNumber;
    }

    public boolean greaterThan(Month1 month1) {
        return month1.getMonthNumber() < monthNumber;
    }

    public boolean lessThan(Month1 month1) {
        return month1.getMonthNumber() > monthNumber;
    }
}
