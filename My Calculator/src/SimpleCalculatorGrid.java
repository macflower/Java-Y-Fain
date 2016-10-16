import javax.swing.*;
import java.awt.GridLayout;

public class SimpleCalculatorGrid {
	
	public static void main(String[] args){
		
     // Создаем панель
		
		JPanel windowContent = new JPanel();
		
	 // Задаём менеджер расположения для этой панели
		
		GridLayout gl = new GridLayout(4,2);
		
		windowContent.setLayout(gl);
		
	  // Создаем компоненты в памяти
		
		JLabel labell = new JLabel("Number 1:");
		
		JTextField fieldl = new JTextField(10);
		
        JLabel label2 = new JLabel("Number 2:");
		
		JTextField field2 = new JTextField(10);
		
        JLabel label3 = new JLabel("Sum:");
		
		JTextField result = new JTextField(10);
		
		JButton go = new JButton("Add");
		
	  // Добавляем компоненты в панель
		
		windowContent.add(labell);
		windowContent.add(fieldl);
		windowContent.add(label2);
		windowContent.add(field2);
		windowContent.add(label3);
		windowContent.add(result);
		windowContent.add(go);
		
	  // Создаем фрейм и задаем панель для него
		JFrame frame = new JFrame("My First Calculator");
		
		frame.setContentPane(windowContent);
		
		
	  // Задаем размер и отображаем окно
		
		frame.setSize(400,100);
		frame.setVisible(true);
	}	
}
