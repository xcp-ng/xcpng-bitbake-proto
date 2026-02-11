
PN = "chkconfig"
PE = "0"
PV = "1.30"
PR = "2.el10"
PACKAGES = "alternatives chkconfig ntsysv"


URI_alternatives = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/alternatives-1.30-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:alternatives = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( )"
RPROVIDES:alternatives = "alternatives ( =  1.30-2.el10) alternatives(x86-64) ( =  1.30-2.el10)"

URI_chkconfig = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/chkconfig-1.30-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:chkconfig = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libselinux.so.1()(64bit) ( ) libpopt.so.0()(64bit) ( ) libselinux.so.1(LIBSELINUX_1.0)(64bit) ( ) libpopt.so.0(LIBPOPT_0)(64bit) ( )"
RPROVIDES:chkconfig = "/sbin/chkconfig ( ) chkconfig ( =  1.30-2.el10) chkconfig(x86-64) ( =  1.30-2.el10)"

URI_ntsysv = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ntsysv-1.30-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ntsysv = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libselinux.so.1()(64bit) ( ) libselinux.so.1(LIBSELINUX_1.0)(64bit) ( ) libpopt.so.0()(64bit) ( ) libpopt.so.0(LIBPOPT_0)(64bit) ( ) libnewt.so.0.52()(64bit) ( ) libnewt.so.0.52(NEWT_0.52)(64bit) ( ) chkconfig ( =  1.30-2.el10)"
RPROVIDES:ntsysv = "ntsysv ( =  1.30-2.el10) ntsysv(x86-64) ( =  1.30-2.el10)"
