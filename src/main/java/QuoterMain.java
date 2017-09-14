import org.springframework.context.support.ClassPathXmlApplicationContext;

public class QuoterMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        context.getBean(TerminatorQuoter.class).sayQote();
    }
}
