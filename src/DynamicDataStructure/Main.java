package DynamicDataStructure;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {

        Node tail = null;
        for (int i = 0; i < 10; i++) {
            tail = new Node(i, tail);
        }
        Node ref = tail;
        while (ref != null) {
            out.print("(" + ref.value + ")-->");
            ref = ref.link;
        }
        System.out.println(" ");
//        generateListIter(10);
        // measureNodeSize(tail);
//        measureNodeSizeRec(tail);
//        System.out.println(sumNodeIter(tail));
//        System.out.println(maxIter(tail));
//        System.out.println(maxRec(tail));
//        addElementItrer(tail, 3, 45);

        //        generateListIter(10);
//                generateListRec(10);
     /*   int numberOfElements = 10;
                Node tailToPrint = generateListRec(numberOfElements-1);

                toStringRec(tailToPrint);
        System.out.println("");
                int size = measureNodeSizeRec(tailToPrint);
                out.println(size);*/
     addElementItrer(tail, 3, 47);

    }

    public static void addElementItrer (Node tail, int elementIndex, int elementValue){
        Node ref = tail;

        for (int count =0; count<elementIndex; count++){
            ref = ref.link;
            if (elementIndex == count +1){
                ref.link = new Node(elementValue, ref.link);
            }
        }

        while (tail != null){
            System.out.print(tail.value + " --> ");
            tail = tail.link;
        }
    }

    public static int maxRec (Node tail){
        // the same fucking shit!!! Variable reinitializing in the start of every recursion.
        int max = tail.value;
        if (tail != null){
            if (max < tail.value){
                max = tail.value;
            }
            maxRec(tail);
        }
        return max;
    }

    public static int maxIter (Node tail){
        int max = tail.value;
        while (tail != null){
            if (tail.value> max){
                max = tail.value;
            }
            tail = tail.link;
        }
        return max;
    }

   /* public static int sumNodeRec (Node tail){
        if (tail != null){
            int sum =
        }
    }*/

    public static int sumNodeIter (Node tail){
        int sum = 0;
        while (tail != null){
           sum+=tail.value;
           tail = tail.link;
        }
        if (tail == null){
            sum = sum + tail.value;
            return sum;
        }
        return sum;
    }

    public static int measureNodeSizeRec (Node tail) {
        if (tail == null) {
            return 0;
        }
            int counter =measureNodeSizeRec(tail.link) +1;
    // How to find out size with recursion?

        return counter;
    }

    public static int measureNodeSize(Node tail) {
        int counter = 0;
        while (tail != null) {
            counter++;
            tail = tail.link;
            out.print(counter + " ");
        }
        // How to print out from here?
        return counter;
    }

    public static void generateListIter(int value) {
        Node tail = null;
        for (int i = 0; i < value; i++) {
            tail = new Node(i, tail);
        }
        Node ref = tail;
        while (ref.link != null) {
            out.print(ref.value + " --> ");
            ref = ref.link;
        }
        if (ref.link == null){
            out.print(ref.value);
        }
        // How to print out this Node?
        // There is also a mistake with Null Pointer Exception
    }

    public static Node generateListRec(int value) {
        Node tail = null;
        if (value > 0) {
            tail = new Node(value, generateListRec(value - 1));

//            return new Node(value, generateListRec(value - 1));
        } else {
//            return new Node(value, null);
            tail = new Node(value, null);
        }
        return tail;
    }

    public static String toStringIter(Node ref) {
        String result = "";
        while (ref != null) {
            return result += " (" + ref.value + ")-->";
        }
        result += "null";
        return result;
    }

    public static void toStringRec(Node ref) {
        if (ref == null) {
            out.print("null");
        return;
        }
        out.print("(" + ref.value + ")--> ");
        toStringRec(ref.link);
    }

}
