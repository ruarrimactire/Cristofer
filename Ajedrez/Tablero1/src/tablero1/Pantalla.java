/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tablero1;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Risto
 */
public class Pantalla extends javax.swing.JFrame implements ActionListener, KeyListener, WindowFocusListener, MouseListener, MouseMotionListener {

//    private windowChessBoard mainChessBoard;
    private Image[][] imgPlayer = new Image[2][6];
    private String[] strRedPieces = {"redPawn.gif","redRock.gif","redKnight.gif","redBishop.gif","redQueen.gif","redKing.gif"};
    private String[] strBluePieces = {"bluePawn.gif","blueRock.gif","blueKnight.gif","blueBishop.gif","blueQueen.gif","blueKing.gif"};
    private MediaTracker mt;
    private objCreateAppletImage createImage;

    /**
     * Creates new form Pantalla
     */
    public Pantalla() {
        initComponents();
        limpiarTablero nueva = new limpiarTablero();
        crearTablero();
        menu x = new menu();
        grupoDeBotones y = new grupoDeBotones();
    }

    private void crearTablero(){
        jPanel1.setLayout(new GridLayout(9, 9));
        /*
        Estos bucles for se utilizan para dibujar el tablero con bootones,
        estan uno dentro de otro, el primero recorre las filas y el segundo
        recorre las columnas. Despues mediante if y else se le añaden los labels
        con la numeracion de filas y columnas y los botones negros y blancos que
        seran las ccasillas del tablero.
        */
        for (int fila = 0; fila < 9;fila++){
            for (int columna = 0; columna < 9; columna++){
                String temp1 = new Character( (char)(65+columna) ).toString();
                String temp2 = String.valueOf(8-fila);
                if( columna == 8 && fila == 8){
                    // La manera de escribir un operador ternario: <text> ? <si es verdadero> : <si es falso>  (;)
                    addLabel(jPanel1, "", ((fila + columna)%2 == 0) ? Color.WHITE : Color.GRAY  );
                }
                else if (columna == 8){
                    addLabel(jPanel1, temp2, ((fila + columna)%2 == 0) ? Color.WHITE : Color.GRAY  );
                }
                else if (fila == 8){
                    addLabel(jPanel1, temp1, ((fila + columna)%2 == 0) ? Color.WHITE : Color.GRAY  );
                }
                else {
                    // La formula de abajo se utiliza para dibujar un tablero,
                    // se va saltando un casilla.
                    addLabel2(jPanel1, temp1 + temp2, ((fila + columna)%2 == 0) ? Color.WHITE : Color.BLACK  );
                }                
            } 
        }
        
        try {
            
            mt = new MediaTracker(jPanel1);
            
            for (int i = 0; i < 6; i++) {
                imgPlayer[0][i] = createImage.getImage(this, "/images/" + strRedPieces[i],  5000);
                imgPlayer[1][i] = createImage.getImage(this, "/images/" + strBluePieces[i], 5000);
                mt.addImage(imgPlayer[0][i], 0);  // imagenes rojas
                mt.addImage(imgPlayer[1][i], 0);  // imagenes azules
            }
            try {
                mt.waitForID(0);
            } catch (InterruptedException e) {}
//            resetBoard();
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Imposible cargar las imagenes.", "ERROR", JOptionPane.WARNING_MESSAGE);
//            cmdNewGame.setEnabled(false);
//            cmdSetNames.setEnabled(false);
            e.printStackTrace();
        }
        
    }
    
    // Operaciones necesarias para añadir un Label.
    private void addLabel(Container parent, String name, Color color) {
        JLabel temp = new JLabel(name);
        temp.setBackground(color);
        temp.setOpaque(true);
        temp.setSize(55, 55);
        temp.setText(name);
        temp.setHorizontalAlignment((int) CENTER_ALIGNMENT);
        parent.add(temp);
    }
    
    // Operaciones necesarias para añadir un Label.
    private void addLabel2(Container parent, String name, Color color) {
        JLabel temp = new JLabel(name);
        temp.setBackground(color);
        temp.setOpaque(true);
        temp.setSize(55, 55);
        temp.setText("");
        temp.setHorizontalAlignment((int) CENTER_ALIGNMENT);
        parent.add(temp);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setMaximumSize(new java.awt.Dimension(495, 495));
        jPanel1.setMinimumSize(new java.awt.Dimension(495, 495));
        jPanel1.setPreferredSize(new java.awt.Dimension(495, 495));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 495, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 495, Short.MAX_VALUE)
        );

        jButton1.setText("Limpiar Tablero");

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton2.setText("Boton1");

        jButton3.setText("Boton2");

        jButton4.setText("Boton3");

        jButton5.setText("Boton6");

        jButton6.setText("Boton4");

        jButton7.setText("Boton5");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3)
                                .addGap(18, 18, 18)
                                .addComponent(jButton4))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton6)
                                .addGap(18, 18, 18)
                                .addComponent(jButton7)
                                .addGap(18, 18, 18)
                                .addComponent(jButton5)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jMenu1.setText("Juego");

        jMenuItem1.setText("Juego Nuevo");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Rendirse");
        jMenu1.add(jMenuItem2);

        jMenu3.setText("Enrrocar");

        jMenuItem3.setText("Corto");
        jMenu3.add(jMenuItem3);

        jMenuItem4.setText("Largo");
        jMenu3.add(jMenuItem4);

        jMenu1.add(jMenu3);

        jMenu5.setText("Modo de Juego");

        jMenuItem5.setText("Ajedrez Clasico");
        jMenu5.add(jMenuItem5);

        jMenuItem6.setText("Variante 1");
        jMenu5.add(jMenuItem6);

        jMenuItem7.setText("Variante 2");
        jMenu5.add(jMenuItem7);

        jMenu1.add(jMenu5);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Diseño");
        jMenuBar1.add(jMenu2);

        jMenu4.setText("Dificultad");
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
                /*  Para imprimir en la consola una lista de los estilos disponibles
                    (el break ha de estar comentado para que esto funcione). */
//                System.out.println(info.getName());
//                jTextArea1.append(info.getName());   // solo se podria hacer esto si la textArea es de tipo static.
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pantalla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
//        System.out.println(e.toString());
//        System.out.println(e.getActionCommand());
//        jTextArea1.append(e.toString() + "\n");
          jTextArea1.append("Esta es la casilla del tablero que ha sido seleccionada: " + e.getActionCommand() + "\n");
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowGainedFocus(WindowEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowLostFocus(WindowEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mousePressed(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public class limpiarTablero extends javax.swing.JFrame implements ActionListener{
        
        public limpiarTablero(){
            jButton1.addActionListener(this);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            jTextArea1.append("Esta es la accion del boton 'Limpiar tablero': " + e.getActionCommand() + "\n");
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        
    }
    
    public class menu extends javax.swing.JFrame implements ActionListener{
        
        public menu(){
            jMenuItem1.addActionListener(this);
            jMenuItem2.addActionListener(this);
            jMenuItem3.addActionListener(this);
            jMenuItem4.addActionListener(this);
            jMenuItem5.addActionListener(this);
            jMenuItem6.addActionListener(this);
            jMenuItem7.addActionListener(this);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            jTextArea1.append("Esto es un elemento de menu: " + e.getActionCommand() + "\n");
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        
    }
    
    public class grupoDeBotones extends javax.swing.JFrame implements ActionListener{
        
        public grupoDeBotones(){
            jButton2.addActionListener(this);
            jButton3.addActionListener(this);
            jButton4.addActionListener(this);
            jButton5.addActionListener(this);
            jButton6.addActionListener(this);
            jButton7.addActionListener(this);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            jTextArea1.append("Esto es un boton: " + e.getActionCommand() + "\n");
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        
    }
}
