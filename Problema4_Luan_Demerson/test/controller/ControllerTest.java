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
			gravarArq.print("# Arquivo descrevendo o tempo entre as esta��es do Metr� de S�o Paulo.\r\n" + 
					"# Linhas iniciadas com o caractere '#' representam coment�rios e devem ser\r\n" + 
					"# ignoradas. \r\n" + 
					"# Cada linha do arquivo est� no seguinte formato:\r\n" + 
					"# <Esta��o A>,<Esta��o B>,<tempo> \r\n" + 
					"# A <Esta��o A> representa a esta��o de origem, a <Esta��o B> representa a\r\n" + 
					"# esta��o de destino e <tempo> � o tempo que um trem leva para ir de A a B.\r\n" + 
					"# Uma conex�o entre uma esta��o A e B implica necessariamente que haja uma\r\n" + 
					"# conex�o entre B e A, e o tempo que o trem leva para ir de A a B � igual ao\r\n" + 
					"# tempo que o trem leva para ir de B para A.\r\n" + 
					"#\r\n" + 
					"#Linha 1\r\n" + 
					"#\r\n" + 
					"Tucuruvi,Parada Inglesa,2\r\n" + 
					"Parada Inglesa,Jardim S�o Paulo-Ayrton Senna,2\r\n" + 
					"Jardim S�o Paulo-Ayrton Senna,Santana,3\r\n" + 
					"Santana,Carandiru,2\r\n" + 
					"Carandiru,Portuguesa-Tiet�,2\r\n" + 
					"Portuguesa-Tiet�,Arm�nia,2\r\n" + 
					"Arm�nia,Tiradentes,2\r\n" + 
					"Tiradentes,Luz,2\r\n" + 
					"Luz,S�o Bento,2\r\n" + 
					"S�o Bento,S�,2\r\n" + 
					"S�,Liberdade,2\r\n" + 
					"Liberdade,S�o Joaquim,3\r\n" + 
					"S�o Joaquim,Vergueiro,2\r\n" + 
					"Vergueiro,Para�so,2\r\n" + 
					"Para�so,Ana Rosa,2\r\n" + 
					"Ana Rosa,Vila Mariana,2\r\n" + 
					"Vila Mariana,Santa Cruz,2\r\n" + 
					"Santa Cruz,Pra�a da �rvore,3\r\n" + 
					"Pra�a da �rvore,Sa�de,2\r\n" + 
					"Sa�de,S�o Judas,2\r\n" + 
					"S�o Judas,Concei��o,2\r\n" + 
					"Concei��o,Jabaquara,2\r\n" + 
					"Jabaquara,Diadema,16\r\n" + 
					"Diadema,Morumbi,20\r\n" + 
					"Diadema,Piraporinha,11\r\n" + 
					"Piraporinha,S�o Bernado,20\r\n" + 
					"S�o Bernado,Santo Andr�,30\r\n" + 
					"Santo Andr�,S�nia Maria,23\r\n" + 
					"S�nia Maria,S�o Mateus,7\r\n" + 
					"#\r\n" + 
					"#Linha 2\r\n" + 
					"#\r\n" + 
					"Vila Madalena,Sumar�,3\r\n" + 
					"Sumar�,Cl�nicas,2\r\n" + 
					"Cl�nicas,Consola��o,3\r\n" + 
					"Consola��o,Trianon-Masp,2\r\n" + 
					"Consola��o,Paulista,0\r\n" + 
					"Trianon-Masp,Brigadeiro,2\r\n" + 
					"Brigadeiro,Para�so,2\r\n" + 
					"Para�so,Ana Rosa,2\r\n" + 
					"Ana Rosa,Ch�cara Klabin,3\r\n" + 
					"Ch�cara Klabin,Santos-Imigrantes,3\r\n" + 
					"Santos-Imigrantes,Alto do Ipiranga,3\r\n" + 
					"Alto do Ipiranga,Sacom�,2\r\n" + 
					"Sacom�,Tamanduate�,3\r\n" + 
					"Tamanduate�,Vila Prudente,3\r\n" + 
					"#\r\n" + 
					"#Linha 3\r\n" + 
					"#\r\n" + 
					"Palmeiras-Barra Funda,Marechal Deodoro,3\r\n" + 
					"Marechal Deodoro,Santa Cec�lia,2\r\n" + 
					"Santa Cec�lia,Rep�blica,2\r\n" + 
					"Rep�blica,Anhangaba�,2\r\n" + 
					"Anhangaba�,S�,2\r\n" + 
					"S�,Pedro II,2\r\n" + 
					"Pedro II,Br�s,2\r\n" + 
					"Br�s,Bresser-Mooca,2\r\n" + 
					"Bresser-Mooca,Bel�m,3\r\n" + 
					"Bel�m,Tatuap�,3\r\n" + 
					"Tatuap�,Carr�o,3\r\n" + 
					"Carr�o,Penha,4\r\n" + 
					"Penha,Vila Matilde,2\r\n" + 
					"Vila Matilde,Guilhermina-Esperan�a,3\r\n" + 
					"Guilhermina-Esperan�a,Patriarca,3\r\n" + 
					"Patriarca,Artur Alvim,3\r\n" + 
					"Artur Alvim,Corinthians-Itaquera,3\r\n" + 
					"#\r\n" + 
					"#Linha 4\r\n" + 
					"#\r\n" + 
					"Luz,Rep�blica,2\r\n" + 
					"Rep�blica,Paulista,2\r\n" + 
					"Paulista,Faria Lima,2\r\n" + 
					"Faria Lima,Pinheiros,2\r\n" + 
					"Pinheiros,Butant�,2\r\n" + 
					"#\r\n" + 
					"#Linha 5\r\n" + 
					"#\r\n" + 
					"Cap�o Redondo,Campo Limpo,2\r\n" + 
					"Campo Limpo,Vila das Belezas,3\r\n" + 
					"Vila das Belezas,Giovanni Gronchi,3 \r\n" + 
					"Giovanni Gronchi,Santo Amaro,3\r\n" + 
					"Santo Amaro,Largo Treze,2\r\n" + 
					"#\r\n" + 
					"#Linha 7\r\n" + 
					"#\r\n" + 
					"Luz,Palmeiras-Barra Funda,5.5\r\n" + 
					"Palmeiras-Barra Funda,�gua Branca,4.5\r\n" + 
					"�gua Branca,Lapa,3.5\r\n" + 
					"Lapa,Piqueri,3\r\n" + 
					"Piqueri,Pirituba,3.5\r\n" + 
					"Pirituba,Vila Clarice,4.5\r\n" + 
					"Vila Clarice,Jaragu�,4.5\r\n" + 
					"Jaragu�,Perus,7\r\n" + 
					"Perus,Caieiras,5.5\r\n" + 
					"Caieiras,Franco da Rocha,8\r\n" + 
					"Franco da Rocha,Baltazar Fid�lis,3\r\n" + 
					"Baltazar Fid�lis,Francisco Morato,7.5\r\n" + 
					"#\r\n" + 
					"#Linha 8\r\n" + 
					"#\r\n" + 
					"J�lio Prestes,Palmeiras-Barra Funda,5.5\r\n" + 
					"Palmeiras-Barra Funda,Lapa,4\r\n" + 
					"Lapa,Domingos de Moraes,4.5\r\n" + 
					"Domingos de Moraes,Imperatriz Leopoldina,3\r\n" + 
					"Imperatriz Leopoldina,Presidente Altino,4\r\n" + 
					"Presidente Altino,Osasco,2.5\r\n" + 
					"Osasco,Comandante Sampaio,5.5\r\n" + 
					"Comandante Sampaio,Quita�na,2\r\n" + 
					"Quita�na,General Miguel Costa,2.5\r\n" + 
					"General Miguel Costa,Carapicu�ba,3.5\r\n" + 
					"Carapicu�ba,Santa Terezinha,3\r\n" + 
					"Santa Terezinha,Ant�nio Jo�o,2.5\r\n" + 
					"Ant�nio Jo�o,Barueri,2.5\r\n" + 
					"Barueri,Jardim Belval,4\r\n" + 
					"Jardim Belval,Jardim Silveira,2\r\n" + 
					"Jardim Silveira,Jandira,1.5\r\n" + 
					"Jandira,Sagrado Cora��o,3\r\n" + 
					"Sagrado Cora��o,Engenheiro Cardoso,2.5\r\n" + 
					"Engenheiro Cardoso,Itapevi,4\r\n" + 
					"#\r\n" + 
					"#Linha 9\r\n" + 
					"#\r\n" + 
					"Osasco,Presidente Altino,3.5,\r\n" + 
					"Presidente Altino,Ceasa,2.5\r\n" + 
					"Ceasa,Vila Lobos-Jaguar�,2\r\n" + 
					"Vila Lobos-Jaguar�,Cidade Universit�ria,3\r\n" + 
					"Cidade Universit�ria,Pinheiros,1.5,\r\n" + 
					"Pinheiros,Hebraica-Rebou�as,2,\r\n" + 
					"Hebraica-Rebou�as,Cidade Jardim,2\r\n" + 
					"Cidade Jardim,Vila Ol�mpia,2\r\n" + 
					"Vila Ol�mpia,Berrini,2\r\n" + 
					"Berrini,Morumbi,2\r\n" + 
					"Morumbi,Granja Julieta,2\r\n" + 
					"Granja Julieta,Santo Amaro,4\r\n" + 
					"Santo Amaro,Socorro,2\r\n" + 
					"Socorro,Jurubatuba,2.5\r\n" + 
					"Jurubatuba,Aut�dromo,3.5\r\n" + 
					"Aut�dromo,Primavera-Interlagos,3\r\n" + 
					"Primavera-Interlagos,Graja�,2.5\r\n" + 
					"#\r\n" + 
					"#Linha 10\r\n" + 
					"#\r\n" + 
					"Br�s,Mooca,4\r\n" + 
					"Mooca,Ipiranga,4.5\r\n" + 
					"Ipiranga,Tamanduate�,3\r\n" + 
					"Tamanduate�,S�o Caetano,4\r\n" + 
					"S�o Caetano,Utinga,4.5\r\n" + 
					"Utinga,Prefeito Saladino,2.5\r\n" + 
					"Prefeito Saladino,Santo Andr�,3.5\r\n" + 
					"Santo Andr�,Capuava,6\r\n" + 
					"Capuava,Mau�,4\r\n" + 
					"Mau�,Guapituba,6\r\n" + 
					"Guapituba,Ribeir�o Pires,5.5\r\n" + 
					"Ribeir�o Pires,Rio Grande da Serra,8\r\n" + 
					"#\r\n" + 
					"#Linha 11\r\n" + 
					"#\r\n" + 
					"Guaianases,Ant�nio Gianetti,6\r\n" + 
					"Ant�nio Gianetti,Ferraz de Vasconcelos,3\r\n" + 
					"Ferraz de Vasconcelos,Po�,4.5\r\n" + 
					"Po�,Calmon Viana,2.5\r\n" + 
					"Calmon Viana,Suzano,3.5\r\n" + 
					"Suzano,Jundiapeba,5.5\r\n" + 
					"Jundiapeba,Braz Cubas,3.5\r\n" + 
					"Braz Cubas,Mogi das Cruzes,5\r\n" + 
					"Mogi das Cruzes,Estudantes,3.5\r\n" + 
					"#\r\n" + 
					"#Linha 11 (expresso)\r\n" + 
					"#\r\n" + 
					"Luz,Br�s,5\r\n" + 
					"Br�s,Tatuap�,7,\r\n" + 
					"Tatuap�,Corinthians-Itaquera,12.5\r\n" + 
					"Corinthians-Itaquera,Dom Bosco,3.5\r\n" + 
					"Dom Bosco,Jos� Bonif�cio,3\r\n" + 
					"Jos� Bonif�cio,Guaianases,3\r\n" + 
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
