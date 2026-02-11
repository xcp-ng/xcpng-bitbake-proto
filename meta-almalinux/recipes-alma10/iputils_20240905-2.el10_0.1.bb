
PN = "iputils"
PE = "0"
PV = "20240905"
PR = "2.el10_0.1"
PACKAGES = "iputils"


URI_iputils = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/iputils-20240905-2.el10_0.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:iputils = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libcap.so.2()(64bit) ( ) libidn2.so.0()(64bit) ( ) libidn2.so.0(IDN2_0.0.0)(64bit) ( )"
RPROVIDES:iputils = "/bin/ping ( ) /bin/ping6 ( ) /sbin/arping ( ) iputils ( =  20240905-2.el10_0.1) iputils(x86-64) ( =  20240905-2.el10_0.1)"
