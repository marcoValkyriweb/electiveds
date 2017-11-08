package za.ac.cput.ExtremeCoders.Senzo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SenzoRun
{
    private List list = new ArrayList();
    private Set set = new HashSet();
    private SinglyLinkedList singlyLinkedList = new SinglyLinkedList();

    public void runLaptops()
    {
        Laptop laptop1 = new Laptop(196545484,"Samsung", "Odyssey");
        Laptop laptop2 = new Laptop(284795214,"Acer", "GK6AA");
        Laptop laptop3 = new Laptop(489998997,"Lenovo", "G50");
        Laptop laptop4 = new Laptop(489998997,"HP", "G6");

        list.add(laptop1);
        list.add(laptop2);
        list.add(laptop3);
        list.add(laptop4);

        System.out.println("Number of laptops in the list: " + list.size());

        set.add(laptop1);
        set.add(laptop2);
        set.add(laptop3);
        set.add(laptop4);

        System.out.println("Number of laptops in the set: " + set.size());

        singlyLinkedList.addAtHead(laptop1);
        singlyLinkedList.addAtHead(laptop2);
        singlyLinkedList.addAtHead(laptop3);
        singlyLinkedList.addAtHead(laptop4);

        singlyLinkedList.print();
    }

    public static void main(String[] args)
    {
        SenzoRun senzoRun = new SenzoRun();
        senzoRun.runLaptops();
    }
}
