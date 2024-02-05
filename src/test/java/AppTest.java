import com.thing.Thing;
import org.instancio.Instancio;
import org.junit.jupiter.api.Test;

class AppTest {
  @Test
  void testCreatesInstance() {
    var thing = Instancio.create(Thing.class);
  }
}
