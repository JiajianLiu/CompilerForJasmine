// Generated from Pascal.g4 by ANTLR 4.8

    package antlr4;
    import java.util.HashMap;
    import intermediate.symtab.SymtabEntry;
    import intermediate.type.Typespec;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PascalParser}.
 */
public interface PascalListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PascalParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(PascalParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(PascalParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#programHeader}.
	 * @param ctx the parse tree
	 */
	void enterProgramHeader(PascalParser.ProgramHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#programHeader}.
	 * @param ctx the parse tree
	 */
	void exitProgramHeader(PascalParser.ProgramHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#programParameters}.
	 * @param ctx the parse tree
	 */
	void enterProgramParameters(PascalParser.ProgramParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#programParameters}.
	 * @param ctx the parse tree
	 */
	void exitProgramParameters(PascalParser.ProgramParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#programIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterProgramIdentifier(PascalParser.ProgramIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#programIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitProgramIdentifier(PascalParser.ProgramIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(PascalParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(PascalParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#declarations}.
	 * @param ctx the parse tree
	 */
	void enterDeclarations(PascalParser.DeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#declarations}.
	 * @param ctx the parse tree
	 */
	void exitDeclarations(PascalParser.DeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#constantsPart}.
	 * @param ctx the parse tree
	 */
	void enterConstantsPart(PascalParser.ConstantsPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#constantsPart}.
	 * @param ctx the parse tree
	 */
	void exitConstantsPart(PascalParser.ConstantsPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#constantDefinitionsList}.
	 * @param ctx the parse tree
	 */
	void enterConstantDefinitionsList(PascalParser.ConstantDefinitionsListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#constantDefinitionsList}.
	 * @param ctx the parse tree
	 */
	void exitConstantDefinitionsList(PascalParser.ConstantDefinitionsListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#constantDefinition}.
	 * @param ctx the parse tree
	 */
	void enterConstantDefinition(PascalParser.ConstantDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#constantDefinition}.
	 * @param ctx the parse tree
	 */
	void exitConstantDefinition(PascalParser.ConstantDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#constantIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterConstantIdentifier(PascalParser.ConstantIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#constantIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitConstantIdentifier(PascalParser.ConstantIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(PascalParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(PascalParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#sign}.
	 * @param ctx the parse tree
	 */
	void enterSign(PascalParser.SignContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#sign}.
	 * @param ctx the parse tree
	 */
	void exitSign(PascalParser.SignContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#typesPart}.
	 * @param ctx the parse tree
	 */
	void enterTypesPart(PascalParser.TypesPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#typesPart}.
	 * @param ctx the parse tree
	 */
	void exitTypesPart(PascalParser.TypesPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#typeDefinitionsList}.
	 * @param ctx the parse tree
	 */
	void enterTypeDefinitionsList(PascalParser.TypeDefinitionsListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#typeDefinitionsList}.
	 * @param ctx the parse tree
	 */
	void exitTypeDefinitionsList(PascalParser.TypeDefinitionsListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#typeDefinition}.
	 * @param ctx the parse tree
	 */
	void enterTypeDefinition(PascalParser.TypeDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#typeDefinition}.
	 * @param ctx the parse tree
	 */
	void exitTypeDefinition(PascalParser.TypeDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#typeIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeIdentifier(PascalParser.TypeIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#typeIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeIdentifier(PascalParser.TypeIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleTypespec}
	 * labeled alternative in {@link PascalParser#typeSpecification}.
	 * @param ctx the parse tree
	 */
	void enterSimpleTypespec(PascalParser.SimpleTypespecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleTypespec}
	 * labeled alternative in {@link PascalParser#typeSpecification}.
	 * @param ctx the parse tree
	 */
	void exitSimpleTypespec(PascalParser.SimpleTypespecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayTypespec}
	 * labeled alternative in {@link PascalParser#typeSpecification}.
	 * @param ctx the parse tree
	 */
	void enterArrayTypespec(PascalParser.ArrayTypespecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayTypespec}
	 * labeled alternative in {@link PascalParser#typeSpecification}.
	 * @param ctx the parse tree
	 */
	void exitArrayTypespec(PascalParser.ArrayTypespecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code recordTypespec}
	 * labeled alternative in {@link PascalParser#typeSpecification}.
	 * @param ctx the parse tree
	 */
	void enterRecordTypespec(PascalParser.RecordTypespecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code recordTypespec}
	 * labeled alternative in {@link PascalParser#typeSpecification}.
	 * @param ctx the parse tree
	 */
	void exitRecordTypespec(PascalParser.RecordTypespecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeIdentifierTypespec}
	 * labeled alternative in {@link PascalParser#simpleType}.
	 * @param ctx the parse tree
	 */
	void enterTypeIdentifierTypespec(PascalParser.TypeIdentifierTypespecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeIdentifierTypespec}
	 * labeled alternative in {@link PascalParser#simpleType}.
	 * @param ctx the parse tree
	 */
	void exitTypeIdentifierTypespec(PascalParser.TypeIdentifierTypespecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code enumerationTypespec}
	 * labeled alternative in {@link PascalParser#simpleType}.
	 * @param ctx the parse tree
	 */
	void enterEnumerationTypespec(PascalParser.EnumerationTypespecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code enumerationTypespec}
	 * labeled alternative in {@link PascalParser#simpleType}.
	 * @param ctx the parse tree
	 */
	void exitEnumerationTypespec(PascalParser.EnumerationTypespecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subrangeTypespec}
	 * labeled alternative in {@link PascalParser#simpleType}.
	 * @param ctx the parse tree
	 */
	void enterSubrangeTypespec(PascalParser.SubrangeTypespecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subrangeTypespec}
	 * labeled alternative in {@link PascalParser#simpleType}.
	 * @param ctx the parse tree
	 */
	void exitSubrangeTypespec(PascalParser.SubrangeTypespecContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#enumerationType}.
	 * @param ctx the parse tree
	 */
	void enterEnumerationType(PascalParser.EnumerationTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#enumerationType}.
	 * @param ctx the parse tree
	 */
	void exitEnumerationType(PascalParser.EnumerationTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#enumerationConstant}.
	 * @param ctx the parse tree
	 */
	void enterEnumerationConstant(PascalParser.EnumerationConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#enumerationConstant}.
	 * @param ctx the parse tree
	 */
	void exitEnumerationConstant(PascalParser.EnumerationConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#subrangeType}.
	 * @param ctx the parse tree
	 */
	void enterSubrangeType(PascalParser.SubrangeTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#subrangeType}.
	 * @param ctx the parse tree
	 */
	void exitSubrangeType(PascalParser.SubrangeTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(PascalParser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(PascalParser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#arrayDimensionList}.
	 * @param ctx the parse tree
	 */
	void enterArrayDimensionList(PascalParser.ArrayDimensionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#arrayDimensionList}.
	 * @param ctx the parse tree
	 */
	void exitArrayDimensionList(PascalParser.ArrayDimensionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#recordType}.
	 * @param ctx the parse tree
	 */
	void enterRecordType(PascalParser.RecordTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#recordType}.
	 * @param ctx the parse tree
	 */
	void exitRecordType(PascalParser.RecordTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#recordFields}.
	 * @param ctx the parse tree
	 */
	void enterRecordFields(PascalParser.RecordFieldsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#recordFields}.
	 * @param ctx the parse tree
	 */
	void exitRecordFields(PascalParser.RecordFieldsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#variablesPart}.
	 * @param ctx the parse tree
	 */
	void enterVariablesPart(PascalParser.VariablesPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#variablesPart}.
	 * @param ctx the parse tree
	 */
	void exitVariablesPart(PascalParser.VariablesPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#variableDeclarationsList}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationsList(PascalParser.VariableDeclarationsListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#variableDeclarationsList}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationsList(PascalParser.VariableDeclarationsListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#variableDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarations(PascalParser.VariableDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#variableDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarations(PascalParser.VariableDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#variableIdentifierList}.
	 * @param ctx the parse tree
	 */
	void enterVariableIdentifierList(PascalParser.VariableIdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#variableIdentifierList}.
	 * @param ctx the parse tree
	 */
	void exitVariableIdentifierList(PascalParser.VariableIdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#variableIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterVariableIdentifier(PascalParser.VariableIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#variableIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitVariableIdentifier(PascalParser.VariableIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#routinesPart}.
	 * @param ctx the parse tree
	 */
	void enterRoutinesPart(PascalParser.RoutinesPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#routinesPart}.
	 * @param ctx the parse tree
	 */
	void exitRoutinesPart(PascalParser.RoutinesPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#routineDefinition}.
	 * @param ctx the parse tree
	 */
	void enterRoutineDefinition(PascalParser.RoutineDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#routineDefinition}.
	 * @param ctx the parse tree
	 */
	void exitRoutineDefinition(PascalParser.RoutineDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#procedureHead}.
	 * @param ctx the parse tree
	 */
	void enterProcedureHead(PascalParser.ProcedureHeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#procedureHead}.
	 * @param ctx the parse tree
	 */
	void exitProcedureHead(PascalParser.ProcedureHeadContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#functionHead}.
	 * @param ctx the parse tree
	 */
	void enterFunctionHead(PascalParser.FunctionHeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#functionHead}.
	 * @param ctx the parse tree
	 */
	void exitFunctionHead(PascalParser.FunctionHeadContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#routineIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterRoutineIdentifier(PascalParser.RoutineIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#routineIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitRoutineIdentifier(PascalParser.RoutineIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(PascalParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(PascalParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#parameterDeclarationsList}.
	 * @param ctx the parse tree
	 */
	void enterParameterDeclarationsList(PascalParser.ParameterDeclarationsListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#parameterDeclarationsList}.
	 * @param ctx the parse tree
	 */
	void exitParameterDeclarationsList(PascalParser.ParameterDeclarationsListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#parameterDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterParameterDeclarations(PascalParser.ParameterDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#parameterDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitParameterDeclarations(PascalParser.ParameterDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#parameterIdentifierList}.
	 * @param ctx the parse tree
	 */
	void enterParameterIdentifierList(PascalParser.ParameterIdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#parameterIdentifierList}.
	 * @param ctx the parse tree
	 */
	void exitParameterIdentifierList(PascalParser.ParameterIdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#parameterIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterParameterIdentifier(PascalParser.ParameterIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#parameterIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitParameterIdentifier(PascalParser.ParameterIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(PascalParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(PascalParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(PascalParser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(PascalParser.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStatement(PascalParser.EmptyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStatement(PascalParser.EmptyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#statementList}.
	 * @param ctx the parse tree
	 */
	void enterStatementList(PascalParser.StatementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#statementList}.
	 * @param ctx the parse tree
	 */
	void exitStatementList(PascalParser.StatementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatement(PascalParser.AssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatement(PascalParser.AssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#lhs}.
	 * @param ctx the parse tree
	 */
	void enterLhs(PascalParser.LhsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#lhs}.
	 * @param ctx the parse tree
	 */
	void exitLhs(PascalParser.LhsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#rhs}.
	 * @param ctx the parse tree
	 */
	void enterRhs(PascalParser.RhsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#rhs}.
	 * @param ctx the parse tree
	 */
	void exitRhs(PascalParser.RhsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(PascalParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(PascalParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#trueStatement}.
	 * @param ctx the parse tree
	 */
	void enterTrueStatement(PascalParser.TrueStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#trueStatement}.
	 * @param ctx the parse tree
	 */
	void exitTrueStatement(PascalParser.TrueStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#falseStatement}.
	 * @param ctx the parse tree
	 */
	void enterFalseStatement(PascalParser.FalseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#falseStatement}.
	 * @param ctx the parse tree
	 */
	void exitFalseStatement(PascalParser.FalseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#caseStatement}.
	 * @param ctx the parse tree
	 */
	void enterCaseStatement(PascalParser.CaseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#caseStatement}.
	 * @param ctx the parse tree
	 */
	void exitCaseStatement(PascalParser.CaseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#caseBranchList}.
	 * @param ctx the parse tree
	 */
	void enterCaseBranchList(PascalParser.CaseBranchListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#caseBranchList}.
	 * @param ctx the parse tree
	 */
	void exitCaseBranchList(PascalParser.CaseBranchListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#caseBranch}.
	 * @param ctx the parse tree
	 */
	void enterCaseBranch(PascalParser.CaseBranchContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#caseBranch}.
	 * @param ctx the parse tree
	 */
	void exitCaseBranch(PascalParser.CaseBranchContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#caseConstantList}.
	 * @param ctx the parse tree
	 */
	void enterCaseConstantList(PascalParser.CaseConstantListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#caseConstantList}.
	 * @param ctx the parse tree
	 */
	void exitCaseConstantList(PascalParser.CaseConstantListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#caseConstant}.
	 * @param ctx the parse tree
	 */
	void enterCaseConstant(PascalParser.CaseConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#caseConstant}.
	 * @param ctx the parse tree
	 */
	void exitCaseConstant(PascalParser.CaseConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#repeatStatement}.
	 * @param ctx the parse tree
	 */
	void enterRepeatStatement(PascalParser.RepeatStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#repeatStatement}.
	 * @param ctx the parse tree
	 */
	void exitRepeatStatement(PascalParser.RepeatStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(PascalParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(PascalParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(PascalParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(PascalParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#procedureCallStatement}.
	 * @param ctx the parse tree
	 */
	void enterProcedureCallStatement(PascalParser.ProcedureCallStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#procedureCallStatement}.
	 * @param ctx the parse tree
	 */
	void exitProcedureCallStatement(PascalParser.ProcedureCallStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#procedureName}.
	 * @param ctx the parse tree
	 */
	void enterProcedureName(PascalParser.ProcedureNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#procedureName}.
	 * @param ctx the parse tree
	 */
	void exitProcedureName(PascalParser.ProcedureNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(PascalParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(PascalParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(PascalParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(PascalParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#writeStatement}.
	 * @param ctx the parse tree
	 */
	void enterWriteStatement(PascalParser.WriteStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#writeStatement}.
	 * @param ctx the parse tree
	 */
	void exitWriteStatement(PascalParser.WriteStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#writelnStatement}.
	 * @param ctx the parse tree
	 */
	void enterWritelnStatement(PascalParser.WritelnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#writelnStatement}.
	 * @param ctx the parse tree
	 */
	void exitWritelnStatement(PascalParser.WritelnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#writeArguments}.
	 * @param ctx the parse tree
	 */
	void enterWriteArguments(PascalParser.WriteArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#writeArguments}.
	 * @param ctx the parse tree
	 */
	void exitWriteArguments(PascalParser.WriteArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#writeArgument}.
	 * @param ctx the parse tree
	 */
	void enterWriteArgument(PascalParser.WriteArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#writeArgument}.
	 * @param ctx the parse tree
	 */
	void exitWriteArgument(PascalParser.WriteArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#fieldWidth}.
	 * @param ctx the parse tree
	 */
	void enterFieldWidth(PascalParser.FieldWidthContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#fieldWidth}.
	 * @param ctx the parse tree
	 */
	void exitFieldWidth(PascalParser.FieldWidthContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#decimalPlaces}.
	 * @param ctx the parse tree
	 */
	void enterDecimalPlaces(PascalParser.DecimalPlacesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#decimalPlaces}.
	 * @param ctx the parse tree
	 */
	void exitDecimalPlaces(PascalParser.DecimalPlacesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#readStatement}.
	 * @param ctx the parse tree
	 */
	void enterReadStatement(PascalParser.ReadStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#readStatement}.
	 * @param ctx the parse tree
	 */
	void exitReadStatement(PascalParser.ReadStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#readlnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReadlnStatement(PascalParser.ReadlnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#readlnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReadlnStatement(PascalParser.ReadlnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#readArguments}.
	 * @param ctx the parse tree
	 */
	void enterReadArguments(PascalParser.ReadArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#readArguments}.
	 * @param ctx the parse tree
	 */
	void exitReadArguments(PascalParser.ReadArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(PascalParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(PascalParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void enterSimpleExpression(PascalParser.SimpleExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void exitSimpleExpression(PascalParser.SimpleExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(PascalParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(PascalParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variableFactor}
	 * labeled alternative in {@link PascalParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterVariableFactor(PascalParser.VariableFactorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variableFactor}
	 * labeled alternative in {@link PascalParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitVariableFactor(PascalParser.VariableFactorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberFactor}
	 * labeled alternative in {@link PascalParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterNumberFactor(PascalParser.NumberFactorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberFactor}
	 * labeled alternative in {@link PascalParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitNumberFactor(PascalParser.NumberFactorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code characterFactor}
	 * labeled alternative in {@link PascalParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterCharacterFactor(PascalParser.CharacterFactorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code characterFactor}
	 * labeled alternative in {@link PascalParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitCharacterFactor(PascalParser.CharacterFactorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringFactor}
	 * labeled alternative in {@link PascalParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterStringFactor(PascalParser.StringFactorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringFactor}
	 * labeled alternative in {@link PascalParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitStringFactor(PascalParser.StringFactorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCallFactor}
	 * labeled alternative in {@link PascalParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallFactor(PascalParser.FunctionCallFactorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCallFactor}
	 * labeled alternative in {@link PascalParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallFactor(PascalParser.FunctionCallFactorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notFactor}
	 * labeled alternative in {@link PascalParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterNotFactor(PascalParser.NotFactorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notFactor}
	 * labeled alternative in {@link PascalParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitNotFactor(PascalParser.NotFactorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthesizedFactor}
	 * labeled alternative in {@link PascalParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedFactor(PascalParser.ParenthesizedFactorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthesizedFactor}
	 * labeled alternative in {@link PascalParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedFactor(PascalParser.ParenthesizedFactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(PascalParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(PascalParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#modifier}.
	 * @param ctx the parse tree
	 */
	void enterModifier(PascalParser.ModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#modifier}.
	 * @param ctx the parse tree
	 */
	void exitModifier(PascalParser.ModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#indexList}.
	 * @param ctx the parse tree
	 */
	void enterIndexList(PascalParser.IndexListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#indexList}.
	 * @param ctx the parse tree
	 */
	void exitIndexList(PascalParser.IndexListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#index}.
	 * @param ctx the parse tree
	 */
	void enterIndex(PascalParser.IndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#index}.
	 * @param ctx the parse tree
	 */
	void exitIndex(PascalParser.IndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(PascalParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(PascalParser.FieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(PascalParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(PascalParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#functionName}.
	 * @param ctx the parse tree
	 */
	void enterFunctionName(PascalParser.FunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#functionName}.
	 * @param ctx the parse tree
	 */
	void exitFunctionName(PascalParser.FunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(PascalParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(PascalParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#unsignedNumber}.
	 * @param ctx the parse tree
	 */
	void enterUnsignedNumber(PascalParser.UnsignedNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#unsignedNumber}.
	 * @param ctx the parse tree
	 */
	void exitUnsignedNumber(PascalParser.UnsignedNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#integerConstant}.
	 * @param ctx the parse tree
	 */
	void enterIntegerConstant(PascalParser.IntegerConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#integerConstant}.
	 * @param ctx the parse tree
	 */
	void exitIntegerConstant(PascalParser.IntegerConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#realConstant}.
	 * @param ctx the parse tree
	 */
	void enterRealConstant(PascalParser.RealConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#realConstant}.
	 * @param ctx the parse tree
	 */
	void exitRealConstant(PascalParser.RealConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#characterConstant}.
	 * @param ctx the parse tree
	 */
	void enterCharacterConstant(PascalParser.CharacterConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#characterConstant}.
	 * @param ctx the parse tree
	 */
	void exitCharacterConstant(PascalParser.CharacterConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#stringConstant}.
	 * @param ctx the parse tree
	 */
	void enterStringConstant(PascalParser.StringConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#stringConstant}.
	 * @param ctx the parse tree
	 */
	void exitStringConstant(PascalParser.StringConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#relOp}.
	 * @param ctx the parse tree
	 */
	void enterRelOp(PascalParser.RelOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#relOp}.
	 * @param ctx the parse tree
	 */
	void exitRelOp(PascalParser.RelOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#addOp}.
	 * @param ctx the parse tree
	 */
	void enterAddOp(PascalParser.AddOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#addOp}.
	 * @param ctx the parse tree
	 */
	void exitAddOp(PascalParser.AddOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#mulOp}.
	 * @param ctx the parse tree
	 */
	void enterMulOp(PascalParser.MulOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#mulOp}.
	 * @param ctx the parse tree
	 */
	void exitMulOp(PascalParser.MulOpContext ctx);
}