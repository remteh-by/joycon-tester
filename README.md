# Joy-Con / Pro Controller Tester 🔴

Android-приложение для тестирования контроллеров **Nintendo Joy-Con и Pro Controller**.

## Функции

- 🎮 Тестирование всех кнопок (B, A, Y, X, L/R, ZL/ZR, +/-, Home, Capture)
- 🕹️ Визуализация стиков с настройкой мёртвой зоны (AXIS_Z/RZ + фоллбек RX/RY)
- 🎯 Калибровка — min/max отслеживание + сброс
- 📊 Отображение триггеров ZL/ZR в реальном времени
- 🔊 Тестирование вибрации геймпада (короткая, средняя, длинная, паттерн)
- ⏱ Время удержания кнопок + счётчик нажатий
- 🐛 Raw Data дебаг для всех осей

## Установка

Скачайте APK из раздела [Releases](https://github.com/remteh-by/joycon-tester/releases).

## Разработка

```bash
# Сборка debug APK
./gradlew assembleDebug

# Сборка release APK + AAB
./gradlew assembleRelease bundleRelease
```

## Автор

**RemTeh.by** — [remteh-by](https://github.com/remteh-by)

## Лицензия

MIT License
