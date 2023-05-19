/*
     * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
     * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Jogos;

/*
     * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
import Menus.Menu_Principal;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author jc374
 *
 */
public class Jogo_Da_Velha extends JFrame {

    JLabel lb = new JLabel("Jogo da velha");
    JButton[] bt = new JButton[9];
    boolean xo = false;
    boolean[] click = new boolean[9];
    JPanel painelFundo; // novo JPanel para o painel de fundo
    

    public Jogo_Da_Velha() {
        setResizable(false);
        setSize(400, 400); // define o tamanho do JFrame
        setLocationRelativeTo(null); // centraliza o JFrame na tela
        setVisible(true);
        setTitle("Jogo da Velha");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // criar painel de fundo
        painelFundo = new JPanel();
        painelFundo.setBackground(Color.BLACK);
        painelFundo.setLayout(null);

        add(painelFundo);

        JButton btn = new JButton(" ↲");
        btn.setBackground(Color.white);
        btn.setForeground(Color.BLACK);
        btn.setBounds(getWidth() - 65, 0, 47, 25); // define as coordenadas e tamanho do botão
        painelFundo.add(btn); // adiciona o botão ao painel de fundo

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                setVisible(false);
                dispose();
                Menu_Principal menuPrincipal = new Menu_Principal();
                menuPrincipal.setVisible(true);
            }
        });

        JLabel labelTopo = new JLabel("Jogo da Velha", SwingConstants.CENTER);
        labelTopo.setBounds(0, 0, getWidth(), 50);
        labelTopo.setFont(new Font("Arial", Font.BOLD, 20));
        labelTopo.setForeground(Color.WHITE);
        labelTopo.setOpaque(true);
        labelTopo.setBackground(Color.BLACK);

        painelFundo.add(labelTopo);

        // adicionar botões ao painel de fundo
        int cont = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                bt[cont] = new JButton();
                painelFundo.add(bt[cont]);
                bt[cont].setBounds((100 * i) + 50, (100 * j) + 50, 95, 95);
                cont++;
            }
        }

        for (int i = 0; i < 9; i++) {
            click[i] = false;
        }

        bt[0].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (click[0] == false) {
                    click[0] = true;
                    mudar(bt[0]);
                }
            }
        });

        bt[1].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (click[1] == false) {
                    click[1] = true;
                    mudar(bt[1]);
                }
            }
        });

        bt[2].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (click[2] == false) {
                    click[2] = true;
                    mudar(bt[2]);
                }
            }
        });

        bt[3].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (click[3] == false) {
                    click[3] = true;
                    mudar(bt[3]);
                }
            }
        });

        bt[4].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (click[4] == false) {
                    click[4] = true;
                    mudar(bt[4]);
                }
            }
        });

        bt[5].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (click[5] == false) {
                    click[5] = true;
                    mudar(bt[5]);
                }
            }
        });

        bt[6].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (click[6] == false) {
                    click[6] = true;
                    mudar(bt[6]);
                }
            }
        });

        bt[7].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (click[7] == false) {
                    click[7] = true;
                    mudar(bt[7]);
                }
            }
        });

        bt[8].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (click[8] == false) {
                    click[8] = true;
                    mudar(bt[8]);
                }
            }
        });

    }

    public void mudar(JButton btn) {
        if (xo) {
            btn.setText("O");
            xo = false;
            btn.setBackground(new Color(153, 179, 226)); // Define a cor de fundo do botão como vermelha
            btn.setForeground(xo ? Color.WHITE : Color.WHITE);

        } else {
            btn.setText("X");
            xo = true;
            btn.setBackground(new Color(139, 202, 180)); // Define a cor de fundo do botão como azul
            btn.setForeground(xo ? Color.WHITE : Color.WHITE);
        }
        ganhou();
    }

    public void ganhou() {
        int cont = 0;
        for (int i = 0; i < 9; i++) {
            if (click[i] == true) {
                cont++;
            }
        }
        if ((bt[0].getText() == "X" && bt[1].getText() == "X" && bt[2].getText() == "X")
                || (bt[3].getText() == "X" && bt[4].getText() == "X" && bt[5].getText() == "X")
                || (bt[6].getText() == "X" && bt[7].getText() == "X" && bt[8].getText() == "X")
                || (bt[0].getText() == "X" && bt[3].getText() == "X" && bt[6].getText() == "X")
                || (bt[1].getText() == "X" && bt[4].getText() == "X" && bt[7].getText() == "X")
                || (bt[2].getText() == "X" && bt[5].getText() == "X" && bt[0].getText() == "X")
                || (bt[0].getText() == "X" && bt[4].getText() == "X" && bt[8].getText() == "X")
                || (bt[6].getText() == "X" && bt[4].getText() == "X" && bt[2].getText() == "X")) {

            JOptionPane.showMessageDialog(null, "X GANHOU!!!!!!");

            limpar();
        } else if ((bt[0].getText() == "O" && bt[1].getText() == "O" && bt[2].getText() == "O")
                || (bt[3].getText() == "O" && bt[4].getText() == "O" && bt[5].getText() == "O")
                || (bt[6].getText() == "O" && bt[7].getText() == "O" && bt[8].getText() == "O")
                || (bt[0].getText() == "O" && bt[3].getText() == "O" && bt[6].getText() == "O")
                || (bt[1].getText() == "O" && bt[4].getText() == "O" && bt[7].getText() == "O")
                || (bt[2].getText() == "O" && bt[5].getText() == "O" && bt[0].getText() == "O")
                || (bt[0].getText() == "O" && bt[4].getText() == "O" && bt[8].getText() == "O")
                || (bt[6].getText() == "O" && bt[4].getText() == "O" && bt[2].getText() == "O")) {

            JOptionPane.showMessageDialog(null, "O GANHOU!!!!!!");

            limpar();
        } else if (cont == 9) {
            JOptionPane.showMessageDialog(null, "EMPATE !!!!!!!");
            limpar();
        }
    }

    public void limpar() {
        int contador = 0;
        for (int i = 0; i < 9; i++) {
            bt[i].setText("");
            bt[contador].setBackground(xo ? Color.WHITE : Color.WHITE);
            click[i] = false;
            contador++;
        }
    }

    public void limparJogo() {
        xo = false;
        for (int i = 0; i < 9; i++) {
            bt[i].setText("");
            click[i] = false;
            bt[i].setEnabled(true); // Habilita os botões novamente
        }
    }

    public static void main(String[] args) {
        new Jogo_Da_Velha();

    }
}
