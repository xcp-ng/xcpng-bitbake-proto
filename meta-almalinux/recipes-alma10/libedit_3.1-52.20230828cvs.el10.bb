
PN = "libedit"
PE = "0"
PV = "3.1"
PR = "52.20230828cvs.el10"
PACKAGES = "libedit libedit-devel"


URI_libedit = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libedit-3.1-52.20230828cvs.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libedit = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libtinfo.so.6()(64bit) ( )"
RPROVIDES:libedit = "libedit.so.0()(64bit) ( ) libedit ( =  3.1-52.20230828cvs.el10) libedit(x86-64) ( =  3.1-52.20230828cvs.el10)"

URI_libedit-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libedit-devel-3.1-52.20230828cvs.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libedit-devel = "/usr/bin/pkg-config ( ) libedit.so.0()(64bit) ( ) ncurses-devel(x86-64) ( ) libedit(x86-64) ( =  3.1-52.20230828cvs.el10)"
RPROVIDES:libedit-devel = "libedit-devel ( =  3.1-52.20230828cvs.el10) libedit-devel(x86-64) ( =  3.1-52.20230828cvs.el10) pkgconfig(libedit) ( =  3.1)"
