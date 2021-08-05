package org.clb.pojo.list;

import jdk.nashorn.internal.objects.annotations.Constructor;
import lombok.*;


@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Node {
    private Node next;
    @NonNull
    private String name;
    public boolean hashNext(){
        return this.next!=null;
    }
    public void iterator(){
        Node index=this;
        System.out.print(this.getName()+" ");
        while (index.hashNext()){
            index=index.next;
            System.out.print(index.getName()+" ");
        }
    }
}
