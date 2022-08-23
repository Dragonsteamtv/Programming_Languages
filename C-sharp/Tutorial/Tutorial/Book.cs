using System;

namespace Tutorial
{
    internal class Book
    {
        public string title;
        public string author;
        public static string staticAttribute = "My Static Attribute";
        public void ReadBook()
        {
            Console.WriteLine($"Reading {this.title} by {this.author}");
        }
    }
}