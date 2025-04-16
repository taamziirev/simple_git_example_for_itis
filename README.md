# Простой пример Git-репозитория с CI/CD

Этот репозиторий демонстрирует базовую структуру проекта на Kotlin с настроенным CI/CD-пайплайном.

## Структура проекта
- `src/` - исходный код
- `test/` - тесты
- `.github/workflows/` - конфигурация CI/CD-пайплайна
- `docs/` - статические файлы для GitHub Pages

## CI/CD-пайплайн
Пайплайн включает следующие этапы:
1. **Сборка** - компиляция проекта
2. **Тестирование** - запуск unit-тестов
3. **Деплоймент в тестовую среду** - деплой на GitHub Pages (тестовое окружение)
4. **Деплоймент в production** - деплой на production-сервер (требует ручного подтверждения)

## Демо-приложение
Демо-версия приложения доступна на GitHub Pages:
https://[username].github.io/simple_git_example_for_itis/staging/

## Процесс релиза
1. Разработчик делает коммит в ветку feature
2. Создается pull request в master
3. После прохождения CI и ревью, изменения мержатся в master
4. Автоматически запускается CI/CD-пайплайн
5. После успешных тестов происходит деплой в тестовую среду на GitHub Pages
6. Ручное подтверждение для релиза в production



//АВТОР: AMIR.T
