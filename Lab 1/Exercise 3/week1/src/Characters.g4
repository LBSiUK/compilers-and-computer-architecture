grammar Characters;

charstring : somechar+ EOF ;

somechar
    : Uppercase #UppercaseChar
    | Lowercase #LowercaseChar
    | Numerical #NumericalChar
;

Uppercase : [A-Z] ;
Lowercase : [a-z] ;
Numerical : [0-9] ;
Others : . -> skip ;