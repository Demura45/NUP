/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hotel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *
 * @author belgo
 */





public class Reader extends JFrame{

    String[][] n = { 
        { null, null, null, null, null }, //0
        { "Свободен", "1 человек      ", "Обычный         ", "  500", "номер никогда не использовался" },//1
        { "Свободен", "1 человек      ", "Полулюкс        ", "1000", "номер никогда не использовался" },//2
        { "Свободен", "1 человек      ", "Люкс                  ", "1500", "номер никогда не использовался" },//3 
        { "Свободен", "2 человека     ", "Обычный         ", "  750", "номер никогда не использовался" },//4
        { "Свободен", "2 человека     ", "Полулюкс        ", "1250", "номер никогда не использовался" },//5
        { "Свободен", "2 человека     ", "Люкс                  ", "1750", "номер никогда не использовался" },//6
        { "Свободен", "3 человека     ", "Обычный         ", "1000", "номер никогда не использовался" },//7
        { "Свободен", "3 человека     ", "Полулюкс        ", "1500", "номер никогда не использовался" },//8
        { "Свободен", "3 человека     ", "Люкс                  ", "2000", "номер никогда не использовался" } //9
    };

    String[][] kl = {
        { null, null, null, null, null },//0
        { null, null, null, null, null },//1
        { null, null, null, null, null },//2
        { null, null, null, null, null },//3
        { null, null, null, null, null },//4
        { null, null, null, null, null },//5
        { null, null, null, null, null },//6
        { null, null, null, null, null },//7
        { null, null, null, null, null },//8
        { null, null, null, null, null } //9
    };
    
    String net="кем";
    String kem="нет";
    String[] knop={net, net, net, net, net, net, net, net, net, net};
    String dat;
    
	JButton kk1, kk2, kk3, kk4, kk5, kk6, kk7, kk8, kk9, zac, vys;
	JLabel z1,nn1,LL1,n1,n2,n3,n4,n5,n6,n7,n8,n9,LL2,z2,LL3,LL4, g1, LL5, g2, LL6, g3,LL7,g4,LL8,g5,LL9,g6,LL10,g7,LL11,LL12, LL13, g8, LL14, g9, g10;
	JTextField t0,t1, t2, t3, t4, t5, vc1, vc2;	
	eHandler handler = new eHandler();
        
	public Reader(String s){
            
		super(s);
		setLayout(new FlowLayout());
                z1 = new JLabel("Список номеров");
                add(z1);
                LL1 = new JLabel("____________________________________________________________");
                add(LL1);
                
                nn1 = new JLabel("№|вместимость|комфортность|цена|занят     |");
                add(nn1);
                n1 = new JLabel("1   |"+n[1][1]+"|"+n[1][2]+"|"+n[1][3]+"|");
                add(n1);
                kk1 = new JButton(knop[1]);
                add(kk1);
                kk1.addActionListener(handler);
                n2 = new JLabel("2   |"+n[2][1]+"|"+n[2][2]+"|"+n[2][3]+"|");
                add(n2);
                kk2 = new JButton(knop[2]);
                add(kk2);
                kk2.addActionListener(handler);
                n3 = new JLabel("3   |"+n[3][1]+"|"+n[3][2]+"|"+n[3][3]+"|");
                add(n3);
                kk3 = new JButton(knop[3]);
                add(kk3);
                kk3.addActionListener(handler);
                n4 = new JLabel("4   |"+n[4][1]+"|"+n[4][2]+"|"+n[4][3]+"|");
                add(n4);
                kk4 = new JButton(knop[4]);
                add(kk4);
                kk4.addActionListener(handler);
                n5 = new JLabel("5   |"+n[5][1]+"|"+n[5][2]+"|"+n[5][3]+"|");
                add(n5);
                kk5 = new JButton(knop[5]);
                add(kk5);
                kk5.addActionListener(handler);
                n6 = new JLabel("6   |"+n[6][1]+"|"+n[6][2]+"|"+n[6][3]+"|");
                add(n6);
                kk6 = new JButton(knop[6]);
                add(kk6);
                kk6.addActionListener(handler);
                n7 = new JLabel("7   |"+n[7][1]+"|"+n[7][2]+"|"+n[7][3]+"|");
                add(n7);
                kk7 = new JButton(knop[7]);
                add(kk7);
                kk7.addActionListener(handler);
                n8 = new JLabel("8   |"+n[8][1]+"|"+n[8][2]+"|"+n[8][3]+"|");
                add(n8);
                kk8 = new JButton(knop[8]);
                add(kk8);
                kk8.addActionListener(handler);
                n9 = new JLabel("9   |"+n[9][1]+"|"+n[9][2]+"|"+n[9][3]+"|");
                add(n9);
                kk9 = new JButton(knop[9]);
                add(kk9);
                kk9.addActionListener(handler);
                LL2 = new JLabel("____________________________________________________________");
                add(LL2);
                LL3 = new JLabel("                                                                                                    ");
                add(LL3);
                z2 = new JLabel("Заселить в номер");
                add(z2);
                LL4 = new JLabel("____________________________________________________________");
                add(LL4);
                g1 = new JLabel("Заселить в №");
                add(g1);
                t0 = new JTextField(1);
                add(t0);
                LL5 = new JLabel("                                                                                                    ");
                add(LL5);
                g2 = new JLabel("Кого:");
                add(g2);
                LL6 = new JLabel("                                                                                                                            ");
                add(LL6);
                g4 = new JLabel("Имя:");
                add(g4);
                t1 = new JTextField(8);
                add(t1);
                LL8 = new JLabel("                                                                                            ");
                add(LL8);
                g3 = new JLabel("Фамилия:");
                add(g3);
                t2 = new JTextField(8);
                add(t2);
                LL7 = new JLabel("                                                                                  ");
                add(LL7);
                g5 = new JLabel("Отчество:");
                add(g5);
                t3 = new JTextField(8);
                add(t3);
                LL9 = new JLabel("                                                                                  ");
                add(LL9);
                g6 = new JLabel("Комментарий:");
                add(g6);
                t4 = new JTextField(20);
                add(t4);
                LL10 = new JLabel("                               ");
                add(LL10);
                g7 = new JLabel("Дата поcеления:");
                add(g7);
                t5 = new JTextField(6);
                add(t5);
                LL11 = new JLabel("                                                                            ");
                add(LL11);
                zac = new JButton("Заселить");
                add(zac);
                zac.addActionListener(handler);
                LL12 = new JLabel("____________________________________________________________");
                add(LL12);
                LL13 = new JLabel("                                                                                                         ");
                add(LL13);
                g8 = new JLabel("Высилить из номера");
                add(g8);
                LL14 = new JLabel("____________________________________________________________");
                add(LL14);
                g9 = new JLabel("Высилить из №");
                add(g9);
                vc1 = new JTextField(1);
                add(vc1);
                g10 = new JLabel("Дата выселения:");
                add(g10);
                vc2 = new JTextField(6);
                add(vc2);
                vys = new JButton("Высилить");
                add(vys);
                vys.addActionListener(handler);
	}
	
	public class eHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			try{	
				if(e.getSource()==zac){
                                 if(Integer.parseInt(t0.getText())>=1 && Integer.parseInt(t0.getText())<=9){   
                                     dat="";                              
        String regex = "([0-3]\\d+)/([0-1]\\d+)/(\\d+)*";
        String s = t5.getText();
        String end_str = "";
        Pattern p2 = Pattern.compile(regex);
        Matcher m2 = p2.matcher(s);
        while (m2.find()) {
            if (Integer.parseInt(m2.group().substring(6, 10)) % 2 == 0 &&
                    Integer.parseInt(m2.group().substring(6, 10)) % 4 == 0 &&
                    Integer.parseInt(m2.group().substring(6, 10)) % 6 != 0){
                System.out.println(m2.group().substring(6, 10));
            }else{
                //System.out.println(m2.group().substring(3, 5));
                if (Integer.parseInt(m2.group().substring(3, 5)) == 2){
                    System.out.println(m2.group().substring(3, 5));
                    if (Integer.parseInt(m2.group().substring(0, 2)) >= 28) continue; 
                }
            }
            System.out.println(m2.group().substring(0, 2));
            
            if (Integer.parseInt(m2.group().substring(0, 1)) > 31) continue;
            if (Integer.parseInt(m2.group().substring(3, 5)) > 12) continue;
            System.out.println("Date " + m2.group().substring(6, 10));
            end_str = end_str + m2.group() + "\n";
        }
        dat=end_str;
        
        if (dat!="") {
               switch(Integer.parseInt(t0.getText())){

     case 1:
     kl[1][0]=t1.getText();
     kl[1][1]=t2.getText();
     kl[1][2]=t3.getText();
     kl[1][3]=t4.getText();
     kl[1][4]=t5.getText();
     knop[1]=kem;
     t0.setText(null);
     t1.setText(null);
     t2.setText(null);
     t3.setText(null);
     t4.setText(null);
     t5.setText(null);
     JOptionPane.showMessageDialog(null, "Заселен");
     break;

     case 2:
     kl[2][0]=t1.getText();
     kl[2][1]=t2.getText();
     kl[2][2]=t3.getText();
     kl[2][3]=t4.getText();
     kl[2][4]=t5.getText();
     knop[2]=kem;
     t0.setText(null);
     t1.setText(null);
     t2.setText(null);
     t3.setText(null);
     t4.setText(null);
     t5.setText(null);
     JOptionPane.showMessageDialog(null, "Заселен");
     break;

     case 3:
     kl[3][0]=t1.getText();
     kl[3][1]=t2.getText();
     kl[3][2]=t3.getText();
     kl[3][3]=t4.getText();
     kl[3][4]=t5.getText();
     knop[3]=kem;
     t0.setText(null);
     t1.setText(null);
     t2.setText(null);
     t3.setText(null);
     t4.setText(null);
     t5.setText(null);
     JOptionPane.showMessageDialog(null, "Заселен");
     break;

     case 4:
     kl[4][0]=t1.getText();
     kl[4][1]=t2.getText();
     kl[4][2]=t3.getText();
     kl[4][3]=t4.getText();
     kl[4][4]=t5.getText();
     knop[4]=kem;
     t0.setText(null);
     t1.setText(null);
     t2.setText(null);
     t3.setText(null);
     t4.setText(null);
     t5.setText(null);
     JOptionPane.showMessageDialog(null, "Заселен");
     break;
         
     case 5:
     kl[5][0]=t1.getText();
     kl[5][1]=t2.getText();
     kl[5][2]=t3.getText();
     kl[5][3]=t4.getText();
     kl[5][4]=t5.getText();
     knop[5]=kem;
     t0.setText(null);
     t1.setText(null);
     t2.setText(null);
     t3.setText(null);
     t4.setText(null);
     t5.setText(null);
     JOptionPane.showMessageDialog(null, "Заселен");
     break;
         
     case 6:
     kl[6][0]=t1.getText();
     kl[6][1]=t2.getText();
     kl[6][2]=t3.getText();
     kl[6][3]=t4.getText();
     kl[6][4]=t5.getText();
     knop[6]=kem;
     t0.setText(null);
     t1.setText(null);
     t2.setText(null);
     t3.setText(null);
     t4.setText(null);
     t5.setText(null);
     JOptionPane.showMessageDialog(null, "Заселен");
     break;
         
     case 7:
     kl[7][0]=t1.getText();
     kl[7][1]=t2.getText();
     kl[7][2]=t3.getText();
     kl[7][3]=t4.getText();
     kl[7][4]=t5.getText();
     knop[7]=kem;
     t0.setText(null);
     t1.setText(null);
     t2.setText(null);
     t3.setText(null);
     t4.setText(null);
     t5.setText(null);
     JOptionPane.showMessageDialog(null, "Заселен");
     break;
         
     case 8:
     kl[8][0]=t1.getText();
     kl[8][1]=t2.getText();
     kl[8][2]=t3.getText();
     kl[8][3]=t4.getText();
     kl[8][4]=t5.getText();
     knop[8]=kem;
     t0.setText(null);
     t1.setText(null);
     t2.setText(null);
     t3.setText(null);
     t4.setText(null);
     t5.setText(null);
     JOptionPane.showMessageDialog(null, "Заселен");
     break;
         
     case 9:
     kl[9][0]=t1.getText();
     kl[9][1]=t2.getText();
     kl[9][2]=t3.getText();
     kl[9][3]=t4.getText();
     kl[9][4]=t5.getText();
     knop[9]=kem;
     t0.setText(null);
     t1.setText(null);
     t2.setText(null);
     t3.setText(null);
     t4.setText(null);
     t5.setText(null);
     JOptionPane.showMessageDialog(null, "Заселен");
     break;

     default:
     System.out.println("Ошибка");
     break;
 }
        }
        
        else {JOptionPane.showMessageDialog(null, "Введён недопустимый формат даты");}
            
                                        
                                        
				}
                                 else {JOptionPane.showMessageDialog(null, "Такого номера не существует");}
                        }
                                
                             if(e.getSource()==kk1){
				if (knop[1]==net){JOptionPane.showMessageDialog(null, "Номер пуст"+"\n"+"Дата освобождения номера: "+n[1][4]);}	
				  
                                if (knop[1]==kem) {JOptionPane.showMessageDialog(null, "Имя:"+kl[1][0]+"\n"+"Фамилия:"+kl[1][1]+"\n"+"Отчество:"+kl[1][2]+"\n"+"Комментарий:"+kl[1][3]+"\n"+"Дата поселения:"+kl[1][4]);}
                             }
				
                                if(e.getSource()==kk2){
				if (knop[2]==net){JOptionPane.showMessageDialog(null, "Номер пуст"+"\n"+"Дата освобождения номера: "+n[2][4]);}	
                                if (knop[2]==kem) {JOptionPane.showMessageDialog(null, "Имя:"+kl[2][0]+"\n"+"Фамилия:"+kl[2][1]+"\n"+"Отчество:"+kl[2][2]+"\n"+"Комментарий:"+kl[2][3]+"\n"+"Дата поселения:"+kl[2][4]);}
                                }
                                
                                if(e.getSource()==kk3){
				if (knop[3]==net){JOptionPane.showMessageDialog(null, "Номер пуст"+"\n"+"Дата освобождения номера: "+n[3][4]);}	   
                                if (knop[3]==kem) {JOptionPane.showMessageDialog(null, "Имя:"+kl[3][0]+"\n"+"Фамилия:"+kl[3][1]+"\n"+"Отчество:"+kl[3][2]+"\n"+"Комментарий:"+kl[3][3]+"\n"+"Дата поселения:"+kl[3][4]);}
                                }
                                
                                if(e.getSource()==kk4){
				if (knop[4]==net){JOptionPane.showMessageDialog(null, "Номер пуст"+"\n"+"Дата освобождения номера: "+n[4][4]);}	   
                                if (knop[4]==kem) {JOptionPane.showMessageDialog(null, "Имя:"+kl[4][0]+"\n"+"Фамилия:"+kl[4][1]+"\n"+"Отчество:"+kl[4][2]+"\n"+"Комментарий:"+kl[4][3]+"\n"+"Дата поселения:"+kl[4][4]);}
                                }
                                
                                if(e.getSource()==kk5){
				if (knop[5]==net){JOptionPane.showMessageDialog(null, "Номер пуст"+"\n"+"Дата освобождения номера: "+n[5][4]);}	   
                                if (knop[5]==kem) {JOptionPane.showMessageDialog(null, "Имя:"+kl[5][0]+"\n"+"Фамилия:"+kl[5][1]+"\n"+"Отчество:"+kl[5][2]+"\n"+"Комментарий:"+kl[5][5]+"\n"+"Дата поселения:"+kl[5][4]);}
                                }
                                
                                if(e.getSource()==kk6){
				if (knop[6]==net){JOptionPane.showMessageDialog(null, "Номер пуст"+"\n"+"Дата освобождения номера: "+n[6][4]);}	   
                                if (knop[6]==kem) {JOptionPane.showMessageDialog(null, "Имя:"+kl[6][0]+"\n"+"Фамилия:"+kl[6][1]+"\n"+"Отчество:"+kl[6][2]+"\n"+"Комментарий:"+kl[6][3]+"\n"+"Дата поселения:"+kl[6][4]);}
                                }
                                
                                if(e.getSource()==kk7){
				if (knop[7]==net){JOptionPane.showMessageDialog(null, "Номер пуст"+"\n"+"Дата освобождения номера: "+n[7][4]);}	   
                                if (knop[7]==kem) {JOptionPane.showMessageDialog(null, "Имя:"+kl[7][0]+"\n"+"Фамилия:"+kl[7][1]+"\n"+"Отчество:"+kl[7][2]+"\n"+"Комментарий:"+kl[7][3]+"\n"+"Дата поселения:"+kl[7][4]);}
                                }
                                
                                if(e.getSource()==kk8){
				if (knop[8]==net){JOptionPane.showMessageDialog(null, "Номер пуст"+"\n"+"Дата освобождения номера: "+n[8][4]);}	   
                                if (knop[8]==kem) {JOptionPane.showMessageDialog(null, "Имя:"+kl[8][0]+"\n"+"Фамилия:"+kl[8][1]+"\n"+"Отчество:"+kl[8][2]+"\n"+"Комментарий:"+kl[8][3]+"\n"+"Дата поселения:"+kl[8][4]);}
                                }
                                
                                if(e.getSource()==kk9){
				if (knop[9]==net){JOptionPane.showMessageDialog(null, "Номер пуст"+"\n"+"Дата освобождения номера: "+n[9][4]);}	   
                                if (knop[9]==kem) {JOptionPane.showMessageDialog(null, "Имя:"+kl[9][0]+"\n"+"Фамилия:"+kl[9][1]+"\n"+"Отчество:"+kl[9][2]+"\n"+"Комментарий:"+kl[9][3]+"\n"+"Дата поселения:"+kl[9][4]);}
                                }
                                
                                if(e.getSource()==vys){
                                 if(Integer.parseInt(vc1.getText())>=1 && Integer.parseInt(vc1.getText())<=9){
                                     dat="";                 
        String regex = "([0-3]\\d+)/([0-1]\\d+)/(\\d+)*";
        String s = vc2.getText();
        String end_str = "";
        Pattern p2 = Pattern.compile(regex);
        Matcher m2 = p2.matcher(s);
        while (m2.find()) {
            if (Integer.parseInt(m2.group().substring(6, 10)) % 2 == 0 &&
                    Integer.parseInt(m2.group().substring(6, 10)) % 4 == 0 &&
                    Integer.parseInt(m2.group().substring(6, 10)) % 6 != 0){
                System.out.println(m2.group().substring(6, 10));
            }else{
                //System.out.println(m2.group().substring(3, 5));
                if (Integer.parseInt(m2.group().substring(3, 5)) == 2){
                    System.out.println(m2.group().substring(3, 5));
                    if (Integer.parseInt(m2.group().substring(0, 2)) >= 28) continue; 
                }
            }
            System.out.println(m2.group().substring(0, 2));
            
            if (Integer.parseInt(m2.group().substring(0, 1)) > 31) continue;
            if (Integer.parseInt(m2.group().substring(3, 5)) > 12) continue;
            System.out.println("Date " + m2.group().substring(6, 10));
            end_str = end_str + m2.group() + "\n";
        }
        dat=end_str;
        
        if (dat!="") {
             
        switch(Integer.parseInt(vc1.getText())){

     case 1:
     if (knop[1]==kem) {
     kl[1][0]=null;
     kl[1][1]=null;
     kl[1][2]=null;
     kl[1][3]=null;
     kl[1][4]=null;
     knop[1]=net;
     n[1][4]=vc2.getText();
     vc1.setText(null);
     vc2.setText(null);
     JOptionPane.showMessageDialog(null, "Выселен");
     }
     else{JOptionPane.showMessageDialog(null, "Выселить невозможно клиента нет");}
     break;

     case 2:
     if (knop[2]==kem) {
     kl[2][0]=null;
     kl[2][1]=null;
     kl[2][2]=null;
     kl[2][3]=null;
     kl[2][4]=null;
     knop[2]=net;
     n[2][4]=vc2.getText();
     vc1.setText(null);
     vc2.setText(null);
     JOptionPane.showMessageDialog(null, "Выселен");
     }
     else{JOptionPane.showMessageDialog(null, "Выселить невозможно клиента нет");}
     
     break;

     case 3:
     if (knop[3]==kem) {
     kl[3][0]=null;
     kl[3][1]=null;
     kl[3][2]=null;
     kl[3][3]=null;
     kl[3][4]=null;
     knop[3]=net;
     n[3][4]=vc2.getText();
     vc1.setText(null);
     vc2.setText(null);
     JOptionPane.showMessageDialog(null, "Выселен");
     }
     else{JOptionPane.showMessageDialog(null, "Выселить невозможно клиента нет");}
     break;

     case 4:
     if (knop[4]==kem) {
     kl[4][0]=null;
     kl[4][1]=null;
     kl[4][2]=null;
     kl[4][3]=null;
     kl[4][4]=null;
     knop[4]=net;
     n[4][4]=vc2.getText();
     vc1.setText(null);
     vc2.setText(null);
     JOptionPane.showMessageDialog(null, "Выселен");
     }
     else{JOptionPane.showMessageDialog(null, "Выселить невозможно клиента нет");}
     break;
         
     case 5:
     if (knop[5]==kem) {
     kl[5][0]=null;
     kl[5][1]=null;
     kl[5][2]=null;
     kl[5][3]=null;
     kl[5][4]=null;
     knop[5]=net;
     n[5][4]=vc2.getText();
     vc1.setText(null);
     vc2.setText(null);
     JOptionPane.showMessageDialog(null, "Выселен");
     }
     else{JOptionPane.showMessageDialog(null, "Выселить невозможно клиента нет");}
     break;
         
     case 6:
     if (knop[6]==kem) {
     kl[6][0]=null;
     kl[6][1]=null;
     kl[6][2]=null;
     kl[6][3]=null;
     kl[6][4]=null;
     knop[6]=net;
     n[6][4]=vc2.getText();
     vc1.setText(null);
     vc2.setText(null);
     JOptionPane.showMessageDialog(null, "Выселен");
     }
     else{JOptionPane.showMessageDialog(null, "Выселить невозможно клиента нет");}
     break;
         
     case 7:
     if (knop[7]==kem) {
     kl[7][0]=null;
     kl[7][1]=null;
     kl[7][2]=null;
     kl[7][3]=null;
     kl[7][4]=null;
     knop[7]=net;
     n[7][4]=vc2.getText();
     vc1.setText(null);
     vc2.setText(null);
     JOptionPane.showMessageDialog(null, "Выселен");
     }
     else{JOptionPane.showMessageDialog(null, "Выселить невозможно клиента нет");}
     break;
         
     case 8:
     if (knop[8]==kem) {
     kl[8][0]=null;
     kl[8][1]=null;
     kl[8][2]=null;
     kl[8][3]=null;
     kl[8][4]=null;
     knop[8]=net;
     n[8][4]=vc2.getText();
     vc1.setText(null);
     vc2.setText(null);
     JOptionPane.showMessageDialog(null, "Выселен");
     }
     else{JOptionPane.showMessageDialog(null, "Выселить невозможно клиента нет");}
     break;
         
     case 9:
     if (knop[9]==kem) {
     kl[9][0]=null;
     kl[9][1]=null;
     kl[9][2]=null;
     kl[9][3]=null;
     kl[9][4]=null;
     knop[9]=net;
     n[9][4]=vc2.getText();
     vc1.setText(null);
     vc2.setText(null);
     JOptionPane.showMessageDialog(null, "Выселен");
     }
     else{JOptionPane.showMessageDialog(null, "Выселить невозможно клиента нет");}
     break;

     default:
     System.out.println("Ошибка");
     break;
 }    
            
        }
        else {JOptionPane.showMessageDialog(null, "Введён недопустимый формат даты");}
        
        
        
                                     
                                 }
                                 else {JOptionPane.showMessageDialog(null, "Такого номера не существует");}
                                 }
                                
			}catch (Exception ex){ JOptionPane.showMessageDialog(null, "Поля ввода пусты"); }
		}
		
	}
}

