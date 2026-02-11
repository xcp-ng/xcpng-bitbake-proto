
PN = "jansi"
PE = "0"
PV = "2.4.1"
PR = "5.el10"
PACKAGES = "jansi jansi-javadoc"


URI_jansi = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/jansi-2.4.1-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:jansi = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) javapackages-filesystem ( )"
RPROVIDES:jansi = "jpms(org.fusesource.jansi) ( ) libjansi.so()(64bit) ( ) jansi ( =  2.4.1-5.el10) jansi(x86-64) ( =  2.4.1-5.el10) jpms(org.fusesource.jansi) ( =  2.4.1) mvn(org.fusesource.jansi:jansi) ( =  2.4.1) mvn(org.fusesource.jansi:jansi:pom:) ( =  2.4.1) osgi(org.fusesource.jansi) ( =  2.4.1)"

URI_jansi-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/jansi-javadoc-2.4.1-5.el10.noarch.rpm;unpack=0"
RDEPENDS:jansi-javadoc = "javapackages-filesystem ( )"
RPROVIDES:jansi-javadoc = "jansi-javadoc ( =  2.4.1-5.el10)"
