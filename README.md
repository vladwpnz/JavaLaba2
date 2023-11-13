# JavaLaba2
## An advanced system that allows the librarian to manage items (books, DVDs) and patrons.
You can: 
Add items (books, DVDs) to the library.
Remove items from the library.
Register a reader.
Issue the item to the reader.
Return the item to the library.
Show list of available items.
Show a list of taken items and their readers
# Project Structure
* Елемент - це загальний тип для всіх елементів, які можна знайти в бібліотеці. Він має такі атрибути, як назва, унікальний ідентифікатор та статус.
* Книга та DVD - це конкретні типи елементів, які реалізують загальний тип Елемент. Вони мають додаткові атрибути, які є унікальними для кожного типу елемента.
* Патрон - це людина, яка користується бібліотекою. Він має такі атрибути, як ім'я, унікальний ідентифікатор та список позичених елементів.
* IManageable - це інтерфейс, який визначає методи для керування елементами в бібліотеці.
* Бібліотека - це програма, яка реалізує інтерфейс IManageable. Вона використовується для керування елементами в бібліотеці.
