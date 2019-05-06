
Analizador sintáctico descencente con JavaCC

Para generar este analizador he realizado dos pasos principales:
	- (1) Crear y rellenar el archivo grammar.jj
	- (2) Ejecutar javacc.jar pare generar el código
	- (3) Ejecutar el códgo generado con los ficheros de prueba

(1) En este paso he creado el fichero "grammar.jj" donde he definido las clases
léxicas del lenguaje desarrolladas en la práctica 1, la gramática acomodada de la práctica 2
y el código extra necesario para lanzar el análisis (imports necesarios y la función main).
NOTA: he modificado la gramática y los lexemas para que se detecten correctamente las expresiones del tipo "5++6"
donde el analizador léxico devuelve {NUM, SUM, SU, NUM} y el analizador sintáctico se encarga de diferenciar entre
el '+' operador binario y el '+' de inicio del número. En la gramática he incluído un asentencia "LOOKAHEAD(2)" en la producción
"void P4() 	: {} {LOOKAHEAD(2)<OPMENOSUNARIO> P4() | <OPNOT> P3() | P3()}" para deshacer la ambigüedad que se crea
entre el operador "menos unario" y el inicio de un número negativo ("-5").

La función main recibe un solo argumento que es la dirección del fichero a analizar.
En caso de error aparecerá una excepción en la consola de comandos y en caso de éxito
aparecerá la cadena "¡¡CORRECTO!!" para indicarlo.

(2) El comando empleado para geerar el código es "java -classpath "<direccion javacc>/javacc.jar" javacc <direccion_gramatica.jj>"

(3) He incluído cuatro ficheros de prueba que se encuentran en el paquete "pruebas":
	- correcto.txt. Es el ejemplo indicado en la descripcion de la practica 1.
	- error_tipos.txt. Este ejemplo contiene errores de tipo (var = true + 2) pero sintácticamente es correcto.
	- sin_puntoycoma.txt. Este fichero contiene una falta de punto y coma en una instrucción:
		Exception in thread "main" descendente.ParseException: Encountered " <NOMBREVARIABLE> "pesado "" at line 5, column 1.
		Was expecting one of:
    	<EOF>, ";", "+", "*", "/", "-", "and", "or", "<", ">", "<=", "=>", "!="
    - sin_separador.txt. En este ejemplo no está el separador que delimita las secciones de declaraciones e instrucciones:
    	Exception in thread "main" descendente.ParseException: Encountered " <NOMBREVARIABLE> "peso "" at line 3, column 1.
		Was expecting one of:
    	"&&", ";"
    - operadores_seguidos.txt. Este ichero contiene una línea con dos operadores consecutivos:
    	Exception in thread "main" descendente.ParseException: Encountered " "*" "* "" at line 6, column 13.
		Was expecting one of:
    	"true", "false", "(", <NUMERO>, <NOMBREVARIABLE>
    - variable_no_declarada.txt. En este fichero de prueba hay una línea con una asignación a una variable no declarada pero
    sintácticamente es correcto.



D d0(D ahOfD)	: {D decS; D decC;} {<PUNTOYCOMA> decS=ds() decC=d0(new DCompuesta(ahOfD.dec(), decS))		{return decC;} 	| {{return ahOfD;}}}
I i0(I ahOfI) 	: {I iC; I iS;} 	{<PUNTOYCOMA> iS=is() 	iC  =i0(new ACompuesta(iS.asignacion(), ahOfI))	{return iC;} 	| {{return ahOfI;}}}























