package test;

import com.hx76.linkedlist.SinglyLinkedList;

public class SinglyLinkedListTest {
    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        for (int i=1;i<=11;i++){
            singlyLinkedList.add(i);
        }
        System.out.println("********************");
        System.out.println("遍历链表");
        singlyLinkedList.print();
        System.out.println();
        System.out.println("********************");
        System.out.println("链表长度为："+singlyLinkedList.getLength());
        System.out.println("********************");
        int j = 3;
        System.out.println("位置为"+j+"的元素为："+singlyLinkedList.selectByIndex(j).data);
        System.out.println("********************");
        int i = 2;
        System.out.println("删除位置为"+i+"的元素：");
        singlyLinkedList.deleteByIndex(i);
        singlyLinkedList.print();
        System.out.println();
        System.out.println("********************");
        int k = 5;
        System.out.println("在"+k+"位置插入元素：");
        singlyLinkedList.insert(9,k);
        singlyLinkedList.print();
        System.out.println();
        System.out.println("********************");
        int l = 9;
        System.out.println("查找数值为"+l+"的元素");
        for (SinglyLinkedList.Node node:singlyLinkedList.selectByData(l)
             ) {
            System.out.println(node.data);
        }
    }
}
