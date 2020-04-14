package by.htp.task.simpleclass.bean;
/*
 * 9. Создать класс Book, спецификация которого приведена ниже.
 *  Определить конструкторы, set- и get- методы и метод toString(). 
 *  Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и методами.
 *   Задать критерии выбора данных и вывести эти данные на консоль.
Book: id, название, автор(ы), издательство, год издания, количество страниц, 
цена, тип переплета.
Найти и вывести:
a) список книг заданного автора;
b) список книг, выпущенных заданным издательством;
c) список книг, выпущенных после заданного года.
 * 
 */

public class Book {



	{
		idGenerator++;
	}

	private static int idGenerator = 0;
	{
		idGenerator = idGenerator++;
	}
	private int id = idGenerator;

	private String name;
	private String author;
	private String publishHous;
	private int yearPublish;
	private int numberPages;
	private int cost;
	private String bindinType;

	public Book ( String name,String author, String publishHous,int yearPublish, int numberPages,int cost,String bindinType){
		this.name = name;      
		this.author=author;
		this.publishHous = publishHous;
		this.yearPublish = yearPublish;
		this.numberPages = numberPages;
		this.cost=  cost;
		this.bindinType = bindinType;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublishHous() {
		return publishHous;
	}

	public void setPublishHous(String publishHous) {
		this.publishHous = publishHous;
	}

	public int getYearPublish() {
		return yearPublish;
	}

	public void setYearPublish(int yearPublish) {
		this.yearPublish = yearPublish;
	}

	public int getNumberPages() {
		return numberPages;
	}

	public void setNumberPages(int numberPages) {
		this.numberPages = numberPages;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public String getBindinType() {
		return bindinType;
	}

	public void setBindinType(String bindinType) {
		this.bindinType = bindinType;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + ", publishHous=" + publishHous
				+ ", yearPublish=" + yearPublish + ", numberPages=" + numberPages + ", cost=" + cost + ", bindinType="
				+ bindinType + "]";
	}
	
	
}
