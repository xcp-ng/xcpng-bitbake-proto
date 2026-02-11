
PN = "libkcapi"
PE = "0"
PV = "1.5.0"
PR = "3.el10"
PACKAGES = "libkcapi libkcapi-hasher libkcapi-hmaccalc libkcapi-devel libkcapi-doc libkcapi-fipscheck libkcapi-static libkcapi-tests libkcapi-tools"


URI_libkcapi = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libkcapi-1.5.0-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libkcapi = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) systemd ( )"
RPROVIDES:libkcapi = "libkcapi.so.1()(64bit) ( ) libkcapi.so.1(LIBKCAPI_0.12.0)(64bit) ( ) libkcapi.so.1(LIBKCAPI_1.3.1)(64bit) ( ) libkcapi.so.1(LIBKCAPI_0.13.0)(64bit) ( ) libkcapi.so.1(LIBKCAPI_0.14.0)(64bit) ( ) libkcapi.so.1(LIBKCAPI_1.0.0)(64bit) ( ) libkcapi.so.1(LIBKCAPI_1.0.1)(64bit) ( ) libkcapi.so.1(LIBKCAPI_1.0.2)(64bit) ( ) libkcapi.so.1(LIBKCAPI_1.0.3)(64bit) ( ) libkcapi.so.1(LIBKCAPI_1.1.0)(64bit) ( ) libkcapi.so.1(LIBKCAPI_1.1.1)(64bit) ( ) libkcapi.so.1(LIBKCAPI_1.1.2)(64bit) ( ) libkcapi.so.1(LIBKCAPI_1.1.3)(64bit) ( ) libkcapi.so.1(LIBKCAPI_1.1.4)(64bit) ( ) libkcapi.so.1(LIBKCAPI_1.1.5)(64bit) ( ) libkcapi.so.1(LIBKCAPI_1.2.0)(64bit) ( ) libkcapi.so.1(LIBKCAPI_1.2.1)(64bit) ( ) libkcapi.so.1(LIBKCAPI_1.3.0)(64bit) ( ) libkcapi.so.1(LIBKCAPI_1.4.0)(64bit) ( ) libkcapi.so.1(LIBKCAPI_1.5.0)(64bit) ( ) libkcapi(x86-64) ( =  1.5.0-3.el10) libkcapi ( =  1.5.0-3.el10)"

URI_libkcapi-hasher = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libkcapi-hasher-1.5.0-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libkcapi-hasher = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libkcapi.so.1()(64bit) ( ) libkcapi.so.1(LIBKCAPI_0.12.0)(64bit) ( ) libkcapi.so.1(LIBKCAPI_1.3.1)(64bit) ( ) libkcapi(x86-64) ( =  1.5.0-3.el10)"
RPROVIDES:libkcapi-hasher = "libkcapi-hasher(x86-64) ( =  1.5.0-3.el10) libkcapi-hasher ( =  1.5.0-3.el10)"

URI_libkcapi-hmaccalc = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libkcapi-hmaccalc-1.5.0-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libkcapi-hmaccalc = "libkcapi-hasher(x86-64) ( =  1.5.0-3.el10)"
RPROVIDES:libkcapi-hmaccalc = "hmaccalc ( =  0.9.14-10.el10.1) hmaccalc(x86-64) ( =  0.9.14-10.el10.1) libkcapi-hmaccalc ( =  1.5.0-3.el10) libkcapi-hmaccalc(x86-64) ( =  1.5.0-3.el10)"

URI_libkcapi-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libkcapi-devel-1.5.0-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libkcapi-devel = "/usr/bin/pkg-config ( ) libkcapi.so.1()(64bit) ( ) libkcapi(x86-64) ( =  1.5.0-3.el10)"
RPROVIDES:libkcapi-devel = "libkcapi-devel(x86-64) ( =  1.5.0-3.el10) libkcapi-devel ( =  1.5.0-3.el10) pkgconfig(libkcapi) ( =  1.5.0)"

URI_libkcapi-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libkcapi-doc-1.5.0-3.el10.noarch.rpm;unpack=0"
RDEPENDS:libkcapi-doc = "libkcapi ( =  1.5.0-3.el10)"
RPROVIDES:libkcapi-doc = "libkcapi-doc ( =  1.5.0-3.el10)"

URI_libkcapi-fipscheck = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libkcapi-fipscheck-1.5.0-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libkcapi-fipscheck = "libkcapi-hasher(x86-64) ( =  1.5.0-3.el10)"
RPROVIDES:libkcapi-fipscheck = "fipscheck ( =  1.5.0-9.1) fipscheck(x86-64) ( =  1.5.0-9.1) libkcapi-fipscheck ( =  1.5.0-3.el10) libkcapi-fipscheck(x86-64) ( =  1.5.0-3.el10)"

URI_libkcapi-static = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libkcapi-static-1.5.0-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libkcapi-static = "libkcapi-devel(x86-64) ( =  1.5.0-3.el10)"
RPROVIDES:libkcapi-static = "libkcapi-static ( =  1.5.0-3.el10) libkcapi-static(x86-64) ( =  1.5.0-3.el10)"

URI_libkcapi-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libkcapi-tests-1.5.0-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libkcapi-tests = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) /usr/bin/bash ( ) coreutils ( ) perl-interpreter ( ) openssl ( ) libkcapi.so.1()(64bit) ( ) libkcapi.so.1(LIBKCAPI_0.12.0)(64bit) ( ) libkcapi.so.1(LIBKCAPI_1.1.0)(64bit) ( ) libkcapi.so.1(LIBKCAPI_1.3.1)(64bit) ( ) libkcapi(x86-64) ( =  1.5.0-3.el10) libkcapi-tools(x86-64) ( =  1.5.0-3.el10) libkcapi-hmaccalc(x86-64) ( =  1.5.0-3.el10)"
RPROVIDES:libkcapi-tests = "libkcapi-tests ( =  1.5.0-3.el10) libkcapi-tests(x86-64) ( =  1.5.0-3.el10)"

URI_libkcapi-tools = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libkcapi-tools-1.5.0-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libkcapi-tools = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libkcapi.so.1()(64bit) ( ) libkcapi.so.1(LIBKCAPI_0.12.0)(64bit) ( ) libkcapi.so.1(LIBKCAPI_1.1.0)(64bit) ( ) libkcapi.so.1(LIBKCAPI_1.3.1)(64bit) ( ) libkcapi.so.1(LIBKCAPI_0.14.0)(64bit) ( ) libkcapi.so.1(LIBKCAPI_1.3.0)(64bit) ( ) libkcapi(x86-64) ( =  1.5.0-3.el10) libkcapi-hasher(x86-64) ( =  1.5.0-3.el10)"
RPROVIDES:libkcapi-tools = "libkcapi-tools(x86-64) ( =  1.5.0-3.el10) libkcapi-tools ( =  1.5.0-3.el10)"
