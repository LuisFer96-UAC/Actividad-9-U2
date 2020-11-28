/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author harde
 */
public class VerificadorTest {
    
@Test
public void verificadorTest(){
    Verificador verificador = new Verificador();
    
    assertFalse(verificador.verificador(5));
    assertTrue(verificador.verificador(0));
    assertTrue(verificador.verificador(-2));
}

@Test
public void tartamudoTest(){
    Verificador verificador = new Verificador();
    
    assertEquals("in.. in.. increible?", verificador.tartamudo("increible"));
    assertEquals("en.. en.. entusiasmado?", verificador.tartamudo("entusiasmado"));
    assertEquals("ac.. ac.. actividades?", verificador.tartamudo("actividades"));
}

@Test
public void totalTheRecaTest(){
    Verificador verificador = new Verificador();
    
    assertEquals(7, verificador.totalTheReca(6));
    assertEquals(14, verificador.totalTheReca(12));
    assertEquals(248, verificador.totalTheReca(213));

}

@Test
public void recuentoTest(){
    Verificador verificador = new Verificador();
    
    assertEquals(6, verificador.recuento("El ejemplo hace movernos hacia adelante"));
    assertEquals(4, verificador.recuento("Esto es un test"));
    assertEquals(5, verificador.recuento("Esto es facil de aprender"));
}

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
