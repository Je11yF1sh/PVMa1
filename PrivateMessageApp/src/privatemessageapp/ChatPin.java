package privatemessageapp;// This class will be used to authorize and authenticate chat pins in order to connect to
// a chat.

public class ChatPin extends LocalChat{

    public ChatPin(int chatPin, String convoName, int newMessages) {
        super(convoName, newMessages);
    }

    @Override
    public String toString() {
        return "ChatPin{" +
                "chatPin='" + chatPin + '\'' +
                '}';
    }

    private int chatPin = 133420;

    public int getChatPin() {
        return chatPin;
    }
    public void setChatPin(int chatPin) {
        this.chatPin = chatPin;
    }
}
