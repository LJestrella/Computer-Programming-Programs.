cd import java.awt.*;

class HelloGUI extends Frame {
    public HelloGUI() {
        super("Login Security System V.1"); 
        Button b1, b2;
        Label l1, l2;
        TextField t1, t2;

        l1 = new Label("USERNAME: ");
        l2 = new Label("PASSWORD: ");
    
        t1 = new TextField(10);
        t2 = new TextField(10); //password
        t2.setEchoChar('*');

        b1 = new Button("Okay");
        b2 = new Button("Cancel");
        
        setLayout(new GridLayout(3, 2));
        add(l1); 
        add(l2);
        add(t1);
        add(t2);
        add(b1);
        add(b2);
        pack();
        show();
          
    }
        public static void main (String Miles[]) {
            new HelloGUI();
        }  
}
