package core.basesyntax;

import java.util.Objects;

class Pair<K, V> {
    private K first;
    private V second;

    public Pair(K first, V second) {
        this.first = first;
        this.second = second;
    }

    K getFirst() {
        return first;
    }

    V getSecond() {
        return second;
    }

    static <K, V> Pair of(K first, V second) {
        return new Pair(first, second);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }

        if (object == null || getClass() != object.getClass()) {
            return false;
        }

        if (object.getClass().equals(Pair.class)) {
            Pair pair = (Pair) object;
            return Objects.equals(first, pair.first)
                    && Objects.equals(second, pair.second);
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = 11;
        result = first.equals(null) ? result : 13 * first.hashCode();
        result = second.equals(null) ? result : 13 * second.hashCode();
        return result;
    }
}
