package OOP_PRINCIP.homework2.task5;

public final class Email {
    private final String address;

    public Email(String address) {
        if (address == null || !address.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
            throw new IllegalArgumentException("Неверный формат Email");
        }
        this.address = address;
    }

    public String getAddress() { return address; }

@Override
public String toString() {
    return address;
}

@Override
public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Email email = (Email) obj;
    return address.equals(email.address);
}

@Override
public int hashCode() {
    return address.hashCode();
}
}