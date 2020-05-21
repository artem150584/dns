Jsvs + Cucumber + Selenide


"C:\Program Files\Java\jdk1.8.0_144\bin\java.exe" -ea -Didea.test.cyclic.buffer.size=1048576 "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2018.1.5\lib\idea_rt.jar=53861:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2018.1.5\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2018.1.5\lib\idea_rt.jar;C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2018.1.5\plugins\junit\lib\junit-rt.jar;C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2018.1.5\plugins\junit\lib\junit5-rt.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\rt.jar;E:\java\dns\target\test-classes;E:\java\dns\target\classes;C:\Users\artem\.m2\repository\junit\junit\4.12\junit-4.12.jar;C:\Users\artem\.m2\repository\org\hamcrest\hamcrest-core\1.3\hamcrest-core-1.3.jar;C:\Users\artem\.m2\repository\com\codeborne\selenide\5.11.1\selenide-5.11.1.jar;C:\Users\artem\.m2\repository\org\seleniumhq\selenium\selenium-java\3.141.59\selenium-java-3.141.59.jar;C:\Users\artem\.m2\repository\org\seleniumhq\selenium\selenium-api\3.141.59\selenium-api-3.141.59.jar;C:\Users\artem\.m2\repository\org\seleniumhq\selenium\selenium-chrome-driver\3.141.59\selenium-chrome-driver-3.141.59.jar;C:\Users\artem\.m2\repository\org\seleniumhq\selenium\selenium-edge-driver\3.141.59\selenium-edge-driver-3.141.59.jar;C:\Users\artem\.m2\repository\org\seleniumhq\selenium\selenium-firefox-driver\3.141.59\selenium-firefox-driver-3.141.59.jar;C:\Users\artem\.m2\repository\org\seleniumhq\selenium\selenium-ie-driver\3.141.59\selenium-ie-driver-3.141.59.jar;C:\Users\artem\.m2\repository\org\seleniumhq\selenium\selenium-opera-driver\3.141.59\selenium-opera-driver-3.141.59.jar;C:\Users\artem\.m2\repository\org\seleniumhq\selenium\selenium-remote-driver\3.141.59\selenium-remote-driver-3.141.59.jar;C:\Users\artem\.m2\repository\org\seleniumhq\selenium\selenium-safari-driver\3.141.59\selenium-safari-driver-3.141.59.jar;C:\Users\artem\.m2\repository\org\seleniumhq\selenium\selenium-support\3.141.59\selenium-support-3.141.59.jar;C:\Users\artem\.m2\repository\org\apache\commons\commons-exec\1.3\commons-exec-1.3.jar;C:\Users\artem\.m2\repository\com\google\guava\guava\25.0-jre\guava-25.0-jre.jar;C:\Users\artem\.m2\repository\com\google\code\findbugs\jsr305\1.3.9\jsr305-1.3.9.jar;C:\Users\artem\.m2\repository\org\checkerframework\checker-compat-qual\2.0.0\checker-compat-qual-2.0.0.jar;C:\Users\artem\.m2\repository\com\google\errorprone\error_prone_annotations\2.1.3\error_prone_annotations-2.1.3.jar;C:\Users\artem\.m2\repository\com\google\j2objc\j2objc-annotations\1.1\j2objc-annotations-1.1.jar;C:\Users\artem\.m2\repository\org\codehaus\mojo\animal-sniffer-annotations\1.14\animal-sniffer-annotations-1.14.jar;C:\Users\artem\.m2\repository\com\squareup\okhttp3\okhttp\3.11.0\okhttp-3.11.0.jar;C:\Users\artem\.m2\repository\com\squareup\okio\okio\1.14.0\okio-1.14.0.jar;C:\Users\artem\.m2\repository\io\github\bonigarcia\webdrivermanager\3.8.1\webdrivermanager-3.8.1.jar;C:\Users\artem\.m2\repository\commons-io\commons-io\2.6\commons-io-2.6.jar;C:\Users\artem\.m2\repository\com\google\code\gson\gson\2.8.5\gson-2.8.5.jar;C:\Users\artem\.m2\repository\org\apache\commons\commons-lang3\3.8.1\commons-lang3-3.8.1.jar;C:\Users\artem\.m2\repository\org\apache\httpcomponents\httpclient\4.5.6\httpclient-4.5.6.jar;C:\Users\artem\.m2\repository\org\apache\httpcomponents\httpcore\4.4.10\httpcore-4.4.10.jar;C:\Users\artem\.m2\repository\commons-logging\commons-logging\1.2\commons-logging-1.2.jar;C:\Users\artem\.m2\repository\commons-codec\commons-codec\1.10\commons-codec-1.10.jar;C:\Users\artem\.m2\repository\org\rauschig\jarchivelib\1.0.0\jarchivelib-1.0.0.jar;C:\Users\artem\.m2\repository\org\apache\commons\commons-compress\1.18\commons-compress-1.18.jar;C:\Users\artem\.m2\repository\org\jsoup\jsoup\1.11.3\jsoup-1.11.3.jar;C:\Users\artem\.m2\repository\org\slf4j\slf4j-api\1.7.30\slf4j-api-1.7.30.jar;C:\Users\artem\.m2\repository\info\cukes\cucumber-java\1.2.4\cucumber-java-1.2.4.jar;C:\Users\artem\.m2\repository\info\cukes\cucumber-core\1.2.4\cucumber-core-1.2.4.jar;C:\Users\artem\.m2\repository\info\cukes\cucumber-html\0.2.3\cucumber-html-0.2.3.jar;C:\Users\artem\.m2\repository\info\cukes\cucumber-jvm-deps\1.0.5\cucumber-jvm-deps-1.0.5.jar;C:\Users\artem\.m2\repository\info\cukes\gherkin\2.12.2\gherkin-2.12.2.jar;C:\Users\artem\.m2\repository\info\cukes\cucumber-junit\1.2.4\cucumber-junit-1.2.4.jar" com.intellij.rt.execution.junit.JUnitStarter -ideVersion5 -junit4 TestRunner
мая 21, 2020 11:27:57 PM pages.Dns click
INFO: Click on: Компьютеры
мая 21, 2020 11:28:02 PM pages.Dns click
INFO: Click on: Компьютеры, ноутбуки и ПО
мая 21, 2020 11:28:04 PM pages.Dns click

INFO: Click on: Системные блоки
мая 21, 2020 11:28:06 PM pages.Dns sortBy
INFO: Sorting by: По убыванию цены
мая 21, 2020 11:28:07 PM pages.Dns findItem
INFO: Looking for 3 element from beginnig
мая 21, 2020 11:28:09 PM pages.Dns click
INFO: Click on: Характеристики
мая 21, 2020 11:28:11 PM pages.Dns saveMainframeCharacter
INFO: Name: Lenovo Legion T730-28ICO [90JF00EMRS]
мая 21, 2020 11:28:11 PM pages.Dns saveMainframeCharacter
INFO: Price: 149 999
мая 21, 2020 11:28:11 PM pages.Dns saveMainframeCharacter
INFO: Warranty: 12 мес.
мая 21, 2020 11:28:11 PM pages.Dns saveMainframeCharacter
INFO: Operation System : Windows 10 Домашняя
мая 21, 2020 11:28:11 PM pages.Dns saveMainframeCharacter
INFO: CPU model: Core i7 9700K
мая 21, 2020 11:28:11 PM pages.Dns saveMainframeCharacter
INFO: CPU number: 8
мая 21, 2020 11:28:11 PM pages.Dns saveMainframeCharacter
INFO: CPU Clock Speed : 3600 МГц
мая 21, 2020 11:28:11 PM pages.Dns saveMainframeCharacter
INFO: Video card model: GeForce RTX 2070 SUPER
мая 21, 2020 11:28:12 PM pages.Dns saveMainframeCharacter
INFO: Video card memory: 8192 МБ
мая 21, 2020 11:28:12 PM pages.Dns saveMainframeCharacter
INFO: RAM type: DDR4
мая 21, 2020 11:28:12 PM pages.Dns saveMainframeCharacter
INFO: RAM size: 16 ГБ
мая 21, 2020 11:28:12 PM pages.Dns saveMainframeCharacter
INFO: HDD size: 1 ТБ
мая 21, 2020 11:28:12 PM pages.Dns saveMainframeCharacter
INFO: SDD size: 256 ГБ
мая 21, 2020 11:28:12 PM pages.Dns openPage
INFO: Opening https://dns-shop.ru/

мая 21, 2020 11:28:13 PM pages.Dns click
INFO: Click on: Компьютеры
мая 21, 2020 11:28:15 PM pages.Dns click
INFO: Click on: Компьютеры, ноутбуки и ПО
[1590078496.275][SEVERE]: Timed out receiving message from renderer: 0.100
мая 21, 2020 11:28:16 PM pages.Dns click

INFO: Click on: Системные блоки
мая 21, 2020 11:28:17 PM pages.Dns sortBy
INFO: Sorting by: По возрастанию цены
мая 21, 2020 11:28:19 PM pages.Dns goToTheLastPage
INFO: Open the last page
мая 21, 2020 11:28:19 PM pages.Dns findItem
INFO: Looking for 3 element from ending
мая 21, 2020 11:28:22 PM pages.Dns click
INFO: Click on: Характеристики
мая 21, 2020 11:28:23 PM pages.Dns saveMainframeCharacter
INFO: Name: Lenovo Legion T730-28ICO [90JF00EMRS]
мая 21, 2020 11:28:24 PM pages.Dns saveMainframeCharacter
INFO: Price: 149 999
мая 21, 2020 11:28:24 PM pages.Dns saveMainframeCharacter
INFO: Warranty: 12 мес.
мая 21, 2020 11:28:24 PM pages.Dns saveMainframeCharacter
INFO: Operation System : Windows 10 Домашняя
мая 21, 2020 11:28:24 PM pages.Dns saveMainframeCharacter
INFO: CPU model: Core i7 9700K
мая 21, 2020 11:28:24 PM pages.Dns saveMainframeCharacter
INFO: CPU number: 8
мая 21, 2020 11:28:24 PM pages.Dns saveMainframeCharacter
INFO: CPU Clock Speed : 3600 МГц
мая 21, 2020 11:28:24 PM pages.Dns saveMainframeCharacter
INFO: Video card model: GeForce RTX 2070 SUPER
мая 21, 2020 11:28:24 PM pages.Dns saveMainframeCharacter
INFO: Video card memory: 8192 МБ
мая 21, 2020 11:28:25 PM pages.Dns saveMainframeCharacter
INFO: RAM type: DDR4
мая 21, 2020 11:28:26 PM pages.Dns saveMainframeCharacter
INFO: RAM size: 16 ГБ
мая 21, 2020 11:28:26 PM pages.Dns saveMainframeCharacter
INFO: HDD size: 1 ТБ
мая 21, 2020 11:28:26 PM pages.Dns saveMainframeCharacter
INFO: SDD size: 256 ГБ
мая 21, 2020 11:28:26 PM pages.Dns compareMainframeCharacters
INFO: Characters are matches!

1 Scenarios (1 passed)
18 Steps (18 passed)
0m39,646s

мая 21, 2020 11:27:47 PM pages.Dns openPage
INFO: Opening https://dns-shop.ru/
