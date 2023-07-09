package LinkedList;

import java.awt.*;
import java.util.Scanner;

public class unfoldLL {

       public static int getSize(Node<Integer> head){
              int count=0;
              Node<Integer> temp=head;
              while(temp!=null){
                     count++;
                     temp=temp.next;
              }
              return count;
       }

       public static Node<Integer> insertAtKth(Node<Integer> head,int data,int k){

              Node<Integer> newNode=new Node<>(data);

              Node<Integer> temp=head;
              if(k==0){
                     newNode.next=head;
                     head=newNode;
                     return head;

              }

              for(int i=0;i<k-2;i++){
                     temp=temp.next;

              }
              if(temp==null){
                     return head;
              }

              newNode.next=temp.next;
              temp.next=newNode;

              return head;
       }
       public static Node<Integer> CreateLL(int n){

              if(n==0){
                     return null;
              }

              Scanner s=new Scanner(System.in);
              int data=1;
              Node<Integer> head=null,tail=null;
              while(n>0){
                     Node<Integer> newNode =new Node<>(data);
                     if(head==null){
                            head=newNode;
                            tail=newNode;
                     }
                     else{
                            tail.next=newNode;
                            tail=tail.next;
                     }
                     n--;
                     data++;


              }
              return head;

       }


       public static Node<Integer> reverse(Node<Integer> head){
              if(head==null||head.next==null){
                     return head;
              }
              Node<Integer> smallhead=reverse(head.next);
              head.next.next=head;
              head.next=null;
              return smallhead;
       }
       public static Node<Integer>  unfold(Node<Integer> head){
              Node<Integer> head2=head.next;
              Node<Integer> t1= head,t2=head2;
              while(t2.next!=null&&t2!=null){
                     //backup
                     Node<Integer> f=t2.next;

                     //move
                     t1.next=f;
                     t2.next=f.next;

                     //
                     t1=t1.next;
                     t2=t2.next;
              }
              t1.next=null;
              head2=reverse(head2);
              t1.next=head2;

              return head;




       }

       public static void print(Node<Integer> head){
              Node<Integer> temp=head;
              while(temp!=null) {
                     System.out.print(temp.data+" ");
                     temp=temp.next;
              }

       }
       public static Node<Integer> inputLL(){
              Scanner s=new Scanner(System.in);
              int data=s.nextInt();
              Node<Integer> head=null,tail=null;
              while(data!=-1){
                     Node<Integer> newNode=new Node<>(data);
                     if(head==null) {
                            head = newNode;
                            tail = newNode;
                     }
                     else {
                            tail.next=newNode;
                            tail = tail.next;
                     }
                     data=s.nextInt();
              }
              return head;
       }
       public static void main (String[] args){
//              Scanner s=new Scanner(System.in);
//              int n=s.nextInt();
              Node<Integer> head= inputLL();
              print(head);
              Node<Integer> head2=insertAtKth(head,2,2);


              //Node<Integer> head= CreateLL(n);
              //  print(head);
              // Node<Integer> head2=unfold(head);
               print(head2);

           }

}



