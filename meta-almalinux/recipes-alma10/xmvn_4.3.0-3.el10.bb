
PN = "xmvn"
PE = "0"
PV = "4.3.0"
PR = "3.el10"
PACKAGES = "xmvn xmvn-core xmvn-javadoc xmvn-minimal xmvn-mojo xmvn-toolchain-openjdk21 xmvn-tools"


URI_xmvn = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/xmvn-4.3.0-3.el10.noarch.rpm;unpack=0"
RDEPENDS:xmvn = "maven ( ) xmvn-minimal ( =  4.3.0-3.el10)"
RPROVIDES:xmvn = "xmvn ( =  4.3.0-3.el10)"

URI_xmvn-core = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/xmvn-core-4.3.0-3.el10.noarch.rpm;unpack=0"
RDEPENDS:xmvn-core = "javapackages-filesystem ( )"
RPROVIDES:xmvn-core = "mvn(org.fedoraproject.xmvn:xmvn-api) ( =  4.3.0) mvn(org.fedoraproject.xmvn:xmvn-core) ( =  4.3.0) xmvn-core ( =  4.3.0-3.el10) mvn(org.fedoraproject.xmvn:xmvn-api:pom:) ( =  4.3.0) mvn(org.fedoraproject.xmvn:xmvn-core:pom:) ( =  4.3.0) mvn(org.fedoraproject.xmvn:xmvn-parent:pom:) ( =  4.3.0)"

URI_xmvn-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/xmvn-javadoc-4.3.0-3.el10.noarch.rpm;unpack=0"
RDEPENDS:xmvn-javadoc = ""
RPROVIDES:xmvn-javadoc = "xmvn-javadoc ( =  4.3.0-3.el10)"

URI_xmvn-minimal = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/xmvn-minimal-4.3.0-3.el10.noarch.rpm;unpack=0"
RDEPENDS:xmvn-minimal = "javapackages-filesystem ( ) /usr/bin/sh ( ) mvn(org.slf4j:slf4j-api) ( ) mvn(org.ow2.asm:asm) ( ) google-guice ( ) slf4j ( ) mvn(com.beust:jcommander) ( ) mvn(org.apache.commons:commons-compress) ( ) guava ( ) mvn(org.slf4j:slf4j-simple) ( ) apache-commons-cli ( ) atinject ( ) maven-jdk-binding ( ) maven-resolver ( ) maven-wagon ( ) plexus-cipher ( ) plexus-classworlds ( ) plexus-interpolation ( ) plexus-sec-dispatcher ( ) plexus-utils ( ) sisu ( ) maven-lib ( ) plexus-containers-component-annotations ( ) mvn(org.fedoraproject.xmvn:xmvn-api) ( =  4.3.0) mvn(org.fedoraproject.xmvn:xmvn-core) ( =  4.3.0) xmvn-core ( =  4.3.0-3.el10) mvn(org.fedoraproject.xmvn:xmvn-install) ( =  4.3.0) mvn(org.fedoraproject.xmvn:xmvn-resolve) ( =  4.3.0) mvn(org.fedoraproject.xmvn:xmvn-subst) ( =  4.3.0)"
RPROVIDES:xmvn-minimal = "xmvn-minimal ( =  4.3.0-3.el10) mvn(org.fedoraproject.xmvn:xmvn-connector) ( =  4.3.0) mvn(org.fedoraproject.xmvn:xmvn-connector:pom:) ( =  4.3.0) mvn(org.fedoraproject.xmvn:xmvn:pom:) ( =  4.3.0)"

URI_xmvn-mojo = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/xmvn-mojo-4.3.0-3.el10.noarch.rpm;unpack=0"
RDEPENDS:xmvn-mojo = "javapackages-filesystem ( ) mvn(org.ow2.asm:asm) ( ) mvn(org.apache.maven.resolver:maven-resolver-util) ( ) mvn(org.fedoraproject.xmvn:xmvn-api) ( =  4.3.0) mvn(org.fedoraproject.xmvn:xmvn-core) ( =  4.3.0)"
RPROVIDES:xmvn-mojo = "mvn(org.fedoraproject.xmvn:xmvn-mojo) ( =  4.3.0) mvn(org.fedoraproject.xmvn:xmvn-mojo:pom:) ( =  4.3.0) xmvn-mojo ( =  4.3.0-3.el10)"

URI_xmvn-toolchain-openjdk21 = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/xmvn-toolchain-openjdk21-4.3.0-3.el10.noarch.rpm;unpack=0"
RDEPENDS:xmvn-toolchain-openjdk21 = "javapackages-tools ( ) java-21-openjdk-devel ( ) xmvn-minimal ( )"
RPROVIDES:xmvn-toolchain-openjdk21 = "xmvn-toolchain-openjdk21 ( =  4.3.0-3.el10)"

URI_xmvn-tools = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/xmvn-tools-4.3.0-3.el10.noarch.rpm;unpack=0"
RDEPENDS:xmvn-tools = "javapackages-filesystem ( ) /usr/bin/bash ( ) mvn(org.slf4j:slf4j-api) ( ) mvn(org.ow2.asm:asm) ( ) mvn(com.beust:jcommander) ( ) mvn(org.apache.commons:commons-compress) ( ) mvn(org.slf4j:slf4j-simple) ( ) mvn(org.fedoraproject.xmvn:xmvn-api) ( =  4.3.0) mvn(org.fedoraproject.xmvn:xmvn-core) ( =  4.3.0)"
RPROVIDES:xmvn-tools = "mvn(org.fedoraproject.xmvn:xmvn-install) ( =  4.3.0) mvn(org.fedoraproject.xmvn:xmvn-resolve) ( =  4.3.0) mvn(org.fedoraproject.xmvn:xmvn-subst) ( =  4.3.0) mvn(org.fedoraproject.xmvn:xmvn-install:pom:) ( =  4.3.0) mvn(org.fedoraproject.xmvn:xmvn-resolve:pom:) ( =  4.3.0) mvn(org.fedoraproject.xmvn:xmvn-subst:pom:) ( =  4.3.0) mvn(org.fedoraproject.xmvn:xmvn-tools:pom:) ( =  4.3.0) xmvn-tools ( =  4.3.0-3.el10)"
