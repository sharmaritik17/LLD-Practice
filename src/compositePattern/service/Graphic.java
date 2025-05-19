package compositePattern.service;

public interface Graphic {
    default void add(Graphic graphic) {
        throw new UnsupportedOperationException();
    }

    default void remove(Graphic graphic) {
        throw new UnsupportedOperationException();
    }

    default Graphic getChild(int i) {
        throw new UnsupportedOperationException();
    }

    void draw();
}
