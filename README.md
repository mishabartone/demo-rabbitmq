В данном проекте реализован микроскрвис с использованием Docker, Spring Boot, RabbitMQ.

Микросервис схематично:
**Producer -> Exchange -> Queue** (String / JSON) -> **Consumer** (String / JSON)

Запросы отправляются через **Postman**.
