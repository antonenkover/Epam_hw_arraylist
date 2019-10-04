package hw6_2;

public class ArrayUsage {
    public static void main(String[] args) {
        HandmadeArrayList handmadeArrayList = new HandmadeArrayList();
        System.out.println("Array length before resizing: " + handmadeArrayList.length());
        handmadeArrayList.add(0);
        handmadeArrayList.add(1);
        handmadeArrayList.add(2);
        handmadeArrayList.add(3);
        handmadeArrayList.add(4);
        handmadeArrayList.add(5);
        handmadeArrayList.add(6);
        handmadeArrayList.add(7);
        System.out.println("Array length after resizing: " + handmadeArrayList.length());
        System.out.println(handmadeArrayList.getElement(1));
        System.out.println(handmadeArrayList.getSize());
    }
}
