public class MyStack<T> {

    //внтурений класс элемента стека
    private static class Element<T> {
        //значение элемента
        private T data;
        //указатель на следующий в очереди экземпляр
        //(предпоследний добавленый)
        private Element<T> next;

        public Element(T data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return data.toString();
        }
    }
    //переменная что хранит первый в очереди на выход элемент
    Element<T> first = null;

    void push(T data) {
        //добавляем новый элемент
        Element<T> newFirst = new Element<T>(data);
        //у нового элемента будет сылка на предведущий элемент
        newFirst.next = first;
        //новый элемент становиться первым на выход
        first = newFirst;
    }

    public T pop() {

        Element<T> oldFirst = first;
        //теперь переменная сылки котороя указывает на первый элемент first
        //будет указывать на следующий элемент в очереди first.next
        //таким образом мы убираем старыйПервый элемент из стека
        first = first.next;
        //и возвращаем его "куда то"
        return oldFirst.data;
    }

    public boolean isEmpty() {
        return first == null;
    }
    //весь стек в строку
    @Override
    public String toString() {
        StringBuilder listBuilder = new StringBuilder();
        Element<T> current = first;
        while (current != null) {
            listBuilder.append(current).append(",");
            current = current.next;
        }
        return listBuilder.toString();
    }

}
