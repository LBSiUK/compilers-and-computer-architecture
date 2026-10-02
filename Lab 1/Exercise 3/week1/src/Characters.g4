grammar Characters;

charstring : somechar+ EOF ;

somechar
    : Uppercase #UppercaseChar
    | Lowercase #LowercaseChar
    | Numerical #NumericalChar
    | Whitespace #Whitespace
    | Punctuation #Punctuation
    | Extended #Extended
    | Unprintable #Unprintable 
;

Uppercase : [A-Z] ;
Lowercase : [a-z] ;
Numerical : [0-9] ;
Whitespace : [\u0009-\u000D\u0020] ;
Punctuation : [\u0021-\u002F\u003A-\u0040\u005B-\u0060\u007B-\u007E] ;
Extended : [\u0080-\u{10FFFF}] ;
Unprintable : . ;