jsmin
=====

Simple Javascript minifier. Built with ANTLR v3.

Rules
=====

var teste;		var a;		OK
var teste, b2;	var a, b;	OK
function (temp)	function(a)	OK
a+ ++b			a+ ++b		OK
msg=msg+1		msg++		OK
msg+=a;msg+=b	msg+=a+b	NOK
el["am"]		el.am		NOK
"abcde"			s1			NOK
if (a) b else c	a?b:c		NOK
var global		var global	OK
/regexp/		/regexp/	NOK
