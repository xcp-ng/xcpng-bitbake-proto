
PN = "fdk-aac-free"
PE = "0"
PV = "2.0.0"
PR = "15.el10"
PACKAGES = "fdk-aac-free fdk-aac-free-devel"


URI_fdk-aac-free = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fdk-aac-free-2.0.0-15.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:fdk-aac-free = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libc.so.6(GLIBC_2.14)(64bit) ( )"
RPROVIDES:fdk-aac-free = "libfdk-aac.so.2()(64bit) ( ) fdk-aac-free ( =  2.0.0-15.el10) fdk-aac-free(x86-64) ( =  2.0.0-15.el10)"

URI_fdk-aac-free-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/fdk-aac-free-devel-2.0.0-15.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:fdk-aac-free-devel = "/usr/bin/pkg-config ( ) libfdk-aac.so.2()(64bit) ( ) fdk-aac-free(x86-64) ( =  2.0.0-15.el10)"
RPROVIDES:fdk-aac-free-devel = "fdk-aac-free-devel ( =  2.0.0-15.el10) fdk-aac-free-devel(x86-64) ( =  2.0.0-15.el10) pkgconfig(fdk-aac) ( =  2.0.0)"
