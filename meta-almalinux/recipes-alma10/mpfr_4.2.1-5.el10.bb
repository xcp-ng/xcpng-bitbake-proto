
PN = "mpfr"
PE = "0"
PV = "4.2.1"
PR = "5.el10"
PACKAGES = "mpfr mpfr-devel mpfr-doc"


URI_mpfr = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/mpfr-4.2.1-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:mpfr = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) libgmp.so.10()(64bit) ( )"
RPROVIDES:mpfr = "libmpfr.so.6()(64bit) ( ) mpfr ( =  4.2.1-5.el10) mpfr(x86-64) ( =  4.2.1-5.el10)"

URI_mpfr-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/mpfr-devel-4.2.1-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:mpfr-devel = "/usr/bin/pkg-config ( ) libmpfr.so.6()(64bit) ( ) gmp-devel(x86-64) ( ) mpfr(x86-64) ( =  4.2.1-5.el10)"
RPROVIDES:mpfr-devel = "mpfr-devel ( =  4.2.1-5.el10) mpfr-devel(x86-64) ( =  4.2.1-5.el10) pkgconfig(mpfr) ( =  4.2.1)"

URI_mpfr-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/mpfr-doc-4.2.1-5.el10.noarch.rpm;unpack=0"
RDEPENDS:mpfr-doc = ""
RPROVIDES:mpfr-doc = "mpfr-doc ( =  4.2.1-5.el10)"
