
PN = "libtool"
PE = "0"
PV = "2.4.7"
PR = "13.el10"
PACKAGES = "libtool libtool-ltdl libtool-ltdl-devel"


URI_libtool = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libtool-2.4.7-13.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libtool = "/usr/bin/sh ( ) findutils ( ) sed ( ) tar ( ) autoconf ( ) automake ( ) gcc(major) ( =  14)"
RPROVIDES:libtool = "libtool ( =  2.4.7-13.el10) libtool(x86-64) ( =  2.4.7-13.el10)"

URI_libtool-ltdl = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libtool-ltdl-2.4.7-13.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libtool-ltdl = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( )"
RPROVIDES:libtool-ltdl = "libltdl.so.7()(64bit) ( ) libtool-libs ( =  2.4.7-13.el10) libtool-ltdl ( =  2.4.7-13.el10) libtool-ltdl(x86-64) ( =  2.4.7-13.el10)"

URI_libtool-ltdl-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libtool-ltdl-devel-2.4.7-13.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libtool-ltdl-devel = "/usr/bin/sh ( ) libltdl.so.7()(64bit) ( ) libtool-ltdl ( =  2.4.7-13.el10) automake ( =  1.16.5)"
RPROVIDES:libtool-ltdl-devel = "libtool-ltdl-devel ( =  2.4.7-13.el10) libtool-ltdl-devel(x86-64) ( =  2.4.7-13.el10)"
