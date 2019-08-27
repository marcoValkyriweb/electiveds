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
        Laptop laptops[] = new Laptop[] {
            new Laptop(196545484,"Samsung", "Odyssey"), 
            new Laptop(284795214,"Acer", "GK6AA"),
            new Laptop(489998997,"Lenovo", "G50"),
            new Laptop(489998997,"HP", "G6"),
        };
        
        for (Laptop laptop : laptops) {
            list.add(laptop);    
        }

        System.out.println("Number of laptops in the list: " + list.size());

        for (Laptop laptop : laptops) {
            set.add(laptop);
        }

        System.out.println("Number of laptops in the set: " + set.size());

        for (Laptop laptop : laptops) {
            singlyLinkedList.addAtHead(laptop);
        }

        singlyLinkedList.print();
    }

    public static void main(String[] args)
    {
        SenzoRun senzoRun = new SenzoRun();
        senzoRun.runLaptops();
    }
}
