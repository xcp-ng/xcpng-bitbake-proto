
PN = "fstrm"
PE = "0"
PV = "0.6.1"
PR = "12.el10"
PACKAGES = "fstrm fstrm-devel fstrm-utils fstrm-doc"


URI_fstrm = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fstrm-0.6.1-12.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:fstrm = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( )"
RPROVIDES:fstrm = "libfstrm.so.0()(64bit) ( ) libfstrm.so.0(LIBFSTRM_0.2.0)(64bit) ( ) bundled(libmy) ( ) libfstrm.so.0(LIBFSTRM_0.4.0)(64bit) ( ) fstrm ( =  0.6.1-12.el10) fstrm(x86-64) ( =  0.6.1-12.el10)"

URI_fstrm-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/fstrm-devel-0.6.1-12.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:fstrm-devel = "/usr/bin/pkg-config ( ) libfstrm.so.0()(64bit) ( ) fstrm(x86-64) ( =  0.6.1-12.el10)"
RPROVIDES:fstrm-devel = "fstrm-devel ( =  0.6.1-12.el10) fstrm-devel(x86-64) ( =  0.6.1-12.el10) pkgconfig(libfstrm) ( =  0.6.1)"

URI_fstrm-utils = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/fstrm-utils-0.6.1-12.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:fstrm-utils = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libfstrm.so.0()(64bit) ( ) libevent-2.1.so.7()(64bit) ( ) libfstrm.so.0(LIBFSTRM_0.2.0)(64bit) ( ) libfstrm.so.0(LIBFSTRM_0.4.0)(64bit) ( ) fstrm(x86-64) ( =  0.6.1-12.el10)"
RPROVIDES:fstrm-utils = "fstrm-utils ( =  0.6.1-12.el10) fstrm-utils(x86-64) ( =  0.6.1-12.el10)"

URI_fstrm-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/fstrm-doc-0.6.1-12.el10.noarch.rpm;unpack=0"
RDEPENDS:fstrm-doc = "fstrm ( =  0.6.1-12.el10)"
RPROVIDES:fstrm-doc = "fstrm-doc ( =  0.6.1-12.el10)"
