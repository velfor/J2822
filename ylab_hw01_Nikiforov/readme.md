# Wallet service

Необходимо создать сервис, который управляет кредитными/дебетовыми транзакциями от имени игроков.
Денежный счет содержит текущий баланс игрока. Баланс можно изменить, зарегистрировав транзакции на счете, либо дебетовые транзакции (удаление средств), 
либо кредитные транзакции (добавление средств). Создайте реализацию на Collection framework и консольном вводе-выводе, которая соответствует описанным ниже требованиям и ограничениям. 

Требования:
1. Вывод текущего баланса игрока
2. Дебет/снятие средств для каждого игрока 
Дебетовая транзакция будет успешной только в том случае, если на счету достаточно средств (баланс - сумма дебета >= 0). 
Вызывающая сторона предоставит идентификатор транзакции, который должен быть уникальным для всех транзакций. 
Если идентификатор транзакции не уникален, операция должна завершиться ошибкой.
3. Кредит/пополнение на игрока.
Вызывающая сторона предоставит идентификатор транзакции, который должен быть уникальным для всех транзакций.
Если идентификатор транзакции не уникален, операция должна завершиться ошибкой.
4. Просмотр истории пополнения/снятия средств игроком

Интерфейс взаимодействия с пользователем - консоль

Нефункциональные требования:
- unit-тестирование