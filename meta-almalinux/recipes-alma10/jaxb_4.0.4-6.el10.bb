
PN = "jaxb"
PE = "0"
PV = "4.0.4"
PR = "6.el10"
PACKAGES = "jaxb-codemodel jaxb-core jaxb-relaxng-datatype jaxb-rngom jaxb-runtime jaxb-txw2 jaxb-xjc jaxb-xsom jaxb-codemodel-annotation-compiler jaxb-txwc2"


URI_jaxb-codemodel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/jaxb-codemodel-4.0.4-6.el10.noarch.rpm;unpack=0"
RDEPENDS:jaxb-codemodel = "javapackages-filesystem ( )"
RPROVIDES:jaxb-codemodel = "mvn(org.glassfish.jaxb:codemodel) ( =  4.0.4) jaxb-codemodel ( =  4.0.4-6.el10) jpms(com.sun.codemodel) ( =  4.0.4) mvn(org.glassfish.jaxb:codemodel:pom:) ( =  4.0.4) osgi(org.glassfish.jaxb.codemodel) ( =  4.0.4)"

URI_jaxb-core = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/jaxb-core-4.0.4-6.el10.noarch.rpm;unpack=0"
RDEPENDS:jaxb-core = "javapackages-filesystem ( ) mvn(jakarta.activation:jakarta.activation-api) ( ) mvn(com.sun.istack:istack-commons-runtime) ( ) mvn(jakarta.xml.bind:jakarta.xml.bind-api) ( ) mvn(org.glassfish.jaxb:txw2) ( =  4.0.4)"
RPROVIDES:jaxb-core = "mvn(org.glassfish.jaxb:jaxb-core) ( =  4.0.4) jaxb-core ( =  4.0.4-6.el10) jpms(org.glassfish.jaxb.core) ( =  4.0.4) mvn(org.glassfish.jaxb:jaxb-core:pom:) ( =  4.0.4) osgi(org.glassfish.jaxb.core) ( =  4.0.4)"

URI_jaxb-relaxng-datatype = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/jaxb-relaxng-datatype-4.0.4-6.el10.noarch.rpm;unpack=0"
RDEPENDS:jaxb-relaxng-datatype = "javapackages-filesystem ( )"
RPROVIDES:jaxb-relaxng-datatype = "mvn(com.sun.xml.bind.external:relaxng-datatype) ( =  4.0.4) jaxb-relaxng-datatype ( =  4.0.4-6.el10) jpms(com.sun.tools.rngdatatype) ( =  4.0.4) mvn(com.sun.xml.bind.external:relaxng-datatype:pom:) ( =  4.0.4) osgi(com.sun.xml.bind.external.relaxng-datatype) ( =  4.0.4)"

URI_jaxb-rngom = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/jaxb-rngom-4.0.4-6.el10.noarch.rpm;unpack=0"
RDEPENDS:jaxb-rngom = "javapackages-filesystem ( ) mvn(com.sun.xml.bind.external:relaxng-datatype) ( =  4.0.4)"
RPROVIDES:jaxb-rngom = "mvn(com.sun.xml.bind.external:rngom) ( =  4.0.4) jaxb-rngom ( =  4.0.4-6.el10) jpms(com.sun.tools.rngom) ( =  4.0.4) mvn(com.sun.xml.bind.external:rngom:pom:) ( =  4.0.4) osgi(com.sun.xml.bind.external.rngom) ( =  4.0.4)"

URI_jaxb-runtime = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/jaxb-runtime-4.0.4-6.el10.noarch.rpm;unpack=0"
RDEPENDS:jaxb-runtime = "javapackages-filesystem ( ) mvn(org.glassfish.jaxb:jaxb-core) ( =  4.0.4)"
RPROVIDES:jaxb-runtime = "jaxb-runtime ( =  4.0.4-6.el10) jpms(org.glassfish.jaxb.runtime) ( =  4.0.4) mvn(org.glassfish.jaxb:jaxb-runtime) ( =  4.0.4) mvn(org.glassfish.jaxb:jaxb-runtime:pom:) ( =  4.0.4) osgi(org.glassfish.jaxb.runtime) ( =  4.0.4)"

URI_jaxb-txw2 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/jaxb-txw2-4.0.4-6.el10.noarch.rpm;unpack=0"
RDEPENDS:jaxb-txw2 = "javapackages-filesystem ( )"
RPROVIDES:jaxb-txw2 = "mvn(org.glassfish.jaxb:txw2) ( =  4.0.4) jaxb-txw2 ( =  4.0.4-6.el10) jpms(com.sun.xml.txw2) ( =  4.0.4) mvn(org.glassfish.jaxb:txw2:pom:) ( =  4.0.4)"

URI_jaxb-xjc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/jaxb-xjc-4.0.4-6.el10.noarch.rpm;unpack=0"
RDEPENDS:jaxb-xjc = "javapackages-filesystem ( ) mvn(com.sun.istack:istack-commons-tools) ( ) mvn(com.sun.xml.dtd-parser:dtd-parser) ( ) mvn(org.glassfish.jaxb:jaxb-core) ( =  4.0.4) mvn(org.glassfish.jaxb:codemodel) ( =  4.0.4) mvn(com.sun.xml.bind.external:rngom) ( =  4.0.4) mvn(org.glassfish.jaxb:xsom) ( =  4.0.4)"
RPROVIDES:jaxb-xjc = "jaxb-xjc ( =  4.0.4-6.el10) jpms(org.glassfish.jaxb.xjc) ( =  4.0.4) mvn(org.glassfish.jaxb:jaxb-xjc) ( =  4.0.4) mvn(org.glassfish.jaxb:jaxb-xjc:pom:) ( =  4.0.4)"

URI_jaxb-xsom = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/jaxb-xsom-4.0.4-6.el10.noarch.rpm;unpack=0"
RDEPENDS:jaxb-xsom = "javapackages-filesystem ( ) mvn(com.sun.xml.bind.external:relaxng-datatype) ( =  4.0.4)"
RPROVIDES:jaxb-xsom = "mvn(org.glassfish.jaxb:xsom) ( =  4.0.4) jaxb-xsom ( =  4.0.4-6.el10) jpms(com.sun.xml.xsom) ( =  4.0.4) mvn(org.glassfish.jaxb:xsom:pom:) ( =  4.0.4) osgi(org.glassfish.jaxb.xsom) ( =  4.0.4)"

URI_jaxb-codemodel-annotation-compiler = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/jaxb-codemodel-annotation-compiler-4.0.4-6.el10.noarch.rpm;unpack=0"
RDEPENDS:jaxb-codemodel-annotation-compiler = "javapackages-filesystem ( ) mvn(org.glassfish.jaxb:codemodel) ( =  4.0.4)"
RPROVIDES:jaxb-codemodel-annotation-compiler = "jaxb-codemodel-annotation-compiler ( =  4.0.4-6.el10) jpms(com.sun.codemodel.ac) ( =  4.0.4) mvn(org.glassfish.jaxb:codemodel-annotation-compiler) ( =  4.0.4) mvn(org.glassfish.jaxb:codemodel-annotation-compiler:pom:) ( =  4.0.4) osgi(org.glassfish.jaxb.codemodel-annotation-compiler) ( =  4.0.4)"

URI_jaxb-txwc2 = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/jaxb-txwc2-4.0.4-6.el10.noarch.rpm;unpack=0"
RDEPENDS:jaxb-txwc2 = "javapackages-filesystem ( ) mvn(org.glassfish.jaxb:codemodel) ( =  4.0.4) mvn(org.glassfish.jaxb:txw2) ( =  4.0.4) mvn(com.sun.xml.bind.external:rngom) ( =  4.0.4) mvn(org.glassfish.jaxb:xsom) ( =  4.0.4)"
RPROVIDES:jaxb-txwc2 = "jaxb-txwc2 ( =  4.0.4-6.el10) jpms(com.sun.tools.txwc2) ( =  4.0.4) mvn(org.glassfish.jaxb:txwc2) ( =  4.0.4) mvn(org.glassfish.jaxb:txwc2:pom:) ( =  4.0.4)"
