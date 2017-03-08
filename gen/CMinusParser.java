// Generated from /home/fauno/Downloads/Compiladores/TP3/TP3_AnaliseSemantica/gramatica/CMinus.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CMinusParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, INT=3, FLOAT=4, CHAR=5, STRUCT=6, IF=7, ELSE=8, WHILE=9, 
		VOID=10, RETURN=11, IntegerLiteral=12, FloatingPointLiteral=13, CharacterLiteral=14, 
		StringLiteral=15, LPAREN=16, RPAREN=17, LBRACE=18, RBRACE=19, LBRACK=20, 
		RBRACK=21, SEMI=22, ASSIGN=23, LT=24, EQUAL=25, LE=26, GE=27, NOTEQUAL=28, 
		ADD=29, SUB=30, MUL=31, DIV=32, Identifier=33, WS=34, COMMENT=35;
	public static final int
		RULE_compilationUnit = 0, RULE_methodDeclaration = 1, RULE_variableDeclarators = 2, 
		RULE_variableDeclarator = 3, RULE_variableDeclaratorId = 4, RULE_variableInitializer = 5, 
		RULE_typeType = 6, RULE_primitiveType = 7, RULE_formalParameters = 8, 
		RULE_formalParameterList = 9, RULE_formalParameterDeclaratorId = 10, RULE_formalParameter = 11, 
		RULE_methodBody = 12, RULE_literal = 13, RULE_structDeclaration = 14, 
		RULE_structVaribleDeclaration = 15, RULE_structVariableInitializer = 16, 
		RULE_structDeclarationStatement = 17, RULE_block = 18, RULE_blockStatement = 19, 
		RULE_localVariableDeclarationStatement = 20, RULE_localVariableDeclaration = 21, 
		RULE_statement = 22, RULE_elseStatement = 23, RULE_parExpression = 24, 
		RULE_expressionList = 25, RULE_statementExpression = 26, RULE_expression = 27, 
		RULE_primary = 28;
	public static final String[] ruleNames = {
		"compilationUnit", "methodDeclaration", "variableDeclarators", "variableDeclarator", 
		"variableDeclaratorId", "variableInitializer", "typeType", "primitiveType", 
		"formalParameters", "formalParameterList", "formalParameterDeclaratorId", 
		"formalParameter", "methodBody", "literal", "structDeclaration", "structVaribleDeclaration", 
		"structVariableInitializer", "structDeclarationStatement", "block", "blockStatement", 
		"localVariableDeclarationStatement", "localVariableDeclaration", "statement", 
		"elseStatement", "parExpression", "expressionList", "statementExpression", 
		"expression", "primary"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "','", "'>'", "'int'", "'float'", "'char'", "'struct'", "'if'", 
		"'else'", "'while'", "'void'", "'return'", null, null, null, null, "'('", 
		"')'", "'{'", "'}'", "'['", "']'", "';'", "'='", "'<'", "'=='", "'<='", 
		"'>='", "'!='", "'+'", "'-'", "'*'", "'/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "INT", "FLOAT", "CHAR", "STRUCT", "IF", "ELSE", "WHILE", 
		"VOID", "RETURN", "IntegerLiteral", "FloatingPointLiteral", "CharacterLiteral", 
		"StringLiteral", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", 
		"SEMI", "ASSIGN", "LT", "EQUAL", "LE", "GE", "NOTEQUAL", "ADD", "SUB", 
		"MUL", "DIV", "Identifier", "WS", "COMMENT"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "CMinus.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CMinusParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CompilationUnitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(CMinusParser.EOF, 0); }
		public List<LocalVariableDeclarationStatementContext> localVariableDeclarationStatement() {
			return getRuleContexts(LocalVariableDeclarationStatementContext.class);
		}
		public LocalVariableDeclarationStatementContext localVariableDeclarationStatement(int i) {
			return getRuleContext(LocalVariableDeclarationStatementContext.class,i);
		}
		public List<MethodDeclarationContext> methodDeclaration() {
			return getRuleContexts(MethodDeclarationContext.class);
		}
		public MethodDeclarationContext methodDeclaration(int i) {
			return getRuleContext(MethodDeclarationContext.class,i);
		}
		public List<StructDeclarationStatementContext> structDeclarationStatement() {
			return getRuleContexts(StructDeclarationStatementContext.class);
		}
		public StructDeclarationStatementContext structDeclarationStatement(int i) {
			return getRuleContext(StructDeclarationStatementContext.class,i);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).exitCompilationUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMinusVisitor ) return ((CMinusVisitor<? extends T>)visitor).visitCompilationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << CHAR) | (1L << STRUCT) | (1L << VOID))) != 0)) {
				{
				setState(61);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(58);
					localVariableDeclarationStatement();
					}
					break;
				case 2:
					{
					setState(59);
					methodDeclaration();
					}
					break;
				case 3:
					{
					setState(60);
					structDeclarationStatement();
					}
					break;
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(66);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CMinusParser.Identifier, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMinusVisitor ) return ((CMinusVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
			case CHAR:
				{
				setState(68);
				typeType();
				}
				break;
			case VOID:
				{
				setState(69);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(72);
			match(Identifier);
			setState(73);
			formalParameters();
			setState(76);
			_la = _input.LA(1);
			if (_la==LBRACK) {
				{
				setState(74);
				match(LBRACK);
				setState(75);
				match(RBRACK);
				}
			}

			setState(80);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(78);
				methodBody();
				}
				break;
			case SEMI:
				{
				setState(79);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorsContext extends ParserRuleContext {
		public VariableDeclaratorContext variableDeclarator() {
			return getRuleContext(VariableDeclaratorContext.class,0);
		}
		public VariableDeclaratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).enterVariableDeclarators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).exitVariableDeclarators(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMinusVisitor ) return ((CMinusVisitor<? extends T>)visitor).visitVariableDeclarators(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorsContext variableDeclarators() throws RecognitionException {
		VariableDeclaratorsContext _localctx = new VariableDeclaratorsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_variableDeclarators);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			variableDeclarator();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorContext extends ParserRuleContext {
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public List<TerminalNode> IntegerLiteral() { return getTokens(CMinusParser.IntegerLiteral); }
		public TerminalNode IntegerLiteral(int i) {
			return getToken(CMinusParser.IntegerLiteral, i);
		}
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).enterVariableDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).exitVariableDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMinusVisitor ) return ((CMinusVisitor<? extends T>)visitor).visitVariableDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			variableDeclaratorId();
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(85);
				match(LBRACK);
				setState(86);
				match(IntegerLiteral);
				setState(87);
				match(RBRACK);
				}
				}
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(95);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(93);
				match(ASSIGN);
				setState(94);
				variableInitializer();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorIdContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CMinusParser.Identifier, 0); }
		public VariableDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).enterVariableDeclaratorId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).exitVariableDeclaratorId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMinusVisitor ) return ((CMinusVisitor<? extends T>)visitor).visitVariableDeclaratorId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorIdContext variableDeclaratorId() throws RecognitionException {
		VariableDeclaratorIdContext _localctx = new VariableDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_variableDeclaratorId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableInitializerContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).enterVariableInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).exitVariableInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMinusVisitor ) return ((CMinusVisitor<? extends T>)visitor).visitVariableInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_variableInitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeTypeContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TypeTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).enterTypeType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).exitTypeType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMinusVisitor ) return ((CMinusVisitor<? extends T>)visitor).visitTypeType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeTypeContext typeType() throws RecognitionException {
		TypeTypeContext _localctx = new TypeTypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_typeType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			primitiveType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).exitPrimitiveType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMinusVisitor ) return ((CMinusVisitor<? extends T>)visitor).visitPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << CHAR))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParametersContext extends ParserRuleContext {
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).enterFormalParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).exitFormalParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMinusVisitor ) return ((CMinusVisitor<? extends T>)visitor).visitFormalParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(LPAREN);
			setState(107);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << CHAR))) != 0)) {
				{
				setState(106);
				formalParameterList();
				}
			}

			setState(109);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterListContext extends ParserRuleContext {
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}
		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class,i);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).enterFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).exitFormalParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMinusVisitor ) return ((CMinusVisitor<? extends T>)visitor).visitFormalParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_formalParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			formalParameter();
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(112);
				match(T__0);
				setState(113);
				formalParameter();
				}
				}
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterDeclaratorIdContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CMinusParser.Identifier, 0); }
		public FormalParameterDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterDeclaratorId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).enterFormalParameterDeclaratorId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).exitFormalParameterDeclaratorId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMinusVisitor ) return ((CMinusVisitor<? extends T>)visitor).visitFormalParameterDeclaratorId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterDeclaratorIdContext formalParameterDeclaratorId() throws RecognitionException {
		FormalParameterDeclaratorIdContext _localctx = new FormalParameterDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_formalParameterDeclaratorId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public FormalParameterDeclaratorIdContext formalParameterDeclaratorId() {
			return getRuleContext(FormalParameterDeclaratorIdContext.class,0);
		}
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).enterFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).exitFormalParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMinusVisitor ) return ((CMinusVisitor<? extends T>)visitor).visitFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_formalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			typeType();
			setState(122);
			formalParameterDeclaratorId();
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(123);
				match(LBRACK);
				setState(124);
				match(RBRACK);
				}
				}
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).exitMethodBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMinusVisitor ) return ((CMinusVisitor<? extends T>)visitor).visitMethodBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_methodBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode IntegerLiteral() { return getToken(CMinusParser.IntegerLiteral, 0); }
		public TerminalNode FloatingPointLiteral() { return getToken(CMinusParser.FloatingPointLiteral, 0); }
		public TerminalNode CharacterLiteral() { return getToken(CMinusParser.CharacterLiteral, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMinusVisitor ) return ((CMinusVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << CharacterLiteral))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CMinusParser.Identifier, 0); }
		public List<StructVaribleDeclarationContext> structVaribleDeclaration() {
			return getRuleContexts(StructVaribleDeclarationContext.class);
		}
		public StructVaribleDeclarationContext structVaribleDeclaration(int i) {
			return getRuleContext(StructVaribleDeclarationContext.class,i);
		}
		public StructDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).enterStructDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).exitStructDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMinusVisitor ) return ((CMinusVisitor<? extends T>)visitor).visitStructDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructDeclarationContext structDeclaration() throws RecognitionException {
		StructDeclarationContext _localctx = new StructDeclarationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_structDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(STRUCT);
			setState(135);
			match(Identifier);
			setState(136);
			match(LBRACE);
			setState(138); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(137);
				structVaribleDeclaration();
				}
				}
				setState(140); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << CHAR))) != 0) );
			setState(142);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructVaribleDeclarationContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CMinusParser.Identifier, 0); }
		public StructVariableInitializerContext structVariableInitializer() {
			return getRuleContext(StructVariableInitializerContext.class,0);
		}
		public StructVaribleDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structVaribleDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).enterStructVaribleDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).exitStructVaribleDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMinusVisitor ) return ((CMinusVisitor<? extends T>)visitor).visitStructVaribleDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructVaribleDeclarationContext structVaribleDeclaration() throws RecognitionException {
		StructVaribleDeclarationContext _localctx = new StructVaribleDeclarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_structVaribleDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			primitiveType();
			setState(145);
			match(Identifier);
			setState(148);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(146);
				match(ASSIGN);
				setState(147);
				structVariableInitializer();
				}
			}

			setState(150);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructVariableInitializerContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public StructVariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structVariableInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).enterStructVariableInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).exitStructVariableInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMinusVisitor ) return ((CMinusVisitor<? extends T>)visitor).visitStructVariableInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructVariableInitializerContext structVariableInitializer() throws RecognitionException {
		StructVariableInitializerContext _localctx = new StructVariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_structVariableInitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			literal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructDeclarationStatementContext extends ParserRuleContext {
		public StructDeclarationContext structDeclaration() {
			return getRuleContext(StructDeclarationContext.class,0);
		}
		public StructDeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDeclarationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).enterStructDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).exitStructDeclarationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMinusVisitor ) return ((CMinusVisitor<? extends T>)visitor).visitStructDeclarationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructDeclarationStatementContext structDeclarationStatement() throws RecognitionException {
		StructDeclarationStatementContext _localctx = new StructDeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_structDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			structDeclaration();
			setState(155);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMinusVisitor ) return ((CMinusVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(LBRACE);
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << CHAR) | (1L << STRUCT) | (1L << IF) | (1L << WHILE) | (1L << RETURN) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << CharacterLiteral) | (1L << LPAREN) | (1L << LBRACE) | (1L << SEMI) | (1L << Identifier))) != 0)) {
				{
				{
				setState(158);
				blockStatement();
				}
				}
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(164);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationStatementContext localVariableDeclarationStatement() {
			return getRuleContext(LocalVariableDeclarationStatementContext.class,0);
		}
		public StructDeclarationStatementContext structDeclarationStatement() {
			return getRuleContext(StructDeclarationStatementContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).exitBlockStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMinusVisitor ) return ((CMinusVisitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_blockStatement);
		try {
			setState(169);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
			case CHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				localVariableDeclarationStatement();
				}
				break;
			case STRUCT:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				structDeclarationStatement();
				}
				break;
			case IF:
			case WHILE:
			case RETURN:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case CharacterLiteral:
			case LPAREN:
			case LBRACE:
			case SEMI:
			case Identifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(168);
				statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalVariableDeclarationStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public LocalVariableDeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclarationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).enterLocalVariableDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).exitLocalVariableDeclarationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMinusVisitor ) return ((CMinusVisitor<? extends T>)visitor).visitLocalVariableDeclarationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalVariableDeclarationStatementContext localVariableDeclarationStatement() throws RecognitionException {
		LocalVariableDeclarationStatementContext _localctx = new LocalVariableDeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_localVariableDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			localVariableDeclaration();
			setState(172);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalVariableDeclarationContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public LocalVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).enterLocalVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).exitLocalVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMinusVisitor ) return ((CMinusVisitor<? extends T>)visitor).visitLocalVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalVariableDeclarationContext localVariableDeclaration() throws RecognitionException {
		LocalVariableDeclarationContext _localctx = new LocalVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_localVariableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			typeType();
			setState(175);
			variableDeclarators();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BlockStatementLabelContext extends StatementContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public BlockStatementLabelContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).enterBlockStatementLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).exitBlockStatementLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMinusVisitor ) return ((CMinusVisitor<? extends T>)visitor).visitBlockStatementLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PvStatementLabelContext extends StatementContext {
		public PvStatementLabelContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).enterPvStatementLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).exitPvStatementLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMinusVisitor ) return ((CMinusVisitor<? extends T>)visitor).visitPvStatementLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileStatementLabelContext extends StatementContext {
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatementLabelContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).enterWhileStatementLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).exitWhileStatementLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMinusVisitor ) return ((CMinusVisitor<? extends T>)visitor).visitWhileStatementLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfStatementLabelContext extends StatementContext {
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ElseStatementContext elseStatement() {
			return getRuleContext(ElseStatementContext.class,0);
		}
		public IfStatementLabelContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).enterIfStatementLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).exitIfStatementLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMinusVisitor ) return ((CMinusVisitor<? extends T>)visitor).visitIfStatementLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatementExpressionLabelContext extends StatementContext {
		public StatementExpressionContext statementExpression() {
			return getRuleContext(StatementExpressionContext.class,0);
		}
		public StatementExpressionLabelContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).enterStatementExpressionLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).exitStatementExpressionLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMinusVisitor ) return ((CMinusVisitor<? extends T>)visitor).visitStatementExpressionLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReturnStatementLabelContext extends StatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementLabelContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).enterReturnStatementLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).exitReturnStatementLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMinusVisitor ) return ((CMinusVisitor<? extends T>)visitor).visitReturnStatementLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_statement);
		int _la;
		try {
			setState(197);
			switch (_input.LA(1)) {
			case LBRACE:
				_localctx = new BlockStatementLabelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(177);
				block();
				}
				break;
			case IF:
				_localctx = new IfStatementLabelContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(178);
				match(IF);
				setState(179);
				parExpression();
				setState(180);
				statement();
				setState(182);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(181);
					elseStatement();
					}
					break;
				}
				}
				break;
			case WHILE:
				_localctx = new WhileStatementLabelContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(184);
				match(WHILE);
				setState(185);
				parExpression();
				setState(186);
				statement();
				}
				break;
			case RETURN:
				_localctx = new ReturnStatementLabelContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(188);
				match(RETURN);
				setState(190);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << CharacterLiteral) | (1L << LPAREN) | (1L << Identifier))) != 0)) {
					{
					setState(189);
					expression(0);
					}
				}

				setState(192);
				match(SEMI);
				}
				break;
			case SEMI:
				_localctx = new PvStatementLabelContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(193);
				match(SEMI);
				}
				break;
			case IntegerLiteral:
			case FloatingPointLiteral:
			case CharacterLiteral:
			case LPAREN:
			case Identifier:
				_localctx = new StatementExpressionLabelContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(194);
				statementExpression();
				setState(195);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).enterElseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).exitElseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMinusVisitor ) return ((CMinusVisitor<? extends T>)visitor).visitElseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseStatementContext elseStatement() throws RecognitionException {
		ElseStatementContext _localctx = new ElseStatementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_elseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(ELSE);
			setState(200);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).enterParExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).exitParExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMinusVisitor ) return ((CMinusVisitor<? extends T>)visitor).visitParExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParExpressionContext parExpression() throws RecognitionException {
		ParExpressionContext _localctx = new ParExpressionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(LPAREN);
			setState(203);
			expression(0);
			setState(204);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).exitExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMinusVisitor ) return ((CMinusVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			expression(0);
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(207);
				match(T__0);
				setState(208);
				expression(0);
				}
				}
				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).enterStatementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).exitStatementExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMinusVisitor ) return ((CMinusVisitor<? extends T>)visitor).visitStatementExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementExpressionContext statementExpression() throws RecognitionException {
		StatementExpressionContext _localctx = new StatementExpressionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_statementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MultDivExpressionLabelContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MultDivExpressionLabelContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).enterMultDivExpressionLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).exitMultDivExpressionLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMinusVisitor ) return ((CMinusVisitor<? extends T>)visitor).visitMultDivExpressionLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RelExpressionLabelContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public RelExpressionLabelContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).enterRelExpressionLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).exitRelExpressionLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMinusVisitor ) return ((CMinusVisitor<? extends T>)visitor).visitRelExpressionLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RelEqDiffExpressionLabelContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public RelEqDiffExpressionLabelContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).enterRelEqDiffExpressionLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).exitRelEqDiffExpressionLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMinusVisitor ) return ((CMinusVisitor<? extends T>)visitor).visitRelEqDiffExpressionLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SumMinusExpressionLabelContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public SumMinusExpressionLabelContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).enterSumMinusExpressionLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).exitSumMinusExpressionLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMinusVisitor ) return ((CMinusVisitor<? extends T>)visitor).visitSumMinusExpressionLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AttrExpressionLabelContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AttrExpressionLabelContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).enterAttrExpressionLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).exitAttrExpressionLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMinusVisitor ) return ((CMinusVisitor<? extends T>)visitor).visitAttrExpressionLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrimExpressionLabelContext extends ExpressionContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public PrimExpressionLabelContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).enterPrimExpressionLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).exitPrimExpressionLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMinusVisitor ) return ((CMinusVisitor<? extends T>)visitor).visitPrimExpressionLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 54;
		enterRecursionRule(_localctx, 54, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new PrimExpressionLabelContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(217);
			primary();
			}
			_ctx.stop = _input.LT(-1);
			setState(236);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(234);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new MultDivExpressionLabelContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(219);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(220);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(221);
						expression(6);
						}
						break;
					case 2:
						{
						_localctx = new SumMinusExpressionLabelContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(222);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(223);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(224);
						expression(5);
						}
						break;
					case 3:
						{
						_localctx = new RelExpressionLabelContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(225);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(226);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << LT) | (1L << LE) | (1L << GE))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(227);
						expression(4);
						}
						break;
					case 4:
						{
						_localctx = new RelEqDiffExpressionLabelContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(228);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(229);
						_la = _input.LA(1);
						if ( !(_la==EQUAL || _la==NOTEQUAL) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(230);
						expression(3);
						}
						break;
					case 5:
						{
						_localctx = new AttrExpressionLabelContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(231);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(232);
						match(ASSIGN);
						setState(233);
						expression(1);
						}
						break;
					}
					} 
				}
				setState(238);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PrimaryContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CMinusParser.Identifier, 0); }
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).exitPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMinusVisitor ) return ((CMinusVisitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_primary);
		try {
			setState(245);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(239);
				match(LPAREN);
				setState(240);
				expression(0);
				setState(241);
				match(RPAREN);
				}
				break;
			case IntegerLiteral:
			case FloatingPointLiteral:
			case CharacterLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(243);
				literal();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(244);
				match(Identifier);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 27:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3%\u00fa\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\2\7\2@\n"+
		"\2\f\2\16\2C\13\2\3\2\3\2\3\3\3\3\5\3I\n\3\3\3\3\3\3\3\3\3\5\3O\n\3\3"+
		"\3\3\3\5\3S\n\3\3\4\3\4\3\5\3\5\3\5\3\5\7\5[\n\5\f\5\16\5^\13\5\3\5\3"+
		"\5\5\5b\n\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\5\nn\n\n\3\n\3\n\3"+
		"\13\3\13\3\13\7\13u\n\13\f\13\16\13x\13\13\3\f\3\f\3\r\3\r\3\r\3\r\7\r"+
		"\u0080\n\r\f\r\16\r\u0083\13\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\6\20\u008d\n\20\r\20\16\20\u008e\3\20\3\20\3\21\3\21\3\21\3\21\5\21\u0097"+
		"\n\21\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\24\3\24\7\24\u00a2\n\24\f\24"+
		"\16\24\u00a5\13\24\3\24\3\24\3\25\3\25\3\25\5\25\u00ac\n\25\3\26\3\26"+
		"\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\5\30\u00b9\n\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\5\30\u00c1\n\30\3\30\3\30\3\30\3\30\3\30\5\30\u00c8"+
		"\n\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\7\33\u00d4\n\33"+
		"\f\33\16\33\u00d7\13\33\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u00ed\n\35"+
		"\f\35\16\35\u00f0\13\35\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u00f8\n\36"+
		"\3\36\2\38\37\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64"+
		"\668:\2\b\3\2\5\7\3\2\16\20\3\2!\"\3\2\37 \5\2\4\4\32\32\34\35\4\2\33"+
		"\33\36\36\u00fb\2A\3\2\2\2\4H\3\2\2\2\6T\3\2\2\2\bV\3\2\2\2\nc\3\2\2\2"+
		"\fe\3\2\2\2\16g\3\2\2\2\20i\3\2\2\2\22k\3\2\2\2\24q\3\2\2\2\26y\3\2\2"+
		"\2\30{\3\2\2\2\32\u0084\3\2\2\2\34\u0086\3\2\2\2\36\u0088\3\2\2\2 \u0092"+
		"\3\2\2\2\"\u009a\3\2\2\2$\u009c\3\2\2\2&\u009f\3\2\2\2(\u00ab\3\2\2\2"+
		"*\u00ad\3\2\2\2,\u00b0\3\2\2\2.\u00c7\3\2\2\2\60\u00c9\3\2\2\2\62\u00cc"+
		"\3\2\2\2\64\u00d0\3\2\2\2\66\u00d8\3\2\2\28\u00da\3\2\2\2:\u00f7\3\2\2"+
		"\2<@\5*\26\2=@\5\4\3\2>@\5$\23\2?<\3\2\2\2?=\3\2\2\2?>\3\2\2\2@C\3\2\2"+
		"\2A?\3\2\2\2AB\3\2\2\2BD\3\2\2\2CA\3\2\2\2DE\7\2\2\3E\3\3\2\2\2FI\5\16"+
		"\b\2GI\7\f\2\2HF\3\2\2\2HG\3\2\2\2IJ\3\2\2\2JK\7#\2\2KN\5\22\n\2LM\7\26"+
		"\2\2MO\7\27\2\2NL\3\2\2\2NO\3\2\2\2OR\3\2\2\2PS\5\32\16\2QS\7\30\2\2R"+
		"P\3\2\2\2RQ\3\2\2\2S\5\3\2\2\2TU\5\b\5\2U\7\3\2\2\2V\\\5\n\6\2WX\7\26"+
		"\2\2XY\7\16\2\2Y[\7\27\2\2ZW\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]"+
		"a\3\2\2\2^\\\3\2\2\2_`\7\31\2\2`b\5\f\7\2a_\3\2\2\2ab\3\2\2\2b\t\3\2\2"+
		"\2cd\7#\2\2d\13\3\2\2\2ef\58\35\2f\r\3\2\2\2gh\5\20\t\2h\17\3\2\2\2ij"+
		"\t\2\2\2j\21\3\2\2\2km\7\22\2\2ln\5\24\13\2ml\3\2\2\2mn\3\2\2\2no\3\2"+
		"\2\2op\7\23\2\2p\23\3\2\2\2qv\5\30\r\2rs\7\3\2\2su\5\30\r\2tr\3\2\2\2"+
		"ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2w\25\3\2\2\2xv\3\2\2\2yz\7#\2\2z\27\3\2"+
		"\2\2{|\5\16\b\2|\u0081\5\26\f\2}~\7\26\2\2~\u0080\7\27\2\2\177}\3\2\2"+
		"\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\31"+
		"\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0085\5&\24\2\u0085\33\3\2\2\2\u0086"+
		"\u0087\t\3\2\2\u0087\35\3\2\2\2\u0088\u0089\7\b\2\2\u0089\u008a\7#\2\2"+
		"\u008a\u008c\7\24\2\2\u008b\u008d\5 \21\2\u008c\u008b\3\2\2\2\u008d\u008e"+
		"\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090\3\2\2\2\u0090"+
		"\u0091\7\25\2\2\u0091\37\3\2\2\2\u0092\u0093\5\20\t\2\u0093\u0096\7#\2"+
		"\2\u0094\u0095\7\31\2\2\u0095\u0097\5\"\22\2\u0096\u0094\3\2\2\2\u0096"+
		"\u0097\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0099\7\30\2\2\u0099!\3\2\2\2"+
		"\u009a\u009b\5\34\17\2\u009b#\3\2\2\2\u009c\u009d\5\36\20\2\u009d\u009e"+
		"\7\30\2\2\u009e%\3\2\2\2\u009f\u00a3\7\24\2\2\u00a0\u00a2\5(\25\2\u00a1"+
		"\u00a0\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2"+
		"\2\2\u00a4\u00a6\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6\u00a7\7\25\2\2\u00a7"+
		"\'\3\2\2\2\u00a8\u00ac\5*\26\2\u00a9\u00ac\5$\23\2\u00aa\u00ac\5.\30\2"+
		"\u00ab\u00a8\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00aa\3\2\2\2\u00ac)\3"+
		"\2\2\2\u00ad\u00ae\5,\27\2\u00ae\u00af\7\30\2\2\u00af+\3\2\2\2\u00b0\u00b1"+
		"\5\16\b\2\u00b1\u00b2\5\6\4\2\u00b2-\3\2\2\2\u00b3\u00c8\5&\24\2\u00b4"+
		"\u00b5\7\t\2\2\u00b5\u00b6\5\62\32\2\u00b6\u00b8\5.\30\2\u00b7\u00b9\5"+
		"\60\31\2\u00b8\u00b7\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00c8\3\2\2\2\u00ba"+
		"\u00bb\7\13\2\2\u00bb\u00bc\5\62\32\2\u00bc\u00bd\5.\30\2\u00bd\u00c8"+
		"\3\2\2\2\u00be\u00c0\7\r\2\2\u00bf\u00c1\58\35\2\u00c0\u00bf\3\2\2\2\u00c0"+
		"\u00c1\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c8\7\30\2\2\u00c3\u00c8\7"+
		"\30\2\2\u00c4\u00c5\5\66\34\2\u00c5\u00c6\7\30\2\2\u00c6\u00c8\3\2\2\2"+
		"\u00c7\u00b3\3\2\2\2\u00c7\u00b4\3\2\2\2\u00c7\u00ba\3\2\2\2\u00c7\u00be"+
		"\3\2\2\2\u00c7\u00c3\3\2\2\2\u00c7\u00c4\3\2\2\2\u00c8/\3\2\2\2\u00c9"+
		"\u00ca\7\n\2\2\u00ca\u00cb\5.\30\2\u00cb\61\3\2\2\2\u00cc\u00cd\7\22\2"+
		"\2\u00cd\u00ce\58\35\2\u00ce\u00cf\7\23\2\2\u00cf\63\3\2\2\2\u00d0\u00d5"+
		"\58\35\2\u00d1\u00d2\7\3\2\2\u00d2\u00d4\58\35\2\u00d3\u00d1\3\2\2\2\u00d4"+
		"\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\65\3\2\2"+
		"\2\u00d7\u00d5\3\2\2\2\u00d8\u00d9\58\35\2\u00d9\67\3\2\2\2\u00da\u00db"+
		"\b\35\1\2\u00db\u00dc\5:\36\2\u00dc\u00ee\3\2\2\2\u00dd\u00de\f\7\2\2"+
		"\u00de\u00df\t\4\2\2\u00df\u00ed\58\35\b\u00e0\u00e1\f\6\2\2\u00e1\u00e2"+
		"\t\5\2\2\u00e2\u00ed\58\35\7\u00e3\u00e4\f\5\2\2\u00e4\u00e5\t\6\2\2\u00e5"+
		"\u00ed\58\35\6\u00e6\u00e7\f\4\2\2\u00e7\u00e8\t\7\2\2\u00e8\u00ed\58"+
		"\35\5\u00e9\u00ea\f\3\2\2\u00ea\u00eb\7\31\2\2\u00eb\u00ed\58\35\3\u00ec"+
		"\u00dd\3\2\2\2\u00ec\u00e0\3\2\2\2\u00ec\u00e3\3\2\2\2\u00ec\u00e6\3\2"+
		"\2\2\u00ec\u00e9\3\2\2\2\u00ed\u00f0\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee"+
		"\u00ef\3\2\2\2\u00ef9\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f1\u00f2\7\22\2\2"+
		"\u00f2\u00f3\58\35\2\u00f3\u00f4\7\23\2\2\u00f4\u00f8\3\2\2\2\u00f5\u00f8"+
		"\5\34\17\2\u00f6\u00f8\7#\2\2\u00f7\u00f1\3\2\2\2\u00f7\u00f5\3\2\2\2"+
		"\u00f7\u00f6\3\2\2\2\u00f8;\3\2\2\2\27?AHNR\\amv\u0081\u008e\u0096\u00a3"+
		"\u00ab\u00b8\u00c0\u00c7\u00d5\u00ec\u00ee\u00f7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}