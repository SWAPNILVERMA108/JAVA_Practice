class human {
    public void eat(){
        System.out.println("boy is eat");
    }

    
}
class boy extends human{
    public void eat(){
        System.out.println("human is eating");
    }
    
}
class test {
    public static void main(String args[]){
        boy b1 = new boy();
        b1.eat();
        human h1 = new human();
        h1.eat();
    
    }

    
}
