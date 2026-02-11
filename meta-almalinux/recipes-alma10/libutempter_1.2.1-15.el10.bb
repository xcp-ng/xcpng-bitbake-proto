
PN = "libutempter"
PE = "0"
PV = "1.2.1"
PR = "15.el10"
PACKAGES = "libutempter libutempter-devel"


URI_libutempter = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libutempter-1.2.1-15.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libutempter = "/bin/sh ( ) shadow-utils ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( )"
RPROVIDES:libutempter = "libutempter.so.0()(64bit) ( ) libutempter.so.0(UTEMPTER_1.1)(64bit) ( ) libutempter ( =  1.2.1-15.el10) libutempter(x86-64) ( =  1.2.1-15.el10) utempter ( =  0.5.2)"

URI_libutempter-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libutempter-devel-1.2.1-15.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libutempter-devel = "libutempter.so.0()(64bit) ( ) libutempter ( =  1.2.1-15.el10)"
RPROVIDES:libutempter-devel = "libutempter-devel ( =  1.2.1-15.el10) libutempter-devel(x86-64) ( =  1.2.1-15.el10)"
