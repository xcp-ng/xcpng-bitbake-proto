
PN = "libaio"
PE = "0"
PV = "0.3.111"
PR = "22.el10"
PACKAGES = "libaio libaio-devel"


URI_libaio = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libaio-0.3.111-22.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libaio = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.4)(64bit) ( )"
RPROVIDES:libaio = "libaio.so.1()(64bit) ( ) libaio.so.1(LIBAIO_0.1)(64bit) ( ) libaio.so.1(LIBAIO_0.4)(64bit) ( ) libaio.so.1.0.0()(64bit) ( ) libaio.so.1.0.0(LIBAIO_0.1)(64bit) ( ) libaio.so.1.0.0(LIBAIO_0.4)(64bit) ( ) libaio ( =  0.3.111-22.el10) libaio(x86-64) ( =  0.3.111-22.el10)"

URI_libaio-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libaio-devel-0.3.111-22.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libaio-devel = "libaio.so.1()(64bit) ( ) libaio(x86-64) ( =  0.3.111-22.el10)"
RPROVIDES:libaio-devel = "libaio-devel ( =  0.3.111-22.el10) libaio-devel(x86-64) ( =  0.3.111-22.el10)"
