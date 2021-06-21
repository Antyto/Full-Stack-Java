

public class SinglyLinkedList {
    public Node head;
    
    public SinglyLinkedList() {
        this.head = null;
    }
    
  //Los metodos de la SLL van aqui. Al principio, les mostraremos cómo agregar nodos a la lista.    
    public void add(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    } 
    
    public void remove(){
        if(this.head != null){
            Node quitar = this.head;
            while(quitar.next.next != null){
            	quitar = quitar.next;
            }
            quitar.next = null;
        }
    }
    

    public void printValues() {
    	if(this.head != null){
            Node print = this.head;
            while(print.next != null){
                System.out.println(print.value);
                print = print.next;
            }
        }
    }
    

}