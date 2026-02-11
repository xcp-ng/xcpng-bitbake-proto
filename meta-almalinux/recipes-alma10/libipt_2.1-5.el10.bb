
PN = "libipt"
PE = "0"
PV = "2.1"
PR = "5.el10"
PACKAGES = "libipt libipt-devel"


URI_libipt = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libipt-2.1-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libipt = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( )"
RPROVIDES:libipt = "libipt.so.2()(64bit) ( ) libipt ( =  2.1-5.el10) libipt(x86-64) ( =  2.1-5.el10)"

URI_libipt-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libipt-devel-2.1-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libipt-devel = "libipt.so.2()(64bit) ( ) libipt(x86-64) ( =  2.1-5.el10)"
RPROVIDES:libipt-devel = "libipt-devel ( =  2.1-5.el10) libipt-devel(x86-64) ( =  2.1-5.el10)"
