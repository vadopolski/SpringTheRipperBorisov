public class TerminatorQuoter implements Quoter {
    private String message;

    @InjectRandomInt(min = 2, max = 7)
    private int repeat;

    public TerminatorQuoter() {
    }

    @Override
    public void sayQote() {
        for (int i = 0; i < repeat; i++) {
            System.out.println("message = " + message);
        }
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
