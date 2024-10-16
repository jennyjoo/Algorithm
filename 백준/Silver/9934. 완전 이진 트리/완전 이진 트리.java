import java.awt.color.ICC_ColorSpace;
import java.io.*;
import java.util.*;

public class Main {

    class Node{
        Node left = null;
        Node right = null;
        int num = -1;

        Node(Node left, Node right, int num){
            this.left = left;
            this.right = right;
            this.num = num;
        }

        Node(int num){
            this.num = num;
        }

        void addLeftChild(Node left){
            this.left = left;
        }
        void addRightChild(Node right){
            this.right = right;
        }
    }

    class Tree{
        Node root = null;

        Tree(Node root){this.root = root;}


    }

    private Node recursive(int[] arr, int l, int r){
        int mid = (l + r)/2;
        if(r - l + 1 == 3){
            Node root = new Node(arr[mid]);
            root.addLeftChild(new Node(arr[l]));
            root.addRightChild(new Node(arr[r]));
            return root;
        }

        int half = (mid - l)/2;
        Node ret = new Node(arr[mid]);
        ret.addLeftChild(recursive(arr, l,  mid-1));
        ret.addRightChild(recursive(arr, mid + 1, r));

        return ret;
    }
    private void solution(int[] arr){
        int mid = arr.length/2;
        Node root = recursive(arr, 0, arr.length - 1);

        Queue<Node> q = new LinkedList<>();

        q.offer(root);
        int depth = 1;
        while(!q.isEmpty()){

            for(int i = 1; i <= Math.pow(2, depth-1); i++){
                Node curr = q.poll();

                System.out.print(curr.num + " ");

                if(curr.left != null) q.offer(curr.left);
                if(curr.left != null) q.offer(curr.right);
            }
            System.out.println();

            depth++;
        }

    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[(int)Math.pow(2,N)-1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < Math.pow(2, N)-1; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        T.solution(arr);



    }


}
