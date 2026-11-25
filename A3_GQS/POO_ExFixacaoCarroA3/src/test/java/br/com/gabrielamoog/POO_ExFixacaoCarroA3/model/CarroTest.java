
package br.com.gabrielamoog.POO_ExFixacaoCarroA3.model;

// Importa o assertEquals para comparar resultados esperados e obtidos.
import static org.junit.Assert.assertEquals;

// Importa a anotação @Test do JUnit 4.
import org.junit.Test;

public class CarroTest {

	// =====================================================
	// QUESTÃO 4 - TESTE DO MÉTODO ligarMotor()
	// =====================================================

	@Test
	public void testarLigarMotor() {

		// Cenário

		// ETAPA A - Criar três variáveis com modelos dos carros.
		String modelo1 = "Uno Mille";
		String modelo2 = "Gol Turbo";
		String modelo3 = "Ka Sedan";

		// ETAPA B - Criar três objetos com situações diferentes.
		// Carro 1: motor desligado e parado.
		Carro carro1 = new Carro("Fiat", modelo1, 2015, false, 0);

		// Carro 2: motor ligado e parado.
		Carro carro2 = new Carro("VW", modelo2, 2020, true, 0);

		// Carro 3: motor ligado e a 60 km/h.
		Carro carro3 = new Carro("Ford", modelo3, 2019, true, 60);

		// Ação

		// ETAPA C - Exibir a situação inicial de cada carro.
		System.out.println(carro1.situacaoMotor());
		System.out.println(carro2.situacaoMotor());
		System.out.println(carro3.situacaoMotor());

		// Verificação

		// ETAPA D - Comparar o resultado esperado com o obtido.

		assertEquals("O motor do Uno Mille já estava ligado.", carro1.ligarMotor());

		assertEquals("O motor do " + modelo2 + " já estava ligado.", carro2.ligarMotor());

		assertEquals("O motor do " + modelo3 + " já estava ligado.", carro3.ligarMotor());
	}

	// =====================================================
	// QUESTÃO 5 - TESTE DO MÉTODO desligarMotor()
	// =====================================================

	@Test
	public void testarDesligarMotor() {

		// Cenário

		// ETAPA A - Criar três variáveis com modelos dos carros.
		String modelo1 = "Uno Mille";
		String modelo2 = "Gol Turbo";
		String modelo3 = "Ka Sedan";

		// ETAPA B - Criar três carros com situações diferentes.
		Carro carro1 = new Carro("Fiat", modelo1, 2015, false, 0);
		Carro carro2 = new Carro("VW", modelo2, 2020, true, 0);
		Carro carro3 = new Carro("Ford", modelo3, 2019, true, 60);

		// Ação

		// ETAPA C - Exibir a situação inicial de cada carro.
		System.out.println(carro1.situacaoMotor());
		System.out.println(carro2.situacaoMotor());
		System.out.println(carro3.situacaoMotor());

		// Verificação

		// ETAPA D - Verificar se o desligamento apresenta o retorno correto.
		assertEquals("O motor do " + modelo1 + " já estava desligado.", carro1.desligarMotor());

		assertEquals("O motor do " + modelo2 + " foi desligado agora.", carro2.desligarMotor());

		assertEquals("ATENÇÃO: O motor do " + modelo3 + " não foi desligado pois o carro está em movimento.",
				carro3.desligarMotor());
	}

	// =====================================================
	// QUESTÃO 6 - TESTE DO MÉTODO acelerar()
	// =====================================================

	@Test
	public void testarAcelerar() {

		// Cenário

		// ETAPA A - Criar três variáveis com modelos dos carros.
		String modelo1 = "Uno Mille";
		String modelo2 = "Gol Turbo";
		String modelo3 = "Ka Sedan";

		// ETAPA B - Criar três carros com situações diferentes.
		Carro carro1 = new Carro("Fiat", modelo1, 2015, false, 0);
		Carro carro2 = new Carro("VW", modelo2, 2020, true, 0);
		Carro carro3 = new Carro("Ford", modelo3, 2019, true, 60);

		// Ação

		// ETAPA C - Exibir a situação inicial de cada carro.
		System.out.println(carro1.situacaoMotor());
		System.out.println(carro2.situacaoMotor());
		System.out.println(carro3.situacaoMotor());

		// Verificação

		// ETAPA D - Acelerar cada carro em 20 km/h e verificar o resultado.

		// Carro 1: não acelera porque o motor está desligado.
		assertEquals(modelo1 + " --> ATENÇÃO: Não é possível acelerar com o motor desligado!", carro1.acelerar(20));

		// Carro 2: estava parado e passa a 20 km/h.
		assertEquals(modelo2 + " --> ACELEROU!!! Velocidade atual: 20 Km/h.", carro2.acelerar(20));

		// Carro 3: estava a 60 km/h e passa a 80 km/h.
		assertEquals(modelo3 + " --> ACELEROU!!! Velocidade atual: 80 Km/h.", carro3.acelerar(20));
	}

	// =====================================================
	// QUESTÃO 7 - TESTE DO MÉTODO frear()
	// =====================================================

	@Test
	public void testarFrear() {

		// Cenário

		// ETAPA A - Criar quatro variáveis com modelos dos carros.
		String modelo1 = "Uno Mille";
		String modelo2 = "Gol Turbo";
		String modelo3 = "Ka Sedan";
		String modelo4 = "Celta";

		// ETAPA B - Criar quatro carros com situações diferentes.

		// Carro 1: motor desligado e parado.
		Carro carro1 = new Carro("Fiat", modelo1, 2015, false, 0);

		// Carro 2: motor ligado e parado.
		Carro carro2 = new Carro("VW", modelo2, 2020, true, 0);

		// Carro 3: motor ligado e a 60 km/h.
		Carro carro3 = new Carro("Ford", modelo3, 2019, true, 60);

		// Carro 4: motor ligado e a 30 km/h.
		Carro carro4 = new Carro("Chevrolet", modelo4, 2018, true, 30);

		// Ação

		// ETAPA C - Exibir a situação inicial dos quatro carros.
		System.out.println(carro1.situacaoMotor());
		System.out.println(carro2.situacaoMotor());
		System.out.println(carro3.situacaoMotor());
		System.out.println(carro4.situacaoMotor());

		// Verificação

		// ETAPA D - Frear cada carro em 40 km/h e verificar o resultado.

		// Carro 1: não pode frear porque o motor está desligado.
		assertEquals(modelo1 + " --> ATENÇÃO: O motor está desligado! O carro já está parado!", carro1.frear(40));

		// Carro 2: já está parado.
		assertEquals(modelo2 + " --> ATENÇÃO: O carro já está parado!", carro2.frear(40));

		// Carro 3: estava a 60 km/h e passa a 20 km/h.
		assertEquals(modelo3 + " --> FREOU!!! Velocidade atual: 20 km/h.", carro3.frear(40));

		// Carro 4: estava a 30 km/h e para completamente.
		assertEquals(modelo4 + " --> FREOU!!! O carro está PARADO!", carro4.frear(40));
	}

	// Depois de rodar o codigo , no prompt
	// Elas mostram se cada carro está com o motor ligado ou desligado antes da
	// execução das verificações.
	// Como todos os testes passaram, significa que os métodos ligar, desligar,
	// acelerar e frear retornaram os resultados esperados

	// para testar erro no assertEquals
	// assertEquals("O motor do Uno Mille já estava ligado.", carro1.ligarMotor());

}
