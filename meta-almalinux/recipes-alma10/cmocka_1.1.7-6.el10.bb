
PN = "cmocka"
PE = "0"
PV = "1.1.7"
PR = "6.el10"
PACKAGES = "libcmocka libcmocka-devel cmocka-doc"


URI_libcmocka = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libcmocka-1.1.7-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libcmocka = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.17)(64bit) ( )"
RPROVIDES:libcmocka = "libcmocka.so.0()(64bit) ( ) libcmocka ( =  1.1.7-6.el10) libcmocka(x86-64) ( =  1.1.7-6.el10)"

URI_libcmocka-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libcmocka-devel-1.1.7-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libcmocka-devel = "/usr/bin/pkg-config ( ) cmake-filesystem(x86-64) ( ) libcmocka.so.0()(64bit) ( ) libcmocka ( =  1.1.7-6.el10)"
RPROVIDES:libcmocka-devel = "cmake(cmocka) ( =  1.1.7) libcmocka-devel ( =  1.1.7-6.el10) libcmocka-devel(x86-64) ( =  1.1.7-6.el10) pkgconfig(cmocka) ( =  1.1.7)"

URI_cmocka-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/cmocka-doc-1.1.7-6.el10.noarch.rpm;unpack=0"
RDEPENDS:cmocka-doc = ""
RPROVIDES:cmocka-doc = "cmocka-doc ( =  1.1.7-6.el10)"
