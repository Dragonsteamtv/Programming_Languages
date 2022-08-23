using System;

namespace Tutorial
{
    internal class Book
    {
        public string title;
        public string author;
        public string pages;
        public static string staticAttribute = "My Static Attribute";

        public Book(string aTitle, string aAuthor, int aPages) // Constructor for class (called when Object from class is created)
        { //        -> Arguments can be passed in so the constructor call can instantly pass in parameters, ((a)Tittle ) is a good way to show that it is an argument
            title = aTitle;
            author = aAuthor;
            pages = aPages.ToString();
            
        }
        // there can be multible constructors!!
        public void ReadBook()
        {
            Console.WriteLine($"Reading {this.title} by {this.author}");
        }
    }
}