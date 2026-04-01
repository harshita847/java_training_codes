

 class node {
      int data;
      node next;

      node(int data){
        this.data=data;
        this.next=null;

      }

}
 class linkedlist{
    node head;
    void createnode(int data){
        node newnode=new node(data);
        newnode.next=head;
    }

void display(){
    node temp=head;
    while(temp!=null){
        System.out.println(temp.data);
        temp=temp.next;
    }
}
void insert(int data){
    node newnode=new node(data);
    if(head==null){
        head=newnode;
    }
    node temp=head;
    while(temp.next!=null){
        temp=temp.next;
    }
    temp.next=newnode;
}
void delete_first(){
    if(head==null){
        return;
    }
    node ttemp=head.next;
    
    head=ttemp;
}
 void delete_last(){
    node temp=head;
    if(temp==null){
         return;
    }
    while(temp.next.next!=null){
        temp=temp.next;

    }
    temp.next=null;
}
void addnode(int value,int data){
    node temp=head;
    node ttemp=temp.next;
    while(temp.data!=value){
        temp=temp.next;
         ttemp=temp.next;
         while()

    }
    node newnode=new node(data);
    newnode.next=ttemp;
    temp.next=newnode;


}
   
// }
}
 public class hello{
    public static void main(String[] args){
        linkedlist obj= new linkedlist();
        obj.createnode(10);
        obj.createnode(20);
        obj.insert(30);
         obj.insert(40);
          obj.insert(50);

        obj.display();
        
    }
}
 
    

