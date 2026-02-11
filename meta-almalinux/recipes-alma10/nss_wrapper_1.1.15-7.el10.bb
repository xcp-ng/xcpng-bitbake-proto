
PN = "nss_wrapper"
PE = "0"
PV = "1.1.15"
PR = "7.el10"
PACKAGES = "nss_wrapper nss_wrapper-libs"


URI_nss_wrapper = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/nss_wrapper-1.1.15-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:nss_wrapper = "perl(strict) ( ) /usr/bin/pkg-config ( ) /usr/bin/perl ( ) cmake-filesystem(x86-64) ( ) perl(Getopt::Long) ( ) perl(Cwd) ( ) nss_wrapper-libs(x86-64) ( =  1.1.15-7.el10)"
RPROVIDES:nss_wrapper = "cmake(nss_wrapper) ( =  1.1.15) nss_wrapper ( =  1.1.15-7.el10) nss_wrapper(x86-64) ( =  1.1.15-7.el10) pkgconfig(nss_wrapper) ( =  1.1.15)"

URI_nss_wrapper-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/nss_wrapper-libs-1.1.15-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:nss_wrapper-libs = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( )"
RPROVIDES:nss_wrapper-libs = "libnss_wrapper.so.0()(64bit) ( ) nss_wrapper-libs(x86-64) ( =  1.1.15-7.el10) nss_wrapper-libs ( =  1.1.15-7.el10)"
