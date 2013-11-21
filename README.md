jsmin
=====

Simple Javascript minifier. Built with ANTLR v3.

Rules
=====

var teste;		var a;		OK <br>
var teste, b2;	var a, b;	OK <br>
function (temp)	function(a)	OK <br>
a+ ++b			a+ ++b		OK <br>
msg=msg+1		msg++		OK <br>
msg+=a;msg+=b	msg+=a+b	NOK <br>
el["am"]		el.am		NOK <br>
"abcde"			s1			NOK <br>
if (a) b else c	a?b:c		NOK <br>
var global		var global	OK <br>
/regexp/		/regexp/	NOK <br>
