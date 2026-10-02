University work. Genuinely hand written, no AI here. You're watching me "learn" to code (and not amazingly well).
This isn't really worth looking at or using. It just takes in a text string and prints the category of each character.
Exercise 1 / 2 are a native implementation in Java, 3 / 4 uses the ANTLR library for text extraction with some rules.
If you put "Test 1 £2!" through this you'll get this for an output.
"T" : uppercase
"e" : lowercase
"s" : lowercase
"t" : lowercase
" " : whitespace
"1" : numeric
" " : whitespace
"£" : extended character
"2" : numeric
"!" : punctuation
