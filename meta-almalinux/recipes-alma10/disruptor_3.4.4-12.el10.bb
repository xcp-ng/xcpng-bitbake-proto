
PN = "disruptor"
PE = "0"
PV = "3.4.4"
PR = "12.el10"
PACKAGES = "disruptor disruptor-javadoc"


URI_disruptor = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/disruptor-3.4.4-12.el10.noarch.rpm;unpack=0"
RDEPENDS:disruptor = "javapackages-filesystem ( )"
RPROVIDES:disruptor = "disruptor ( =  3.4.4-12.el10) mvn(com.lmax:disruptor) ( =  3.4.4) mvn(com.lmax:disruptor:pom:) ( =  3.4.4) osgi(com.lmax.disruptor) ( =  3.4.4)"

URI_disruptor-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/disruptor-javadoc-3.4.4-12.el10.noarch.rpm;unpack=0"
RDEPENDS:disruptor-javadoc = "javapackages-filesystem ( )"
RPROVIDES:disruptor-javadoc = "disruptor-javadoc ( =  3.4.4-12.el10)"
