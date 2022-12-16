https://powcoder.com
代写代考加微信 powcoder
Assignment Project Exam Help
Add WeChat powcoder
https://powcoder.com
代写代考加微信 powcoder
Assignment Project Exam Help
Add WeChat powcoder
// Do not modify the code below!  Don't add anything (including
// "public" declarations), don't remove anything. Don't wrap it in a
// package, don't make it an innner class of some other class.
// If your IDE suggsts to change anything below, ignore your IDE.

class CodegenException extends Exception {
    public String msg;
    public CodegenException ( String _msg ) { msg = _msg; } }

interface Codegen {
    public String codegen ( Program p ) throws CodegenException; }

