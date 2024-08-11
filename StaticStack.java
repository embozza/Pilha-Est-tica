public class StaticStack<T> {
    private int top = -1;
    private T[] data;

    @SuppressWarnings("unchecked")
    public StaticStack(int size) {
        data = (T[]) new Object[size];
    }

    public void push(T value) {
        if (isFull()) {
            throw new StackOverflowError("Stack is full");
        }
        data[++top] = value;
    }

    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return data[top--];
    }

    public void clear() {
        top = -1;
    }

    public boolean isFull() {
        return top == data.length - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public static void main(String[] args) {
        StaticStack<Integer> stack = new StaticStack<>(5);

        // Adicionando elementos na pilha
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Verificando o estado da pilha
        System.out.println("Pilha está vazia? " + stack.isEmpty()); 
        System.out.println("Pilha está cheia? " + stack.isFull());  

        // Removendo elementos da pilha
        System.out.println("Elemento removido: " + stack.pop());    
        System.out.println("Elemento removido: " + stack.pop());    

        // Limpando a pilha
        stack.clear();
        System.out.println("Pilha está vazia após limpar? " + stack.isEmpty()); 
    }
}
