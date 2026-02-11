
PN = "papi"
PE = "0"
PV = "7.1.0"
PR = "6.el10"
PACKAGES = "papi papi-devel papi-libs papi-testsuite"


URI_papi = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/papi-7.1.0-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:papi = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) /usr/bin/python3 ( ) libpapi.so.7.1()(64bit) ( ) papi-libs ( =  7.1.0-6.el10)"
RPROVIDES:papi = "papi ( =  7.1.0-6.el10) papi(x86-64) ( =  7.1.0-6.el10)"

URI_papi-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/papi-devel-7.1.0-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:papi-devel = "/usr/bin/pkg-config ( ) pkgconfig ( ) libpapi.so.7.1()(64bit) ( ) libsde.so()(64bit) ( ) papi-libs ( =  7.1.0-6.el10) papi ( =  7.1.0-6.el10)"
RPROVIDES:papi-devel = "papi-devel ( =  7.1.0-6.el10) papi-devel(x86-64) ( =  7.1.0-6.el10) pkgconfig(papi) ( =  7.1.0.0) pkgconfig(papi-7.1) ( =  7.1.0.0) pkgconfig(papi-7.1.0.0) ( =  7.1.0.0)"

URI_papi-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/papi-libs-7.1.0-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:papi-libs = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libpfm.so.4()(64bit) ( )"
RPROVIDES:papi-libs = "libpapi.so.7.1()(64bit) ( ) libsde.so()(64bit) ( ) papi-libs ( =  7.1.0-6.el10) papi-libs(x86-64) ( =  7.1.0-6.el10)"

URI_papi-testsuite = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/papi-testsuite-7.1.0-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:papi-testsuite = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libm.so.6()(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) /usr/bin/sh ( ) libgfortran.so.5()(64bit) ( ) libgfortran.so.5(GFORTRAN_8)(64bit) ( ) libgomp.so.1()(64bit) ( ) libgomp.so.1(GOMP_4.0)(64bit) ( ) libgomp.so.1(OMP_1.0)(64bit) ( ) libgomp.so.1(GOMP_1.0)(64bit) ( ) libgfortran.so.5(GFORTRAN_10)(64bit) ( ) libpapi.so.7.1()(64bit) ( ) papi ( =  7.1.0-6.el10) papi-libs ( =  7.1.0-6.el10)"
RPROVIDES:papi-testsuite = "papi-testsuite ( =  7.1.0-6.el10) papi-testsuite(x86-64) ( =  7.1.0-6.el10)"
