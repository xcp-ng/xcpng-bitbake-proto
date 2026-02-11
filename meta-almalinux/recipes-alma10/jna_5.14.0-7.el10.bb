
PN = "jna"
PE = "0"
PV = "5.14.0"
PR = "7.el10"
PACKAGES = "jna jna-contrib jna-javadoc"


URI_jna = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/jna-5.14.0-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:jna = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) javapackages-filesystem ( ) libffi.so.8()(64bit) ( ) libffi.so.8(LIBFFI_BASE_8.0)(64bit) ( ) libffi.so.8(LIBFFI_CLOSURE_8.0)(64bit) ( ) libffi ( )"
RPROVIDES:jna = "jpms(com.sun.jna) ( ) jna ( =  5.14.0-7.el10) mvn(net.java.dev.jna:jna) ( =  5.14.0) osgi(com.sun.jna) ( =  5.14.0) jna(x86-64) ( =  5.14.0-7.el10) mvn(net.java.dev.jna:jna:pom:) ( =  5.14.0)"

URI_jna-contrib = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/jna-contrib-5.14.0-7.el10.noarch.rpm;unpack=0"
RDEPENDS:jna-contrib = "javapackages-filesystem ( ) jna ( =  5.14.0-7.el10) mvn(net.java.dev.jna:jna) ( =  5.14.0) osgi(com.sun.jna) ( =  5.14.0)"
RPROVIDES:jna-contrib = "jpms(com.sun.jna.platform) ( ) jna-contrib ( =  5.14.0-7.el10) mvn(net.java.dev.jna:jna-platform) ( =  5.14.0) mvn(net.java.dev.jna:jna-platform:pom:) ( =  5.14.0) mvn(net.java.dev.jna:platform) ( =  5.14.0) mvn(net.java.dev.jna:platform:pom:) ( =  5.14.0) osgi(com.sun.jna.platform) ( =  5.14.0)"

URI_jna-javadoc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/jna-javadoc-5.14.0-7.el10.noarch.rpm;unpack=0"
RDEPENDS:jna-javadoc = "javapackages-filesystem ( )"
RPROVIDES:jna-javadoc = "jna-javadoc ( =  5.14.0-7.el10)"
