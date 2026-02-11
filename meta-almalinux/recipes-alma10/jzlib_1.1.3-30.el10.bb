
PN = "jzlib"
PE = "0"
PV = "1.1.3"
PR = "30.el10"
PACKAGES = "jzlib jzlib-demo jzlib-javadoc"


URI_jzlib = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/jzlib-1.1.3-30.el10.noarch.rpm;unpack=0"
RDEPENDS:jzlib = "javapackages-filesystem ( )"
RPROVIDES:jzlib = "jzlib ( =  1.1.3-30.el10) mvn(com.jcraft:jzlib) ( =  1.1.3) mvn(com.jcraft:jzlib:pom:) ( =  1.1.3) osgi(com.jcraft.jzlib) ( =  1.1.3)"

URI_jzlib-demo = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/jzlib-demo-1.1.3-30.el10.noarch.rpm;unpack=0"
RDEPENDS:jzlib-demo = "jzlib ( =  1.1.3-30.el10)"
RPROVIDES:jzlib-demo = "jzlib-demo ( =  1.1.3-30.el10)"

URI_jzlib-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/jzlib-javadoc-1.1.3-30.el10.noarch.rpm;unpack=0"
RDEPENDS:jzlib-javadoc = "javapackages-filesystem ( )"
RPROVIDES:jzlib-javadoc = "jzlib-javadoc ( =  1.1.3-30.el10)"
