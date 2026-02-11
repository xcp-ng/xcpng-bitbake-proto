
PN = "pkgconf"
PE = "0"
PV = "2.1.0"
PR = "3.el10"
PACKAGES = "libpkgconf pkgconf pkgconf-m4 pkgconf-pkg-config bomtool libpkgconf-devel"


URI_libpkgconf = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libpkgconf-2.1.0-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libpkgconf = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( )"
RPROVIDES:libpkgconf = "libpkgconf.so.4()(64bit) ( ) libpkgconf(x86-64) ( =  2.1.0-3.el10) libpkgconf ( =  2.1.0-3.el10)"

URI_pkgconf = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/pkgconf-2.1.0-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:pkgconf = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libpkgconf.so.4()(64bit) ( ) libpkgconf(x86-64) ( =  2.1.0-3.el10)"
RPROVIDES:pkgconf = "rpm_macro(pkgconfig_personalitydir) ( ) pkgconf(x86-64) ( =  2.1.0-3.el10) pkgconf ( =  2.1.0-3.el10) pkgconfig(pkgconf) ( =  2.1.0)"

URI_pkgconf-m4 = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/pkgconf-m4-2.1.0-3.el10.noarch.rpm;unpack=0"
RDEPENDS:pkgconf-m4 = ""
RPROVIDES:pkgconf-m4 = "pkgconf-m4 ( =  2.1.0-3.el10)"

URI_pkgconf-pkg-config = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/pkgconf-pkg-config-2.1.0-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:pkgconf-pkg-config = "/usr/bin/sh ( ) pkgconf(x86-64) ( =  2.1.0-3.el10) pkgconf-m4 ( =  2.1.0-3.el10)"
RPROVIDES:pkgconf-pkg-config = "pkg-config ( =  0.29.1-3) pkg-config(x86-64) ( =  0.29.1-3) pkgconf-pkg-config ( =  2.1.0-3.el10) pkgconf-pkg-config(x86-64) ( =  2.1.0-3.el10) pkgconfig ( =  1:0.29.1-3) pkgconfig(pkg-config) ( =  2.1.0) pkgconfig(x86-64) ( =  1:0.29.1-3)"

URI_bomtool = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/bomtool-2.1.0-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:bomtool = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libpkgconf.so.4()(64bit) ( ) libpkgconf(x86-64) ( =  2.1.0-3.el10)"
RPROVIDES:bomtool = "bomtool ( =  2.1.0-3.el10) bomtool(x86-64) ( =  2.1.0-3.el10)"

URI_libpkgconf-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libpkgconf-devel-2.1.0-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libpkgconf-devel = "/usr/bin/pkg-config ( ) libpkgconf.so.4()(64bit) ( ) libpkgconf(x86-64) ( =  2.1.0-3.el10)"
RPROVIDES:libpkgconf-devel = "libpkgconf-devel ( =  2.1.0-3.el10) libpkgconf-devel(x86-64) ( =  2.1.0-3.el10) pkgconfig(libpkgconf) ( =  2.1.0)"
