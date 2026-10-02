// Generated from /Users/leonb/code/University code/Year 2/Compilers and Computer Architecture/Lab 1/Exercise 3/week1/src/Characters.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class CharactersParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Uppercase=1, Lowercase=2, Numerical=3, Others=4;
	public static final int
		RULE_charstring = 0, RULE_somechar = 1;
	private static String[] makeRuleNames() {
		return new String[] {
			"charstring", "somechar"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Uppercase", "Lowercase", "Numerical", "Others"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "Characters.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CharactersParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CharstringContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(CharactersParser.EOF, 0); }
		public List<SomecharContext> somechar() {
			return getRuleContexts(SomecharContext.class);
		}
		public SomecharContext somechar(int i) {
			return getRuleContext(SomecharContext.class,i);
		}
		public CharstringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charstring; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CharactersVisitor ) return ((CharactersVisitor<? extends T>)visitor).visitCharstring(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharstringContext charstring() throws RecognitionException {
		CharstringContext _localctx = new CharstringContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_charstring);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(5); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(4);
				somechar();
				}
				}
				setState(7); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 14L) != 0) );
			setState(9);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SomecharContext extends ParserRuleContext {
		public SomecharContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_somechar; }
	 
		public SomecharContext() { }
		public void copyFrom(SomecharContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UppercaseCharContext extends SomecharContext {
		public TerminalNode Uppercase() { return getToken(CharactersParser.Uppercase, 0); }
		public UppercaseCharContext(SomecharContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CharactersVisitor ) return ((CharactersVisitor<? extends T>)visitor).visitUppercaseChar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumericalCharContext extends SomecharContext {
		public TerminalNode Numerical() { return getToken(CharactersParser.Numerical, 0); }
		public NumericalCharContext(SomecharContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CharactersVisitor ) return ((CharactersVisitor<? extends T>)visitor).visitNumericalChar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LowercaseCharContext extends SomecharContext {
		public TerminalNode Lowercase() { return getToken(CharactersParser.Lowercase, 0); }
		public LowercaseCharContext(SomecharContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CharactersVisitor ) return ((CharactersVisitor<? extends T>)visitor).visitLowercaseChar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SomecharContext somechar() throws RecognitionException {
		SomecharContext _localctx = new SomecharContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_somechar);
		try {
			setState(14);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Uppercase:
				_localctx = new UppercaseCharContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(11);
				match(Uppercase);
				}
				break;
			case Lowercase:
				_localctx = new LowercaseCharContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(12);
				match(Lowercase);
				}
				break;
			case Numerical:
				_localctx = new NumericalCharContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(13);
				match(Numerical);
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

	public static final String _serializedATN =
		"\u0004\u0001\u0004\u0011\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0001\u0000\u0004\u0000\u0006\b\u0000\u000b\u0000\f\u0000\u0007\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u000f"+
		"\b\u0001\u0001\u0001\u0000\u0000\u0002\u0000\u0002\u0000\u0000\u0011\u0000"+
		"\u0005\u0001\u0000\u0000\u0000\u0002\u000e\u0001\u0000\u0000\u0000\u0004"+
		"\u0006\u0003\u0002\u0001\u0000\u0005\u0004\u0001\u0000\u0000\u0000\u0006"+
		"\u0007\u0001\u0000\u0000\u0000\u0007\u0005\u0001\u0000\u0000\u0000\u0007"+
		"\b\u0001\u0000\u0000\u0000\b\t\u0001\u0000\u0000\u0000\t\n\u0005\u0000"+
		"\u0000\u0001\n\u0001\u0001\u0000\u0000\u0000\u000b\u000f\u0005\u0001\u0000"+
		"\u0000\f\u000f\u0005\u0002\u0000\u0000\r\u000f\u0005\u0003\u0000\u0000"+
		"\u000e\u000b\u0001\u0000\u0000\u0000\u000e\f\u0001\u0000\u0000\u0000\u000e"+
		"\r\u0001\u0000\u0000\u0000\u000f\u0003\u0001\u0000\u0000\u0000\u0002\u0007"+
		"\u000e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}