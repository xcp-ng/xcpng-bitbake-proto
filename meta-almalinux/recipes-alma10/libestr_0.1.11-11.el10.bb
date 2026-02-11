
PN = "libestr"
PE = "0"
PV = "0.1.11"
PR = "11.el10"
PACKAGES = "libestr libestr-devel"


URI_libestr = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libestr-0.1.11-11.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libestr = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.14)(64bit) ( )"
RPROVIDES:libestr = "libestr.so.0()(64bit) ( ) libestr ( =  0.1.11-11.el10) libestr(x86-64) ( =  0.1.11-11.el10)"

URI_libestr-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libestr-devel-0.1.11-11.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libestr-devel = "/usr/bin/pkg-config ( ) libestr.so.0()(64bit) ( ) libestr(x86-64) ( =  0.1.11-11.el10)"
RPROVIDES:libestr-devel = "libestr-devel ( =  0.1.11-11.el10) libestr-devel(x86-64) ( =  0.1.11-11.el10) pkgconfig(libestr) ( =  0.1.11)"
