/*!
 * imalex@163.com - v0.1 (2015-08-29 18:00:00 +0800)
 * Copyright 2015
 */
var ctx=getBasePath();

function getBasePath(){ 
	var obj=window.location; 
	var contextPath=obj.pathname.split("/")[1]; 
	var basePath=obj.protocol+"//"+obj.host+"/"+contextPath; 
	return basePath; 
} 