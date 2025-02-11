# cohort59-start-git-project
Учебный проект взаимодействия с git + 1

#4

# 1 Клонируем проект
git clone git@github.com:art-respublica/cohort59-start-git-project.git

# 2 Создаем структуру проекта
Добавляем 4 папки src/main/java..,
модифицируем project structure,
создаем пакет ru.practicum.javadeveloper.cohort59

# 3 Создаем новую ветку
git checkout -b dishes-constructor

# 4 Проверим текущую ветку
git branch

# 5 Добавляем все измененные файлы в отслеживаемые
git add .

# 6 Посмотрим список уделенных репозиториев
git remote -v

# 7 Поместим наши изменения в локальный репозиторий
git status
git commit -m "First changes"

# 8 Поместим последние коммиты в удаленный репозиторий
git fetch origin
git push origin dishes-constructor

# 9 Создать pull request
В репозитории на github



