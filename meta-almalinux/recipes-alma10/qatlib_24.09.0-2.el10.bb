
PN = "qatlib"
PE = "0"
PV = "24.09.0"
PR = "2.el10"
PACKAGES = "qatlib qatlib-service qatlib-devel qatlib-tests"


URI_qatlib = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qatlib-24.09.0-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qatlib = "/bin/sh ( ) shadow-utils ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libcrypto.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) libnuma.so.1()(64bit) ( ) libnuma.so.1(libnuma_1.2)(64bit) ( ) libnuma.so.1(libnuma_1.1)(64bit) ( )"
RPROVIDES:qatlib = "libqat.so.4()(64bit) ( ) libusdm.so.0()(64bit) ( ) qatlib(x86-64) ( =  24.09.0-2.el10) qatlib ( =  24.09.0-2.el10)"

URI_qatlib-service = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qatlib-service-24.09.0-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qatlib-service = "/bin/sh ( ) systemd ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) /usr/bin/sh ( ) libnuma.so.1()(64bit) ( ) libnuma.so.1(libnuma_1.2)(64bit) ( ) libnuma.so.1(libnuma_1.1)(64bit) ( ) pciutils ( ) qatlib(x86-64) ( =  24.09.0-2.el10)"
RPROVIDES:qatlib-service = "qatlib-service ( =  24.09.0-2.el10) qatlib-service(x86-64) ( =  24.09.0-2.el10)"

URI_qatlib-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/qatlib-devel-24.09.0-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qatlib-devel = "/usr/bin/pkg-config ( ) pkgconfig(libcrypto) ( ) libqat.so.4()(64bit) ( ) libusdm.so.0()(64bit) ( ) pkgconfig(libqat) ( ) pkgconfig(libusdm) ( ) qatlib(x86-64) ( =  24.09.0-2.el10)"
RPROVIDES:qatlib-devel = "pkgconfig(libqat) ( =  24.09.0) pkgconfig(libusdm) ( =  24.09.0) pkgconfig(qatlib) ( =  24.09.0) qatlib-devel ( =  24.09.0-2.el10) qatlib-devel(x86-64) ( =  24.09.0-2.el10)"

URI_qatlib-tests = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/qatlib-tests-24.09.0-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qatlib-tests = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libz.so.1()(64bit) ( ) libcrypto.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) libqat.so.4()(64bit) ( ) libusdm.so.0()(64bit) ( ) qatlib(x86-64) ( =  24.09.0-2.el10)"
RPROVIDES:qatlib-tests = "qatlib-tests ( =  24.09.0-2.el10) qatlib-tests(x86-64) ( =  24.09.0-2.el10)"
