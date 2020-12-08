package com.uycode.queue;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
    // "static void main" must be defined in a public class.

    class MyQueue {
        // store elements
        private int data[];

        // a pointer to indicate the start position
        private int p_start;

        // a pointer to indicate the end position
        private int p_end;

        //capacity of queue
        private int capacity;

        public MyQueue(int capacity) {
            this.capacity = capacity;
            data = new int[capacity];
            p_start = 0;
            p_end = 0;
        }
        /** Insert an element into the queue. Return true if the operation is successful. */
        public boolean enQueue(int x) {
            if(!isFull()){
               p_end = (p_end + 1) % capacity;
                data[p_end] = x;
                return true;
            }
            System.out.println("队列已为满！");
            return false;
        }
        /** Delete an element from the queue. Return true if the operation is successful. */
        public boolean deQueue() {
            if (!isEmpty()) {
                p_start = (p_start + 1) % capacity;
                return true;
            }
            System.out.println("队列已为空！");
            return false;
        }
        /** Get the front item from the queue. */
        public int Front() {
            return data[(p_start + 1) % capacity];
        }
        /** Checks whether the queue is empty or not. */
        public boolean isEmpty() {
            return p_start == p_end;
        }

        /**if end of the index equals to start of the index, full or empty*/
        public boolean isFull(){
            if((p_end + 1) % capacity == p_start){
                return true;
            }
            return false;
        }
    };

    public class Main {
        public static void main(String[] args) {
            /*MyQueue q = new MyQueue(5);
            q.enQueue(5);
            q.enQueue(3);
            q.enQueue(2);
            q.enQueue(1);
            q.enQueue(6);
            q.deQueue();
            q.enQueue(7);
            q.deQueue();
            q.deQueue();*/

            HashMap hashMap = new HashMap();
            hashMap.put("name","Ahmatjan");
            hashMap.hashCode();

            System.out.println(hashMap.get("name"));

            System.out.println();

        }
    }
