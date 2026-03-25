package OOP_PRINCIP.homework2.task6;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

public final class DateRange {
    private final LocalDate start;
    private final LocalDate end;

    public DateRange(LocalDate start, LocalDate end) {
        this.start = start;
        this.end = end;
    }

    public boolean contains(LocalDate date) {
        return !date.isBefore(start) && !date.isAfter(end);
    }

    public boolean overlaps(DateRange other) {
        return !this.start.isAfter(other.end) && !other.start.isAfter(this.end);
    }

    public long getDays() {
        return ChronoUnit.DAYS.between(start, end);
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        DateRange that = (DateRange) obj;
        return Objects.equals(start, that.start) && Objects.equals(end, that.end);
    }

    @Override
    public int hashCode() {
        return Objects.hash(start, end);
    }

    @Override
    public String toString() {
        return "DateRange{" + start + " -> " + end + '}';
    }
}
