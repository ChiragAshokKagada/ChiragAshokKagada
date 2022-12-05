package ChattingApplicationProject;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Server implements ActionListener {

    JTextField text;
    JPanel a1 ;
    static Box vertical = Box.createVerticalBox();
    static JFrame f = new JFrame();
    static DataOutputStream dout ;

    Server(){
        // Setting Panel Layout For Profile
        f.setLayout(null);
        JPanel p1 = new JPanel();
        p1.setBackground(new Color(21, 85, 78));
        p1.setBounds(0,0,450,70);
        p1.setLayout(null);
        f.add(p1);


        // Setting Image Icon for Exiting the application
        ImageIcon i1 = new ImageIcon("FAMILY PICTURES/3.png");
        Image i2 = i1.getImage().getScaledInstance(25,25,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel back = new JLabel(i3);
        back.setBounds(5,20,25,25);
        p1.add(back);
        back.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                System.exit(0);
            }
        });


        // Setting profile of the user
        ImageIcon i4 = new ImageIcon("FAMILY PICTURES/Chirag.jpg");
        Image i5 = i4.getImage().getScaledInstance(50,50,Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel profile = new JLabel(i6);
        profile.setBounds(40,10,50,50);
        p1.add(profile);


        // Setting video icon in the application
        ImageIcon i7 = new ImageIcon("FAMILY PICTURES/video.png");
        Image i8 = i7.getImage().getScaledInstance(50,50,Image.SCALE_DEFAULT);
        ImageIcon i9 = new ImageIcon(i8);
        JLabel video = new JLabel(i9);
        video.setBounds(300,20,30,30);
        p1.add(video);


        // Setting phone icon in the application
        ImageIcon i10 = new ImageIcon("FAMILY PICTURES/phone.png");
        Image i11 = i10.getImage().getScaledInstance(50,50,Image.SCALE_DEFAULT);
        ImageIcon i12 = new ImageIcon(i11);
        JLabel phone = new JLabel(i12);
        phone.setBounds(360,20,30,30);
        p1.add(phone);


        // Setting Options icon
        ImageIcon i13 = new ImageIcon("FAMILY PICTURES/3icon.png");
        Image i14 = i13.getImage().getScaledInstance(10,25,Image.SCALE_DEFAULT);
        ImageIcon i15 = new ImageIcon(i14);
        JLabel morevert = new JLabel(i15);
        morevert.setBounds(420,20,10,25);
        p1.add(morevert);


        // Providing Profile Name to the User
        JLabel name = new JLabel("Chirag ");
        name.setBounds(110,15,100,18);
        name.setForeground(Color.WHITE);
        name.setFont(new Font("SAN_SERIF",Font.BOLD,18));
        p1.add(name);


        // Providing status of the user whether he is active or inActive
        JLabel status = new JLabel("Active Now");
        status.setBounds(110,35,100,18);
        status.setForeground(Color.WHITE);
        status.setFont(new Font("SAN_SERIF",Font.BOLD,14));
        p1.add(status);


        // Creating a separate panel/area for the messages
        a1 = new JPanel();
        a1.setBounds(5,75,440,570);
        f.add(a1);


        // Creating the text field for text messages
        text = new JTextField();
        text.setBounds(5,655,310,40);
        text.setFont(new Font("SANS_SERIF",Font.PLAIN,16));
        f.add(text);


        // Creating button to send the messages
        JButton send = new JButton("Send");
        send.setBounds(320,655,123,40);
        send.setBackground(new Color(43, 137, 127));
        send.setForeground(Color.WHITE);
        send.addActionListener(this);
        text.setFont(new Font("SANS_SERIF",Font.PLAIN,16));
        f.add(send);


        // Setting the entire application layout for the application in terms of size of the screen
        f.setSize(450,700);
        f.setLocation(200,50);
        f.setUndecorated(true);
        f.getContentPane().setBackground(Color.WHITE);
        f.setVisible(true);
    }


    public void actionPerformed(ActionEvent e) {
        try {
            String out = text.getText();
            JPanel p2 = formatLabel(out);

            a1.setLayout(new BorderLayout());

            JPanel right = new JPanel(new BorderLayout());
            right.add(p2, BorderLayout.LINE_END);

            vertical.add(right);
            vertical.add(Box.createVerticalStrut(15));

            a1.add(vertical, BorderLayout.PAGE_START);

            dout.writeUTF(out);
            text.setText("");

            f.repaint();
            f.invalidate();
            f.validate();
        }catch (Exception ae){
           ae.printStackTrace();
        }
    }

    public static JPanel formatLabel(String out){
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));

        JLabel output = new JLabel("<html><p style = \"width : 150px \">" + out + "</p></html");
        output.setFont(new Font("Tahoma",Font.PLAIN,16));

        output.setBackground(new Color(17, 164, 72));
        output.setOpaque(true);

        output.setBorder(new EmptyBorder(15,15,15,50));
        panel.add(output);

        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");

        JLabel time = new JLabel();
        time.setText(sdf.format(cal.getTime()));

        panel.add(time);
        return panel ;
    }

    public static void main(String[] args){
        new Server();

        try{
            ServerSocket skt = new ServerSocket(6001);
            while(true){
                Socket s = skt.accept();
                DataInputStream din = new DataInputStream(s.getInputStream());
                dout = new DataOutputStream(s.getOutputStream());

                while(true){
                    String msg = din.readUTF();
                    JPanel panel = formatLabel(msg);

                    JPanel left = new JPanel(new BorderLayout());
                    left.add(panel,BorderLayout.LINE_START);
                    vertical.add(left);
                    f.validate();
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
