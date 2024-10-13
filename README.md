# qa_java
QA Java Project


#### Для формирования отчета jacoco:
mvn clean test (запускаем тесты)

/c/Program\ Files/apache-maven-3.9.8/bin/mvn.cmd jacoco:report (для указания пути мавен и создания отчета)

cd target/site/jacoco (переходим в ветку таргет)

explorer.exe index.html (открываем отчет в браузере)

#### Для отчета если мавен правильно натроен в переменной окружения:
mvn clean test

mvn jacoco:report