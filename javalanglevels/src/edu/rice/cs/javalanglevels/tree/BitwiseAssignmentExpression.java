package edu.rice.cs.javalanglevels.tree;

import edu.rice.cs.javalanglevels.SourceInfo;

/**
 * Class BitwiseAssignmentExpression, a component of the JExpressionIF composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Wed Oct 26 13:40:50 CDT 2016
 */
public abstract class BitwiseAssignmentExpression extends AssignmentExpression {

  /**
   * Constructs a BitwiseAssignmentExpression.
   * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
   */
  public BitwiseAssignmentExpression(SourceInfo in_sourceInfo, Expression in_name, Expression in_value) {
    super(in_sourceInfo, in_name, in_value);
  }


  public abstract <RetType> RetType visit(JExpressionIFVisitor<RetType> visitor);
  public abstract void visit(JExpressionIFVisitor_void visitor);
  public abstract void outputHelp(TabPrintWriter writer);
  protected abstract int generateHashCode();
}
