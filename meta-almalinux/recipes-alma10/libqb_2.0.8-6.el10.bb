
PN = "libqb"
PE = "0"
PV = "2.0.8"
PR = "6.el10"
PACKAGES = "libqb doxygen2man"


URI_libqb = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libqb-2.0.8-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libqb = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( )"
RPROVIDES:libqb = "libqb.so.100()(64bit) ( ) libqb ( =  2.0.8-6.el10) libqb(x86-64) ( =  2.0.8-6.el10)"

URI_doxygen2man = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/doxygen2man-2.0.8-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:doxygen2man = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libxml2.so.2()(64bit) ( ) libxml2.so.2(LIBXML2_2.4.30)(64bit) ( ) libqb.so.100()(64bit) ( ) libqb(x86-64) ( =  2.0.8-6.el10)"
RPROVIDES:doxygen2man = "doxygen2man ( =  2.0.8-6.el10) doxygen2man(x86-64) ( =  2.0.8-6.el10)"
