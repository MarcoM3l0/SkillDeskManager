package controller;

import model.Livro;

public class Acervo {
	
	private Livro[] livro;

	public void preencher() {
		setLivro(new Livro[] {
				new Livro("100", "Engenharia de Software", "Addison-Wesley", "Ian Sommervile", "6a", "2000", 5, "Disponível"),
				new Livro("101", "UML - Guia do Usuário", "Campus", "Grady Booch, James Rumbaugh, Ivar Jacobson", "7a", "2000", 3, "Disponível"),
				new Livro("200", "Code Complete", "Microsoft Press", "Steve McConnell", "2a", "2014", 2, "Disponível"),
				new Livro("201", "Agile Software Development", "Prentice Hall", "Robert Martin", "1a", "2002", 4, "Disponível"),
				new Livro("300", "Refactoring: Improving the Design of Existing Code", "Addison-Wesley Professional", "Martin Fowler", "1a", "1999", 1, "Disponível"),
				new Livro("301", "Software Metrics: A Rigorous and Practical Approach", "CRC Press", "Norman Fenton, James Bieman", "3a", "2014", 5, "Disponível"),
				new Livro("400", "Design Patterns: Elements of Reusable Object-Oriented Software", "Addison-Wesley Professional", "Erich Gamma, Richard Helm, Ralph Johnson, John Vlissides", "1a", "1994", 3, "Disponível"),
				new Livro("401", "UML Distilled: A Brief Guide to the Standard Object Modeling Language", "Addison-Wesley Professional", "Martin Fowler", "3a", "2003", 2, "Disponível")
		});
		
	}


	public Livro[] getLivro() {
		return livro;
	}

	public void setLivro(Livro[] livro) {
		this.livro = livro;
	}
	
}
