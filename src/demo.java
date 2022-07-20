public class demo {
    public static void main(String[] args) {
        GenericQueue<String> queue = new GenericQueue<>();
        queue.enqueue("Hằng");
        queue.enqueue("Hiếu");
        queue.enqueue("Hiệp");
        queue.enqueue("Đức Anh");
        queue.enqueue("Ba");

        //duyệt mảng và in ra các phần tử
        for (int i = 0; i < queue.getSize(); i++) {
            if(i==0){
                System.out.println("phần tử đầu: ");
            }else
            if(i == queue.getSize()-1){
                System.out.println("phần tử cuối:");
            }else {
                System.out.println("phần tử thân:"+i);
            }
            System.out.println(queue.get(i));

        }

        //in ra mảng đã bị xóa
        System.out.println("Phần tử đã bị xóa:");
//        while (!queue.isEmpty()){ System.out.println(queue.dequeue());
//        }
        System.out.println(queue.dequeue());

        System.out.println(queue.dequeue());

        for (int i = 0; i < queue.getSize(); i++) {
            if(i==0){
                System.out.println("phần tử đầu: ");
            }else
            if(i == queue.getSize()-1){
                System.out.println("phần tử cuối:");
            }else {
                System.out.println("phần tử thân:"+i);
            }
            System.out.println(queue.get(i));

        }
//        //Kiểm tra mảng
//        System.out.println("Kiểm tra mảng:");
//        if(queue.isEmpty()){
//            System.out.println("Mảng rỗng (null)");
//        }else {
//            System.out.println("Mảng không rỗng (not null)");
//        }

    }
}
