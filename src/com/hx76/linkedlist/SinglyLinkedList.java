package com.hx76.linkedlist;

import java.util.LinkedList;
import java.util.List;

/**
 * 单向链表
 * @author Administrator
 */
public class SinglyLinkedList {
    /**
     * @param head 头节点
     */
    public Node head = null;

    /**
     * 添加元素，直接添加在链表尾部
     * @param data 被添加的元素
     */
    public void add(int data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }

        Node node = head;
        while (node.next!=null){
            node = node.next;
        }

        node.next = newNode;
    }

    /**
     * 插入元素，在指定位置插入指定元素
     * @param data 插入的元素
     * @param index 插入的位置
     */
    public void insert(int data,int index){
        if (index==getLength()){
            add(data);
        }else if (index>getLength()){
            System.out.println("插入位置超出链表长度");
        }else if (index<1){
            System.out.println("插入位置输入不正确");
        }else {
            Node newNode = new Node(data);
            Node preNode = selectByIndex(index-1);
            Node curNode = selectByIndex(index);
            preNode.next = newNode;
            newNode.next = curNode;
        }
    }

    /**
     * 删除指定位置的元素
     * @param index 被删除元素的位置
     */
    public void deleteByIndex(int index){
        if (ifExceedLength(index)){
            return;
        }
        if (index == 1){
            head = head.next;
            return;
        }
        Node preNode = selectByIndex(index-1);
        Node curNode = selectByIndex(index);
        preNode.next = curNode.next;
    }

    /**
     * 打印链表
     */
    public void print(){
        Node node = head;
        while (node.next != null){
            System.out.print(node.data+" ");
            node = node.next;
        }
    }

    /**
     * 根据下标查找元素
     * @param index 要查找元素的下标
     */
    public Node selectByIndex(int index){
        if (ifExceedLength(index)){
            return null;
        }
        if (index == 1){
            return head;
        }
        Node temp = head;
        for (int i=1;i<index;i++){
            temp = temp.next;
        }
        return temp;
    }

    /**
     * 查找元素所在的位置
     * @param data 要查找的元素
     */
    public List<Node> selectByData(int data){
        LinkedList<Node> nodes = new LinkedList<>();
        Node temp = head;
        while (temp.next != null){
            if (temp.data == data){
                nodes.add(temp);
            }
            temp = temp.next;
        }
        return nodes;
    }

    /**
     * 获取链表长度
     * @return 链表长度
     */
    public int getLength(){
        int length = 0;
        Node node = head;
        while (node.next != null){
            length++;
            node = node.next;
        }
        return length;
    }
    public boolean ifExceedLength(int index){
        if (index>getLength()||index<1){
            System.out.println("输入下标越界");
            return true;
        }else {
            return false;
        }
    }
    /**
     * 节点类
     */
    public static class Node {
        /**
         * @param data 节点中保存的数据
         * @param next 指向下一个节点的指针，链表的最后一个节点指向null
         */
        public int data;
        public Node next;

        public Node(int data) {
            this.data = data;
        }
    }
}
