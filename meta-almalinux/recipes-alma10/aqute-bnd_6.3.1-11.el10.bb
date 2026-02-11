
PN = "aqute-bnd"
PE = "0"
PV = "6.3.1"
PR = "11.el10"
PACKAGES = "aqute-bnd aqute-bnd-javadoc aqute-bndlib"


URI_aqute-bnd = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/aqute-bnd-6.3.1-11.el10.noarch.rpm;unpack=0"
RDEPENDS:aqute-bnd = "javapackages-filesystem ( ) /usr/bin/bash ( ) mvn(org.slf4j:slf4j-api) ( ) javapackages-tools ( ) mvn(org.apache.ant:ant) ( ) mvn(org.osgi:osgi.annotation) ( ) mvn(org.slf4j:slf4j-simple) ( ) mvn(biz.aQute.bnd:aQute.libg) ( =  6.3.1) mvn(biz.aQute.bnd:biz.aQute.bndlib) ( =  6.3.1)"
RPROVIDES:aqute-bnd = "mvn(biz.aQute.bnd:biz.aQute.bnd.util) ( =  6.3.1) aqute-bnd ( =  6.3.1-11.el10) config(aqute-bnd) ( =  6.3.1-11.el10) mvn(biz.aQute.bnd:biz.aQute.bnd) ( =  6.3.1) mvn(biz.aQute.bnd:biz.aQute.bnd.ant) ( =  6.3.1) mvn(biz.aQute.bnd:biz.aQute.bnd.ant:pom:) ( =  6.3.1) mvn(biz.aQute.bnd:biz.aQute.bnd.util:pom:) ( =  6.3.1) mvn(biz.aQute.bnd:biz.aQute.bnd:pom:) ( =  6.3.1) mvn(biz.aQute.bnd:bnd) ( =  6.3.1) mvn(biz.aQute.bnd:bnd:pom:) ( =  6.3.1) mvn(biz.aQute:bnd) ( =  6.3.1) mvn(biz.aQute:bnd:pom:) ( =  6.3.1)"

URI_aqute-bnd-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/aqute-bnd-javadoc-6.3.1-11.el10.noarch.rpm;unpack=0"
RDEPENDS:aqute-bnd-javadoc = "javapackages-filesystem ( )"
RPROVIDES:aqute-bnd-javadoc = "aqute-bnd-javadoc ( =  6.3.1-11.el10)"

URI_aqute-bndlib = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/aqute-bndlib-6.3.1-11.el10.noarch.rpm;unpack=0"
RDEPENDS:aqute-bndlib = "javapackages-filesystem ( ) mvn(org.slf4j:slf4j-api) ( ) mvn(org.osgi:osgi.annotation) ( ) mvn(org.osgi:osgi.cmpn) ( ) mvn(org.osgi:osgi.core) ( ) mvn(biz.aQute.bnd:biz.aQute.bnd.util) ( =  6.3.1)"
RPROVIDES:aqute-bndlib = "mvn(biz.aQute.bnd:aQute.libg) ( =  6.3.1) mvn(biz.aQute.bnd:biz.aQute.bndlib) ( =  6.3.1) aqute-bndlib ( =  6.3.1-11.el10) mvn(biz.aQute.bnd:aQute.libg:pom:) ( =  6.3.1) mvn(biz.aQute.bnd:biz.aQute.bnd.annotation) ( =  6.3.1) mvn(biz.aQute.bnd:biz.aQute.bnd.annotation:pom:) ( =  6.3.1) mvn(biz.aQute.bnd:biz.aQute.bndlib:pom:) ( =  6.3.1) mvn(biz.aQute.bnd:bndlib) ( =  6.3.1) mvn(biz.aQute.bnd:bndlib:pom:) ( =  6.3.1) mvn(biz.aQute:bndlib) ( =  6.3.1) mvn(biz.aQute:bndlib:pom:) ( =  6.3.1)"
