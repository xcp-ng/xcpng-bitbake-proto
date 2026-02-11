
PN = "bison"
PE = "0"
PV = "3.8.2"
PR = "9.el10"
PACKAGES = "bison bison-runtime bison-devel"


URI_bison = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/bison-3.8.2-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:bison = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) m4 ( >=  1.4)"
RPROVIDES:bison = "bundled(gnulib) ( ) bison ( =  3.8.2-9.el10) bison(x86-64) ( =  3.8.2-9.el10)"

URI_bison-runtime = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/bison-runtime-3.8.2-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:bison-runtime = ""
RPROVIDES:bison-runtime = "bison-runtime ( =  3.8.2-9.el10) bison-runtime(x86-64) ( =  3.8.2-9.el10)"

URI_bison-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/bison-devel-3.8.2-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:bison-devel = ""
RPROVIDES:bison-devel = "bison-devel ( =  3.8.2-9.el10) bison-devel(x86-64) ( =  3.8.2-9.el10) bison-static ( =  3.8.2-9.el10)"
