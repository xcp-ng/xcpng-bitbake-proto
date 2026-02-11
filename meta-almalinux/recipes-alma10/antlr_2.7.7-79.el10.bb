
PN = "antlr"
PE = "0"
PV = "2.7.7"
PR = "79.el10"
PACKAGES = "antlr-tool antlr-C++ antlr-javadoc antlr-manual"


URI_antlr-tool = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/antlr-tool-2.7.7-79.el10.noarch.rpm;unpack=0"
RDEPENDS:antlr-tool = "/usr/bin/sh ( ) javapackages-filesystem ( ) javapackages-tools ( )"
RPROVIDES:antlr-tool = "antlr ( =  2.7.7-79.el10) antlr-tool ( =  2.7.7-79.el10) mvn(antlr:antlr) ( =  2.7.7) mvn(antlr:antlr:pom:) ( =  2.7.7) mvn(antlr:antlrall) ( =  2.7.7) mvn(antlr:antlrall:pom:) ( =  2.7.7)"

URI_antlr-C++ = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/antlr-C++-2.7.7-79.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:antlr-C++ = "/usr/bin/sh ( )"
RPROVIDES:antlr-C++ = "antlr-C++ ( =  2.7.7-79.el10) antlr-C++(x86-64) ( =  2.7.7-79.el10) antlr-static ( =  2.7.7-79.el10)"

URI_antlr-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/antlr-javadoc-2.7.7-79.el10.noarch.rpm;unpack=0"
RDEPENDS:antlr-javadoc = "javapackages-filesystem ( )"
RPROVIDES:antlr-javadoc = "antlr-javadoc ( =  2.7.7-79.el10)"

URI_antlr-manual = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/antlr-manual-2.7.7-79.el10.noarch.rpm;unpack=0"
RDEPENDS:antlr-manual = ""
RPROVIDES:antlr-manual = "antlr-manual ( =  2.7.7-79.el10)"
