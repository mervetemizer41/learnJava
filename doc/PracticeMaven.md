### Practice Maven

#### What I have done in general?
I added Zemberek library to my simple and getting started maven project.

#### What is the aim?
Getting a working project which needs an external library is the purpose. Main project should have been generated using mvn command and of course it should contain a pom.xml.
To be clear base project have to be a maven project. After that we call the libreries the external code projects as dependencies. In this project, I need a Turkish morphologic analyzer and its methods. Thus the dependecies should be added into the pom.xml within dependencies section.


#### Let's start!

Grabbing a maven project is as simple as a single command:

```
mvn archetype:generate -DgroupId=com.mervetemizer41.zemberek_kullan.uyg -DartifactId=z_uyg -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4 -DinteractiveMode=false
```

If everything is ok ok after running this on a powershell on Windows or terminal on Linux, then congratulations, you have grabbed a new maven project.

If you want to run it

```
mvn exec:java -D exec.mainClass=com.mervetemizer41.zemberek_kullan.uyg.App
```

Below is the App file I modified:

```
package com.mervetemizer41.zemberek_kullan.uyg;


import zemberek.morphology.TurkishMorphology;
import zemberek.morphology.analysis.WordAnalysis;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Zemberek'e hoşgeldiniz!" );

	TurkishMorphology morphology = TurkishMorphology.createWithDefaults();
	WordAnalysis results = morphology.analyze("kalemin");
	results.forEach(s -> System.out.println(s.formatLong()));
    }
}
```
Also below is the parts to be added into pom.xml

```
<dependencies>
...
	<dependency>
            <groupId>zemberek-nlp</groupId>
            <artifactId>zemberek-morphology</artifactId>
            <version>0.17.1</version>
        </dependency>
...
  </dependencies>

    <repositories>
        <repository>
            <id>zemberek-repo</id>
            <name>zemberek Maven Repo on Github</name>
            <url>https://raw.github.com/ahmetaa/maven-repo/master</url>
        </repository>
    </repositories>

```
