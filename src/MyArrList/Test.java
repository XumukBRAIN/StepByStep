package MyArrList;

public class Test {
    public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.getObject(0));
        System.out.println(list.isEmpty());
        list.delete(2);
        list.deleteByObject(2);
        System.out.println(list);
    }
}
