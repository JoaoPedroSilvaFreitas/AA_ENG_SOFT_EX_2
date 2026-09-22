package padroescriacao.abstractfactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void deveEmitirContratoPF() {
        FabricaAbstrata fabrica = new FabricaPF();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Contrato PF", cliente.emitirContrato());
    }

    @Test
    void deveEmitirContratoPJ() {
        FabricaAbstrata fabrica = new FabricaPJ();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Contrato PJ", cliente.emitirContrato());
    }

    @Test
    void deveEmitirProcuracaoPF() {
        FabricaAbstrata fabrica = new FabricaPF();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Procuracao PF", cliente.emitirProcuracao());
    }

    @Test
    void deveEmitirProcuracaoPJ() {
        FabricaAbstrata fabrica = new FabricaPJ();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Procuracao PJ", cliente.emitirProcuracao());
    }

}