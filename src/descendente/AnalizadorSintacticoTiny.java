/* AnalizadorSintacticoTiny.java */
/* Generated By:JavaCC: Do not edit this line. AnalizadorSintacticoTiny.java */
package descendente;

import java.io.FileReader;

import ast.Programa;
import ast.asignaciones.ACompuesta;
import ast.asignaciones.ASimple;
import ast.asignaciones.Asignacion;
import ast.asignaciones.I;
import ast.asignaciones.IS;
import ast.declaraciones.D;
import ast.declaraciones.DBool;
import ast.declaraciones.DCompuesta;
import ast.declaraciones.DNum;
import ast.declaraciones.DS;
import ast.declaraciones.DSimple;
import ast.expresiones.E;
import ast.expresiones.eBin.OpAnd;
import ast.expresiones.eBin.OpDistinto;
import ast.expresiones.eBin.OpDiv;
import ast.expresiones.eBin.OpIgual;
import ast.expresiones.eBin.OpMas;
import ast.expresiones.eBin.OpMayor;
import ast.expresiones.eBin.OpMayorIgual;
import ast.expresiones.eBin.OpMenor;
import ast.expresiones.eBin.OpMenorIgual;
import ast.expresiones.eBin.OpMenos;
import ast.expresiones.eBin.OpMul;
import ast.expresiones.eBin.OpOr;
import ast.expresiones.eUn.OpMenosUnario;
import ast.expresiones.eUn.OpNot;
import ast.terminales.BoolFalse;
import ast.terminales.BoolTrue;
import ast.terminales.NombreVariable;
import ast.terminales.Numero;

// java -classpath "javacc.jar" javacc grammar.jj

public class AnalizadorSintacticoTiny implements AnalizadorSintacticoTinyConstants {

        public static void main(String[] args) throws Exception {
                AnalizadorSintacticoTiny asint = new AnalizadorSintacticoTiny(new FileReader("src/pruebas/correcto.txt"));
                Programa prg = asint.sp();
                System.out.println(prg.toString());
                System.out.println("CORRECTO!!");
        }

        E mkop(String op, E exp1, E exp2) {
                if(op.equalsIgnoreCase("==")) {
                        return new OpIgual(exp1, exp2);
                } else if(op.equalsIgnoreCase("!=")) {
                        return new OpDistinto(exp1, exp2);
                } else if(op.equalsIgnoreCase("<")) {
                        return new OpMenor(exp1, exp2);
                } else if(op.equalsIgnoreCase(">")) {
                        return new OpMayor(exp1, exp2);
                } else if(op.equalsIgnoreCase("<=")) {
                        return new OpMenorIgual(exp1, exp2);
                } else if(op.equalsIgnoreCase("=>")) {
                        return new OpMayorIgual(exp1, exp2);
                } else {
                        return null;
                }
        }

  final public Programa sp() throws ParseException {Programa prg;
    prg = s();
{if ("" != null) return prg;}
    throw new Error("Missing return statement in function");
  }

  final public Programa s() throws ParseException {D dec; I ins;
    dec = d();
    jj_consume_token(SEPARADOR);
    ins = i();
    jj_consume_token(0);
{if ("" != null) return new Programa(dec, ins);}
    throw new Error("Missing return statement in function");
  }

  final public D d() throws ParseException {D dec, decC; DS decS;
    decS = ds();
    decC = d0(decS);
{if ("" != null) return new DCompuesta(decS, decC);}
    throw new Error("Missing return statement in function");
  }

  final public D d0(DS ahOfD) throws ParseException {D dec;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case PUNTOYCOMA:{
      jj_consume_token(PUNTOYCOMA);
      dec = d();
{if ("" != null) return new DCompuesta(ahOfD, dec);}
      break;
      }
    default:
      jj_la1[0] = jj_gen;
{{if ("" != null) return new DSimple(ahOfD);}}
    }
    throw new Error("Missing return statement in function");
  }

  final public DS ds() throws ParseException {Token id;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case NOMBRETIPONUM:{
      jj_consume_token(NOMBRETIPONUM);
      id = jj_consume_token(NOMBREVARIABLE);
{if ("" != null) return new DNum(id.image);}
      break;
      }
    case NOMBRETIPOBOOL:{
      jj_consume_token(NOMBRETIPOBOOL);
      id = jj_consume_token(NOMBREVARIABLE);
{if ("" != null) return new DBool(id.image);}
      break;
      }
    default:
      jj_la1[1] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    throw new Error("Missing return statement in function");
  }

  final public I i() throws ParseException {I iC; IS iS;
    iS = is();
    iC = i0(iS);
{if ("" != null) return new ACompuesta(iC, iS);}
    throw new Error("Missing return statement in function");
  }

  final public I i0(IS ahOfI) throws ParseException {I iC;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case PUNTOYCOMA:{
      jj_consume_token(PUNTOYCOMA);
      iC = i();
{if ("" != null) return new ACompuesta(iC, ahOfI);}
      break;
      }
    default:
      jj_la1[2] = jj_gen;
{{if ("" != null) return new ASimple(ahOfI);}}
    }
    throw new Error("Missing return statement in function");
  }

  final public IS is() throws ParseException {Token id;E exp;
    id = jj_consume_token(NOMBREVARIABLE);
    jj_consume_token(OPASIGNAR);
    exp = e4();
{if ("" != null) return new Asignacion(id.image, exp);}
    throw new Error("Missing return statement in function");
  }

  final public E e4() throws ParseException {E exp;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case OPMENOSUNARIO:{
      jj_consume_token(OPMENOSUNARIO);
      exp = e4();
{if ("" != null) return new OpMenosUnario(exp);}
      break;
      }
    case OPNOT:{
      jj_consume_token(OPNOT);
      exp = e3();
{if ("" != null) return new OpNot(exp);}
      break;
      }
    case NUMERO:
    case TRUE:
    case FALSE:
    case PAP:
    case NOMBREVARIABLE:{
      exp = e3();
{if ("" != null) return exp;}
      break;
      }
    default:
      jj_la1[3] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    throw new Error("Missing return statement in function");
  }

  final public E e3() throws ParseException {E exp1, exp2;
    exp1 = e2();
    exp2 = e32(exp1);
{if ("" != null) return exp2;}
    throw new Error("Missing return statement in function");
  }

  final public E e31(E ahOfExp) throws ParseException {E exp;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case OPMUL:{
      jj_consume_token(OPMUL);
      exp = e2();
{if ("" != null) return new OpMul(ahOfExp, exp);}
      break;
      }
    case OPDIV:{
      jj_consume_token(OPDIV);
      exp = e2();
{if ("" != null) return new OpDiv(ahOfExp, exp);}
      break;
      }
    default:
      jj_la1[4] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    throw new Error("Missing return statement in function");
  }

  final public E e32(E ahOfExp) throws ParseException {E exp1, exp2;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case OPMUL:
    case OPDIV:{
      exp1 = e31(ahOfExp);
      exp2 = e32(exp1);
{if ("" != null) return exp2;}
      break;
      }
    default:
      jj_la1[5] = jj_gen;
{{if ("" != null) return ahOfExp;}}
    }
    throw new Error("Missing return statement in function");
  }

  final public E e2() throws ParseException {E exp1, exp2;
    exp1 = e1();
    exp2 = e21(exp1);
{if ("" != null) return exp2;}
    throw new Error("Missing return statement in function");
  }

  final public E e21(E ahOfExp) throws ParseException {Token op; E exp;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case OPMENOR:
    case OPMAYOR:
    case OPMENORIGUAL:
    case OPMAYORIGUAL:
    case OPDISTINTO:{
      op = r();
      exp = e1();
{if ("" != null) return mkop(op.image, ahOfExp, exp);}
      break;
      }
    default:
      jj_la1[6] = jj_gen;
{{if ("" != null) return ahOfExp;}}
    }
    throw new Error("Missing return statement in function");
  }

  final public Token r() throws ParseException {Token op;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case OPMAYOR:{
      op = jj_consume_token(OPMAYOR);
{if ("" != null) return op;}
      break;
      }
    case OPMENOR:{
      op = jj_consume_token(OPMENOR);
{if ("" != null) return op;}
      break;
      }
    case OPMENORIGUAL:{
      op = jj_consume_token(OPMENORIGUAL);
{if ("" != null) return op;}
      break;
      }
    case OPMAYORIGUAL:{
      op = jj_consume_token(OPMAYORIGUAL);
{if ("" != null) return op;}
      break;
      }
    case OPDISTINTO:{
      op = jj_consume_token(OPDISTINTO);
{if ("" != null) return op;}
      break;
      }
    default:
      jj_la1[7] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    throw new Error("Missing return statement in function");
  }

  final public E e1() throws ParseException {E exp1, exp2;
    exp1 = e0();
    exp2 = e12(exp1);
{if ("" != null) return exp2;}
    throw new Error("Missing return statement in function");
  }

  final public E e11(E ahOfExp) throws ParseException {E exp;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case OPAND:{
      jj_consume_token(OPAND);
      exp = e1();
{if ("" != null) return new OpAnd(ahOfExp, exp);}
      break;
      }
    case OPOR:{
      jj_consume_token(OPOR);
      exp = e0();
{if ("" != null) return new OpOr(ahOfExp, exp);}
      break;
      }
    default:
      jj_la1[8] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    throw new Error("Missing return statement in function");
  }

  final public E e12(E ahOfExp) throws ParseException {E exp;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case OPAND:
    case OPOR:{
      exp = e11(ahOfExp);
{if ("" != null) return exp;}
      break;
      }
    default:
      jj_la1[9] = jj_gen;
{{if ("" != null) return ahOfExp;}}
    }
    throw new Error("Missing return statement in function");
  }

  final public E e0() throws ParseException {E exp1, exp2;
    exp1 = f();
    exp2 = e02(exp1);
{if ("" != null) return exp2;}
    throw new Error("Missing return statement in function");
  }

  final public E e01(E ahOfExp) throws ParseException {E exp;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case OPMAS:{
      jj_consume_token(OPMAS);
      exp = f();
{if ("" != null) return new OpMas(ahOfExp, exp);}
      break;
      }
    case OPMENOSUNARIO:{
      jj_consume_token(OPMENOSUNARIO);
      exp = f();
{if ("" != null) return new OpMenos(ahOfExp, exp);}
      break;
      }
    default:
      jj_la1[10] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    throw new Error("Missing return statement in function");
  }

  final public E e02(E ahOfExp) throws ParseException {E exp1, exp2;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case OPMAS:
    case OPMENOSUNARIO:{
      exp1 = e01(ahOfExp);
      exp2 = e02(exp1);
{if ("" != null) return exp2;}
      break;
      }
    default:
      jj_la1[11] = jj_gen;
{{if ("" != null) return ahOfExp;}}
    }
    throw new Error("Missing return statement in function");
  }

  final public E f() throws ParseException {E exp; Token ter;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case PAP:{
      jj_consume_token(PAP);
      exp = e4();
      jj_consume_token(PCI);
{if ("" != null) return exp;}
      break;
      }
    case NOMBREVARIABLE:{
      ter = jj_consume_token(NOMBREVARIABLE);
{if ("" != null) return new NombreVariable(ter.image);}
      break;
      }
    case TRUE:{
      jj_consume_token(TRUE);
{if ("" != null) return new BoolTrue();}
      break;
      }
    case FALSE:{
      jj_consume_token(FALSE);
{if ("" != null) return new BoolFalse();}
      break;
      }
    case NUMERO:{
      ter = jj_consume_token(NUMERO);
{if ("" != null) return new Numero(ter.image);}
      break;
      }
    default:
      jj_la1[12] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    throw new Error("Missing return statement in function");
  }

  /** Generated Token Manager. */
  public AnalizadorSintacticoTinyTokenManager token_source;
  SimpleCharStream jj_input_stream;
  /** Current token. */
  public Token token;
  /** Next token. */
  public Token jj_nt;
  private int jj_ntk;
  private int jj_gen;
  final private int[] jj_la1 = new int[13];
  static private int[] jj_la1_0;
  static {
      jj_la1_init_0();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0x20,0xc0,0x20,0x901c208,0xc00,0xc00,0xbc0000,0xbc0000,0x3000,0x3000,0x300,0x300,0x9018008,};
   }

  /** Constructor with InputStream. */
  public AnalizadorSintacticoTiny(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public AnalizadorSintacticoTiny(java.io.InputStream stream, String encoding) {
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new AnalizadorSintacticoTinyTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 13; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 13; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public AnalizadorSintacticoTiny(java.io.Reader stream) {
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new AnalizadorSintacticoTinyTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 13; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 13; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public AnalizadorSintacticoTiny(AnalizadorSintacticoTinyTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 13; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(AnalizadorSintacticoTinyTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 13; i++) jj_la1[i] = -1;
  }

  private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }


/** Get the next Token. */
  final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  private int jj_ntk_f() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  private int[] jj_expentry;
  private int jj_kind = -1;

  /** Generate ParseException. */
  public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[29];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 13; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 29; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  final public void enable_tracing() {
  }

  /** Disable tracing. */
  final public void disable_tracing() {
  }

}