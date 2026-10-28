class Book:
    def __init__(self, title, author, price):
        self.title = title
        self.author = author
        self.price = price

    def __str__(self):
        return f"Book: {self.title} / Author: {self.author} / Price: {self.price}"


class Ebook(Book):
    def __init__(self, title, author, price, file_size_mb):

        super().__init__(title, author, price)
        self.file_size_mb = file_size_mb

    def __str__(self):
    
        return super().__str__() + f" Size: {self.file_size_mb}MB"

class ROG:
    def __init__(self, product, price):
        self.product = product
        self.price = price

    def __str__(self):
        return f"Product:{self.product} // Price: PHP{self.price}"

class ElectronicProduct(ROG):
    def __init__(self, product, price, warranty):
        super().__init__(product, price)
        self.warranty = warranty

    def __str__(self):
        return super().__str__() + f" // Warranty:{self.warranty}"

class Laptop(ElectronicProduct):
    def __init__(self, product, price, warranty, ram_size, storage_size):
        super().__init__(product, price, warranty)
        self.ram_size = ram_size
        self.storage_size = storage_size

    def __str__(self):
        return super().__str__() + f" // RAM:{self.ram_size} // Storage:{self.storage_size}"

def main():
    books = [
        Book("How to program with AI", "Martin Santino", 2700.00),
        Ebook("How to destroy an AI datacenter", "Martin Santino", 3000.00, 4.5),
        Ebook("How to bomb an AI datacenter", "Martin Santino", 5000.00, 5.0,)
    ]
  
    rog_laptops = [
        Laptop("ROG ASUS", 5500.00, "1 year", "16.00 GB", "1.00 TB"),
        Laptop("Lenovo LOQ", 2500.00, "3 months", "8.00 GB", "250.00 GB")
    ]
     
    for book in books:
        print(book)
        
    print("="*23)
    
    for laptop in rog_laptops:
        print(laptop)

if __name__ == "__main__":
    main()