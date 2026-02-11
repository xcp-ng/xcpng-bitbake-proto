
PN = "objectweb-asm"
PE = "0"
PV = "9.6"
PR = "6.el10"
PACKAGES = "objectweb-asm objectweb-asm-javadoc"


URI_objectweb-asm = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/objectweb-asm-9.6-6.el10.noarch.rpm;unpack=0"
RDEPENDS:objectweb-asm = "/usr/bin/bash ( ) javapackages-filesystem ( ) javapackages-tools ( )"
RPROVIDES:objectweb-asm = "jpms(org.objectweb.asm) ( =  9.6) jpms(org.objectweb.asm.commons) ( =  9.6) jpms(org.objectweb.asm.tree) ( =  9.6) jpms(org.objectweb.asm.tree.analysis) ( =  9.6) jpms(org.objectweb.asm.util) ( =  9.6) mvn(org.ow2.asm:asm) ( =  9.6) mvn(org.ow2.asm:asm-analysis) ( =  9.6) mvn(org.ow2.asm:asm-analysis:pom:) ( =  9.6) mvn(org.ow2.asm:asm-commons) ( =  9.6) mvn(org.ow2.asm:asm-commons:pom:) ( =  9.6) mvn(org.ow2.asm:asm-tree) ( =  9.6) mvn(org.ow2.asm:asm-tree:pom:) ( =  9.6) mvn(org.ow2.asm:asm-util) ( =  9.6) mvn(org.ow2.asm:asm-util:pom:) ( =  9.6) mvn(org.ow2.asm:asm:pom:) ( =  9.6) objectweb-asm ( =  9.6-6.el10)"

URI_objectweb-asm-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/objectweb-asm-javadoc-9.6-6.el10.noarch.rpm;unpack=0"
RDEPENDS:objectweb-asm-javadoc = "javapackages-filesystem ( )"
RPROVIDES:objectweb-asm-javadoc = "objectweb-asm-javadoc ( =  9.6-6.el10)"
