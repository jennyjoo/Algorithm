import java.io.*;
import java.util.*;

public class Main {

    class Node{
        int num;
        Node left = null;
        Node right = null;

        Node(int num){
            this.num = num;
        }

        void addLeft(Node left){
            this.left = left;
        }

        void addRight(Node right){
            this.right = right;
        }

    }

    class Tree{
        Node root;
        Tree(Node root){
            this.root = root;
        }

        void addNode(Node pointer, Node node){
            if(pointer.num > node.num){
                if(pointer.left == null){
                    pointer.left = node;
                    return;
                }
                addNode(pointer.left, node);
            }
            else{
                if(pointer.right == null){
                    pointer.right = node;
                    return;
                }
                addNode(pointer.right, node);
            }
        }

        void search(Node pointer){
            if(pointer.left != null) search(pointer.left);
            if(pointer.right != null) search(pointer.right);
            System.out.println(pointer.num);
        }
    }


    private void solution(Queue<Integer> list){
        if(list.isEmpty()) return;
        Node root = new Node(list.poll());
        Tree tree = new Tree(root);

        while(!list.isEmpty()){
            tree.addNode(root, new Node(list.poll()));
        }

        tree.search(root);
    }
    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        Queue<Integer> str = new LinkedList<>();
        String input;
        while((input = br.readLine()) != null && !input.isEmpty()){
            int in = Integer.parseInt(input);
            str.offer(in);
        }

        T.solution(str);

    }


}
