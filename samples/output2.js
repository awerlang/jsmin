var Hashtable=(function(a){var b="function",c="string",d="undefined";if(typeof encodeURIComponent==d||Array.prototype.splice===a||Object.prototype.hasOwnProperty===a){return null;}function e(f){return(typeof f==c)?f:""+f;}function g(f){var h;if(typeof f==c){return f;}else if(typeof f.hashCode==b){h=f.hashCode();return(typeof h==c)?h:g(h);}else{return e(f);}}function i(j,k){for(var l in k){if(k.m(l)){j[l]=k[l];}}}function n(o,p){return o.equals(p);}function q(o,p){return(typeof p.equals==b)?p.equals(o):(o===p);}function r(s){return function(t){if(t===null){throw new Error("null is not a valid "+s)}else if(t===a){throw new Error(s+" must not be undefined")}};}var u=r("key"),v=r("value");function w(x,y,z,ab){this[0]=x;this.entries=[];this.addEntry(y,z);if(ab!==null){this.getEqualityFunction=function(){return ab;};}}var bb=0,cb=1,db=2;function eb(fb){return function(gb){var l=this.entries.length,hb,ib=this.getEqualityFunction(gb);while(l--){hb=this.entries[l];if(ib(gb,hb[0])){switch(fb){case bb:return!0;case cb:return hb;case db:return[l,hb[1]];}}}return!1;};}function jb(kb){return function(lb){var mb=lb.length;for(var l=0,nb=this.entries,ob=nb.length;l<ob;++l){lb[mb+l]=nb[l][kb];}};}w.prototype={getEqualityFunction:function(pb){return(typeof pb.equals==b)?n:q;},getEntryForKey:eb(cb),getEntryAndIndexForKey:eb(db),removeEntryForKey:function(gb){var qb=this.getEntryAndIndexForKey(gb);if(qb){this.entries.splice(qb[0],1);return qb[1];}return null;},addEntry:function(gb,rb){this.entries.push([gb,rb]);},keys:jb(0),values:jb(1),getEntries:function(sb){var mb=sb.length;for(var l=0,nb=this.entries,ob=nb.length;l<ob;++l){sb[mb+l]=nb[l].slice(0);}},containsKey:eb(bb),containsValue:function(rb){var nb=this.entries,l=nb.length;while(l--){if(rb===nb[l][1]){return!0;}}return!1;}};function tb(ub,x){var l=ub.length,vb;while(l--){vb=ub[l];if(x===vb[0]){return l;}}return null;}function wb(xb,x){var vb=xb[x];return(vb&&(vb instanceof w))?vb:null;}function yb(){var ub=[];var xb={};var zb={replaceDuplicateKey:!0,hashCode:g,equals:null};var ac=arguments[0],bc=arguments[1];if(bc!==a){zb.hashCode=ac;zb.equals=bc;}else if(ac!==a){i(zb,ac);}var h=zb.hashCode,ib=zb.equals;this.properties=zb;this.put=function(gb,rb){u(gb);v(rb);var x=h(gb),vb,cc,dc=null;vb=wb(xb,x);if(vb){cc=vb.getEntryForKey(gb);if(cc){if(zb.replaceDuplicateKey){cc[0]=gb;}dc=cc[1];cc[1]=rb;}else{vb.addEntry(gb,rb);}}else{vb=new w(x,gb,rb,ib);ub.push(vb);xb[x]=vb;}return dc;};this.get=function(gb){u(gb);var x=h(gb);var vb=wb(xb,x);if(vb){var cc=vb.getEntryForKey(gb);if(cc){return cc[1];}}return null;};this.containsKey=function(gb){u(gb);var ec=h(gb);var vb=wb(xb,ec);return vb?vb.containsKey(gb):!1;};this.containsValue=function(rb){v(rb);var l=ub.length;while(l--){if(ub[l].containsValue(rb)){return!0;}}return!1;};this.clear=function(){ub.length=0;xb={};};this.isEmpty=function(){return!ub.length;};var fc=function(gc){return function(){var hc=[],l=ub.length;while(l--){ub[l][gc](hc);}return hc;};};this.keys=fc("keys");this.values=fc("values");this.entries=fc("getEntries");this.remove=function(gb){u(gb);var x=h(gb),ic,dc=null;var vb=wb(xb,x);if(vb){dc=vb.removeEntryForKey(gb);if(dc!==null){if(vb.entries.length==0){ic=tb(ub,x);ub.splice(ic,1);delete xb[x];}}}return dc;};this.size=function(){var jc=0,l=ub.length;while(l--){jc+=ub[l].entries.length;}return jc;};}yb.prototype={each:function(kc){var nb=this.entries(),l=nb.length,hb;while(l--){hb=nb[l];kc(hb[0],hb[1]);}},ib:function(lc){var mc,gb,nc,oc=this.size();if(oc==lc.size()){mc=this.keys();while(oc--){gb=mc[oc];nc=lc.get(gb);if(nc===null||nc!==this.get(gb)){return!1;}}return!0;}return!1;},putAll:function(lc,pc){var nb=lc.entries();var hb,gb,rb,qc,l=nb.length;var rc=(typeof pc==b);while(l--){hb=nb[l];gb=hb[0];rb=hb[1];if(rc&&(qc=this.get(gb))){rb=pc(gb,qc,rb);}this.put(gb,rb);}},clone:function(){var sc=new yb(this.properties);sc.putAll(this);return sc;}};yb.prototype.toQueryString=function(){var nb=this.entries(),l=nb.length,hb;var tc=[];while(l--){hb=nb[l];tc[l]=encodeURIComponent(e(hb[0]))+"="+encodeURIComponent(e(hb[1]));}return tc.join("&");};return yb;})();