package ro.ase.csie.cts.Horia.Negreanu.g1099.prototype;

public class Message implements Cloneable{

	String destination;
	String textContent;
	
	private Message() {
		
	}
	
	public Message(String destination, String pathToFile) {
		
		System.out.println("Read the text from path " + pathToFile);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.setTextContent("text");
		this.setDestination(destination);
	}
	
	public String getDestination() {
		return destination;
	}



	public void setDestination(String destination) {
		this.destination = destination;
	}



	public String getTextContent() {
		return textContent;
	}



	public void setTextContent(String textContent) {
		this.textContent = textContent;
	}

	@Override
	public String toString() {
		return "Message [destination=" + destination + ", textContent=" + textContent + "]";
	}

	@Override
	protected Object clone(){
		Message message = new Message();
		message.destination = this.destination;
		message.textContent = this.textContent;
		return message;
	}
	
}
