
PN = "OpenIPMI"
PE = "0"
PV = "2.0.36"
PR = "3.el10"
PACKAGES = "OpenIPMI OpenIPMI-lanserv OpenIPMI-libs OpenIPMI-devel"


URI_OpenIPMI = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/OpenIPMI-2.0.36-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:OpenIPMI = "/bin/sh ( ) systemd ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) /usr/bin/sh ( ) libglib-2.0.so.0()(64bit) ( ) libreadline.so.8()(64bit) ( ) libnetsnmp.so.40()(64bit) ( ) libgthread-2.0.so.0()(64bit) ( ) libgdbm.so.6()(64bit) ( ) libOpenIPMIposix.so.0()(64bit) ( ) libOpenIPMIutils.so.0()(64bit) ( ) libOpenIPMI.so.0()(64bit) ( ) libOpenIPMIcmdlang.so.0()(64bit) ( ) libOpenIPMIglib.so.0()(64bit) ( ) libOpenIPMIui.so.1()(64bit) ( ) OpenIPMI-libs(x86-64) ( =  2.0.36-3.el10)"
RPROVIDES:OpenIPMI = "OpenIPMI(x86-64) ( =  2.0.36-3.el10) OpenIPMI ( =  2.0.36-3.el10) config(OpenIPMI) ( =  2.0.36-3.el10)"

URI_OpenIPMI-lanserv = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/OpenIPMI-lanserv-2.0.36-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:OpenIPMI-lanserv = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libcrypto.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) libpopt.so.0()(64bit) ( ) libpopt.so.0(LIBPOPT_0)(64bit) ( ) libOpenIPMIposix.so.0()(64bit) ( ) libOpenIPMIutils.so.0()(64bit) ( ) OpenIPMI-libs(x86-64) ( =  2.0.36-3.el10) OpenIPMI(x86-64) ( =  2.0.36-3.el10)"
RPROVIDES:OpenIPMI-lanserv = "libIPMIlanserv.so.0()(64bit) ( ) OpenIPMI-lanserv ( =  2.0.36-3.el10) OpenIPMI-lanserv(x86-64) ( =  2.0.36-3.el10) config(OpenIPMI-lanserv) ( =  2.0.36-3.el10)"

URI_OpenIPMI-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/OpenIPMI-libs-2.0.36-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:OpenIPMI-libs = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libcrypto.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) libtinfo.so.6()(64bit) ( ) libncurses.so.6()(64bit) ( ) libnetsnmp.so.40()(64bit) ( ) libgthread-2.0.so.0()(64bit) ( ) libgdbm.so.6()(64bit) ( )"
RPROVIDES:OpenIPMI-libs = "libOpenIPMIposix.so.0()(64bit) ( ) libOpenIPMIutils.so.0()(64bit) ( ) libOpenIPMI.so.0()(64bit) ( ) libOpenIPMIcmdlang.so.0()(64bit) ( ) libOpenIPMIglib.so.0()(64bit) ( ) libOpenIPMIui.so.1()(64bit) ( ) libOpenIPMIpthread.so.0()(64bit) ( ) OpenIPMI-libs(x86-64) ( =  2.0.36-3.el10) OpenIPMI-libs ( =  2.0.36-3.el10)"

URI_OpenIPMI-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/OpenIPMI-devel-2.0.36-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:OpenIPMI-devel = "/usr/bin/pkg-config ( ) pkgconfig ( ) pkgconfig(OpenIPMI) ( ) pkgconfig(OpenIPMIutils) ( ) libIPMIlanserv.so.0()(64bit) ( ) libOpenIPMI.so.0()(64bit) ( ) libOpenIPMIcmdlang.so.0()(64bit) ( ) libOpenIPMIglib.so.0()(64bit) ( ) libOpenIPMIposix.so.0()(64bit) ( ) libOpenIPMIpthread.so.0()(64bit) ( ) libOpenIPMIui.so.1()(64bit) ( ) libOpenIPMIutils.so.0()(64bit) ( ) pkgconfig(ncurses) ( ) OpenIPMI(x86-64) ( =  2.0.36-3.el10) OpenIPMI-libs(x86-64) ( =  2.0.36-3.el10) OpenIPMI-lanserv(x86-64) ( =  2.0.36-3.el10)"
RPROVIDES:OpenIPMI-devel = "OpenIPMI-devel ( =  2.0.36-3.el10) OpenIPMI-devel(x86-64) ( =  2.0.36-3.el10) pkgconfig(OpenIPMI) ( =  2.0.36) pkgconfig(OpenIPMIcmdlang) ( =  2.0.36) pkgconfig(OpenIPMIglib) ( =  2.0.36) pkgconfig(OpenIPMIposix) ( =  2.0.36) pkgconfig(OpenIPMIpthread) ( =  2.0.36) pkgconfig(OpenIPMIui) ( =  2.0.36) pkgconfig(OpenIPMIutils) ( =  2.0.36)"
