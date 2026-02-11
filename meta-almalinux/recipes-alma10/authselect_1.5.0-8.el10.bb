
PN = "authselect"
PE = "0"
PV = "1.5.0"
PR = "8.el10"
PACKAGES = "authselect authselect-libs authselect-devel"


URI_authselect = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/authselect-1.5.0-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:authselect = "rtld(GNU_HASH) ( ) /bin/sh ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libpopt.so.0()(64bit) ( ) libpopt.so.0(LIBPOPT_0)(64bit) ( ) libauthselect.so.3()(64bit) ( ) libauthselect.so.3(AUTHSELECT_1.0.1)(64bit) ( ) libauthselect.so.3(AUTHSELECT_1.0.2)(64bit) ( ) libauthselect.so.3(AUTHSELECT_1.0.3)(64bit) ( ) libauthselect.so.3(AUTHSELECT_1.1.0)(64bit) ( ) libauthselect.so.3(AUTHSELECT_1.2.3)(64bit) ( ) authselect-libs(x86-64) ( =  1.5.0-8.el10)"
RPROVIDES:authselect = "authselect ( =  1.5.0-8.el10) authselect(x86-64) ( =  1.5.0-8.el10)"

URI_authselect-libs = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/authselect-libs-1.5.0-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:authselect-libs = "rtld(GNU_HASH) ( ) /bin/sh ( ) coreutils ( ) libselinux.so.1()(64bit) ( ) libselinux.so.1(LIBSELINUX_1.0)(64bit) ( ) sed ( ) libc.so.6(GLIBC_2.33)(64bit) ( )"
RPROVIDES:authselect-libs = "libauthselect.so.3()(64bit) ( ) libauthselect.so.3(AUTHSELECT_1.0.1)(64bit) ( ) libauthselect.so.3(AUTHSELECT_1.0.2)(64bit) ( ) libauthselect.so.3(AUTHSELECT_1.0.3)(64bit) ( ) libauthselect.so.3(AUTHSELECT_1.1.0)(64bit) ( ) libauthselect.so.3(AUTHSELECT_1.2.3)(64bit) ( ) authselect-libs(x86-64) ( =  1.5.0-8.el10) authselect-libs ( =  1.5.0-8.el10)"

URI_authselect-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/authselect-devel-1.5.0-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:authselect-devel = "/usr/bin/pkg-config ( ) libauthselect.so.3()(64bit) ( ) authselect-libs(x86-64) ( =  1.5.0-8.el10)"
RPROVIDES:authselect-devel = "authselect-devel ( =  1.5.0-8.el10) authselect-devel(x86-64) ( =  1.5.0-8.el10) pkgconfig(authselect) ( =  1.5.0)"
