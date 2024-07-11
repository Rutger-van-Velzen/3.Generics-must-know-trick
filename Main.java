public class Main {
    public static void main(String... args){
        example_1();
        example_2();
    }




    static void example_1(){
        Box_1<MyClass> box = new Box_1<>();
        MyClass myClass = new MyClass();
        box.setValue(myClass);

        MyClass myBoxValue =  box.getValue();
    }

    static class MyClass implements Printable{

        @Override
        public void print() {
            System.out.println("Printable!");
        }
    }

    interface Printable{
        void print();
    }

    static class Box_1<T extends Printable>{
        private T t;

        public void setValue(T t){
            this.t = t;
        }

        public T getValue(){
            return t;
        }

        public void printString(){
            t.print();
        }
    }














    static void example_2(){
        Box_2<MyOtherClass> box = new Box_2<>();
        box.setValue(new MyOtherClass());
    }

    interface PlusOne{
        void addOne();
    }

    static class MyOtherClass implements Printable, PlusOne{

        @Override
        public void print() {
            System.out.println("Printable!");
        }

        @Override
        public void addOne() {
            // More Code...
        }
    }


    static class Box_2<T extends Printable & PlusOne>{
        private T t;

        public void setValue(T t){
            this.t = t;
        }

        public T getValue(){
            return t;
        }

        public void printString(){
            t.print();
        }
    }
}
