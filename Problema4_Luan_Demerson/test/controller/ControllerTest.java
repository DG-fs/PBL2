package controller;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class ControllerTest extends TestCase {
	
	@Before
	public void setUp() {
		FileWriter arq;
		PrintWriter gravarArq = null;
		try {
			arq = new FileWriter("MapaMetro.txt");
			gravarArq = new PrintWriter(arq);
			gravarArq.print("# Arquivo descrevendo o tempo entre as estações do Metrô de São Paulo.\r\n" + 
					"# Linhas iniciadas com o caractere '#' representam comentários e devem ser\r\n" + 
					"# ignoradas. \r\n" + 
					"# Cada linha do arquivo está no seguinte formato:\r\n" + 
					"# <Estação A>,<Estação B>,<tempo> \r\n" + 
					"# A <Estação A> representa a estação de origem, a <Estação B> representa a\r\n" + 
					"# estação de destino e <tempo> é o tempo que um trem leva para ir de A a B.\r\n" + 
					"# Uma conexão entre uma estação A e B implica necessariamente que haja uma\r\n" + 
					"# conexão entre B e A, e o tempo que o trem leva para ir de A a B é igual ao\r\n" + 
					"# tempo que o trem leva para ir de B para A.\r\n" + 
					"#\r\n" + 
					"#Linha 1\r\n" + 
					"#\r\n" + 
					"Tucuruvi,Parada Inglesa,2\r\n" + 
					"Parada Inglesa,Jardim São Paulo-Ayrton Senna,2\r\n" + 
					"Jardim São Paulo-Ayrton Senna,Santana,3\r\n" + 
					"Santana,Carandiru,2\r\n" + 
					"Carandiru,Portuguesa-Tietê,2\r\n" + 
					"Portuguesa-Tietê,Armênia,2\r\n" + 
					"Armênia,Tiradentes,2\r\n" + 
					"Tiradentes,Luz,2\r\n" + 
					"Luz,São Bento,2\r\n" + 
					"São Bento,Sé,2\r\n" + 
					"Sé,Liberdade,2\r\n" + 
					"Liberdade,São Joaquim,3\r\n" + 
					"São Joaquim,Vergueiro,2\r\n" + 
					"Vergueiro,Paraíso,2\r\n" + 
					"Paraíso,Ana Rosa,2\r\n" + 
					"Ana Rosa,Vila Mariana,2\r\n" + 
					"Vila Mariana,Santa Cruz,2\r\n" + 
					"Santa Cruz,Praça da Árvore,3\r\n" + 
					"Praça da Árvore,Saúde,2\r\n" + 
					"Saúde,São Judas,2\r\n" + 
					"São Judas,Conceição,2\r\n" + 
					"Conceição,Jabaquara,2\r\n" + 
					"Jabaquara,Diadema,16\r\n" + 
					"Diadema,Morumbi,20\r\n" + 
					"Diadema,Piraporinha,11\r\n" + 
					"Piraporinha,São Bernado,20\r\n" + 
					"São Bernado,Santo André,30\r\n" + 
					"Santo André,Sônia Maria,23\r\n" + 
					"Sônia Maria,São Mateus,7\r\n" + 
					"#\r\n" + 
					"#Linha 2\r\n" + 
					"#\r\n" + 
					"Vila Madalena,Sumaré,3\r\n" + 
					"Sumaré,Clínicas,2\r\n" + 
					"Clínicas,Consolação,3\r\n" + 
					"Consolação,Trianon-Masp,2\r\n" + 
					"Consolação,Paulista,0\r\n" + 
					"Trianon-Masp,Brigadeiro,2\r\n" + 
					"Brigadeiro,Paraíso,2\r\n" + 
					"Paraíso,Ana Rosa,2\r\n" + 
					"Ana Rosa,Chácara Klabin,3\r\n" + 
					"Chácara Klabin,Santos-Imigrantes,3\r\n" + 
					"Santos-Imigrantes,Alto do Ipiranga,3\r\n" + 
					"Alto do Ipiranga,Sacomã,2\r\n" + 
					"Sacomã,Tamanduateí,3\r\n" + 
					"Tamanduateí,Vila Prudente,3\r\n" + 
					"#\r\n" + 
					"#Linha 3\r\n" + 
					"#\r\n" + 
					"Palmeiras-Barra Funda,Marechal Deodoro,3\r\n" + 
					"Marechal Deodoro,Santa Cecília,2\r\n" + 
					"Santa Cecília,República,2\r\n" + 
					"República,Anhangabaú,2\r\n" + 
					"Anhangabaú,Sé,2\r\n" + 
					"Sé,Pedro II,2\r\n" + 
					"Pedro II,Brás,2\r\n" + 
					"Brás,Bresser-Mooca,2\r\n" + 
					"Bresser-Mooca,Belém,3\r\n" + 
					"Belém,Tatuapé,3\r\n" + 
					"Tatuapé,Carrão,3\r\n" + 
					"Carrão,Penha,4\r\n" + 
					"Penha,Vila Matilde,2\r\n" + 
					"Vila Matilde,Guilhermina-Esperança,3\r\n" + 
					"Guilhermina-Esperança,Patriarca,3\r\n" + 
					"Patriarca,Artur Alvim,3\r\n" + 
					"Artur Alvim,Corinthians-Itaquera,3\r\n" + 
					"#\r\n" + 
					"#Linha 4\r\n" + 
					"#\r\n" + 
					"Luz,República,2\r\n" + 
					"República,Paulista,2\r\n" + 
					"Paulista,Faria Lima,2\r\n" + 
					"Faria Lima,Pinheiros,2\r\n" + 
					"Pinheiros,Butantã,2\r\n" + 
					"#\r\n" + 
					"#Linha 5\r\n" + 
					"#\r\n" + 
					"Capão Redondo,Campo Limpo,2\r\n" + 
					"Campo Limpo,Vila das Belezas,3\r\n" + 
					"Vila das Belezas,Giovanni Gronchi,3 \r\n" + 
					"Giovanni Gronchi,Santo Amaro,3\r\n" + 
					"Santo Amaro,Largo Treze,2\r\n" + 
					"#\r\n" + 
					"#Linha 7\r\n" + 
					"#\r\n" + 
					"Luz,Palmeiras-Barra Funda,5.5\r\n" + 
					"Palmeiras-Barra Funda,Água Branca,4.5\r\n" + 
					"Água Branca,Lapa,3.5\r\n" + 
					"Lapa,Piqueri,3\r\n" + 
					"Piqueri,Pirituba,3.5\r\n" + 
					"Pirituba,Vila Clarice,4.5\r\n" + 
					"Vila Clarice,Jaraguá,4.5\r\n" + 
					"Jaraguá,Perus,7\r\n" + 
					"Perus,Caieiras,5.5\r\n" + 
					"Caieiras,Franco da Rocha,8\r\n" + 
					"Franco da Rocha,Baltazar Fidélis,3\r\n" + 
					"Baltazar Fidélis,Francisco Morato,7.5\r\n" + 
					"#\r\n" + 
					"#Linha 8\r\n" + 
					"#\r\n" + 
					"Júlio Prestes,Palmeiras-Barra Funda,5.5\r\n" + 
					"Palmeiras-Barra Funda,Lapa,4\r\n" + 
					"Lapa,Domingos de Moraes,4.5\r\n" + 
					"Domingos de Moraes,Imperatriz Leopoldina,3\r\n" + 
					"Imperatriz Leopoldina,Presidente Altino,4\r\n" + 
					"Presidente Altino,Osasco,2.5\r\n" + 
					"Osasco,Comandante Sampaio,5.5\r\n" + 
					"Comandante Sampaio,Quitaúna,2\r\n" + 
					"Quitaúna,General Miguel Costa,2.5\r\n" + 
					"General Miguel Costa,Carapicuíba,3.5\r\n" + 
					"Carapicuíba,Santa Terezinha,3\r\n" + 
					"Santa Terezinha,Antônio João,2.5\r\n" + 
					"Antônio João,Barueri,2.5\r\n" + 
					"Barueri,Jardim Belval,4\r\n" + 
					"Jardim Belval,Jardim Silveira,2\r\n" + 
					"Jardim Silveira,Jandira,1.5\r\n" + 
					"Jandira,Sagrado Coração,3\r\n" + 
					"Sagrado Coração,Engenheiro Cardoso,2.5\r\n" + 
					"Engenheiro Cardoso,Itapevi,4\r\n" + 
					"#\r\n" + 
					"#Linha 9\r\n" + 
					"#\r\n" + 
					"Osasco,Presidente Altino,3.5,\r\n" + 
					"Presidente Altino,Ceasa,2.5\r\n" + 
					"Ceasa,Vila Lobos-Jaguaré,2\r\n" + 
					"Vila Lobos-Jaguaré,Cidade Universitária,3\r\n" + 
					"Cidade Universitária,Pinheiros,1.5,\r\n" + 
					"Pinheiros,Hebraica-Rebouças,2,\r\n" + 
					"Hebraica-Rebouças,Cidade Jardim,2\r\n" + 
					"Cidade Jardim,Vila Olímpia,2\r\n" + 
					"Vila Olímpia,Berrini,2\r\n" + 
					"Berrini,Morumbi,2\r\n" + 
					"Morumbi,Granja Julieta,2\r\n" + 
					"Granja Julieta,Santo Amaro,4\r\n" + 
					"Santo Amaro,Socorro,2\r\n" + 
					"Socorro,Jurubatuba,2.5\r\n" + 
					"Jurubatuba,Autódromo,3.5\r\n" + 
					"Autódromo,Primavera-Interlagos,3\r\n" + 
					"Primavera-Interlagos,Grajaú,2.5\r\n" + 
					"#\r\n" + 
					"#Linha 10\r\n" + 
					"#\r\n" + 
					"Brás,Mooca,4\r\n" + 
					"Mooca,Ipiranga,4.5\r\n" + 
					"Ipiranga,Tamanduateí,3\r\n" + 
					"Tamanduateí,São Caetano,4\r\n" + 
					"São Caetano,Utinga,4.5\r\n" + 
					"Utinga,Prefeito Saladino,2.5\r\n" + 
					"Prefeito Saladino,Santo André,3.5\r\n" + 
					"Santo André,Capuava,6\r\n" + 
					"Capuava,Mauá,4\r\n" + 
					"Mauá,Guapituba,6\r\n" + 
					"Guapituba,Ribeirão Pires,5.5\r\n" + 
					"Ribeirão Pires,Rio Grande da Serra,8\r\n" + 
					"#\r\n" + 
					"#Linha 11\r\n" + 
					"#\r\n" + 
					"Guaianases,Antônio Gianetti,6\r\n" + 
					"Antônio Gianetti,Ferraz de Vasconcelos,3\r\n" + 
					"Ferraz de Vasconcelos,Poá,4.5\r\n" + 
					"Poá,Calmon Viana,2.5\r\n" + 
					"Calmon Viana,Suzano,3.5\r\n" + 
					"Suzano,Jundiapeba,5.5\r\n" + 
					"Jundiapeba,Braz Cubas,3.5\r\n" + 
					"Braz Cubas,Mogi das Cruzes,5\r\n" + 
					"Mogi das Cruzes,Estudantes,3.5\r\n" + 
					"#\r\n" + 
					"#Linha 11 (expresso)\r\n" + 
					"#\r\n" + 
					"Luz,Brás,5\r\n" + 
					"Brás,Tatuapé,7,\r\n" + 
					"Tatuapé,Corinthians-Itaquera,12.5\r\n" + 
					"Corinthians-Itaquera,Dom Bosco,3.5\r\n" + 
					"Dom Bosco,José Bonifácio,3\r\n" + 
					"José Bonifácio,Guaianases,3\r\n" + 
					"");
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			gravarArq.close();
		}
	}
	
	@Test
	public void testReadFile() {
		try {
			Controller.getInstance().ImportarArq();
		} catch (IOException e) {
			assertFalse(true);
		}
	}
}
