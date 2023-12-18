import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/* FichaIdentificacionPaciente hereda de la clase JFrame e implementa ActionListener
Autor: Marisol Zarate López
Fecha: 15-12-23
Objetivo: Formulario que ingresa a los datos de los pacientes
*/
public class FichaIdentificacionPaciente extends JFrame implements ActionListener{
	
	private JMenuBar mb;
	private JMenu menuOpciones;
	private JLabel logo, titulo, nombre, apellidoPaterno, apellidoMaterno, alias, diaNac, mesNac, anioNac, 
			lugarNac, sexo, estadoCivil, ocupacion, escolaridad, religion, direccion, telCasa, 
			telCelular, telOficina, correoElectronico, nombreFamiliar, telDelFamiliar, tipoInterrogatorio, responsableLegal, alerta; 
			
	private JTextField txtNombre, txtApellidoPaterno, txtApellidoMaterno, txtAlias, txtDiaNac, txtMesNac, txtAnioNac, 
			txtLugarNac, txtSexo, txtReligion, txtTelCasa, txtTelCelular, txtTelOficina, txtCorreoElectronico, txtNombreFamiliar, 
			txtTelDelFamiliar, txtResponsableLegal;
			
	//private JComboBox comboEstadoCivil, comboOcupacion, comboEscolaridad, comboTipoInterrogatorio;
	private JScrollPane sp1;
	private JTextArea TxArDireccion, txArAlerta;

   /* 
        Autor: Marisol Zarate López
        Fecha: 15-12-23
        Objetivo:constructor de la clase FichaIdentificacionPaciente
    */
	public FichaIdentificacionPaciente(){
		setLayout(null);
		setTitle ("Ficha de Identificación del Paciente");
		getContentPane().setBackground(new Color(255,255,255));
		setIconImage(new ImageIcon(getClass().getResource("logo.png")).getImage());
		
		mb = new JMenuBar();
		mb.setBackground(new Color(0,191,255));
		setJMenuBar(mb);
		
		menuOpciones = new JMenu ("OPCIONES");
		menuOpciones.setBackground(new Color(0,191,255));
		menuOpciones.setFont(new Font("Andale Mono", 1, 14));
		menuOpciones.setForeground(new Color(255,215,0));
		mb.add(menuOpciones);
		
		ImageIcon imagen = new ImageIcon("odontoynova.png");
		logo = new JLabel(imagen);
		logo.setBounds(0,0,400,105);
		add(logo);
		
		titulo = new JLabel("Sistema Dental");
		titulo.setBounds(350,100,300,50);
		titulo.setFont(new Font("Andale Mono", 0, 24));
		titulo.setForeground(new Color(0,191,255));
		add(titulo);
		
		//nombre
		nombre = new JLabel("Nombre(s):");
		nombre.setBounds(25,150,180,25);
		nombre.setFont(new Font("Andale Mono", 1, 12));
		add(nombre);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(100,150,150,25);
		txtNombre.setBackground(new Color(224,224,224));
		txtNombre.setFont(new Font("Andale Mono", 1, 14));
		add(txtNombre);
		
		//apellidoPaterno
		apellidoPaterno = new JLabel("Apellido Paterno:");
		apellidoPaterno.setBounds(265,150,180,25);
		apellidoPaterno.setFont(new Font("Andale Mono", 1, 12));
		add(apellidoPaterno);
		
		txtApellidoPaterno = new JTextField();
		txtApellidoPaterno.setBounds(370,150,150,25);
		txtApellidoPaterno.setBackground(new Color(224,224,224));
		txtApellidoPaterno.setFont(new Font("Andale Mono", 1, 14));
		add(txtApellidoPaterno);
		
		//apellidoMaterno
		apellidoMaterno = new JLabel("Apellido Materno:");
		apellidoMaterno.setBounds(535,150,180,25);
		apellidoMaterno.setFont(new Font("Andale Mono", 1, 12));
		add(apellidoMaterno);
		
		txtApellidoMaterno = new JTextField();
		txtApellidoMaterno.setBounds(650,150,150,25);
		txtApellidoMaterno.setBackground(new Color(224,224,224));
		txtApellidoMaterno.setFont(new Font("Andale Mono", 1, 14));
		add(txtApellidoMaterno);
		
		//alias
		alias = new JLabel("Alias: ");
		alias.setBounds(25,180,180,25);
		alias.setFont(new Font("Andale Mono", 1, 12));
		add(alias);
		
		txtAlias = new JTextField();
		txtAlias.setBounds(100,180,150,25);
		txtAlias.setBackground(new Color(224,224,224));
		txtAlias.setFont(new Font("Andale Mono", 1, 14));
		add(txtAlias);
		
		// diaNac
		diaNac = new JLabel("Día de Nacimiento: ");
		diaNac.setBounds(265,180,180,25);
		diaNac.setFont(new Font("Andale Mono", 1, 12));
		add(diaNac);

		txtDiaNac = new JTextField();
		txtDiaNac.setBounds(370,180,150,25);
		txtDiaNac.setBackground(new Color(224, 224, 224));
		txtDiaNac.setFont(new Font("Andale Mono", 1, 14));
		add(txtDiaNac);
		
		// mesNac
		mesNac = new JLabel("Mes de Nacimiento: ");
		mesNac.setBounds(535,180,180,25);
		mesNac.setFont(new Font("Andale Mono", 1, 12));
		add(mesNac);

		txtMesNac = new JTextField();
		txtMesNac.setBounds(650,180,150,25);
		txtMesNac.setBackground(new Color(224, 224, 224));
		txtMesNac.setFont(new Font("Andale Mono", 1, 14));
		add(txtMesNac);
		
		// Lugar de Nacimiento
        lugarNac = new JLabel("Lugar de Nacimiento:");
        lugarNac.setBounds(25, 210, 180, 25);
        lugarNac.setFont(new Font("Andale Mono", 1, 12));
        add(lugarNac);

        txtLugarNac = new JTextField();
        txtLugarNac.setBounds(190, 210, 180, 25);
        txtLugarNac.setBackground(new Color(224, 224, 224));
        txtLugarNac.setFont(new Font("Andale Mono", 1, 14));
        add(txtLugarNac);

        // Sexo
        sexo = new JLabel("Sexo:");
        sexo.setBounds(400, 210, 80, 25);
        sexo.setFont(new Font("Andale Mono", 1, 12));
        add(sexo);

        txtSexo = new JTextField();
        txtSexo.setBounds(490, 210, 150, 25);
        txtSexo.setBackground(new Color(224, 224, 224));
        txtSexo.setFont(new Font("Andale Mono", 1, 14));
        add(txtSexo);

       /* // Estado Civil
        estadoCivil = new JLabel("Estado Civil:");
        estadoCivil.setBounds(25, 240, 180, 25);
        estadoCivil.setFont(new Font("Andale Mono", 1, 12));
        add(estadoCivil);

        String[] estadosCiviles = {"Soltero/a", "Casado/a", "Viudo/a", "Divorciado/a"};
        comboEstadoCivil = new JComboBox(estadosCiviles);
        comboEstadoCivil.setBounds(160, 240, 180, 25);
        add(comboEstadoCivil);*/

		 // Direccion
        direccion = new JLabel("Dirección:");
        direccion.setBounds(25, 250, 180, 25);
        direccion.setFont(new Font("Andale Mono", 1, 12));
        add(direccion);

        TxArDireccion= new JTextArea();
        TxArDireccion.setBackground(new Color(224, 224, 224));
        TxArDireccion.setFont(new Font("Andale Mono", 1, 14));
        sp1 = new JScrollPane(TxArDireccion);
        sp1.setBounds(120, 250, 400, 35);
        add(sp1);

        // Teléfono de Casa
        telCasa = new JLabel("Teléfono de Casa:");
        telCasa.setBounds(25, 340, 180, 25);
        telCasa.setFont(new Font("Andale Mono", 1, 12));
        add(telCasa);

        txtTelCasa = new JTextField();
        txtTelCasa.setBounds(150, 340, 150, 25);
        txtTelCasa.setBackground(new Color(224, 224, 224));
        txtTelCasa.setFont(new Font("Andale Mono", 1, 14));
        add(txtTelCasa);
		
        // Religion
        religion = new JLabel("Religión:");
        religion.setBounds(25, 300, 180, 25);
        religion.setFont(new Font("Andale Mono", 1, 12));
        add(religion);

        txtReligion = new JTextField();
        txtReligion.setBounds(100, 300, 150, 25);
        txtReligion.setBackground(new Color(224, 224, 224));
        txtReligion.setFont(new Font("Andale Mono", 1, 14));
        add(txtReligion);

        // Teléfono Celular
        telCelular = new JLabel("Teléfono Celular:");
        telCelular.setBounds(265, 300, 180, 25);
        telCelular.setFont(new Font("Andale Mono", 1, 12));
        add(telCelular);

        txtTelCelular = new JTextField();
        txtTelCelular.setBounds(370, 300, 150, 25);
        txtTelCelular.setBackground(new Color(224, 224, 224));
        txtTelCelular.setFont(new Font("Andale Mono", 1, 14));
        add(txtTelCelular);

        // Teléfono de Oficina
        telOficina = new JLabel("Teléfono de Oficina:");
        telOficina.setBounds(535, 300, 180, 25);
        telOficina.setFont(new Font("Andale Mono", 1, 12));
        add(telOficina);

        txtTelOficina = new JTextField();
        txtTelOficina.setBounds(650, 300, 150, 25);
        txtTelOficina.setBackground(new Color(224, 224, 224));
        txtTelOficina.setFont(new Font("Andale Mono", 1, 14));
        add(txtTelOficina);

        // Correo Electrónico
        correoElectronico = new JLabel("Correo Electrónico:");
        correoElectronico.setBounds(25, 370, 180, 25);
        correoElectronico.setFont(new Font("Andale Mono", 1, 12));
        add(correoElectronico);

        txtCorreoElectronico = new JTextField();
        txtCorreoElectronico.setBounds(150, 370, 150, 25);
        txtCorreoElectronico.setBackground(new Color(224, 224, 224));
        txtCorreoElectronico.setFont(new Font("Andale Mono", 1, 14));
        add(txtCorreoElectronico);

        // Nombre del Familiar
        nombreFamiliar = new JLabel("Nombre del Familiar:");
        nombreFamiliar.setBounds(25, 400, 180, 25);
        nombreFamiliar.setFont(new Font("Andale Mono", 1, 12));
        add(nombreFamiliar);

        txtNombreFamiliar = new JTextField();
        txtNombreFamiliar.setBounds(170, 400, 150, 25);
        txtNombreFamiliar.setBackground(new Color(224, 224, 224));
        txtNombreFamiliar.setFont(new Font("Andale Mono", 1, 14));
        add(txtNombreFamiliar);

        // Teléfono del Familiar
        telDelFamiliar = new JLabel("Teléfono del Familiar:");
        telDelFamiliar.setBounds(25, 430, 180, 25);
        telDelFamiliar.setFont(new Font("Andale Mono", 1, 12));
        add(telDelFamiliar);

        txtTelDelFamiliar = new JTextField();
        txtTelDelFamiliar.setBounds(170, 430, 150, 25);
        txtTelDelFamiliar.setBackground(new Color(224, 224, 224));
        txtTelDelFamiliar.setFont(new Font("Andale Mono", 1, 14));
        add(txtTelDelFamiliar);

        /*/ Tipo de Interrogatorio
        tipoInterrogatorio = new JLabel("Tipo de Interrogatorio:");
        tipoInterrogatorio.setBounds(25, 510, 180, 25);
        tipoInterrogatorio.setFont(new Font("Andale Mono", 1, 12));
        add(tipoInterrogatorio);

        String[] tiposInterrogatorio = {"Tipo 1", "Tipo 2", "Tipo 3"};  // Puedes cambiar esto según tus necesidades
        comboTipoInterrogatorio = new JComboBox<>(tiposInterrogatorio);
        comboTipoInterrogatorio.setBounds(200, 510, 120, 25);
        comboTipoInterrogatorio.setBackground(new Color(224, 224, 224));
        comboTipoInterrogatorio.setFont(new Font("Andale Mono", 1, 14));
        add(comboTipoInterrogatorio);*/

        // Responsable Legal
        responsableLegal = new JLabel("Responsable Legal:");
        responsableLegal.setBounds(25, 460, 180, 25);
        responsableLegal.setFont(new Font("Andale Mono", 1, 12));
        add(responsableLegal);

        txtResponsableLegal = new JTextField();
        txtResponsableLegal.setBounds(170, 460, 150, 25);
        txtResponsableLegal.setBackground(new Color(224, 224, 224));
        txtResponsableLegal.setFont(new Font("Andale Mono", 1, 14));
        add(txtResponsableLegal);

        // Alerta
        alerta = new JLabel("Alerta:");
        alerta.setBounds(370, 340, 180, 25);
        alerta.setFont(new Font("Andale Mono", 1, 12));
        add(alerta);

        txArAlerta = new JTextArea();
        txArAlerta.setBackground(new Color(224, 224, 224));
        txArAlerta.setFont(new Font("Andale Mono", 1, 14));
        JScrollPane sp2 = new JScrollPane(txArAlerta);
        sp2.setBounds(370, 370, 400, 90);
        add(sp2);

        // Botón Guardar 
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(370, 470, 100, 30);
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SwingUtilities.invokeLater(new Runnable() {
					public void run() {
						//excepciones
						JOptionPane.showMessageDialog(null, "Paciente registrado correctamente");
						
					}
				});
			}
		});
		add(btnGuardar);
		
	}
	private static final long serialVersionUID = 1L;

    /**
    * Nombre del método actionPerformed 
    * @Autor: Marisol Zarate López 
    * @Fecha: 15-12-16
    * @Objetivo: asignar un evento 
    * @Parámetros: actionEvent e
    * @return: void
     */
	public void actionPerformed(ActionEvent e){
		
	}
	
	//main
	public static void main (String[] args){
		
		FichaIdentificacionPaciente formulario = new FichaIdentificacionPaciente();
		formulario.setBounds(0,0,850,600);
		formulario.setVisible(true);
		formulario.setLocationRelativeTo(null);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	}
}	
