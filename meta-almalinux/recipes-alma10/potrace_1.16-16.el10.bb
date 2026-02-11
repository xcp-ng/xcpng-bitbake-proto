
PN = "potrace"
PE = "0"
PV = "1.16"
PR = "16.el10"
PACKAGES = "potrace potrace-devel potrace-doc"


URI_potrace = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/potrace-1.16-16.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:potrace = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libz.so.1()(64bit) ( )"
RPROVIDES:potrace = "libpotrace.so.0()(64bit) ( ) potrace ( =  1.16-16.el10) potrace(x86-64) ( =  1.16-16.el10)"

URI_potrace-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/potrace-devel-1.16-16.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:potrace-devel = "libpotrace.so.0()(64bit) ( ) potrace ( =  1.16-16.el10)"
RPROVIDES:potrace-devel = "potrace-devel ( =  1.16-16.el10) potrace-devel(x86-64) ( =  1.16-16.el10)"

URI_potrace-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/potrace-doc-1.16-16.el10.noarch.rpm;unpack=0"
RDEPENDS:potrace-doc = ""
RPROVIDES:potrace-doc = "potrace-doc ( =  1.16-16.el10)"
