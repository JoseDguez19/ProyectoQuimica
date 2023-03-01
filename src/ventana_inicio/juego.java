/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventana_inicio;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;
/**
 *
 * @author Casa
 */
public class juego extends javax.swing.JFrame {
    
     public ImageIcon imgs[];
    public JButton btns[];
    public String msgs[];
    public int ran;
    public int err;
    public int err2;
    public String res[];
    
    public juego() {
        initComponents();
        setSize(1340,650);//cambiar tamaÃ±o de la ventana
        this.setLocationRelativeTo(null);//posicion de la ventana
        
        Image icon=new ImageIcon(getClass().getResource("/imagenes/hol.png")).getImage();
        setIconImage(icon);
        
        imgs = new ImageIcon[15];
        btns = new JButton[28];
        msgs = new String[129];
        
        //imganes fallos 
        
        imgs[0] = new ImageIcon(getClass().getResource("/imagenes/im1.png"));
        imgs[1] = new ImageIcon(getClass().getResource("/imagenes/im2.png"));
        imgs[2] = new ImageIcon(getClass().getResource("/imagenes/im3.png"));
        imgs[3] = new ImageIcon(getClass().getResource("/imagenes/im4.png"));
        imgs[4] = new ImageIcon(getClass().getResource("/imagenes/im5.png"));
        imgs[5] = new ImageIcon(getClass().getResource("/imagenes/im6.png"));
        imgs[6] = new ImageIcon(getClass().getResource("/imagenes/im7.png"));

        
       imgs[7] = new ImageIcon(getClass().getResource("/imagenes/fallo0.png"));
       imgs[8] = new ImageIcon(getClass().getResource("/imagenes/fallo1.png"));
       imgs[9] = new ImageIcon(getClass().getResource("/imagenes/fallo2.png"));
       imgs[10] = new ImageIcon(getClass().getResource("/imagenes/fallo3.png"));
       imgs[11] = new ImageIcon(getClass().getResource("/imagenes/fallo4.png"));
       imgs[12] = new ImageIcon(getClass().getResource("/imagenes/fallo5.png"));
       imgs[13] = new ImageIcon(getClass().getResource("/imagenes/fallo6.png"));
       imgs[14] = new ImageIcon(getClass().getResource("/imagenes/fallo7.png"));
       
        //botones para las letras
        btns[1]=button_1;
        btns[2]=button_2;
        btns[3]=button_3;
        btns[4]=button_4;
        btns[5]=button_5;
        btns[6]=button_6;
        btns[7]=button_7;
        btns[8]=button_8;
        btns[9]=button_9;
        btns[10]=button_10;
        btns[11]=button_11;
        btns[12]=button_12;
        btns[13]=button_13;
        btns[14]=button_14;
        btns[15]=button_16;
        btns[16]=button_17;
        btns[17]=button_18;
        btns[18]=button_19;
        btns[19]=button_20;
        btns[20]=button_21;
        btns[21]=button_22;
        btns[22]=button_23;
        btns[23]=button_24;
        btns[24]=button_25;
        btns[25]=button_26;
        btns[26]=button_27;
        btns[27]=button_15;
        
        //palabras por advinar, para agregar una nueva palabra sera necesario declararla al inicio
        msgs[0] = "ATOMO".toUpperCase();
        msgs[1] = "PARTICULAS".toUpperCase();
        msgs[2] = "SUBATOMICO".toUpperCase();
        msgs[3] = "PROTONES".toUpperCase();
        msgs[4] = "NEUTRONES".toUpperCase();
        msgs[5] = "ELECTRONES".toUpperCase();
        msgs[6] = "CARGA POSITIVA".toUpperCase();
        msgs[7] = "CARGA NEGATIVA".toUpperCase();
        msgs[8] = "ELEMENTO".toUpperCase();
        msgs[9] = "ESTRUCUTURA".toUpperCase();
        msgs[10] = "GASES".toUpperCase();
        msgs[11] = "NUCLEO".toUpperCase();
        msgs[12] = "NUBE ELECTRONICA".toUpperCase();
        msgs[13] = "IONES".toUpperCase();
        msgs[14] = "TAMAÑO".toUpperCase();
        msgs[15] = "MASA".toUpperCase();
        msgs[16] = "MASA CUANTICA".toUpperCase();
        msgs[17] = "ORBITAS".toUpperCase();
        msgs[18] = "ORBITALES".toUpperCase();
        msgs[19] = "RAYOS".toUpperCase();
        msgs[20] ="RAYOS CATODICOS".toUpperCase();
        msgs[22] ="RAYOS ANODICOS".toUpperCase();
        msgs[23] ="FENOMENO".toUpperCase();
        msgs[24] ="FISICO".toUpperCase();
        msgs[25] ="EMISIONES".toUpperCase();
        msgs[26] ="MATERIA".toUpperCase();
        msgs[27] ="MOLECULAR".toUpperCase();
        msgs[28] ="CATODO".toUpperCase();
        msgs[29] ="ANODO".toUpperCase();
        msgs[30] ="CARGA NEGATIVA".toUpperCase();
        msgs[31] ="CARGA POSITIVA".toUpperCase();
        msgs[32] ="TUBO".toUpperCase();
        msgs[33] ="VACIO".toUpperCase();
        msgs[34] ="MATERIAL CONDUCTOR".toUpperCase();
        msgs[35] ="FENOMENO FISICO".toUpperCase();
        msgs[36] ="FENOMENO QUIMICO".toUpperCase();
        msgs[37] ="FISICA".toUpperCase();
        msgs[38] ="QUIMICA".toUpperCase();
        msgs[39] ="TUBOS DE GEISSLER".toUpperCase();
        msgs[40] ="TUBOS DE CROOKES".toUpperCase();
        msgs[41] ="TELEVISORES".toUpperCase();
        msgs[42] ="OSCILOSCOPIOS".toUpperCase();
        msgs[43] ="DIODO".toUpperCase();
        msgs[44] ="RADIACION".toUpperCase();
        msgs[45] ="RADIOACTIVDAD".toUpperCase();
        msgs[46] ="RADIOACTIVO".toUpperCase();
        msgs[47] ="ELEMENTO".toUpperCase();
        msgs[48] ="NUCLEO".toUpperCase();
        msgs[49] ="GAMMA".toUpperCase();
        msgs[50] ="BETA".toUpperCase();
        msgs[51] ="ALPHA".toUpperCase();
        msgs[52] ="PARTICULAS".toUpperCase();
        msgs[53] ="PARTICULAS".toUpperCase();
        msgs[54] ="ELECTROMAGNETICA".toUpperCase();
        msgs[55] ="URANIO".toUpperCase();
        msgs[56] ="TORIO".toUpperCase();
        msgs[57] ="PLUTONIO".toUpperCase();
        msgs[58] ="ACTINIO".toUpperCase();
        msgs[59] ="CARBONO".toUpperCase();
        msgs[60] ="TRITIO".toUpperCase();
        msgs[61] ="COBALTO".toUpperCase();
        msgs[62] ="CESIO".toUpperCase();
        msgs[63] ="YODO".toUpperCase();
        msgs[64] ="COBRE".toUpperCase();
        msgs[65] ="ACERO".toUpperCase();
        msgs[66] ="PLOMO".toUpperCase();
        msgs[67] ="RAYOS X".toUpperCase();
        msgs[68] ="RAYOS GAMMA".toUpperCase();
        msgs[69] ="RAYOS BETA".toUpperCase();
        msgs[70] ="RAYOS ALPHA".toUpperCase();
        msgs[71] ="ELECTRONES ACELERADOS".toUpperCase();
        msgs[72] ="RADIACION ARTIFICIAL".toUpperCase();
        msgs[73] ="RADIACION NATURAL".toUpperCase();
        msgs[74] ="ELEMENTO QUIMICO".toUpperCase();
        msgs[75] ="REACCION NUCLEAR".toUpperCase();
        msgs[76] ="NUCLEIDO".toUpperCase();
        msgs[77] ="FAMILIA RADIOACTIVA".toUpperCase();
        msgs[78] ="POLONIO".toUpperCase();
        msgs[79] ="ARISTITELES".toUpperCase();
        msgs[80] ="ROBERTO BOYLE".toUpperCase();
        msgs[81] ="JOSEPH PRIESTLEY".toUpperCase();
        msgs[82] ="ANTONIE LAVOISIER".toUpperCase();
        msgs[85] ="SIR HUMPHRY".toUpperCase();
        msgs[86] ="DAVY".toUpperCase();
        msgs[90] ="MICHAEL FARADAY".toUpperCase();
        msgs[91] ="LOUIS PASTEUR".toUpperCase();
        msgs[92] ="ALFRED NOBEL".toUpperCase();
        msgs[93] ="DIMITRI MENDELEEV".toUpperCase();
        msgs[94] ="MARIE CURIE".toUpperCase();
        msgs[95] ="MARIE CURIE".toUpperCase();
        msgs[97] ="LINUS PAULING".toUpperCase();
        msgs[98] ="ROSALIND FRANKLIN".toUpperCase();
        msgs[99] ="PHILIP LENARD".toUpperCase();
        msgs[100] ="WILIAM CROOKES".toUpperCase();
        msgs[101] ="JOSEPH JONH TOMSON".toUpperCase();
        msgs[102] ="LEUCIPO".toUpperCase();
        msgs[103] ="DEMOCRITO".toUpperCase();
        msgs[104] ="DIMITRI MENDELEEV".toUpperCase();
        msgs[105] ="JONH DALTON".toUpperCase();
        msgs[106] ="ERNEST RUTHERFORD".toUpperCase();
        msgs[107] ="ARISTOTELES".toUpperCase();
        msgs[108] ="ROBERT BOYLE".toUpperCase();
        msgs[110] ="JOSEPH PRIESTLEY".toUpperCase();
        msgs[111] ="ANTONIE LAVOISIER".toUpperCase();
        msgs[112] ="SIR HUMPHRY ".toUpperCase();
        msgs[113] ="MICHAEL FARADAY".toUpperCase();
        msgs[114] ="LOUIS PASTEUR".toUpperCase();
        msgs[115] ="ALFRED NOBEL".toUpperCase();
        msgs[116] ="DIMITRI MENDELEEV ".toUpperCase();
        msgs[117] ="MARIE CURIE".toUpperCase();
        msgs[118] ="LINUS PAULING".toUpperCase();
        msgs[122] ="PHILIP LENARD".toUpperCase();
        msgs[123] ="WILIAM CROOKES".toUpperCase();
        msgs[124] ="JOSEPH JONH TOMSON".toUpperCase();
        msgs[125] ="LEUCIPO".toUpperCase();
        msgs[126] ="DEMOCRITO".toUpperCase();
        msgs[127] ="JONH DALTON".toUpperCase();
        msgs[128] ="ERNEST RUTHERFORD".toUpperCase();

        //se asigna un evento a cada letra para comprobar que exista en la palabra a adivinar
        for (int i = 1; i < 28; i++) {
            btns[i].addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    checarLetra(e);
                }
            });
        }
        iniciar();
    }

    //funcion para comenzar los parametros del juego o iniciar una nueva partida
    public void iniciar() {
        //ERRORES EN 0
        err = 0;
        err2=7;
        Dibujo.setIcon(imgs[0]);
        txtPalabra.setText("");
        errores.setIcon(imgs[7]);//:___________________________________----
        //para activar las letras del tablero
        for (int i = 1; i < 28; i++) {
            btns[i].setEnabled(true);
        }
        //para generar una palabra aleatoriamente 
        ran = (int) 0 + (int) (Math.random() * ((msgs.length - 1) + 1));
        //SEPARA EL MENSAJE POR PALABRAS
        String pal[] = msgs[ran].split(" ");
        res = new String[msgs[ran].length() + 1];
        int j = 0;
        // seran los guiones que van debajo de las letras como una separacion_
        for (String pal1 : pal) {
            for (int i = 0; i < pal1.length(); i++) {
                txtPalabra.setText(txtPalabra.getText() + "_ ");
                res[j++] = "_";
            }
            txtPalabra.setText(txtPalabra.getText() + "\n");
            res[j++] = " ";
        }
    }
    
    //al presionar una letra, esta se buscara si aparece en la palabra, de lo contrario la marcara como error 
    public void checarLetra(ActionEvent e) {
        Icon cp=new ImageIcon(getClass().getResource("/imagenes/copa.png"));//icono de la copa
        Icon cara=new ImageIcon(getClass().getResource("/imagenes/cara.png"));//icono de la copa
        JButton bt = (JButton) e.getSource();
        char c[];
        //busca la letra en la palabra despues de haber sido marcada
        for (int i = 1; i < 28; i++) {
            if (bt == btns[i]) {
                //la tecla es inicializada
                c = Character.toChars(64 + i);
                //busca si la letra esta en la palabra
                boolean esta = false;
                for (int j = 0; j < msgs[ran].length(); j++) {
                    if (c[0] == msgs[ran].charAt(j)) {
                        res[j] = c[0] + "";
                        esta = true;
                    }
                }
                //SI LA LETRA ESTA EN EL MENSAJE SE MUESTRA EN EL TEXTPANEL
                if (esta) {
                    txtPalabra.setText("");
                    for (String re : res) {
                        if (" ".equals(re)) {
                            txtPalabra.setText(txtPalabra.getText() + "\n");
                        } else {
                            txtPalabra.setText(txtPalabra.getText() + re + " ");
                        }
                    }
                    // conprueba si quedan letras faltantes o restantes y decide si gano o perdio
                    boolean gano = true;
                    for (String re : res) {
                        if (re.equals("_")) {
                            gano = false;
                            break;
                        }
                    }
                    //al ser correcta se muestra un mensaje y se reinicia el juego
                    
                    if (gano) { 
                        JOptionPane.showMessageDialog(this, "FELICITACIONES !", "",JOptionPane.INFORMATION_MESSAGE, cp);
                        iniciar();
                        return;
                    }
                    //si la letra no esta en el mensaje marca error y cambia de imagen
                } else {
                    Dibujo.setIcon(imgs[++err]);
                    errores.setIcon(imgs[++err2]);//////////////////////////////////////_----
                    //si llegan a los 7 errores marca que as perdido 
                    if (err == 7) {
                        JOptionPane.showMessageDialog(this, "HAS PERDIDO\n la respuesta es: \n" + msgs[ran], "",JOptionPane.INFORMATION_MESSAGE, cara);
                        iniciar();
                        return;
                    }
                }
            
            }
        }

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Dibujo = new javax.swing.JLabel();
        button_1 = new javax.swing.JButton();
        button_7 = new javax.swing.JButton();
        button_13 = new javax.swing.JButton();
        button_19 = new javax.swing.JButton();
        button_25 = new javax.swing.JButton();
        button_2 = new javax.swing.JButton();
        button_8 = new javax.swing.JButton();
        button_14 = new javax.swing.JButton();
        button_20 = new javax.swing.JButton();
        button_26 = new javax.swing.JButton();
        button_3 = new javax.swing.JButton();
        button_9 = new javax.swing.JButton();
        button_15 = new javax.swing.JButton();
        button_21 = new javax.swing.JButton();
        button_27 = new javax.swing.JButton();
        button_4 = new javax.swing.JButton();
        button_10 = new javax.swing.JButton();
        button_16 = new javax.swing.JButton();
        button_22 = new javax.swing.JButton();
        button_5 = new javax.swing.JButton();
        button_11 = new javax.swing.JButton();
        button_17 = new javax.swing.JButton();
        button_23 = new javax.swing.JButton();
        button_6 = new javax.swing.JButton();
        button_12 = new javax.swing.JButton();
        button_18 = new javax.swing.JButton();
        button_24 = new javax.swing.JButton();
        txtPalabra = new javax.swing.JTextField();
        errores = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.setForeground(new java.awt.Color(255, 255, 153));

        Dibujo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        button_1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        button_1.setText("A");
        button_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        button_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_1ActionPerformed(evt);
            }
        });

        button_7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        button_7.setText("G");
        button_7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        button_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_7ActionPerformed(evt);
            }
        });

        button_13.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        button_13.setText("M");
        button_13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        button_13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_13ActionPerformed(evt);
            }
        });

        button_19.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        button_19.setText("R");
        button_19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        button_19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_19ActionPerformed(evt);
            }
        });

        button_25.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        button_25.setText("X");
        button_25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        button_25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_25ActionPerformed(evt);
            }
        });

        button_2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        button_2.setText("B");
        button_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        button_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_2ActionPerformed(evt);
            }
        });

        button_8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        button_8.setText("H");
        button_8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        button_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_8ActionPerformed(evt);
            }
        });

        button_14.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        button_14.setText("N");
        button_14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        button_14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_14ActionPerformed(evt);
            }
        });

        button_20.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        button_20.setText("S");
        button_20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        button_20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_20ActionPerformed(evt);
            }
        });

        button_26.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        button_26.setText("Y");
        button_26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        button_26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_26ActionPerformed(evt);
            }
        });

        button_3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        button_3.setText("C");
        button_3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        button_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_3ActionPerformed(evt);
            }
        });

        button_9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        button_9.setText("I");
        button_9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        button_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_9ActionPerformed(evt);
            }
        });

        button_15.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        button_15.setText("Ñ");
        button_15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        button_15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_15ActionPerformed(evt);
            }
        });

        button_21.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        button_21.setText("T");
        button_21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        button_21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_21ActionPerformed(evt);
            }
        });

        button_27.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        button_27.setText("Z");
        button_27.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        button_27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_27ActionPerformed(evt);
            }
        });

        button_4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        button_4.setText("D");
        button_4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        button_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_4ActionPerformed(evt);
            }
        });

        button_10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        button_10.setText("J");
        button_10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        button_10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_10ActionPerformed(evt);
            }
        });

        button_16.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        button_16.setText("O");
        button_16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        button_22.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        button_22.setText("U");
        button_22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        button_22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_22ActionPerformed(evt);
            }
        });

        button_5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        button_5.setText("E");
        button_5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        button_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_5ActionPerformed(evt);
            }
        });

        button_11.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        button_11.setText("K");
        button_11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        button_11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_11ActionPerformed(evt);
            }
        });

        button_17.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        button_17.setText("P");
        button_17.setAutoscrolls(true);
        button_17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        button_17.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        button_17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_17ActionPerformed(evt);
            }
        });

        button_23.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        button_23.setText("V");
        button_23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        button_23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_23ActionPerformed(evt);
            }
        });

        button_6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        button_6.setText("F");
        button_6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        button_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_6ActionPerformed(evt);
            }
        });

        button_12.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        button_12.setText("L");
        button_12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        button_12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_12ActionPerformed(evt);
            }
        });

        button_18.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        button_18.setText("Q");
        button_18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        button_18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_18ActionPerformed(evt);
            }
        });

        button_24.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        button_24.setText("W");
        button_24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        button_24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_24ActionPerformed(evt);
            }
        });

        txtPalabra.setEditable(false);
        txtPalabra.setBackground(new java.awt.Color(255, 255, 255));
        txtPalabra.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        txtPalabra.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPalabra.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtPalabra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPalabraActionPerformed(evt);
            }
        });

        errores.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnSalir.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(button_1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button_18, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(button_20, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(button_4, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(button_6, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(button_7, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(button_8, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(button_10, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(button_11, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(button_12, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(button_15, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Dibujo, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(button_24, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(button_5, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(button_19, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(button_21, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(button_26, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(button_22, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(button_9, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(button_16, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(button_17, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(button_27, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button_25, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button_3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(button_23, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(button_2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(button_13, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(button_14, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 61, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(txtPalabra, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(errores, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(139, 139, 139))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(btnSalir)
                        .addGap(37, 37, 37)
                        .addComponent(errores, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Dibujo, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(txtPalabra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button_26, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(button_18)
                        .addComponent(button_24, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(button_5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(button_19)
                        .addComponent(button_21)
                        .addComponent(button_22)
                        .addComponent(button_9)
                        .addComponent(button_16)
                        .addComponent(button_17)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_1)
                    .addComponent(button_20)
                    .addComponent(button_4)
                    .addComponent(button_6)
                    .addComponent(button_7)
                    .addComponent(button_8)
                    .addComponent(button_10)
                    .addComponent(button_11)
                    .addComponent(button_12)
                    .addComponent(button_15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_27, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_25)
                    .addComponent(button_3)
                    .addComponent(button_23)
                    .addComponent(button_2)
                    .addComponent(button_13)
                    .addComponent(button_14))
                .addContainerGap(279, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1090, 810);
        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_25ActionPerformed
       
        
    }//GEN-LAST:event_button_25ActionPerformed

    private void button_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_1ActionPerformed
       
        
        
    }//GEN-LAST:event_button_1ActionPerformed

    private void button_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_2ActionPerformed
        
        
    }//GEN-LAST:event_button_2ActionPerformed

    private void button_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_3ActionPerformed
        
        
    }//GEN-LAST:event_button_3ActionPerformed

    private void button_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_4ActionPerformed
        
        
    }//GEN-LAST:event_button_4ActionPerformed

    private void button_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_5ActionPerformed
       
    }//GEN-LAST:event_button_5ActionPerformed

    private void button_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_6ActionPerformed
        
    }//GEN-LAST:event_button_6ActionPerformed

    private void button_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_7ActionPerformed
       
    }//GEN-LAST:event_button_7ActionPerformed

    private void button_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_8ActionPerformed
        
    }//GEN-LAST:event_button_8ActionPerformed

    private void button_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_9ActionPerformed
        
    }//GEN-LAST:event_button_9ActionPerformed

    private void button_10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_10ActionPerformed
        
    }//GEN-LAST:event_button_10ActionPerformed

    private void button_11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_11ActionPerformed
      
    }//GEN-LAST:event_button_11ActionPerformed

    private void button_12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_12ActionPerformed
        
    }//GEN-LAST:event_button_12ActionPerformed

    private void button_13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_13ActionPerformed
        
    }//GEN-LAST:event_button_13ActionPerformed

    private void button_14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_14ActionPerformed
        
    }//GEN-LAST:event_button_14ActionPerformed

    private void button_ÃActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_ÃActionPerformed
        
    }//GEN-LAST:event_button_ÃActionPerformed

    private void button_17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_17ActionPerformed
       
    }//GEN-LAST:event_button_17ActionPerformed

    private void button_18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_18ActionPerformed
        
    }//GEN-LAST:event_button_18ActionPerformed

    private void button_19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_19ActionPerformed

    }//GEN-LAST:event_button_19ActionPerformed

    private void button_20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_20ActionPerformed
        
    }//GEN-LAST:event_button_20ActionPerformed

    private void button_21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_21ActionPerformed
        
    }//GEN-LAST:event_button_21ActionPerformed

    private void button_22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_22ActionPerformed
       
    }//GEN-LAST:event_button_22ActionPerformed

    private void button_23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_23ActionPerformed
        
    }//GEN-LAST:event_button_23ActionPerformed

    private void button_24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_24ActionPerformed
        
    }//GEN-LAST:event_button_24ActionPerformed

    private void button_26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_26ActionPerformed
       
    }//GEN-LAST:event_button_26ActionPerformed

    private void button_27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_27ActionPerformed
      
    }//GEN-LAST:event_button_27ActionPerformed

    private void button_15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_15ActionPerformed
        
    }//GEN-LAST:event_button_15ActionPerformed

    private void txtPalabraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPalabraActionPerformed
    
    }//GEN-LAST:event_txtPalabraActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        if (JOptionPane.showConfirmDialog(rootPane, "Deseas Salir?",
            "", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE) == JOptionPane.YES_OPTION)
    {ini i=new ini();
        i.setVisible(true);
        this.setVisible(false);
        }
        else{
            setDefaultCloseOperation(0);
        }
    }//GEN-LAST:event_btnSalirActionPerformed
   private void button_00ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        
    } 
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new juego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Dibujo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton button_1;
    private javax.swing.JButton button_10;
    private javax.swing.JButton button_11;
    private javax.swing.JButton button_12;
    private javax.swing.JButton button_13;
    private javax.swing.JButton button_14;
    private javax.swing.JButton button_15;
    private javax.swing.JButton button_16;
    private javax.swing.JButton button_17;
    private javax.swing.JButton button_18;
    private javax.swing.JButton button_19;
    private javax.swing.JButton button_2;
    private javax.swing.JButton button_20;
    private javax.swing.JButton button_21;
    private javax.swing.JButton button_22;
    private javax.swing.JButton button_23;
    private javax.swing.JButton button_24;
    private javax.swing.JButton button_25;
    private javax.swing.JButton button_26;
    private javax.swing.JButton button_27;
    private javax.swing.JButton button_3;
    private javax.swing.JButton button_4;
    private javax.swing.JButton button_5;
    private javax.swing.JButton button_6;
    private javax.swing.JButton button_7;
    private javax.swing.JButton button_8;
    private javax.swing.JButton button_9;
    private javax.swing.JLabel errores;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtPalabra;
    // End of variables declaration//GEN-END:variables
}
