import javax.swing.*;
import java.awt.FlowLayout;

public class SimpleCalculator {
	
	public static void main(String[] args) {
		
		// Создаем панель
		
		   JPanel windowContent = new JPanel();
		   
		// Задаем менеджер отображения для этой панели
		   
		   FlowLayout f1 = new FlowLayout();
		   windowContent.setLayout(f1);
		   
		// Создаем компоненты в памяти
		   
		   JLabel labell = new JLabel("Number 1:");
		   JTextField field1 = new JTextField(10);
		   JLabel label2 = new JLabel("Number 2:");
		   JTextField field2 = new JTextField(10);
		   JLabel label3 = new JLabel("Sum:");
		   JTextField result = new JTextField(10);
		   JButton go = new JButton("Add");
		
		// Добавляем компоненты в панель
		   
		   windowContent.add(labell);
		   windowContent.add(field1);
		   windowContent.add(label2);
		   windowContent.add(field2);
		   windowContent.add(label3);
		   windowContent.add(result);
		   windowContent.add(go);
		   
		// Создаем фрейм и задаем для него панель
		   
		   JFrame frame = new JFrame("My First Calculator");
		   frame.setContentPane(windowContent);
		   
		// Задаем размер и делаем фрейм видимым 
		   
		   frame.setSize(400,100);
		   frame.setVisible(true);
		   	   
	}	
}
