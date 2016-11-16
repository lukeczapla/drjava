package edu.rice.cs.javalanglevels.tree;

import edu.rice.cs.javalanglevels.SourceInfo;

/**
 * Class FormalParameter, a component of the JExpressionIF composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Wed Oct 26 13:40:50 CDT 2016
 */
public class FormalParameter extends JExpression {
  private final VariableDeclarator _declarator;
  private final boolean _isFinal;

  /**
   * Constructs a FormalParameter.
   * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
   */
  public FormalParameter(SourceInfo in_sourceInfo, VariableDeclarator in_declarator, boolean in_isFinal) {
    super(in_sourceInfo);

    if (in_declarator == null) {
      throw new java.lang.IllegalArgumentException("Parameter 'declarator' to the FormalParameter constructor was null. This class may not have null field values.");
    }
    _declarator = in_declarator;
    _isFinal = in_isFinal;
  }

  final public VariableDeclarator getDeclarator() { return _declarator; }
  final public boolean isIsFinal() { return _isFinal; }

  public <RetType> RetType visit(JExpressionIFVisitor<RetType> visitor) { return visitor.forFormalParameter(this); }
  public void visit(JExpressionIFVisitor_void visitor) { visitor.forFormalParameter(this); }

  /**
   * Implementation of toString that uses
   * {@link #output} to generated nicely tabbed tree.
   */
  public java.lang.String toString() {
    java.io.StringWriter w = new java.io.StringWriter();
    output(w);
    return w.toString();
  }

  /**
   * Prints this object out as a nicely tabbed tree.
   */
  public void output(java.io.Writer writer) {
    outputHelp(new TabPrintWriter(writer, 2));
  }

  public void outputHelp(TabPrintWriter writer) {
    writer.print("FormalParameter" + ":");
    writer.indent();

    writer.startLine("");
    writer.print("sourceInfo = ");
    SourceInfo temp_sourceInfo = getSourceInfo();
    if (temp_sourceInfo == null) {
      writer.print("null");
    } else {
      writer.print(temp_sourceInfo);
    }

    writer.startLine("");
    writer.print("declarator = ");
    VariableDeclarator temp_declarator = getDeclarator();
    if (temp_declarator == null) {
      writer.print("null");
    } else {
      temp_declarator.outputHelp(writer);
    }

    writer.startLine("");
    writer.print("isFinal = ");
    boolean temp_isFinal = isIsFinal();
    writer.print(temp_isFinal);
    writer.unindent();
  }

  /**
   * Implementation of equals that is based on the values
   * of the fields of the object. Thus, two objects 
   * created with identical parameters will be equal.
   */
  public boolean equals(java.lang.Object obj) {
    if (obj == null) return false;
    if ((obj.getClass() != this.getClass()) || (obj.hashCode() != this.hashCode())) {
      return false;
    } else {
      FormalParameter casted = (FormalParameter) obj;
      if (! (getDeclarator().equals(casted.getDeclarator()))) return false;
      if (! (isIsFinal() == casted.isIsFinal())) return false;
      return true;
    }
  }

  /**
   * Implementation of hashCode that is consistent with
   * equals. The value of the hashCode is formed by
   * XORing the hashcode of the class object with
   * the hashcodes of all the fields of the object.
   */
  protected int generateHashCode() {
    int code = getClass().hashCode();
    code ^= 0;
    code ^= getDeclarator().hashCode();
    code ^= (isIsFinal() ? 1231 : 1237);
    return code;
  }
}
