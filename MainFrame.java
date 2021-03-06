import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MainFrame extends JFrame
{
Container c;
JButton btnAdd, btnView, btnUpdate, btnDelete, btnChart;

MainFrame()
{
c = getContentPane();
c.setLayout(null);
//c.setLayout(new FlowLayout());
	JLabel background;
	ImageIcon img = new ImageIcon("C:\\navya_docs\\demo\\java\\project1\\Main_img.jpg");
	background = new JLabel("" ,img , JLabel.CENTER);
	background.setBounds(2,2, 800, 532);
btnAdd = new JButton("Add");
btnView = new JButton("View");
btnUpdate = new JButton("Update");
btnDelete = new JButton("Delete");
btnChart = new JButton("Chart");

//btnAdd.setBounds(x,y,w,h)

btnAdd.setBounds(210, 130, 150, 50);
btnView.setBounds(450, 130, 150, 50);
btnUpdate.setBounds(210, 230, 150, 50);
btnDelete.setBounds(450, 230, 150, 50);
btnChart.setBounds(330, 330, 150, 50);

btnAdd.setFont(new Font("Times new roman",Font.BOLD,20));
btnAdd.setForeground(Color.blue);
btnAdd.setBackground(Color.yellow);
btnView.setFont(new Font("Times new roman",Font.BOLD,20));
btnView.setForeground(Color.blue);
btnView.setBackground(Color.yellow);
btnUpdate.setFont(new Font("Times new roman",Font.BOLD,20));
btnUpdate.setForeground(Color.blue);
btnUpdate.setBackground(Color.yellow);
btnDelete.setFont(new Font("Times new roman",Font.BOLD,20));
btnDelete.setForeground(Color.blue);
btnDelete.setBackground(Color.yellow);
btnChart.setFont(new Font("Times new roman",Font.BOLD,20));
btnChart.setForeground(Color.blue);
btnChart.setBackground(Color.yellow);

c.add(btnAdd);
c.add(btnView);
c.add(btnUpdate);
c.add(btnDelete);
c.add(btnChart);
add(background);

ActionListener a1 = (ae) -> { AddFrame af = new AddFrame(); 
dispose(); 
};
btnAdd.addActionListener(a1);							// control will goto AddFrame

ActionListener a2 = (ae) -> { ViewFrame vf = new ViewFrame(); 
dispose(); 
};
btnView.addActionListener(a2);

ActionListener a3 = (ae) -> { UpdateFrame uf = new UpdateFrame(); 
dispose(); 
};
btnUpdate.addActionListener(a3);

ActionListener a4 = (ae) -> { DeleteFrame df = new DeleteFrame(); 
dispose(); 
};
btnDelete.addActionListener(a4);

ActionListener a5 = (ae) -> { Chart c = new Chart(); 
};
btnChart.addActionListener(a5);							

setTitle("Student Management System");
setSize(800,558);
setResizable(false);
setLocationRelativeTo(null);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setDefaultLookAndFeelDecorated(true);
setVisible(true);
}
}