
PN = "libeconf"
PE = "0"
PV = "0.6.2"
PR = "4.el10"
PACKAGES = "libeconf libeconf-devel libeconf-utils"


URI_libeconf = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libeconf-0.6.2-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libeconf = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( )"
RPROVIDES:libeconf = "libeconf.so.0()(64bit) ( ) libeconf.so.0(LIBECONF_0.2)(64bit) ( ) libeconf.so.0(LIBECONF_0.4)(64bit) ( ) libeconf.so.0(LIBECONF_0.3)(64bit) ( ) libeconf.so.0(LIBECONF_0.5)(64bit) ( ) libeconf.so.0(LIBECONF_0.6)(64bit) ( ) libeconf.so.0(LIBECONF_ALPHA)(64bit) ( ) libeconf ( =  0.6.2-4.el10) libeconf(x86-64) ( =  0.6.2-4.el10)"

URI_libeconf-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libeconf-devel-0.6.2-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libeconf-devel = "/usr/bin/pkg-config ( ) cmake-filesystem(x86-64) ( ) libeconf.so.0()(64bit) ( ) libeconf(x86-64) ( =  0.6.2-4.el10)"
RPROVIDES:libeconf-devel = "cmake(libeconf) ( =  0.6.2) libeconf-devel ( =  0.6.2-4.el10) libeconf-devel(x86-64) ( =  0.6.2-4.el10) pkgconfig(libeconf) ( =  0.6.2)"

URI_libeconf-utils = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libeconf-utils-0.6.2-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libeconf-utils = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libeconf.so.0()(64bit) ( ) libeconf.so.0(LIBECONF_0.2)(64bit) ( ) libeconf.so.0(LIBECONF_0.4)(64bit) ( ) libeconf.so.0(LIBECONF_ALPHA)(64bit) ( ) libeconf(x86-64) ( =  0.6.2-4.el10)"
RPROVIDES:libeconf-utils = "libeconf-utils ( =  0.6.2-4.el10) libeconf-utils(x86-64) ( =  0.6.2-4.el10)"
