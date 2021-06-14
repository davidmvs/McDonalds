package SimuladorMc;

import java.awt.Color;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;

public class Interfaz extends javax.swing.JFrame {

    //private static int clientesEspera = 0;              
    private Crear c = new Crear();                      
    public boolean[] arrayCajeros = new boolean[3];    
    public boolean[] arrayEspera = new boolean[4];      
    public DefaultListModel modelo = new DefaultListModel();

    public Interfaz() {
        this.setResizable(false);
        initComponents();
        this.setLocationRelativeTo(null);
        jLabelEspera1.setVisible(false);
        jLabelEspera2.setVisible(false);
        jLabelEspera3.setVisible(false);
        jLabelEspera4.setVisible(false);
        c.start();
    }
    
    //Codigo de interfaz
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelCjaero2S = new javax.swing.JLabel();
        jLabelCajero3S = new javax.swing.JLabel();
        jLabelCajeroA = new javax.swing.JLabel();
        jLabelCajero2A = new javax.swing.JLabel();
        jLabelCajero3A = new javax.swing.JLabel();
        jLabelEspera1 = new javax.swing.JLabel();
        jLabelEspera2 = new javax.swing.JLabel();
        jLabelEspera3 = new javax.swing.JLabel();
        jLabelEspera4 = new javax.swing.JLabel();
        jButtonAgregarProceso = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListProcesosFuera = new javax.swing.JList<>();
        jLabelAtencion3 = new javax.swing.JLabel();
        jLabelatencion1 = new javax.swing.JLabel();
        jLabelatencion2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabeltotal = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabelestado1 = new javax.swing.JLabel();
        jLabelestado2 = new javax.swing.JLabel();
        jLabelestado3 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabeLacum1 = new javax.swing.JLabel();
        jLabelacum2 = new javax.swing.JLabel();
        jLabelacum3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabelCjaero2S1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelCjaero2S.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/Despachador Espera.jpg"))); // NOI18N
        jPanel1.add(jLabelCjaero2S, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, -1, -1));

        jLabelCajero3S.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/Despachador Espera.jpg"))); // NOI18N
        jPanel1.add(jLabelCajero3S, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 290, -1, -1));

        jLabelCajeroA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/Despachador.jpg"))); // NOI18N
        jPanel1.add(jLabelCajeroA, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, -1, -1));

        jLabelCajero2A.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/Despachador.jpg"))); // NOI18N
        jPanel1.add(jLabelCajero2A, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 360, -1, -1));

        jLabelCajero3A.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/Despachador.jpg"))); // NOI18N
        jPanel1.add(jLabelCajero3A, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 360, -1, -1));

        jLabelEspera1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/pensando.png"))); // NOI18N
        jPanel1.add(jLabelEspera1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, -1, -1));

        jLabelEspera2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/pensando.png"))); // NOI18N
        jPanel1.add(jLabelEspera2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, -1, -1));

        jLabelEspera3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/pensando.png"))); // NOI18N
        jPanel1.add(jLabelEspera3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        jLabelEspera4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/pensando.png"))); // NOI18N
        jPanel1.add(jLabelEspera4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        jButtonAgregarProceso.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 12)); // NOI18N
        jButtonAgregarProceso.setText("COMPRAR");
        jButtonAgregarProceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarProcesoActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonAgregarProceso, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 320, 110, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/Logo.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 24)); // NOI18N
        jLabel3.setText("McDonald´s pa' llevar");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, 230, 30));

        jListProcesosFuera.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane1.setViewportView(jListProcesosFuera);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 110, 160));

        jLabelAtencion3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/avatar.png"))); // NOI18N
        jPanel1.add(jLabelAtencion3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, -1, -1));

        jLabelatencion1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/avatar.png"))); // NOI18N
        jPanel1.add(jLabelatencion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, -1, -1));

        jLabelatencion2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/avatar.png"))); // NOI18N
        jPanel1.add(jLabelatencion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        jLabel7.setText("ESTADO:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 430, 60, -1));

        jPanel2.setBackground(new java.awt.Color(0, 204, 0));

        jLabeltotal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabeltotal.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jLabeltotal);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 450, 130, 30));

        jLabel9.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        jLabel9.setText("Ventas del día");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 430, 110, -1));

        jLabelestado1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        jPanel1.add(jLabelestado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 440, -1, -1));

        jLabelestado2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        jPanel1.add(jLabelestado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 440, -1, -1));

        jLabelestado3.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        jPanel1.add(jLabelestado3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 440, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 12)); // NOI18N
        jLabel13.setText("CAJA 1:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 460, 60, 20));

        jLabel14.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 12)); // NOI18N
        jLabel14.setText("CAJA 2:");
        jLabel14.setToolTipText("");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 460, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 12)); // NOI18N
        jLabel15.setText("CAJA 3:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 460, 60, 20));

        jLabeLacum1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 12)); // NOI18N
        jPanel1.add(jLabeLacum1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, 70, 20));

        jLabelacum2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 12)); // NOI18N
        jPanel1.add(jLabelacum2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 300, 60, 20));

        jLabelacum3.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 12)); // NOI18N
        jPanel1.add(jLabelacum3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 300, 50, 20));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/Mostrador.jpg"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, -1, -1));

        jLabelCjaero2S1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/Despachador Espera.jpg"))); // NOI18N
        jPanel1.add(jLabelCjaero2S1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 760, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //Codigo de interfaz
    private void jButtonAgregarProcesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarProcesoActionPerformed
        // TODO add your handling code here:
        c.nuevoProceso();
    }//GEN-LAST:event_jButtonAgregarProcesoActionPerformed

  

    private class Crear extends Thread {

        public void run() {
            while (true) {
              
                if (!jLabelestado1.getText().equals("Orden entrgada")) {
                    jLabelestado1.setForeground(new Color(60, 63, 65));
                }
                if (!jLabelestado2.getText().equals("Orden entrgada")) {
                    jLabelestado2.setForeground(new Color(60, 63, 65));
                }
                if (!jLabelestado3.getText().equals("Orden entrgada")) {
                    jLabelestado3.setForeground(new Color(60, 63, 65));
                }
                
                for (int x = 0; x < arrayCajeros.length; x++) {
                    if (!arrayCajeros[x]) {
                        try {
                            Thread.sleep(800);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        quitarCliente(x + 1);
                        dormir(x + 1);
                    } else {
                        activar(x + 1);
                    }
                }

                for (int x = 0; x < arrayEspera.length; x++) {
                    if (!arrayEspera[x]) {
                        desocuparCajaEspera(x + 1);
                        if (!modelo.isEmpty()) {
                            //ocuparCaja(indexCajaVacia() + 1);
                            modelo.remove(0);
                            jListProcesosFuera.setModel(modelo);
                            arrayEspera[x] = true;
                        }
                    }
                }
            }
        }

        private void ocuparCaja(int caja) {
            switch (caja) {
                case 1:
                    jLabelEspera1.setVisible(true);
                    break;
                case 2:
                    jLabelEspera2.setVisible(true);
                    break;
                case 3:
                    jLabelEspera3.setVisible(true);
                    break;
                case 4:
                    jLabelEspera4.setVisible(true);
                    break;
            }
            try {
                Thread.sleep(800);
            } catch (InterruptedException ex) {
                Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        private void nuevoProceso() {
            int contador = -1;
            boolean bandera = false;
            for (int x = 0; x < arrayCajeros.length; x++) {
                if (!arrayCajeros[x]) {
                    arrayCajeros[x] = true;
                    contador = x + 1;
                    bandera = true;
                    break;
                }
            }
            if (bandera) {
                despertar(contador);
            } else {
            
                for (int x = 0; x < arrayEspera.length; x++) {
                    if (!arrayEspera[x]) {
                        arrayEspera[x] = true;
                        contador = x + 1;
                        bandera = true;
                        break;
                    }
                }
                if (bandera) {
                    
                    ocuparCaja(contador);
                } else {
                    
                    modelo.addElement("Cliente en espera");
                    jListProcesosFuera.setModel(modelo);
                }
            }
        }
    }

   
   //Main
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }
   //Main
    
    public class AtenderCliente extends Thread {

        private int contador = -1;

        public void run() {
            int numeroAleatorio = getRandomNumberInRange(5, 15);

            try {
                Thread.sleep(numeroAleatorio * 1000);
               
            } catch (InterruptedException ex) {
                Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                clienteSatisfecho();
                
            } catch (InterruptedException ex) {
                Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        private void clienteSatisfecho() throws InterruptedException {
            arrayCajeros[contador - 1] = false;
         
            System.out.println("Hasta luego, le atendió " + " caja "+ contador);

            if (contador == 1) {
                jLabelestado1.setForeground(new Color(29, 184, 29));
                jLabelestado1.setText("Orden entregada");
                actualizarcobro(10, 0, 0);


            } else if (contador == 2) {
                jLabelestado2.setForeground(new Color(29, 184, 29));
                jLabelestado2.setText("Orden entregada");
                actualizarcobro(0, 10, 0);
 

            } else {
                jLabelestado3.setForeground(new Color(29, 184, 29));
                jLabelestado3.setText("Orden entregada");
                actualizarcobro(0, 0, 10);

            }
            verificarEspera();
        }

        private void verificarEspera() {
            
            if (arrayEspera[0] == true) {
                if (arrayEspera[1] == true) {
                    if (arrayEspera[2] == true) {
                        if (arrayEspera[3] == true) {
                            arrayEspera[3] = false;
                            desocuparCajaEspera(4);
                        } else {
                            arrayEspera[2] = false;
                            desocuparCajaEspera(3);
                        }
                    } else {
                        arrayEspera[1] = false;
                        desocuparCajaEspera(2);
                    }
                } else {
                    arrayEspera[0] = false;
                    desocuparCajaEspera(1);
                }
                arrayCajeros[contador - 1] = true;
                System.out.println("Bienvenido, le atiende " + "caja " + contador);
                despertar(contador);
            }
        }
    }

    public boolean CajasEsperaLlenas() {
   
        int contador = 0;
        if (jLabelEspera1.isVisible()) {
            contador++;
        }
        if (jLabelEspera2.isVisible()) {
            contador++;
        }
        if (jLabelEspera3.isVisible()) {
            contador++;
        }
        if (jLabelEspera4.isVisible()) {
            contador++;
        }

        return !(contador == 4);
    }

    /*public int indexCajaVacia() {
 
        if (!jLabelEspera1.isVisible()) {
            return 0;
        }
        if (!jLabelEspera2.isVisible()) {
            return 1;
        }
        if (!jLabelEspera3.isVisible()) {
            return 2;
        }
        if (!jLabelEspera4.isVisible()) {
            return 3;
        }

        return -1;
    }*/

    public void desocuparCajaEspera(int caja) {
        switch (caja) {
            case 1:
                jLabelEspera1.setVisible(false);
                break;
            case 2:
                jLabelEspera2.setVisible(false);
                break;
            case 3:
                jLabelEspera3.setVisible(false);
                break;
            case 4:
                jLabelEspera4.setVisible(false);
                break;
            default:
                break;
        }
    }

    int b1 = 10, b2 = 10, b3 = 10;    
    int total = 0;        

    public void actualizarcobro(int caja1, int caja2, int caja3) {
       
        if (caja1 == 10 & caja2 == 0 & caja3 == 0) {
            jLabeLacum1.setText("$ " + String.valueOf(b1));
            b1 += caja1;
            total += caja1;
            jLabeltotal.setText("$ " + String.valueOf(total));
        } else if (caja1 == 0 & caja2 == 10 & caja3 == 0) {
            jLabelacum2.setText("$ " + String.valueOf(b2));
            b2 += caja2;
            total += caja2;
            jLabeltotal.setText("$ " + String.valueOf(total));
        } else {
            jLabelacum3.setText("$ " + String.valueOf(b3));
            b3 += caja3;
            total += caja3;
            jLabeltotal.setText("$ " + String.valueOf(total));
        }
    }

    public void actualizarcobro() {
        //int preciocorte = 10;
        int b1 = 0, b2 = 0, b3 = 0;    
        int total = 0;       
        jLabeltotal.setText("$ " + String.valueOf(total));
        jLabeLacum1.setText("$ " + String.valueOf(b1));
        jLabelacum2.setText("$ " + String.valueOf(b2));
        jLabelacum3.setText("$ " + String.valueOf(b3));
    }

    public void activar(int cajero) {
        switch (cajero) {
            case 1: {
                jLabelCajeroA.setVisible(true);
                jLabelatencion1.setVisible(true);
                jLabelestado1.setText("Atendiendo...");
                
                break;
            }
            case 2: {
                jLabelCajero2A.setVisible(true);
                jLabelatencion2.setVisible(true);
                jLabelestado2.setText("Atendiendo...");
                break;
            }
            case 3: {
                jLabelCajero3A.setVisible(true);
                jLabelAtencion3.setVisible(true);
                jLabelestado3.setText("Atendiendo...");
                break;
            }
        }
    }

    public int despertar(int cajero) {
        //se llama al hilo para atender al cliente
        switch (cajero) {
            case 1: {
                //jLabelCajeroA.setVisible(true);
                //jLabelatencion1.setVisible(true);
                AtenderCliente atender = new AtenderCliente();
                atender.contador = cajero;
                atender.start();
                break;
            }
            case 2: {
                //jLabelCajero2A.setVisible(true);
                //jLabelatencion2.setVisible(true);
                AtenderCliente atender = new AtenderCliente();
                atender.contador = cajero;
                atender.start();
                break;
            }
            case 3: {
                //jLabelCajero3A.setVisible(true);
                //jLabelAtencion3.setVisible(true);
                AtenderCliente atender = new AtenderCliente();
                atender.contador = cajero;
                atender.start();
                break;
            }
        }
        return 1;
    }

    public void quitarCliente(int cliente) {
        switch (cliente) {
            case 1:
                jLabelatencion1.setVisible(false);
                break;
            case 2:
                jLabelatencion2.setVisible(false);
                break;
            case 3:
                jLabelAtencion3.setVisible(false);
                break;
            default:
                break;
        }
    }

    public int dormir(int cajero) {
        switch (cajero) {
            case 1:
                jLabelCajeroA.setVisible(false);
                jLabelestado1.setText("En espera... ");
                break;
            case 2:
                jLabelCajero2A.setVisible(false);
                jLabelestado2.setText("En espera... ");
                break;
            default:
                jLabelCajero3A.setVisible(false);
                jLabelestado3.setText("En espera...");
                break;
        }
        return 1;
    }

    private static int getRandomNumberInRange(int min, int max) {
        if (min >= max) {
            throw new IllegalArgumentException("");
        }

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgregarProceso;
    private javax.swing.JLabel jLabeLacum1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelAtencion3;
    private javax.swing.JLabel jLabelCajero2A;
    private javax.swing.JLabel jLabelCajero3A;
    private javax.swing.JLabel jLabelCajero3S;
    private javax.swing.JLabel jLabelCajeroA;
    private javax.swing.JLabel jLabelCjaero2S;
    private javax.swing.JLabel jLabelCjaero2S1;
    private javax.swing.JLabel jLabelEspera1;
    private javax.swing.JLabel jLabelEspera2;
    private javax.swing.JLabel jLabelEspera3;
    private javax.swing.JLabel jLabelEspera4;
    private javax.swing.JLabel jLabelacum2;
    private javax.swing.JLabel jLabelacum3;
    private javax.swing.JLabel jLabelatencion1;
    private javax.swing.JLabel jLabelatencion2;
    private javax.swing.JLabel jLabelestado1;
    private javax.swing.JLabel jLabelestado2;
    private javax.swing.JLabel jLabelestado3;
    private javax.swing.JLabel jLabeltotal;
    private javax.swing.JList<String> jListProcesosFuera;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

