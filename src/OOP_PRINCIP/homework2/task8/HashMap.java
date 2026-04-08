package OOP_PRINCIP.homework2.task8;

import java.util.Objects;

public class HashMap {
    private final String key;

    public HashMap(String key) {
        this.key = key;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof HashMap)) return false;
        HashMap other = (HashMap) o;
        return Objects.equals(key, other.key);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key);
    }
}
