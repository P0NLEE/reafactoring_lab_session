package lanSimulation.internals;

public class Printer extends Node {

	public Printer(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	/*
	Construct a <em>Printer</em> with given #type and #name, and which is linked to #nextNode.
	<p><strong>Precondition:</strong> (type >= NODE) & (type <= PRINTER);</p>
		 */
		public Printer( String name, Node nextNode) {
			super(name,nextNode);
		}
		 
	/**
Write a printable representation of #receiver on the given #buf.
<p><strong>Precondition:</strong> isInitialized();</p>
	 */
    public void printOn(StringBuffer buf) {
        buf.append("Printer ");
        buf.append(name_);
        buf.append(" [Printer]");
    }

	/**
Write a HTML representation of #receiver on the given #buf.
 <p><strong>Precondition:</strong> isInitialized();</p>
	 */
    public void printHTMLOn(StringBuffer buf) {
        buf.append("Printer ");
        buf.append(name_);
        buf.append(" [Printer]");
    }

	/**
Write an XML representation of #receiver on the given #buf.
<p><strong>Precondition:</strong> isInitialized();</p>
	 */
    public void printXMLOn(StringBuffer buf) {
        buf.append("<printer>");
        buf.append(name_);
        buf.append("</printer>");
    }

}
