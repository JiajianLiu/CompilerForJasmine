package backend.compiler;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeMap;

import org.antlr.v4.runtime.tree.ParseTree;

import java.util.Set;
import java.util.Iterator;
import java.util.Map;

import antlr4.PascalParser;

import intermediate.symtab.*;
import intermediate.type.*;
import intermediate.type.Typespec.Form;

import static intermediate.type.Typespec.Form.*;
import static backend.compiler.Instruction.*;

/**
 * <h1>StatementGenerator</h1>
 *
 * <p>
 * Emit code for executable statements.
 * </p>
 *
 * <p>
 * Copyright (c) 2020 by Ronald Mak
 * </p>
 * <p>
 * For instructional purposes only. No warranties.
 * </p>
 */
public class StatementGenerator extends CodeGenerator {
	/**
	 * Constructor.
	 * 
	 * @param parent   the parent generator.
	 * @param compiler the compiler to use.
	 */
	public StatementGenerator(CodeGenerator parent, Compiler compiler) {
		super(parent, compiler);
	}

	/**
	 * Emit code for an assignment statement.
	 * 
	 * @param ctx the AssignmentStatementContext.
	 */
	public void emitAssignment(PascalParser.AssignmentStatementContext ctx) {
		PascalParser.VariableContext varCtx = ctx.lhs().variable();
		PascalParser.ExpressionContext exprCtx = ctx.rhs().expression();
		SymtabEntry varId = varCtx.entry;
		Typespec varType = varCtx.type;
		Typespec exprType = exprCtx.type;

		// The last modifier, if any, is the variable's last subscript or field.
		int modifierCount = varCtx.modifier().size();
		PascalParser.ModifierContext lastModCtx = modifierCount == 0 ? null : varCtx.modifier().get(modifierCount - 1);

		// The target variable has subscripts and/or fields.
		if (modifierCount > 0) {
			lastModCtx = varCtx.modifier().get(modifierCount - 1);
			compiler.visit(varCtx);
		}

		// Emit code to evaluate the expression.
		compiler.visit(exprCtx);

		// float variable := integer constant
		if ((varType == Predefined.realType) && (exprType.baseType() == Predefined.integerType))
			emit(I2F);

		// Emit code to store the expression value into the target variable.
		// The target variable has no subscripts or fields.
		if (lastModCtx == null)
			emitStoreValue(varId, varId.getType());

		// The target variable is a field.
		else if (lastModCtx.field() != null) {
			emitStoreValue(lastModCtx.field().entry, lastModCtx.field().type);
		}

		// The target variable is an array element.
		else {
			emitStoreValue(null, varType);
		}
	}

	/**
	 * Emit code for an IF statement.
	 * 
	 * @param ctx the IfStatementContext.
	 */
	public void emitIf(PascalParser.IfStatementContext ctx) {
		/***** Complete this method. *****/
		Label ifFalseLabel = new Label(); // Label to go to false section
		Label exitLabel = new Label(); // Label to exit the if statement
		compiler.visit(ctx.expression()); // Evaluate the conditional
		emit(IFEQ, ifFalseLabel); // If condition is true go to else
		// If conditional false fall through to the true statement..
		compiler.visit(ctx.trueStatement()); // Visit the true statements
		emit(GOTO, exitLabel); // Go to the exit label to end if statement
		// If conditional is true jump here...
		emitLabel(ifFalseLabel);
		if (ctx.falseStatement() != null) // If there is a falseStatement branch in the tree
			compiler.visit(ctx.falseStatement()); // Visit the false statements
		emitLabel(exitLabel); // Exit the if statement
	}

	/**
	 * Emit code for a CASE statement.
	 * 
	 * @param ctx the CaseStatementContext.
	 */
	public void emitCase(PascalParser.CaseStatementContext ctx) {
		 /***** Complete this method. *****/
		HashMap<Integer, Label> map = new HashMap<Integer, Label>();
	    Label defaultLabel = new Label();
	    String select_String = "\n";
	   ArrayList<Integer> sortValue = new ArrayList<Integer>();
	    ArrayList<Label> labels = new ArrayList<Label>();
	    emitComment("----CASE----CASE----CASE----CASE----CASE----CASE----CASE----CASE----CASE----CASE----CASE----");
	    compiler.visit(ctx.expression());
	    for(int i = 0; i < ctx.caseBranchList().children.size(); i++)   //Loop through case branch
	    {
	        //labels.add(new Label());
	        //
	        //Check for ';' nodes
	        if(ctx.caseBranchList().children.get(i).getChild(0) != null)
	        {
	            labels.add(new Label());
	            //emitLabel(labels.get(i));
	            for(int j = 0; j < ctx.caseBranchList().children.get(i).getChild(0).getChildCount(); j++)
	                if(j % 2 == 0) {
	                    String temp = ctx.caseBranchList().children.get(i).getChild(0).getChild(j).getText();
	                    //System.out.println("temp = " + temp);
	                    //System.out.println("temp.length() = " + temp.length());
	                    int ascii = 0;
	                    if (temp.length() == 3 && temp.substring(0, 1).equals("'"))
	                    {
	                        ascii = (int) temp.charAt(1);
	                        sortValue.add(ascii);
	                        map.put(ascii, labels.get(labels.size()-1));
	                      //  select_String = select_String + "\t\t" + ascii;
	                    }
	                    else
	                    {
	                    	sortValue.add(Integer.parseInt(ctx.caseBranchList().children.get(i).getChild(0).getChild(j).getText()));
	                    	map.put(Integer.parseInt(ctx.caseBranchList().children.get(i).getChild(0).getChild(j).getText()), labels.get(labels.size()-1));
	                      //  select_String = select_String + "\t\t" + ctx.caseBranchList().children.get(i).getChild(0).getChild(j).getText();
	                    }
	                   // select_String = select_String + ": " + labels.get(labels.size()-1).toString() + "\n";
	                }
	        }
	    }
	    Collections.sort(sortValue);
	    
	    for (int i = 0; i < sortValue.size(); i++)
	    {
	    	int temp = sortValue.get(i);
	    	select_String = select_String + "\t\t" + temp;
	    	select_String = select_String + ": " + map.get(temp).toString() + "\n";
	    	
	    }
	    
	    
	    select_String = select_String + "\t\tdefault: " + defaultLabel.toString() + "\n";
	    emit(LOOKUPSWITCH, select_String);
	    //for(int i = 0; i < ctx.caseBranchList().caseBranch().size(); i++)
	    for(int i = 0; i < labels.size(); i++)
	    {
	        emitLabel(labels.get(i));
	        compiler.visit(ctx.caseBranchList().caseBranch(i));
	        emit(GOTO, defaultLabel);
	    }
	    emitLabel(defaultLabel);
	    emitComment("----------------------------------------------------------------------------------------------");
	    localStack.increase(100); 
	}

	/**
	 * Emit code for a REPEAT statement.
	 * 
	 * @param ctx the RepeatStatementContext.
	 */
	public void emitRepeat(PascalParser.RepeatStatementContext ctx) {
		Label loopTopLabel = new Label();
		Label loopExitLabel = new Label();

		emitLabel(loopTopLabel);

		compiler.visit(ctx.statementList());
		compiler.visit(ctx.expression());
		emit(IFNE, loopExitLabel);
		emit(GOTO, loopTopLabel);

		emitLabel(loopExitLabel);
	}

	/**
	 * Emit code for a WHILE statement.
	 * 
	 * @param ctx the WhileStatementContext.
	 */
	public void emitWhile(PascalParser.WhileStatementContext ctx) {
		/***** Complete this method. *****/
		Label loopTopLabel = new Label(); // Label to return to the loop condition
		Label loopExitLabel = new Label(); // Label to exit the loop
		Label loopStatementsLabel = new Label();// Label to go to the statements
		// Check the loop condition and jump to the proper location
		System.out.println("ctx.expression()  " + ctx.expression().getText());
		System.out.println("ctx.statement()" + ctx.statement().getText());
		emitLabel(loopTopLabel);
		compiler.visit(ctx.expression());
		emit(IFEQ, loopExitLabel); // If the condition no longer holds, exit loop
		emit(GOTO, loopStatementsLabel);// If the condition holds, go into the statements
		emitLabel(loopStatementsLabel); // Statements block
		compiler.visit(ctx.statement());
		emit(GOTO, loopTopLabel);
		emitLabel(loopExitLabel); // Exit loop
	}

	/**
	 * Emit code for a FOR statement.
	 * 
	 * @param ctx the ForStatementContext.
	 */
	public void emitFor(PascalParser.ForStatementContext ctx) {
		/***** Complete this method. *****/
		Label loopTopLabel = new Label(); // Label to return to the loop condition
		Label Middle1 = new Label();
		Label Middle2 = new Label(); // Label to exit the loop
		Label Exit = new Label();// Label to go to the statements
		compiler.visitExpression(ctx.expression(0));
		emitStoreValue(ctx.variable().entry, ctx.variable().type);
		// Check the loop condition and jump to the proper location
		emitLabel(loopTopLabel);
		compiler.visit(ctx.variable());
		compiler.visit(ctx.expression(1));
		// Changed IF_ICMPEQ to IF_ICMPGT and IF_ICMPLT
		if (ctx.getChild(4).getText().toLowerCase().equals("to"))
			emit(IF_ICMPGT, Middle1);
		else
			emit(IF_ICMPLT, Middle1);
		emit(ICONST_0);
		emit(GOTO, Middle2);
		emitLabel(Middle1);
		emit(ICONST_1);
		emitLabel(Middle2);
		emit(IFNE, Exit);
		compiler.visit(ctx.statement());
		compiler.visit(ctx.variable());
		emit(ICONST_1);
		if (ctx.getChild(4).getText().toLowerCase().equals("to"))
			emit(IADD);
		else
			emit(ISUB);
		emitStoreValue(ctx.variable().entry, ctx.variable().type);
		emit(GOTO, loopTopLabel);
		emitLabel(Exit);

	}

	/**
	 * Emit code for a procedure call statement.
	 * 
	 * @param ctx the ProcedureCallStatementContext.
	 */
	public void emitProcedureCall(PascalParser.ProcedureCallStatementContext ctx) {
		/***** Complete this method. *****/
		emitCall(ctx.procedureName().entry, ctx.argumentList());
		localStack.increase(100); 
	}

	/**
	 * Emit code for a function call statement.
	 * 
	 * @param ctx the FunctionCallContext.
	 */
	public void emitFunctionCall(PascalParser.FunctionCallContext ctx) {
		/***** Complete this method. *****/
		emitCall(ctx.functionName().entry, ctx.argumentList());
		localStack.increase(100); 
	}

	/**
	 * Emit a call to a procedure or a function.
	 * 
	 * @param routineId  the routine name's symbol table entry.
	 * @param argListCtx the ArgumentListContext.
	 */
	private void emitCall(SymtabEntry routineId, PascalParser.ArgumentListContext argListCtx) {
		/***** Complete this method. *****/
		
        String programName = routineId.getSymtab().getOwner().getName();
        String routineName = routineId.getName();
        ArrayList<SymtabEntry> parmIds = routineId.getRoutineParameters();
        StringBuilder buffer = new StringBuilder();
        if(argListCtx != null){
            System.out.println();
            for(int i = 0; i < argListCtx.argument().size(); i++){
                compiler.visitExpression(argListCtx.argument(i).expression());
                String found = typeDescriptor(argListCtx.argument(i).expression().type);
                String expected = typeDescriptor(parmIds.get(i));
                System.out.println("Found expression of type: " + found + " Expected: " + expected);
                if(found.equals("I") && expected.equals("F")) emit(I2F);
            }
        }
//        else System.out.println("Argument list is null");
        // Procedure or function name.
        buffer.append(programName);
        buffer.append("/");
        buffer.append(routineName);
        buffer.append("(");
        // Parameter and return type descriptors.
        if (parmIds != null)
        {
            for (SymtabEntry parmId : parmIds)
            {
                buffer.append(typeDescriptor(parmId));
            }
        }
        buffer.append(")");
        buffer.append(typeDescriptor(routineId));
        emit(INVOKESTATIC, buffer.toString());
        
        
        localStack.increase(100); 
	}

	/**
	 * Emit code for a WRITE statement.
	 * 
	 * @param ctx the WriteStatementContext.
	 */
	public void emitWrite(PascalParser.WriteStatementContext ctx) {
		emitWrite(ctx.writeArguments(), false);
	}

	/**
	 * Emit code for a WRITELN statement.
	 * 
	 * @param ctx the WritelnStatementContext.
	 */
	public void emitWriteln(PascalParser.WritelnStatementContext ctx) {
		emitWrite(ctx.writeArguments(), true);
	}

	/**
	 * Emit code for a call to WRITE or WRITELN.
	 * 
	 * @param argsCtx the WriteArgumentsContext.
	 * @param needLF  true if need a line feed.
	 */
	private void emitWrite(PascalParser.WriteArgumentsContext argsCtx, boolean needLF) {
		emit(GETSTATIC, "java/lang/System/out", "Ljava/io/PrintStream;");

		// WRITELN with no arguments.
		if (argsCtx == null) {
			emit(INVOKEVIRTUAL, "java/io/PrintStream.println()V");
			localStack.decrease(1);
		}

		// Generate code for the arguments.
		else {
			StringBuffer format = new StringBuffer();
			int exprCount = createWriteFormat(argsCtx, format, needLF);

			// Load the format string.
			emit(LDC, format.toString());

			// Emit the arguments array.
			if (exprCount > 0) {
				emitArgumentsArray(argsCtx, exprCount);

				emit(INVOKEVIRTUAL,
						"java/io/PrintStream/printf(Ljava/lang/String;[Ljava/lang/Object;)" + "Ljava/io/PrintStream;");
				localStack.decrease(2);
				emit(POP);
			} else {
				emit(INVOKEVIRTUAL, "java/io/PrintStream/print(Ljava/lang/String;)V");
				localStack.decrease(2);
			}
		}
	}

	/**
	 * Create the printf format string.
	 * 
	 * @param argsCtx the WriteArgumentsContext.
	 * @param format  the format string to create.
	 * @return the count of expression arguments.
	 */
	private int createWriteFormat(PascalParser.WriteArgumentsContext argsCtx, StringBuffer format, boolean needLF) {
		int exprCount = 0;
		format.append("\"");

		// Loop over the write arguments.
		for (PascalParser.WriteArgumentContext argCtx : argsCtx.writeArgument()) {
			Typespec type = argCtx.expression().type;
			String argText = argCtx.getText();

			// Append any literal strings.
			if (argText.charAt(0) == '\'') {
				format.append(convertString(argText));
			}

			// For any other expressions, append a field specifier.
			else {
				exprCount++;
				format.append("%");

				PascalParser.FieldWidthContext fwCtx = argCtx.fieldWidth();
				if (fwCtx != null) {
					String sign = ((fwCtx.sign() != null) && (fwCtx.sign().getText().equals("-"))) ? "-" : "";
					format.append(sign).append(fwCtx.integerConstant().getText());

					PascalParser.DecimalPlacesContext dpCtx = fwCtx.decimalPlaces();
					if (dpCtx != null) {
						format.append(".").append(dpCtx.integerConstant().getText());
					}
				}

				String typeFlag = type == Predefined.integerType ? "d"
						: type == Predefined.realType ? "f"
								: type == Predefined.booleanType ? "b" : type == Predefined.charType ? "c" : "s";
				format.append(typeFlag);
			}
		}

		format.append(needLF ? "\\n\"" : "\"");

		return exprCount;
	}

	/**
	 * Emit the printf arguments array.
	 * 
	 * @param argsCtx
	 * @param exprCount
	 */
	private void emitArgumentsArray(PascalParser.WriteArgumentsContext argsCtx, int exprCount) {
		// Create the arguments array.
		emitLoadConstant(exprCount);
		emit(ANEWARRAY, "java/lang/Object");

		int index = 0;

		// Loop over the write arguments to fill the arguments array.
		for (PascalParser.WriteArgumentContext argCtx : argsCtx.writeArgument()) {
			String argText = argCtx.getText();
			PascalParser.ExpressionContext exprCtx = argCtx.expression();
			Typespec type = exprCtx.type.baseType();

			// Skip string constants, which were made part of
			// the format string.
			if (argText.charAt(0) != '\'') {
				emit(DUP);
				emitLoadConstant(index++);

				compiler.visit(exprCtx);

				Form form = type.getForm();
				if (((form == SCALAR) || (form == ENUMERATION)) && (type != Predefined.stringType)) {
					emit(INVOKESTATIC, valueOfSignature(type));
				}

				// Store the value into the array.
				emit(AASTORE);
			}
		}
	}

	/**
	 * Emit code for a READ statement.
	 * 
	 * @param ctx the ReadStatementContext.
	 */
	public void emitRead(PascalParser.ReadStatementContext ctx) {
		emitRead(ctx.readArguments(), false);
	}

	/**
	 * Emit code for a READLN statement.
	 * 
	 * @param ctx the ReadlnStatementContext.
	 */
	public void emitReadln(PascalParser.ReadlnStatementContext ctx) {
		emitRead(ctx.readArguments(), true);
	}

	/**
	 * Generate code for a call to READ or READLN.
	 * 
	 * @param argsCtx  the ReadArgumentsContext.
	 * @param needSkip true if need to skip the rest of the input line.
	 */
	private void emitRead(PascalParser.ReadArgumentsContext argsCtx, boolean needSkip) {
		int size = argsCtx.variable().size();

		// Loop over read arguments.
		for (int i = 0; i < size; i++) {
			PascalParser.VariableContext varCtx = argsCtx.variable().get(i);
			Typespec varType = varCtx.type;

			if (varType == Predefined.integerType) {
				emit(GETSTATIC, programName + "/_sysin Ljava/util/Scanner;");
				emit(INVOKEVIRTUAL, "java/util/Scanner/nextInt()I");
				emitStoreValue(varCtx.entry, null);
			} else if (varType == Predefined.realType) {
				emit(GETSTATIC, programName + "/_sysin Ljava/util/Scanner;");
				emit(INVOKEVIRTUAL, "java/util/Scanner/nextFloat()F");
				emitStoreValue(varCtx.entry, null);
			} else if (varType == Predefined.booleanType) {
				emit(GETSTATIC, programName + "/_sysin Ljava/util/Scanner;");
				emit(INVOKEVIRTUAL, "java/util/Scanner/nextBoolean()Z");
				emitStoreValue(varCtx.entry, null);
			} else if (varType == Predefined.charType) {
				emit(GETSTATIC, programName + "/_sysin Ljava/util/Scanner;");
				emit(LDC, "\"\"");
				emit(INVOKEVIRTUAL, "java/util/Scanner/useDelimiter(Ljava/lang/String;)" + "Ljava/util/Scanner;");
				emit(POP);
				emit(GETSTATIC, programName + "/_sysin Ljava/util/Scanner;");
				emit(INVOKEVIRTUAL, "java/util/Scanner/next()Ljava/lang/String;");
				emit(ICONST_0);
				emit(INVOKEVIRTUAL, "java/lang/String/charAt(I)C");
				emitStoreValue(varCtx.entry, null);

				emit(GETSTATIC, programName + "/_sysin Ljava/util/Scanner;");
				emit(INVOKEVIRTUAL, "java/util/Scanner/reset()Ljava/util/Scanner;");

			} else // string
			{
				emit(GETSTATIC, programName + "/_sysin Ljava/util/Scanner;");
				emit(INVOKEVIRTUAL, "java/util/Scanner/next()Ljava/lang/String;");
				emitStoreValue(varCtx.entry, null);
			}
		}

		// READLN: Skip the rest of the input line.
		if (needSkip) {
			emit(GETSTATIC, programName + "/_sysin Ljava/util/Scanner;");
			emit(INVOKEVIRTUAL, "java/util/Scanner/nextLine()Ljava/lang/String;");
			emit(POP);
		}
	}
}