import com.personetics.test.ChainValidator;
import com.personetics.test.Node;

import java.util.Arrays;
import java.util.List;

public class Application {
    public static void main(String[] args) {

        List<Node> NodeList1 = Arrays.asList(new Node(36), new Node(6), new Node(24), new Node(4),
                new Node(47), new Node(7), new Node(2), new Node(3), new Node(27));
        List<Node> NodeList2 = Arrays.asList(new Node("p"), new Node("aba"), new Node("a"),
                new Node("b"), new Node("perso"), new Node("o"), new Node("r"), new Node("e"),
                new Node("s"));
        List<Node> NodeList3 = Arrays.asList(new Node(35), new Node(5), new Node(65), new Node(6),
                new Node(24), new Node(4));

        ChainValidator chainValidator = new ChainValidator();
        System.out.print("#1 Node - Result: " + chainValidator.validate(NodeList1) + "  | Original list: ");
        NodeList1.forEach(list -> System.out.print(" " + list.getObj()));

        System.out.print("\n#2 Node - Result: " + chainValidator.validate(NodeList2) + "  | Original list: ");
        NodeList2.forEach(list -> System.out.print(" " + list.getObj()));

        System.out.print("\n#3 Node - Result: " + chainValidator.validate(NodeList3) + " | Original list: ");
        NodeList3.forEach(list -> System.out.print(" " + list.getObj()));
    }
}
