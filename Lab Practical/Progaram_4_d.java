
interface Print1 {
    void print();
}

interface Show1 {
    void show();
}

class Document implements Print1, Show1 {
    
    public void print() {
        System.out.println("Printing document content");
    }

    public void show() {
        System.out.println("Showing document preview");
    }
}

public class Progaram_4_d {
    public static void main(String[] args) {
        Document doc = new Document();
        
        doc.print();
        doc.show();
    }
}