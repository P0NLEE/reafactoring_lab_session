package lanSimulation.internals;

public class Workstation extends Node {

	public Workstation(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	/*
	Construct a <em>Worksattion</em> with given #type and #name, and which is linked to #nextNode.
	<p><strong>Precondition:</strong> (type >= NODE) & (type <= PRINTER);</p>
		 */
		public Workstation( String name, Node nextNode) {
			super(name,nextNode);
		}
	
	/**
Write a printable representation of #receiver on the given #buf.
<p><strong>Precondition:</strong> isInitialized();</p>
	 */
    public void printOn(StringBuffer buf) {
        buf.append("Workstation ");
        buf.append(name_);
        buf.append(" [Workstation]");
    }

	/**
Write a HTML representation of #receiver on the given #buf.
 <p><strong>Precondition:</strong> isInitialized();</p>
	 */
    public void printHTMLOn(StringBuffer buf) {
        buf.append("Workstation ");
        buf.append(name_);
        buf.append(" [Workstation]");
    }
    
	/**
Write an XML representation of #receiver on the given #buf.
<p><strong>Precondition:</strong> isInitialized();</p>
	 */
	public void printXMLOn(StringBuffer buf) {
		buf.append("<workstation>");
		buf.append(name_);
		buf.append("</workstation>");
	}

}
