public class DoubleLinkedList {
    Node head;
    int count=0;
    public void insert(int data) {
        Node nNode=new Node();
        nNode.data=data;
        nNode.next=null;
        nNode.previous=null;

        if(head==null){
            head=nNode;
            //end=head.previous;
        }else{
            Node n=head;
            while(n.next!=null){
                n=n.next;
            }
           // Node m=nNode;
            n.next=nNode;
            n.next.previous=n;

        }
        count++;
    }
    public void insertAtStart(int data){
        Node nNode=new Node();
        nNode.data=data;
        nNode.next=head;
        nNode.previous=null;
        head=nNode;
        head.next.previous=head;
        count++;

    }
    public void updateValue(int index, int data){
        if(index<count){
            Node n=head;
            for(int i=0;i<index-1;i++){
                n=n.next;
            }
            n.data=data;
        }else{
            System.out.println("Sorry! Invalid Index Value:--"+index);
        }
    }

    public void insertAt(int index, int data){
        Node nNode=new Node();
        nNode.data=data;
        nNode.next=null;
        nNode.previous=null;
        if (index<=1){
            insertAtStart(data);
            count--;
        }else if(count==0){
            insert(data);
            count--;
        }
        else if(index<=count){
            Node n=head;
            for(int i=0;i<index-1;i++){
                n=n.next;
            }
            nNode.previous=n.previous;
            nNode.next=n;
            n.previous.next=nNode;
            n.previous=nNode;

        }else{
            insert(data);
        }
        count++;
    }
    public void deleteAt(int index){
        if(index<0){
            deleteAtStart();
        }else if(index==count-1){
            deleteAtEnd();
        } else if(index<count){
            Node n=head;
            Node del=null;
            for(int i=0;i<index-1;i++){
                n=n.next;
            }
            del=n.next;
            n.next=del.next;
            n.next.previous= del.previous;
            count--;
        }else{
            System.out.println("Sorry! invalid index value. Index value:- "+index);
        }

    }
    public void deleteAtStart(){
        Node n=head;
        head=n.next;
        head.previous=null;
        count--;
    }
    public void deleteAtEnd(){
        Node n=head;
        while(n.next!=null){
            n=n.next;
        }
        n.previous.next=null;
        count--;

    }
    public int count(){
        return count;
    }

    public void show(){
        Node n=head;
        while(n.next!=null){
            System.out.print(n.data+" ");
            n=n.next;
        }
        System.out.println(n.data);
        while(n.previous!=null){
            System.out.print(n.data+" ");
            n=n.previous;
        }
        System.out.println(n.data);
    }

}
