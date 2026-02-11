
PN = "libcomps"
PE = "0"
PV = "0.1.21"
PR = "3.el10"
PACKAGES = "libcomps python3-libcomps libcomps-devel libcomps-doc python-libcomps-doc"


URI_libcomps = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libcomps-0.1.21-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libcomps = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) libxml2.so.2()(64bit) ( ) libxml2.so.2(LIBXML2_2.4.30)(64bit) ( ) libxml2.so.2(LIBXML2_2.6.0)(64bit) ( ) libexpat.so.1()(64bit) ( ) libxml2.so.2(LIBXML2_2.5.8)(64bit) ( ) libxml2.so.2(LIBXML2_2.6.23)(64bit) ( ) libxml2.so.2(LIBXML2_2.6.3)(64bit) ( )"
RPROVIDES:libcomps = "libcomps.so.0()(64bit) ( ) libcomps(x86-64) ( =  0.1.21-3.el10) libcomps ( =  0.1.21-3.el10)"

URI_python3-libcomps = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/python3-libcomps-0.1.21-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-libcomps = "rtld(GNU_HASH) ( ) libz.so.1()(64bit) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libpython3.12.so.1.0()(64bit) ( ) libcomps.so.0()(64bit) ( ) python(abi) ( =  3.12) libcomps(x86-64) ( =  0.1.21-3.el10)"
RPROVIDES:python3-libcomps = "python-libcomps ( =  0.1.21-3.el10) python3-libcomps ( =  0.1.21-3.el10) python3-libcomps(x86-64) ( =  0.1.21-3.el10) python3.12-libcomps ( =  0.1.21-3.el10) python3.12dist(libcomps) ( =  0.1.21) python3dist(libcomps) ( =  0.1.21)"

URI_libcomps-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libcomps-devel-0.1.21-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libcomps-devel = "/usr/bin/pkg-config ( ) pkgconfig(libxml-2.0) ( ) pkgconfig(expat) ( ) libcomps.so.0()(64bit) ( ) libcomps(x86-64) ( =  0.1.21-3.el10)"
RPROVIDES:libcomps-devel = "libcomps-devel ( =  0.1.21-3.el10) libcomps-devel(x86-64) ( =  0.1.21-3.el10) pkgconfig(libcomps) ( =  0.1.21)"

URI_libcomps-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libcomps-doc-0.1.21-3.el10.noarch.rpm;unpack=0"
RDEPENDS:libcomps-doc = "libcomps ( =  0.1.21-3.el10)"
RPROVIDES:libcomps-doc = "libcomps-doc ( =  0.1.21-3.el10)"

URI_python-libcomps-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/python-libcomps-doc-0.1.21-3.el10.noarch.rpm;unpack=0"
RDEPENDS:python-libcomps-doc = "libcomps ( =  0.1.21-3.el10)"
RPROVIDES:python-libcomps-doc = "python-libcomps-doc ( =  0.1.21-3.el10)"
