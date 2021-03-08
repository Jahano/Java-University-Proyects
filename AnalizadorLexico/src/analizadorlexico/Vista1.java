package analizadorlexico;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;

public class Vista1 extends javax.swing.JFrame {

    public Lector lector = new Lector();
    public Vista1() {
        initComponents();
        
    }
    
     LinkedList<Tokens> Tokenslist;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTextArea1.setBackground(new java.awt.Color(0, 0, 0));
        jTextArea1.setColumns(20);
        jTextArea1.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setWrapStyleWord(true);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTextPane1.setToolTipText("");
        jTextPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane3.setViewportView(jTextPane1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );

        jButton1.setText("Analizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ID");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Reservada");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Operador");

        jMenu1.setText("Archivo");

        jMenuItem1.setText("Nuevo");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Abrir");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Guardar");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem15.setText("Guardar como...");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem15);

        jMenuItem4.setText("Analizar");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem5.setText("Salir");
        jMenu1.add(jMenuItem5);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Manual Tecnico");

        jMenuItem10.setText("Compilador");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem10);

        jMenuItem11.setText("Fases de un Compilador");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem11);

        jMenuItem12.setText("Analizador Lexico");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem12);

        jMenuItem14.setText("JFlex");
        jMenu3.add(jMenuItem14);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(0, 20, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                            .addComponent(jTextField1))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField3)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))))
                .addGap(0, 31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
       lector = new Lector();
       lector.presentar();
   //     System.out.println(lector.texto);
       jTextArea1.setText(" ");
       jTextArea1.setText(lector.texto);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        new Vista1().setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
       jTextArea1.setText("La construcción de un compilador involucra la división del proceso en una serie de fases que variará con su complejidad. \n" +
        "Generalmente estas fases se agrupan en dos tareas: el análisis del programa fuente y la síntesis del programa objeto.\n" +
        "\n" +
        "Análisis Léxico\n" +
        "La primera fase de escáner funciona como un texto escáner. \n" +
        "Esta fase busca en el código fuente como una secuencia de \n" +
        "caracteres y la convierte en un lexema resultante-. \n" +
        "Analizador Léxico representa estos lexema resultante- en forma de fichas.\n" +
        "\n" +
        "Sintaxis Análisis\n" +
        "La siguiente fase se denomina la sintaxis análisis o análisis. Toma el token\n" +
        " de análisis léxico como entrada y genera un árbol analizar (o árbol de sintaxis). \n" +
        "En esta fase, token arreglos se contrastan con el código fuente gramática, \n" +
        "es decir, el analizador comprueba si la expresión de los tokens es \n" +
        "sintácticamente correcto.\n" +
        "\n" +
        "Análisis semántico\n" +
        "Análisis semántico comprueba si el análisis árbol construido sigue las reglas \n" +
        "del idioma. Por ejemplo, la asignación de valores es entre tipos de datos \n" +
        "compatibles, y añadiendo cadena en un número entero. Además, el analizador \n" +
        "semántico realiza un seguimiento de los identificadores, sus tipos y expresiones; \n" +
        "si los identificadores se declaran antes de su uso, o no, etc. El analizador \n" +
        "semántico produce un árbol de sintaxis anotado como una salida.\n" +
        "\n" +
        "Generación de código intermedio\n" +
        "Tras análisis semántico el compilador genera un código intermedio del código fuente \n" +
        "para el equipo de destino. Es un programa para algunos la máquina abstracta. \n" +
        "Está entre el lenguaje de alto nivel y el lenguaje de máquina. Este código \n" +
        "intermedio debe ser generado de tal manera que hace que sea más fácil de traducir en la \n" +
        "máquina de destino.\n" +
        "\n" +
        "Optimización de código\n" +
        "La siguiente fase de optimización de código es el código intermedio. La optimización \n" +
        "puede ser asumida como algo que elimina código innecesario, y organiza la secuencia \n" +
        "de declaraciones con el fin de acelerar la ejecución del programa sin desperdicio de \n" +
        "recursos (CPU, memoria).\n" +
        "\n" +
        "Generación de código\n" +
        "En esta fase, el generador de código optimizado la representación del código \n" +
        "intermedio y la asigna a la máquina de destino. El generador de código se \n" +
        "traduce el código intermedio en una secuencia de (generalmente) reubicables \n" +
        "código máquina. Secuencia de instrucciones de código máquina realiza la tarea\n" +
        " como el código intermedio.\n" +
        "\n" +
        "Tabla de símbolos\n" +
        "Es una estructura de datos mantendrá en todas las fases de un compilador. \n" +
        "Todos los nombres de identificador junto con sus tipos se almacenan aquí. \n" +
        "La tabla de símbolos hace que sea más fácil para que el compilador pueda \n" +
        "buscar con rapidez el registro de código y recuperarla. La tabla de símbolos \n" +
        "se utiliza también para el campo.");
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
                   
        lector.Guardar(jTextArea1.getText());
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        try {
            probarLexerFile();
        } catch (IOException ex) {
            Logger.getLogger(Vista1.class.getName()).log(Level.SEVERE, null, ex);
        }
        color();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        lector.GuardarComo(jTextArea1.getText());
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
         try {
            probarLexerFile();
            color();
        } catch (IOException ex) {
            Logger.getLogger(Vista1.class.getName()).log(Level.SEVERE, null, ex);
        }
         
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        jTextArea1.setText("Un compilador es un programa informático que traduce un programa que ha sido "
                + "escrito en un lenguaje de programación a un lenguaje común,reúne diversos elementos o fragmentos "
                + "en una misma unidad. 1​ usualmente lenguaje de máquina, aunque también puede ser traducido a un código"
                + " intermedio (bytecode) o a texto. Este proceso de traducción se conoce como compilación, compilar "
                + "consiste en traducir un programa escrito en un cierto lenguaje a otro.2​\n" +
                "\n" +
                "La construcción de un compilador involucra la división del proceso en una serie de fases que variará "
                + "con su complejidad. Generalmente estas fases se agrupan en dos tareas: el análisis del programa fuente y la"
                + " síntesis del programa objeto.");
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        jTextArea1.setText("Un compilador es un programa informático que traduce \n" +
        "un programa que ha sido escrito en un lenguaje de programación a \n" +
        "un lenguaje común,reúne diversos elementos o fragmentos en una \n" +
        "misma unidad. 1​ usualmente lenguaje de máquina, aunque también \n" +
        "puede ser traducido a un código intermedio (bytecode) o a texto. \n" +
        "Este proceso de traducción se conoce como compilación, \n" +
        "compilar consiste en traducir un programa escrito en un cierto \n" +
        "lenguaje a otro.2​\n" +
        "\n" +
        "Leer los caracteres de entrada y elaborar como salida una secuencia \n" +
        "de componentes léxicos que utiliza el analizador sintáctico para hacer el \n" +
        "análisis.\n" +
        "\n" +
        "El analizador léxico es la primera fase de un compilador.\n" +
        "\n" +
        "Su principal función consiste en leer los caracteres de entrada y \n" +
        "elaborar como salida una secuencia de componentes léxicos que utiliza \n" +
        "el analizador sintáctico para hacer el análisis. Esta interacción, \n" +
        "suele aplicarse convirtiendo al analizador léxico en una subrutina o \n" +
        "corrutina del analizador sintáctico. Recibida la orden \"obtén el \n" +
        "siguiente componente léxico\" del analizador sintáctico, el analizador \n" +
        "léxico lee los caracteres de entrada hasta que pueda identificar el \n" +
        "siguiente componente léxico.\n" +
        "\n" +
        "Funciones secundarias.\n" +
        "\n" +
        "Como el analizador léxico es .la parte del compilador que lee el texto \n" +
        "fuente. También puede realizar ciertas funciones secundarias en la \n" +
        "interfaz del usuario, como eliminar del programa fuente comentarios y \n" +
        "espacios en blanco en forma de caracteres de espacio en blanco, caracteres \n" +
        "TAB y de línea nueva. Otra función es relacionar os mensajes de error del \n" +
        "compilador con el programa fuente. Por ejemplo, el analizador léxico puede \n" +
        "tener localizado el número de caracteres de nueva línea detectados, de \n" +
        "modo que se pueda asociar un número de línea con un mensaje de error.\n" +
        "\n" +
        "En algunos compiladores, el analizador léxico se encarga de hacer una copia \n" +
        "del programa fuente en el que están marcados los mensajes de error. Si el \n" +
        "lenguaje fuente es la base de algunas funciones de pre procesamiento de macros, \n" +
        "entonces esas funciones del preprocesador también se pueden aplicar al hacer \n" +
        "el análisis léxico.");
    }//GEN-LAST:event_jMenuItem12ActionPerformed

     
     public void probarLexerFile() throws IOException{
        jTextPane1.setText(jTextArea1.getText());
        int contIDs=0;   
        int contRes=0;
        int contOpe=0;
        Tokenslist = new LinkedList<Tokens>();        
        File fichero = new File ("fichero.txt");
        PrintWriter writer;
        try {
            writer = new PrintWriter(fichero);
            writer.print(jTextArea1.getText());
            writer.close();
            } 
        catch(Exception e){
                System.out.println(e);
                }
        
        Reader reader = new BufferedReader(new FileReader("fichero.txt"));
        Lexer lexer = new Lexer (reader);        
        String resultado = "";
        while (true) {
            Tokens tokemitem = new Tokens();    
            Token token = lexer.yylex();            
            if (token == null){
                for(int i=0;i<Tokenslist.size();i++){
                    System.out.println(Tokenslist.get(i).nombre + "=" + Tokenslist.get(i).ID);
                }
                System.out.println(resultado);
                //jTextField2.setText(resultado);
                return;
                }
            switch (token){
                case RESERVADA:{
                    contRes++;
                   
                    tokemitem.nombre = lexer.lexeme;
                    tokemitem.ID = contRes;
                    tokemitem.tipo = "Reservada";
                    tokemitem.tamaño=tokemitem.nombre.length();
                    resultado=resultado+"<Reservada"+ contRes+ ">";
                    jTextField3.setText(String.valueOf(contRes));
                    break;
                    }
                case OPERADORES:{
                    contOpe++;                    
                    tokemitem.nombre = lexer.lexeme;
                    tokemitem.ID = contOpe;
                    tokemitem.tipo = "Operador";
                    tokemitem.tamaño=tokemitem.nombre.length();                    
                    resultado = resultado + "<Operador>" + contOpe + ">";
                    jTextField2.setText(String.valueOf(contOpe));
                    break;
                }
                
                case ERROR:{
                    resultado=resultado+"Error,simbolo no reconocido";
                    break;
                }
		case ID: {
                    contIDs++;
                    tokemitem.nombre=lexer.lexeme;
                    tokemitem.ID=contIDs;
                    tokemitem.tipo = "ID";
                    tokemitem.tamaño=tokemitem.nombre.length();
                    resultado=resultado+"<ID"+ contIDs+ ">";
                    jTextField1.setText(String.valueOf(contIDs));
                    break;
		}
		case INT:
                    resultado=resultado+"<"+ lexer.lexeme+">";
                    break;
		default:
                    resultado=resultado+"<"+ lexer.lexeme +">";
                    break;
		}
            Tokenslist.add(tokemitem);
        }
       
    }
     public void color()
     {
        String texto="";
        
	for(int i =0; i<Tokenslist.size();i++)
        {
            if(Tokenslist.get(i).tipo == "Reservada")
            {
                texto =texto + Tokenslist.get(i).nombre +" ";
                
            }
            else if(Tokenslist.get(i).tipo == "Operador")
            {
                texto =texto + Tokenslist.get(i).nombre +" ";
                
            }
            else if(Tokenslist.get(i).tipo == "ID")
            {
                texto =texto + Tokenslist.get(i).nombre +" ";                
            }
         }
         System.out.println(texto);
        StyleContext sc = new StyleContext();
         DefaultStyledDocument doc = new DefaultStyledDocument(sc);
         jTextPane1.setStyledDocument(doc);
        try {
            doc.insertString(0, texto, null);
        } catch (BadLocationException ex) {
             Logger.getLogger(Vista1.class.getName()).log(Level.SEVERE, null, ex);
        }
        Style rojo = sc.addStyle("ConstantWidth", null);
        StyleConstants.setForeground(rojo, Color.red);

        Style verde = sc.addStyle("ConstantWidth", null);
        StyleConstants.setForeground(verde, Color.green);

        Style azul = sc.addStyle("ConstantWidth", null);
        StyleConstants.setForeground(azul, Color.blue);
        int inicio = 0;
        for(int i =0; i<Tokenslist.size();i++)
        {
            if(Tokenslist.get(i).tipo == "Reservada")
            {                
                doc.setCharacterAttributes(inicio, Tokenslist.get(i).tamaño, azul, false);
                inicio =inicio + Tokenslist.get(i).tamaño + 1;
            }
            else if(Tokenslist.get(i).tipo == "Operador")
            {
                doc.setCharacterAttributes(inicio, Tokenslist.get(i).tamaño, rojo, false);
                inicio =inicio + Tokenslist.get(i).tamaño + 1;
                
            }
            else if(Tokenslist.get(i).tipo == "ID")
            {
                doc.setCharacterAttributes(inicio, Tokenslist.get(i).tamaño, verde, false);
                inicio =inicio + Tokenslist.get(i).tamaño + 1;                
            }
         }
     }
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}
