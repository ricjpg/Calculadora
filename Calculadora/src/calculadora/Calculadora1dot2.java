/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.*;

/**
 *
 * @author Administrador
 */
public class Calculadora1dot2 extends JFrame {
    public float numeroEnLinea = 0.0f;
    public float lastNumber= 0.0f;
    public String ultimoSigno = "";
    public boolean tienePunto = false;
    public String cadenaNumeros = "";
    public String CadenaDot = "";
    public boolean tienePlus = false;
    public boolean tieneMinus = false;
    public boolean tieneTimes = false;
    public boolean tieneDiv = false;
    float respuesta = 0.0F;
    public ArrayList contenedorGeneral = new ArrayList();
    public ArrayList respuestas = new ArrayList();
    public ArrayList contenedorPlus = new ArrayList();
    public ArrayList contenedorMinus = new ArrayList();
    public ArrayList contenedorTimes = new ArrayList();
    public ArrayList contenedorDiv = new ArrayList();
    JFrame frame = new JFrame("CALCULADORA");
    JPanel panel = new JPanel();
    JTextField txtCaja = new JTextField();
    JButton btn0 = new JButton("0");
    JButton btn1 = new JButton("1");
    JButton btn2 = new JButton("2");
    JButton btn3 = new JButton("3");
    JButton btn4 = new JButton("4");
    JButton btn5 = new JButton("5");
    JButton btn6 = new JButton("6");
    JButton btn7 = new JButton("7");
    JButton btn8 = new JButton("8");
    JButton btn9 = new JButton("9");
    JButton btnPlus = new JButton("+");
    JButton btnMinus = new JButton("-");
    JButton btnTimes = new JButton("*");
    JButton btnDiv = new JButton("/");
    JButton btnDot = new JButton(".");
    JButton btnEquals = new JButton("=");

    public Calculadora1dot2() {

        this.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 4;
        this.add(txtCaja, gbc);
        txtCaja.setEditable(false);
        txtCaja.setBackground(Color.white);
        gbc.gridwidth = 1;

        gbc.gridx = 0;
        gbc.gridy = 1;
        this.add(btn7, gbc);
        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cadenaNumeros += btn7.getText();
                System.out.println(cadenaNumeros);
                txtCaja.setText(cadenaNumeros);
                lastNumber = Float.parseFloat(txtCaja.getText());
            }
        });
        gbc.gridx = 1;
        gbc.gridy = 1;
        this.add(btn8, gbc);
        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cadenaNumeros += btn8.getText();
                System.out.println(cadenaNumeros);
                txtCaja.setText(cadenaNumeros);
                lastNumber = Float.parseFloat(txtCaja.getText());
            }
        });
        gbc.gridx = 2;
        gbc.gridy = 1;
        this.add(btn9, gbc);
        btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cadenaNumeros += btn9.getText();
                System.out.println(cadenaNumeros);
                txtCaja.setText(cadenaNumeros);
                lastNumber = Float.parseFloat(txtCaja.getText());
            }
        });
        gbc.gridx = 3;
        gbc.gridy = 1;
        this.add(btnDiv, gbc);
        btnDiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cadenaNumeros = txtCaja.getText();
                respuesta = Float.parseFloat(txtCaja.getText());
                System.out.println(cadenaNumeros);
                contenedorGeneral.add(cadenaNumeros);
                System.out.println("Se leyo el digito: "+ cadenaNumeros);
                //respuesta /= Float.parseFloat(cadenaNumeros);
                
                cadenaNumeros = "";
                
                contenedorGeneral.add("/");
                System.out.println("La respuesta va en "+respuesta);
                ultimoSigno = "/";
            }
        });
        gbc.gridx = 0;
        gbc.gridy = 2;
        this.add(btn4, gbc);
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cadenaNumeros += btn4.getText();
                System.out.println(cadenaNumeros);
                txtCaja.setText(cadenaNumeros);
                lastNumber = Float.parseFloat(txtCaja.getText());
            }
        });

        gbc.gridx = 1;
        gbc.gridy = 2;
        this.add(btn5, gbc);
        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cadenaNumeros += btn5.getText();
                System.out.println(cadenaNumeros);
                txtCaja.setText(cadenaNumeros);
                lastNumber = Float.parseFloat(txtCaja.getText());
            }
        });

        gbc.gridx = 2;
        gbc.gridy = 2;
        this.add(btn6, gbc);
        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cadenaNumeros += btn6.getText();
                System.out.println(cadenaNumeros);
                txtCaja.setText(cadenaNumeros);
                lastNumber = Float.parseFloat(txtCaja.getText());
            }
        });

        gbc.gridx = 3;
        gbc.gridy = 2;
        this.add(btnTimes, gbc);
        btnTimes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("ingreso: "+txtCaja.getText());
                contenedorGeneral.add(txtCaja.getText());
                cadenaNumeros = txtCaja.getText();
                respuesta *= Float.parseFloat(txtCaja.getText());
                System.out.println("LA RESPUESTA AL MOMENTO ES:"+respuesta);
                txtCaja.setText("");
            }
        });
        gbc.gridx = 0;
        gbc.gridy = 3;
        this.add(btn1, gbc);
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cadenaNumeros += btn1.getText();
                System.out.println(cadenaNumeros);
                txtCaja.setText(cadenaNumeros);
                lastNumber = Float.parseFloat(txtCaja.getText());
                
            }
        });

        gbc.gridx = 1;
        gbc.gridy = 3;
        this.add(btn2, gbc);
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cadenaNumeros += btn2.getText();
                System.out.println(cadenaNumeros);
                txtCaja.setText(cadenaNumeros);
                lastNumber = Float.parseFloat(txtCaja.getText());
            }
        });

        gbc.gridx = 2;
        gbc.gridy = 3;
        this.add(btn3, gbc);
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cadenaNumeros += btn3.getText();
                System.out.println(cadenaNumeros);
                txtCaja.setText(cadenaNumeros);
                lastNumber = Float.parseFloat(txtCaja.getText());
            }
        });

        gbc.gridx = 3;
        gbc.gridy = 3;
        this.add(btnMinus, gbc);
        btnMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(cadenaNumeros);
                contenedorGeneral.add(cadenaNumeros);
                System.out.println("Se leyo el digito: "+ cadenaNumeros);
                respuesta = Float.parseFloat(cadenaNumeros);
                
                cadenaNumeros = "";
                
                contenedorGeneral.add("-");
                System.out.println("La respuesta va en "+respuesta);
                ultimoSigno = "-";
            }
        });
        
        gbc.gridx = 0;
        gbc.gridy = 4;
        this.add(btn0, gbc);
        btn0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cadenaNumeros += btn0.getText();
                System.out.println(cadenaNumeros);
                txtCaja.setText(cadenaNumeros);
                lastNumber = Float.parseFloat(txtCaja.getText());
            }
        });

        gbc.gridx = 1;
        gbc.gridy = 4;
        this.add(btnDot, gbc);
        btnDot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!tienePunto) {
                    cadenaNumeros += btnDot.getText();
                    tienePunto = true;
                    txtCaja.setText(cadenaNumeros);
                }
                System.out.println(cadenaNumeros);

            }
        });
        gbc.gridx = 2;
        gbc.gridy = 4;
        this.add(btnEquals, gbc);
        btnEquals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lastNumber = Float.parseFloat(txtCaja.getText());
                contenedorGeneral.add(txtCaja.getText());
                cadenaNumeros = "";
                System.out.println(contenedorGeneral);
                //contenedorPlus.clear();
                
                if(ultimoSigno.equals("+")){
                    respuesta += lastNumber;
                    System.out.println("---------------- de suma: "+respuesta);
                }if(ultimoSigno.equals("-")){
                    respuesta -= lastNumber;
                    System.out.println("---------------- de suma: "+respuesta);
                }if((ultimoSigno.equals("*"))){
                    respuesta *= lastNumber;
                    System.out.println("jkasjhdasjkdhasdk:   "+respuesta);
                }if(ultimoSigno.equals("/") && lastNumber==0){
                    System.out.println("division entre cero no esta definida");
                }if(ultimoSigno.equals("/")){
                    respuesta /= lastNumber;
                    System.out.println("---------------- de suma: "+respuesta);
                }
                System.out.println("la respuesta definitiva es: "+ respuesta);
                
                System.out.println("el ultimo signo registrado es: "+ultimoSigno);
                System.out.println("la ultima cadena regitrada es: "+
                        lastNumber);
                txtCaja.setText(String.valueOf(respuesta));
                respuesta = 0.0f;
                lastNumber = 0.0f;
                
            }
        });
        
        
        gbc.gridx = 3;
        gbc.gridy = 4;
        this.add(btnPlus, gbc);
        btnPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(cadenaNumeros);
                contenedorGeneral.add(cadenaNumeros);
                System.out.println("Se leyo el digito: "+ cadenaNumeros);
                respuesta += Float.parseFloat(cadenaNumeros);
                
                cadenaNumeros = "";
                
                contenedorGeneral.add("+");
                System.out.println("La respuesta va en "+respuesta);
                ultimoSigno = "+";
            }
        });

        frame.add(panel);

    }

    public void mostrar() {
        this.setVisible(true);
        this.setSize(300, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        Calculadora1dot2 calc = new Calculadora1dot2();

        calc.mostrar();
    }

}
