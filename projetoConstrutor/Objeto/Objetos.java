package projetoConstrutor.Objeto;

import projetoConstrutor.ClienteClasse.Cliente;
import projetoConstrutor.ClienteClasse.ClienteOpcao1;
import projetoConstrutor.ClienteClasse.EnderecoOp1;
import projetoConstrutor.ClienteClasse.EnderecoOp2;
import projetoConstrutor.ClienteClasse.ItemTemaOp1;
import projetoConstrutor.ClienteClasse.ItemTemaOp2;
import projetoConstrutor.ClienteClasse.TemaOp1;
import projetoConstrutor.ClienteClasse.TemaOp2;

public class Objetos {

	public static void main(String[] args) {
		ClienteOpcao1 cliente1 = new ClienteOpcao1();
		
		cliente1.setNome("Luciana");
		cliente1.setTelefone("(15) 99347-6183");
		cliente1.setCpf("123.445.678.90");
		cliente1.setRg("09.876.543-2");
		
		System.out.println(cliente1.getNome());
		System.out.println(cliente1.getTelefone());
		System.out.println(cliente1.getCpf());
		System.out.println(cliente1.getRg());
		
		Cliente cliente2 = new Cliente(1 ,"Carla", "(15) 99326-3414", "123.456.789-01", "12.345.678-0");
		
		System.out.println(cliente2.getId());
		System.out.println(cliente2.getNome());
		System.out.println(cliente2.getTelefone());
		System.out.println(cliente2.getCpf());
		System.out.println(cliente2.getRg());
		
		ItemTemaOp1 tema = new ItemTemaOp1();
		
		tema.setId(1);
		tema.setNome("lua");
		tema.setDescricao("não possui descricão.");
		
		System.out.println(tema.getId());
		System.out.println(tema.getNome());
		System.out.println(tema.getDescricao());
		
		ItemTemaOp2 tema1 = new ItemTemaOp2(1, "sol", "não possui.");
		
		System.out.println(tema1.getId());
		System.out.println(tema1.getNome());
		System.out.println(tema1.getDescricao());
		
		TemaOp1 tema2 = new TemaOp1();
		
		tema2.setId(1);
		tema2.setNome("giovana");
		tema2.setAluguel(2500);
		tema2.setCorTolha("hdsod bduef");
		
		System.out.println(tema2.getId());
		System.out.println(tema2.getNome());
		System.out.println(tema2.getAluguel());
		System.out.println(tema2.getCorTolha());
		
		TemaOp2 tema3 = new TemaOp2(1, "beatriz", 1200.5, "amarelo");
		
		System.out.println(tema3.getId());
		System.out.println(tema3.getNome());
		System.out.println(tema3.getAluguel());
		System.out.println(tema3.getCorTolha());
		
		EnderecoOp1 endereco = new EnderecoOp1();
		
		endereco.setId(1);
		endereco.setLogradouro("Rua Luz do Sol");
		endereco.setNumero(343);
		endereco.setComplemento("Ao lado da marcenaria Lua");
		endereco.setBairro("Solar");
		endereco.setCidade("Via Láctea");
		endereco.setCep("13407-234");
		endereco.setUf("ES");
		
		System.out.println(endereco.getId());
		System.out.println(endereco.getLogradouro());
		System.out.println(endereco.getNumero());
		System.out.println(endereco.getComplemento());
		System.out.println(endereco.getBairro());
		System.out.println(endereco.getCidade());
		System.out.println(endereco.getCep());
		System.out.println(endereco.getUf());
		
		EnderecoOp2 endereco1 = new EnderecoOp2(1, "Rua Onde as estrelas estâo", 12, "não tem", "galáxia", "estrelas", "62493-581", "SP");
		
		System.out.println(endereco1.getId());
		System.out.println(endereco1.getLogradouro());
		System.out.println(endereco1.getNumero());
		System.out.println(endereco1.getComplemento());
		System.out.println(endereco1.getBairro());
		System.out.println(endereco1.getCidade());
		System.out.println(endereco1.getCep());
		System.out.println(endereco1.getUf());

	}

}
