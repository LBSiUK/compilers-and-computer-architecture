grammar Characters;

charstring : somechar+ EOF ;

somechar
    : Uppercase             #UppercaseChar
;

Uppercase : [A-Z] ;
Others : . -> skip ;
