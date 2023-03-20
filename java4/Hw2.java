import java.util.LinkedList;

public class Main {

    public static class Queue<T> {
        private LinkedList<T> list;

        public Queue() {
            list = new LinkedList<T>();
        }

        public void enqueue(T element) {
            list.addLast(element);
        }

        public T dequeue() {
            return list.removeFirst();
        }

        public T first() {
            return list.getFirst();
        }

        public boolean isEmpty() {
            return list.isEmpty();
        }

        public int size() {
            return list.size();
        }
    }

    public static void main(String[] args) {
        Queue<String> queue = new Queue<>();

        // добавляем элементы в очередь
        queue.enqueue("A");
        queue.enqueue("B");
        queue.enqueue("C");

        // получаем и удаляем первый элемент очереди
        String first = queue.dequeue();
        System.out.println("Первый элемент очереди: " + first);

        // получаем первый элемент очереди без удаления
        String peek = queue.first();
        System.out.println("Первый элемент очереди: " + peek);

        // проверяем размер и пустоту очереди
        System.out.println("Размер очереди: " + queue.size());
        System.out.println("Очередь пустая? " + queue.isEmpty());

        // получаем и удаляем оставшиеся элементы из очереди
        while (!queue.isEmpty()) {
            String element = queue.dequeue();
            System.out.println("Удаляем элемент: " + element);
        }
    }
}