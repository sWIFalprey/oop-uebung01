package ueb01;

import java.util.NoSuchElementException;

class IntElement {
    char value;
    IntElement next;
    IntElement(char v, IntElement e){
        value = v;
        next = e;
    }
}

class CharStackImpl implements CharStack {
    private IntElement head;

    public void push(char c){
        IntElement it = head;

        if (head == null) {
            head = new IntElement(c, null);
            return;
        }

        while(it.next != null){
            it = it.next;
        }
        it.next = new IntElement(c, null);
    }

    public char pop(){
        IntElement it = head;
        IntElement parent = head;

        if (head == null){
            throw new NoSuchElementException();
        }
        if (head.next == null){
            head = null;
        }

        while(it.next != null){
            parent = it;
            it = it.next;
        }

        char v = it.value;
        parent.next = null;
        return v;
    }

    public int size(){
        int size = 0;
        IntElement it = head;

        while (it != null){
            size++;
            it = it.next;
        }
        return size;
    }
}
