/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tablero1;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author Risto
 */
public class Pantalla extends javax.swing.JFrame implements ActionListener {

    private String[] strRedPieces = {"redPawn.gif","redRock.gif","redKnight.gif","redBishop.gif","redQueen.gif","redKing.gif"};
    private String[] strBluePieces = {"bluePawn.gif","blueRock.gif","blueKnight.gif","blueBishop.gif","blueQueen.gif","blueKing.gif"};
    JButton [][] casillas = new JButton [8][8];
    /**
     * Creates new form Pantalla
     */
    public Pantalla() {
        initComponents();
        limpiarTablero botonLimpiar = new limpiarTablero();
        menu elementosMenu = new menu();
        grupoDeBotones botonesVarios = new grupoDeBotones();
        crearTablero();
        /* bucle for con arrays
        Esto sirve para depuracion y para hacer el test del metodo conseguirNombrePieza,
        para que funcione sea con un actionEvent.toString(), sea con JButton.toString()*/
//        for(JButton []nn : casillas)
//            for (JButton nn2 : nn)
//                System.out.println(String.valueOf(nn2.getActionCommand().charAt(0)) + "  " +
//                        String.valueOf(nn2.getActionCommand().charAt(1)) + "  " +
//                        conseguirNombrePieza(nn2.toString()) );
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
                    // La manera de escribir un operador ternario: <test> ? <si es verdadero> : <si es falso>  (;)
                    addLabel(jPanel1, "", ((fila + columna)%2 == 0) ? Color.WHITE : Color.GRAY  );
                }
                else if (columna == 8){
                    addLabel(jPanel1, temp2, ((fila + columna)%2 == 0) ? Color.WHITE : Color.GRAY  );
                }
                else if (fila == 8){
                    addLabel(jPanel1, temp1, ((fila + columna)%2 == 0) ? Color.WHITE : Color.GRAY  );
                }
                else {
                    /* La formula de abajo se utiliza para dibujar un tablero, 
                       que tenga las casillas adyacentes (sea en sentido 
                       orizontal que vertical) con colores alternados.  */
                    casillas[fila][columna] = addButton(jPanel1, temp1, temp2, ((fila + columna)%2 == 0) ? Color.WHITE : Color.BLACK  );
                }
            }
        }
    }
    
    // Operaciones necesarias para añadir un Label para la indicación
    // de la columna o fila correspondiente a cada casilla del tablero.
    private void addLabel(Container parent, String name, Color color) {
        JLabel temp = new JLabel(name);
        temp.setBackground(color);
        temp.setOpaque(true);
        temp.setSize(55, 55);
        temp.setText(name);
        temp.setHorizontalAlignment((int) CENTER_ALIGNMENT);
        parent.add(temp);
    }
    
    // Operaciones necesarias para añadir un Label para dibujar el tablero.
    private JButton addButton(Container parent, String columna, String fila, Color color) {
        JButton temp = new JButton(columna+fila);
        temp.setBackground(color);
        colocarPiezas(columna, fila, temp);
        temp.setOpaque(true);
        temp.setSize(55, 55);
        temp.setText("");
        temp.setHorizontalAlignment((int) CENTER_ALIGNMENT);
        temp.setActionCommand(columna + fila);
        temp.addActionListener(this);
        parent.add(temp);
        return temp;
    }
    
    private void colocarPiezas(String columna, String fila, JButton casilla){
        // se ponen los iconos de los peones en las casillas correspondientes.
        if (fila.equals("7")) {
            casilla.setIcon(new ImageIcon(getClass().getResource("/images/" + strRedPieces[0])));
        }
        if (fila.equals("2")) 
            casilla.setIcon(new ImageIcon(getClass().getResource("/images/" + strBluePieces[0])));
        if (fila.equals("8")) {
            // se ponen los iconos de las torres en las casillas correspondientes.
            if (columna.equals("A") || columna.equals("H"))
                casilla.setIcon(new ImageIcon(getClass().getResource("/images/" + strRedPieces[1])));
            // se ponen los iconos de las caballos en las casillas correspondientes.
            if (columna.equals("B") || columna.equals("G"))
                casilla.setIcon(new ImageIcon(getClass().getResource("/images/" + strRedPieces[2])));
            // se ponen los iconos de las Alfiles en las casillas correspondientes.
            if (columna.equals("C") || columna.equals("F"))
                casilla.setIcon(new ImageIcon(getClass().getResource("/images/" + strRedPieces[3])));
            // se ponen los iconos de las Reina en las casillas correspondientes.
            if (columna.equals("D"))
                casilla.setIcon(new ImageIcon(getClass().getResource("/images/" + strRedPieces[4])));
            // se ponen los iconos de las Rey en las casillas correspondientes.
            if (columna.equals("E"))
                casilla.setIcon(new ImageIcon(getClass().getResource("/images/" + strRedPieces[5])));
        }
        if (fila.equals("1")){
            // se ponen los iconos de las torres en las casillas correspondientes.
            if (columna.equals("A") || columna.equals("H"))
                casilla.setIcon(new ImageIcon(getClass().getResource("/images/" + strBluePieces[1])));
            // se ponen los iconos de las caballos en las casillas correspondientes.
            if (columna.equals("B") || columna.equals("G"))
                casilla.setIcon(new ImageIcon(getClass().getResource("/images/" + strBluePieces[2])));
            // se ponen los iconos de las Alfiles en las casillas correspondientes.
            if (columna.equals("C") || columna.equals("F"))
                casilla.setIcon(new ImageIcon(getClass().getResource("/images/" + strBluePieces[3])));
            // se ponen los iconos de las Reina en las casillas correspondientes.
            if (columna.equals("D"))
                casilla.setIcon(new ImageIcon(getClass().getResource("/images/" + strBluePieces[4])));
            // se ponen los iconos de las Rey en las casillas correspondientes.
            if (columna.equals("E"))
                casilla.setIcon(new ImageIcon(getClass().getResource("/images/" + strBluePieces[5])));
        }
        
//        // solo para depuración
//        try {
//            System.out.println(casilla.getIcon().toString());
//        } catch (NullPointerException e){ }
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

    /* Punto en el cual se redefinen (@Override) las acciones a realizar después 
       de presionar uno de los eventuales botones de los cuales está formado el tablero */
    @Override
    public void actionPerformed(ActionEvent e) {
        jTextArea1.append("casilla: " + e.getActionCommand() + " que contiene: " + conseguirNombrePieza(e.toString()) + "\n" );
    }

    String conseguirNombrePieza(String evento){
        String []temp1 = evento.split("[ ,]");
        String []temp2 = null;
        for(String nn : temp1){
            if(nn.contains("defaultIcon="))
                temp2 = nn.split("/");
        }
        String pieza = temp2[temp2.length-1];
        if (pieza.contains("defaultIcon="))
            pieza = "";
        else
            pieza = pieza.replace(".gif", "");
        return pieza;
    }
    
    /* Clase interna para redefinir (@Override) las acciones a realizar después 
       de presionar el boton "Limpiar Tablero" */
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
    
    /* Clase interna para redefinir (@Override) las acciones a realizar después 
       de elegir un elemento de menu */
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
    
    /* Clase interna para redefinir (@Override) las acciones a realizar después 
       de presionar uno de los botones por debajo de la textArea */
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
