package uni.aed.wu.cap19stack;

public class StackEmptyExceptionTDA extends RuntimeException {

    public StackEmptyExceptionTDA(String message) {
        super(message);
    }

    public StackEmptyExceptionTDA() {
        this("La pila esta vacia");
    }
}
