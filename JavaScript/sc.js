class btnClass {
    constructor(text, onClick) {
      this.text = text;
      this.onClick = onClick;
      this.element = document.createElement('button');
      this.element.innerText = text;
      this.element.addEventListener('click', onClick);
    }
    
    render(parentElement) {
      parentElement.appendChild(this.element);
    }
  }

  // Создаем экземпляр класса btnClass
const myButton = new btnClass('Нажми меня', () => {
    alert('Вы нажали на кнопку!');
  });
  
  // Находим родительский элемент, куда нужно добавить кнопку
  const parentElement = document.querySelector('#myDiv');
  
  // Добавляем кнопку в родительский элемент
  myButton.render(parentElement);