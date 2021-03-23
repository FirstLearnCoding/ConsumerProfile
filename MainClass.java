public class MainClass {

    public static void main(String[] args){
        DoubleLinkedList list=new DoubleLinkedList();
        list.insert(4);
        list.insert(7);
        list.insert(3);
        list.insert(9);
        list.insertAt(3,11);
        list.insertAt(2,88);
        list.insertAt(1,77);
        list.insertAt(2,99);
        list.deleteAt(6);
        list.deleteAtStart();
        list.deleteAtEnd();
        list.updateValue(10,88);
        //list.deleteAt(5);
        list.show();
        System.out.println(list.count());

    }
}
